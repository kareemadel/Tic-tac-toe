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
import java.util.ArrayList;
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
    public char[] board = new char[9];

    
    /* Steps is a 2d Array [ [ location as char , player SYmbol X or O ] , [ , ] ] 
                             |                                         | 
                             |----------First Step in The Game---------|
    */
    private ArrayList<ArrayList<Character>> steps = new ArrayList<>();
    
    /* Current Player is used to determine whose turn is in the game */
    Player currentPlayer;

    /* A Boolean flag used to determine whether the game should be recorded or not  */
    public boolean recordable;
    
    
    /*Methods*/
    
    /* check whether the PLayer won or not  */
    public boolean isWinner() {
        int pos = (int) steps.get(steps.size() - 1).get(0);
        char icon = steps.get(steps.size() - 1).get(1);
        int col, row, diag, rdiag;
        col = row = diag = rdiag = 0;
        for (int i = 0; i < 3; i++) {
            if (board[pos % 3 + i * 3] == icon)
            {
                col++;
            }
            if (board[pos / 3 + i] == icon) {
                row++;
            }
        }
        if (pos % 2 == 0) {
            for (int i = 0; i < 3; i++) {
                if (board[i * 4] == icon) {
                    diag++;
                }
                if (board[i*2 + 2] == icon) {
                    rdiag++;
                }
            }
        }
        return col == 3 || row == 3 || diag == 3 || rdiag == 3;
    }

    /* Check whether the board is filled up to indicate a tie in case of 
        no winner or loser detected
    */
    public boolean isFull() {
        return steps.size() == 9;
    }

    /* Check if the move is legal and perform it if so */
    public synchronized boolean move(int location, Player player) {
        if (player == currentPlayer && board[location] == 0) {
            board[location] = currentPlayer.icon;
            ArrayList<Character> step = new ArrayList<>();
            step.add((char) location);
            step.add(currentPlayer.icon);
            steps.add(step);
            currentPlayer = currentPlayer.opponent;
            return true;
        }
        return false;
    }
}
