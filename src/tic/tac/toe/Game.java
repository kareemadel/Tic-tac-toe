/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

/**
 *
 * @author Team7
 */
import java.io.Serializable;
import java.util.UUID;
public class Game implements Serializable {

    /**
     * UUID for the game
     */
     UUID uuid;
    /**
     * To obtain the value of the random string generated
     * we need to call the UUID.toString() method.
     */
    String randomUUIDString;
    
    /**
     * Board object.
     */
    Board board;
    
    /**
     * possible state of the board
     */
    public enum State {Blank, X, O}
    
    /**
     * Current Player is used to determine whose turn is in the game
     */
    Player currentPlayer;
    
    /**
     * current move number
     */
    int currentMove;
    
    
    /**
     * Players
     */
    Player player1;
    Player player2;
    
    /**
     * Constructs the Game objects
     * @param pl1   the player who will play first
     * @param pl2   the player who will play second
     */
    public Game(Player pl1, Player pl2) {
        uuid = UUID.randomUUID();
        randomUUIDString = uuid.toString();
        board = new Board();
        player1 = pl1;
        player2 = pl2;
        player1.icon = Board.State.X;
        player2.icon = Board.State.O;
        currentMove = 0;
    }

    /**
     * A Boolean flag used to determine
     * whether the game should be recorded or not.
     */
    public boolean recordable;
    
    
    /*Methods*/
    
    /** check whether the PLayer won or not
     * @return  true if there is a winner
     */
    public boolean isWinner() {
        if (board.isGameOver()) {
            return board.getWinner() != Board.State.Blank;
        }
        return false;
    }

    /** Check whether the board is filled up to indicate a tie in case of 
     * no winner or loser detected.
     */
    public boolean isFull() {
        return board.isGameOver();
    }

    /**
     * Check if the move is legal and perform it if so
     */
    public synchronized boolean move(int location, Player player) {
        if (currentPlayer == player && board.move(location)) {
            if (!(isFull() || isWinner())) {
                currentPlayer = currentPlayer == player1 ? player2 : player1;
            }
            return true;
        }
        else {
            return false;
        }
    }
    
    public void reset() {
        board.reset();
        currentPlayer = player1;
    }
}
