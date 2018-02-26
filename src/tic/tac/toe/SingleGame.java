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
        try {
            pin = new PipedInputStream();
            pout = new PipedOutputStream(pin);
        } catch (IOException ex) {
            Logger.getLogger(SingleGame.class.getName()).log(Level.SEVERE, null, ex);
        }
//        Thread th = new Thread(this);
//        th.start();
//        Thread th = new Thread(this);
//        th.start();
    }
    
    public void computerMove() {
        if(!isFull()) {
            System.out.println("Now in Comp.");
            System.out.println(this.currentPlayer.icon);
            AlphaBetaAdvanced.run(currentPlayer.icon, board, board.getAvailableMoves().size(), this);
            System.out.println(this.currentPlayer.icon);
        }
    }
    
    public void randomMove() {
        while (!move(ThreadLocalRandom.current().nextInt(0, 9), player1));
    }
}
