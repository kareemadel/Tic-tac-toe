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

public class Server 
{
    private ServerSocket listener;
    private Socket connection;
    private int port;
    private boolean hasConnection;

    public Server(int p) throws Exception 
    {
        this.port = p;
        this.hasConnection = false;

        System.out.println("Listening on port " + this.port + "...");
        listener = new ServerSocket(port);
        while (!this.hasConnection) 
        {
            connection = listener.accept();
            this.hasConnection = true;
        }
    }

    public boolean hasConnection() 
    {
        return hasConnection;
    }

    public Socket connection() 
    {
        return connection;
    }
}
