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

    private boolean running;
    private boolean isHost;
    private boolean myTurn;
    private Socket gameSocket;
    private BufferedReader response;
    private DataOutputStream client;


    public NetGame(Socket connection, boolean isHost) throws Exception {
        super(new Player("Host"), new Player("Guest"));
        this.board = new Board();

        this.running = true;
        this.isHost = isHost;
        this.myTurn = isHost;

        this.gameSocket = connection;
        this.response = new BufferedReader(new InputStreamReader(this.gameSocket.getInputStream()));
        this.client = new DataOutputStream(this.gameSocket.getOutputStream());
    }

    public boolean move(int location) throws Exception {
        if (board.move(location)) {
            this.sendMessage("" + location);
            if (!(isFull() || isWinner())) {
                this.myTurn = !this.myTurn;
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean myTurn() {
        return myTurn;
    }

    public void exit() throws Exception {
        this.gameSocket.close();
    }

    public String readMessage() throws Exception {
        return this.response.readLine();
    }

    public void sendMessage(String s) throws Exception {
        this.client.writeBytes(s + "\n");
    }
}
