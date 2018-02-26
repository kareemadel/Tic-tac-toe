/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;



/**
 *
 * @author dina
 */
public class MultiMode extends Game {
int mode = 2;
    public MultiMode(){
        
        super(new Player("PlayerX"), new Player("PlayerO"));
        currentPlayer = player1;
      
    }
    
}
