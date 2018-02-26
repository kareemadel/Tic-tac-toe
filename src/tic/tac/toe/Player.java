/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.util.UUID;

/**
 *
 * @author Team7
 */

/**/
public class Player{
    UUID uuid;
    Board.State icon;
    
    public Player() {
         uuid = UUID.randomUUID();
    }
    
    public Player(String name) {
         this.uuid = UUID.nameUUIDFromBytes(name.getBytes());
    }
}
