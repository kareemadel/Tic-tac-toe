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
import java.util.UUID;
public class Game {

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
    public char[] board = {
        0, 0, 0,
        0, 0, 0,
        0, 0, 0};

    
    /* Steps is a 2d Array [ [ location as char , player SYmbol X or O ] , [ , ] ] 
                             |                                         | 
                             |----------First Step in The Game---------|
    */
    public char[][] steps;
    
    /* Current Player is used to determine whose turn is in the game */
    Player currentPlayer;

    /* A Boolean flag used to determine whether the game should be recorded or not  */
    public boolean recordable;
    
    
    /*Methods*/
    
    /* check whether the PLayer won or not  */
    public boolean Winner() {
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

    /* Check whether the board is filled up to indicate a tie in case of 
        no winner or loser detected
    */
    public boolean isFull() {
        for (int i = 0; i < board.length; i++) {
            if (board[i] == 0) {
                return false;
            }
        }
        return true;
    }

    /* Check if the move is legal and perform it if so */
    public synchronized boolean move(int location, Player player) {
        if (player == currentPlayer && board[location] == 0) {
            board[location] = currentPlayer.icon;
            currentPlayer = currentPlayer.opponent;
            return true;
        }
        return false;
    }
}
