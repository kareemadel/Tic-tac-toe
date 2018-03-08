package tic.tac.toe;

import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class LogScreen extends VBox{
	
	static private ArrayList<Label> _Screenlabels = null;
		
	public static ArrayList<Label> get_Screenlabels() {
		return _Screenlabels;
	}

	public static void set_Screenlabels(Label _Screenlabels) {
		LogScreen._Screenlabels.add(_Screenlabels);
	}

	public LogScreen(ArrayList<TicLog> logs) {
		
		_Screenlabels  = new ArrayList<Label>();		

		this.setPrefHeight(113.0);
		this.setPrefWidth(380.0);
		
		// Start building dynamic UI according to size of data returned from file.
		for(int i=0 ; i< logs.size(); i++) {
			
			TicLog log = logs.get(i);			
			CustomItem hBox = new CustomItem(log);	
			hBox.set_SelectedLog(log);
			this.getChildren().add(hBox);
			}
		}
	}
