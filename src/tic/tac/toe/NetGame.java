/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

/**
 *
 * @author Majid
 */
import java.net.*;
import java.io.*;

public class NetGame extends Game {

    public boolean isWaiting = true;
    private boolean running;
    private boolean isHost;
    private boolean myTurn;
    private Socket gameSocket;
    private BufferedReader response;
    private DataOutputStream client;

    public NetGame(Socket connection, boolean isHost) {
        super(new Player("Host"), new Player("Guest"));
        this.board = new Board();

        this.running = true;
        this.isHost = isHost;
        this.myTurn = isHost;

        this.gameSocket = connection;
        currentPlayer = player1;
    }

    public boolean moveAndSend(int location) throws IOException {
        System.out.println("Before condition");
        System.out.println(currentPlayer.icon);
        System.out.println(myTurn);
        if (board.move(location)) {
            this.sendMessage("" + location);
            if (!(isFull() || isWinner())) {
                this.myTurn = !this.myTurn;
                currentPlayer = currentPlayer == player1 ? player2 : player1;
            }
            System.out.println("Before True");
            System.out.println(currentPlayer.icon);
            System.out.println(myTurn);
            return true;
        } else {
            System.out.println("Before false");
            System.out.println(currentPlayer.icon);
            System.out.println(myTurn);
            return false;
        }
    }

    public boolean move(int location) {
        System.out.println("Before condition");
        System.out.println(currentPlayer.icon);
        System.out.println(myTurn);
        if (board.move(location)) {
            if (!(isFull() || isWinner())) {
                this.myTurn = !this.myTurn;
                currentPlayer = currentPlayer == player1 ? player2 : player1;
            }
            System.out.println("Before true");
            System.out.println(currentPlayer.icon);
            System.out.println(myTurn);
            return true;
        } else {
            System.out.println("Before false");
            System.out.println(currentPlayer.icon);
            System.out.println(myTurn);
            return false;
        }
    }

    public void setIsHost(boolean flag) {
        this.isHost = flag;
    }

    public void setConnection(Socket s) throws IOException {
        this.gameSocket = s;
        this.response = new BufferedReader(new InputStreamReader(this.gameSocket.getInputStream()));
        this.client = new DataOutputStream(this.gameSocket.getOutputStream());
    }

    public void setMyTurn(boolean flag) {
        this.myTurn = flag;
    }

    public boolean myTurn() {
        return myTurn;
    }

    public void exit() throws IOException {
//        this.response.close();
//        this.client.close();
        this.gameSocket.close();
    }

    public String readMessage() throws IOException {
        return this.response.readLine();
    }

    public void sendMessage(String s) throws IOException {
        this.client.writeBytes(s + "\n");
    }
    
    public BufferedReader getResponse(){
        return this.response;
    }
    
    public DataOutputStream getClient(){
        return this.client;
    }
    
    public Socket getGameSocket(){
        return this.gameSocket;
    }
}
