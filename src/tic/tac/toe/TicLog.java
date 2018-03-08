/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;
import java.util.ArrayList;
import java.util.UUID;
/**
 *
 * @author dina
 */

public class TicLog {
	private String _Time;
	private String _Type;
	private ArrayList<String> _Moves;
	private String ID;
	
	public TicLog() {
		_Time = "";
		_Type = "";
		ID = "";
		_Moves = new ArrayList<String>();
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public TicLog(String time, String type,ArrayList<String> moves) {
		_Time = time;
		_Type = type;
		_Moves = moves;
	}

	public String get_Time() {
		return _Time;
	}

	public void set_Time(String _Time) {
		this._Time = _Time;
	}

	public String get_Type() {
		return _Type;
	}

	public void set_Type(String _Type) {
		this._Type = _Type;
	}

	public ArrayList<String> get_Moves() {
		return _Moves;
	}

	public void set_Moves(ArrayList<String> _Moves) {
		this._Moves = _Moves;
	}	
}
