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

public class netGame 
{
    private boolean running;
    private boolean isHost;
    private boolean myTurn;
    private int availableMoves;
    private Socket gameSocket;
    private BufferedReader response;
    private DataOutputStream client;

    public Board board;

    public netGame(Socket connection, boolean isHost) throws Exception 
    {
        this.board = new Board();

        this.running = true;
        this.isHost = isHost;
        this.myTurn = isHost;
        this.availableMoves = 3*3;

        this.gameSocket = connection;
        this.response = new BufferedReader(new InputStreamReader(this.gameSocket.getInputStream()));
        this.client = new DataOutputStream(this.gameSocket.getOutputStream());
    }

    public boolean move(int location) throws Exception {
        if (board.move(location)) {
            this.sendMessage(""+location);
            if (!(isFull() || winner())) {
                this.myTurn = !this.myTurn;
            }
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isRunning() 
    {
        return this.running;
    }

    public void checkWinner()  throws Exception 
    {
    }

    public boolean winner() {
        if (board.isGameOver()) {
            return board.getWinner() != Board.State.Blank;
        }
        return false;
    }

    public boolean myTurn() 
    {
        return myTurn;
    }

    public void draw() throws Exception 
    {
        System.out.println("Draw - No available moves...");
        this.gameOver();
        this.exit();
    }
    public boolean isFull() {
        return board.isGameOver();
    }

    public void gameOver() 
    {
        this.running = false;
    }

    public void exit() throws Exception 
    {
        this.gameSocket.close();
        System.exit(0);
    }

    public String readMessage() throws Exception 
    {
        return this.response.readLine();
    }

    public void sendMessage(String s) throws Exception 
    {
        this.client.writeBytes(s+"\n");
    }
}
