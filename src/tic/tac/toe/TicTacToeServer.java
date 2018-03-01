import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.ArrayList;



public class TicTacToeServer {

    public static void main(String[] args) throws Exception {
        ServerSocket our_listener = new ServerSocket(5005);
        System.out.println("The Server is Running");
        try {
            while (true) {
                MultiPlayerGame Mygame = new MultiPlayerGame();
                MultiPlayerGame.MultiPlayer playerX = Mygame.new MultiPlayer(our_listener.accept(), 'X');
                MultiPlayerGame.MultiPlayer playerO = Mygame.new MultiPlayer(our_listener.accept(), 'O');
                playerX.setOpponent(playerO);
                playerO.setOpponent(playerX);
                Mygame.currentPlayer = playerX;
                new Thread(playerX).start();
                new Thread(playerO).start();
            }
        } finally {
            our_listener.close();
        }
    }
}


class MultiPlayerGame {

    /*Game Id : This will generate a universal unique id for the game */
    UUID uuid = UUID.randomUUID();
    /* To obtain the value of the random string generated
       we need to call the UUID.toString() method. */
    String randomUUIDString = uuid.toString();

    /** Mode of the game 
     0 ---> Player Vs Computer
     1 ---> PLayer Vs Player local
     2 ---> Player Vs Player Network
    */
    public int mode;

    /*Array of chars for the board intialized by zeros*/
    private char[] board = {
        0, 0, 0,
        0, 0, 0,
        0, 0, 0};

    /* Steps is a 2d Array [ [ location as char , player SYmbol X or O ] , [ , ] ] 
                             |                                         | 
                             |----------First Step in The Game---------|
    */
    public ArrayList<ArrayList<Character>> steps = new ArrayList<>();

    /* Current Player is used to determine whose turn is in the game */

    MultiPlayer currentPlayer;

    /* A Boolean flag used to determine whether the game should be recorded or not  */
    public boolean recordable;

    /* Methods */
    public boolean isWinner() {
        return
            (board[0] != 0 && board[0] == board[1] && board[0] == board[2])
          ||(board[3] != 0 && board[3] == board[4] && board[3] == board[5])
          ||(board[6] != 0 && board[6] == board[7] && board[6] == board[8])
          ||(board[0] != 0 && board[0] == board[3] && board[0] == board[6])
          ||(board[1] != 0 && board[1] == board[4] && board[1] == board[7])
          ||(board[2] != 0 && board[2] == board[5] && board[2] == board[8])
          ||(board[0] != 0 && board[0] == board[4] && board[0] == board[8])
          ||(board[2] != 0 && board[2] == board[4] && board[2] == board[6]);
    }

    public boolean isFull() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 0) {
                return false;
            }
        }
        return true;
    }

    
    public synchronized boolean move(int location, MultiPlayer player) {
        if (player == currentPlayer && board[location] == 0) {
            board[location] = currentPlayer.icon;
            ArrayList<Character> step = new ArrayList<>();
            step.add((char) location);
            step.add(currentPlayer.icon);
            steps.add(step);
            currentPlayer = currentPlayer.opponent;
            currentPlayer.otherPlayerMoved(location);
            return true;
        }
        return false;
    }

    class MultiPlayer implements Runnable {
        char icon;
        MultiPlayer opponent;
        Socket socket;
        BufferedReader input;
        PrintWriter output;

        public MultiPlayer(Socket socket, char icon) {
            this.socket = socket;
            this.icon = icon;
            try {
                input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
                output = new PrintWriter(socket.getOutputStream(), true);
                output.println("WELCOME " + icon);
                output.println("MESSAGE Waiting for the other player to connect");
            } catch (IOException e) {
                System.out.println("Player disconnected: " + e);
            }
        }

        public void setOpponent(MultiPlayer opponent) {
            this.opponent = opponent;
        }

        public void otherPlayerMoved(int location) {
            output.println("OPPONENT_MOVED " + location);
            output.println(isWinner() ? "DEFEAT" : isFull() ? "TIE" : "");
        }


        public void run() {
            try {
                
                output.println("MESSAGE All players connected");
                if (icon == 'X') {
                    output.println("MESSAGE Your move");
                }
                while (true) {
                    String command = input.readLine();
                    if (command.startsWith("MOVE")) {
                        int location = Integer.parseInt(command.substring(5));
                        if (move(location, this)) {
                            output.println("VALID_MOVE");
                            output.println(isWinner() ? "VICTORY": isFull() ? "TIE": "");
                        } else {
                            output.println("MESSAGE Not Your Turn");
                        }
                    } else if (command.startsWith("QUIT")) {
                        return;
                    }
                }
            } catch (IOException e) {
                System.out.println("Player disconnected: " + e);
            } finally {
                try {
                    socket.close();
                }
                catch (IOException e) {}
            }
        }
    }
}
