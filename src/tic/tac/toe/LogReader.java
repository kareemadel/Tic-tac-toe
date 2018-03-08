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
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LogReader {
	
    static private   BufferedReader reader = null;
	
	static public ArrayList<TicLog> getLogs(){
		
		ArrayList<TicLog> allLogs = new ArrayList<TicLog>();
        
        try {

            reader = new BufferedReader(new FileReader("TicLogger2.txt"));

            String line;
            try{
                while ((line = reader.readLine()) != null) {
                	
                	String[] slog = line.split("\\$");                    
                    TicLog obj = new TicLog();
                    obj.set_Time(slog[0]);

                    if(slog[1]!= null && slog[1]!= "")
                       obj.set_Type(slog[1]);

                   if(slog[2]!= null && slog[2]!= ""){
                	   String[] steps = slog[2].split("\\%");
                       ArrayList <String> temp = new  ArrayList <String>();
                       for (int i = 0;  i < steps.length; i++) {
                           if(steps[i]!= "")
                               temp.add(steps[i]);
                           }
                       obj.set_Moves(temp);
                       }
                   if(obj.get_Moves().size() > 0)
                	   allLogs.add(obj);
                   }
                }
            catch (IOException e) {
            	System.out.println("error in splitting: " + e.getMessage());
            	}
            if(allLogs.size() >0)
            	return allLogs;
            else
            	return null;
            }
        catch (IOException e) {
        	System.out.println("error: " + e.getMessage());
        	}
        try{
        	reader.close();
        	}
        catch (IOException e) {
        	e.printStackTrace();
        	} 
        return null;
    }
	
}
