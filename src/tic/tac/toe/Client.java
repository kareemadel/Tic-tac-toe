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

public class Client extends Thread {

    private Socket connection;
    private String host;
    private int port;
    public boolean isException = false;
    public NetGame game = new NetGame(this.connection, false);

    public Client(String host, int p) {
        this.port = p;
        this.host = host;
        System.out.println("Connecting to " + host + " on port " + this.port);
    }

    @Override
    public void run() {
        try {
            this.connection = new Socket(this.host, this.port);
            // initialize new game with the correct socket and host status
            System.out.println("Before client Set");
            game.setConnection(this.connection);
            game.setMyTurn(false);
            game.setIsHost(false);
            game.isWaiting = false;
            System.out.println("After client Set");
        } catch (IOException ex) {
            System.out.println("Connection to " + host + " failed!");
            isException = true;
        } catch (NumberFormatException ex) {
            System.out.println("ex");
            isException = true;
        }
    }

    public Socket connection() {
        return connection;
    }
}
