package tic.tac.toe;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dina
 */
public class TicLogWriter {	
	
	static private TicLog _Log = null;
	
    static private BufferedWriter writer = null;
    
    static public void setup() {
    	
    	_Log = new TicLog();
    	
        try{
        	FileWriter  logFile = new FileWriter("TicLogger2.txt",true);
        	writer = new BufferedWriter(logFile);
        	}
        catch(IOException ex){
        	System.out.println("Error in creating Log File: " + ex.getMessage());
        }
    }
    
    static public void WriteLog(){
        try{        	
        	ArrayList<String> moves = _Log.get_Moves();
        	if(moves != null) {
	        	if( moves.size() > 0) {
	        		writer.write(_Log.getID());;
	        		writer.write(_Log.get_Time());
	        		writer.write(_Log.get_Type());        		
	        		for(int i=0; i< moves.size(); i++) {
	        			writer.write(moves.get(i) + "%" );
	        		}
	        	}            
	            writer.flush();
        	}
        	System.out.println("Dina: This round has no moves");
        }
        catch(IOException ex){
            System.out.println("Error in writing log row: " + ex.getMessage());
        }
    }
    
    static public void Dispose(){
        try{
        writer.close();        
        }
        catch(IOException ex){
            System.out.println("Error in closing file: " + ex.getMessage());
        }
    }

	
    public static TicLog get_Log() {
		return _Log;
	}

    
}
