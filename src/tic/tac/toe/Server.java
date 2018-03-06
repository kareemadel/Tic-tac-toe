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
import java.util.Enumeration;
import java.util.regex.Pattern;

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
    
    public String getIp() throws SocketException {
        Pattern patternIP = Pattern.compile("(^127\\.[1-9])|(^127\\.0\\.[1-9])|(^127\\.0\\.0\\.[02-9])|(^10\\.)|(^172\\.1[6-9]\\.)|(^172\\.2[0-9]\\.)|(^172\\.3[0-1]\\.)|(^192\\.168\\.)");
        Enumeration e = NetworkInterface.getNetworkInterfaces();
        while (e.hasMoreElements()) {
            NetworkInterface n = (NetworkInterface) e.nextElement();
            Enumeration ee = n.getInetAddresses();
            while (ee.hasMoreElements()) {
                InetAddress i = (InetAddress) ee.nextElement();
                if (patternIP.matcher(i.getHostAddress()).find()) {
                    return i.getHostAddress();
                }
            }
        }
        return null;
    }
}
