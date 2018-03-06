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
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends Thread
{
    private Socket connection;
    private String host;
    private int port;
    public NetGame game =  new NetGame(this.connection, false);

    public Client(String host, int p) throws Exception 
    {
        this.port = p;
        this.host = host;
        System.out.println("Connecting to " + host + " on port " + this.port);
    }
    
    @Override
    public void run(){
            try {
                try {
                    this.connection = new Socket(this.host, this.port);
                } catch (Exception ex) {
                    System.out.println("Connection to " + host + " failed!");
                    System.exit(0);
                }
                // initialize new game with the correct socket and host status
                game.setConnection(this.connection);
                game.setMyTurn(false);
                game.setIsHost(false);
                game.isWaiting = false;
                } catch (Exception ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
    
    

    public Socket connection() 
    {
        return connection;
    }
}