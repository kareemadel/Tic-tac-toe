package tic.tac.toe;

import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class CustomItem  extends HBox{
	
	private TicLog _SelectedLog = null;

	public TicLog get_SelectedLog() {
		return _SelectedLog;
	}

	public void set_SelectedLog(TicLog _SelectedLog) {
		this._SelectedLog = _SelectedLog;
	}	
	
	public CustomItem(TicLog log) {
	
		_SelectedLog = new TicLog();
		
		this.setPrefHeight(111.0);
		this.setPrefWidth(378.0);
		
		// Start building dynamic UI according to size of data returned from file.
		this.setPrefHeight(35.0);
		this.setPrefWidth(372.0);
		
		Label lblType = new Label();
		lblType.setPrefHeight(17.0);
		lblType.setPrefWidth(86.0);
		lblType.setText(log.get_Type());		
		this.getChildren().add(lblType);
		
		Label lblTime = new Label();
		lblTime.setPrefHeight(17.0);
		lblTime.setPrefWidth(242.0);
		lblTime.setText(log.get_Time());
		LogScreen.set_Screenlabels(lblTime);
		lblTime.setOnMouseClicked(e->{
			this.set_SelectedLog(log);
			});			
		this.getChildren().add(lblTime);
	}
}
