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

public class Client 
{
    private Socket connection;
    private int port;

    public Client(String host, int p) 
    {
        this.port = p;
        System.out.println("Connecting to " + host + " on port " + this.port);
        try 
        {
            connection = new Socket(host,p);
        } catch(Exception ex) 
        {
            System.out.println("Connection to " + host + " failed!");
            System.exit(0);
        }
        System.out.println("Connected...");
        System.out.println("Waiting for opponent...");
    }

    public Socket connection() 
    {
        return connection;
    }
}