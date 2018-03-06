/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.Serializable;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Team7
 */
public class SingleGame extends Game implements Serializable{
  
    PipedInputStream pin;
    PipedOutputStream pout;
    public SingleGame() {
        super(new Player("name"), new Player("computer"));
        currentPlayer = player1;
    }
    
    public void computerMove() {
        if(!isFull()) {
            AlphaBetaAdvanced.run(currentPlayer.icon, board, board.getAvailableMoves().size(), this);
        }
    }
    
    public void randomMove() {
        while (!move(ThreadLocalRandom.current().nextInt(0, 9), player1));
    }
}
