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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Main extends Application {
	
	ArrayList<TicLog> logs;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
    logs = new ArrayList<TicLog>();
			
// Fill logs from file with data using reader class.			
    FillGameLogs();
			
// Creates scroll for the custom UI.
    ScrollPane scrollPane = new ScrollPane();
    scrollPane.setStyle("-fx-border-color: yellow");
    scrollPane.setPrefWidth(400.0);
			
    VBox vbox = new VBox();
    vbox.setPrefHeight(111.0);
    vbox.setPrefWidth(378.0);
			
// Start building dynamic UI according to size of data returned from file.
    for(int i=0 ; i< logs.size(); i++) {
    
        TicLog log = logs.get(i);
				
//StackPane sPane = First_Custom(log);
	HBox hBox = Second_Custom(log);
	vbox.getChildren().add(hBox);
	scrollPane.setContent(vbox);				
    }	
    
//BorderPane root = new BorderPane();
	Scene scene = new Scene(scrollPane,400,400);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	primaryStage.setScene(scene);
	primaryStage.show();
    } catch(Exception e) {
	e.printStackTrace();
    }
}
	
	
    private StackPane First_Custom(TicLog log) {
// Container of (icon + button).
	GridPane gridpane = new GridPane();
	gridpane.setAlignment(Pos.CENTER);
	gridpane.setMinWidth(200);
	gridpane.setMaxWidth(300);
	gridpane.setMinHeight(150);
	gridpane.setMaxHeight(200);

// Create Image icon for game type.
// Can be replaced with a label for simplicity
	ImageView imgGameType = new ImageView();
	imgGameType.setFitHeight(250);
	imgGameType.setFitWidth(250);
	imgGameType.setLayoutX(61.0);
	imgGameType.setLayoutY(83.0);
	imgGameType.setPickOnBounds(true);
	imgGameType.setPreserveRatio(true);

// Specify icon according to game type.
	if(log.get_Type() == "Multi") {
// get icon of multi.
	}
	else if(log.get_Type() == "Single") { // Person vs Computer
// get icon of single game.
	}
	else {
// get icon of online game
	}	
	Label lblGameType = new Label();
	lblGameType.setText(log.get_Type());
	lblGameType.setPrefWidth(100);
	lblGameType.setPrefHeight(30);
	System.out.println(log.get_Type());
		
// add icon to gridpane.
	gridpane.getChildren().add(lblGameType);
// Create button which holds game time.
	Button btnGameTime = new Button();
	btnGameTime.setId("btnGameTime");
	btnGameTime.setText(log.get_Time());
	btnGameTime.setOnMouseClicked(e -> {
// Hide log scene.
// pass list of moves to game scene to be redrawed.
// Return to game scene.					
	});

// add button to gridpane.
	gridpane.getChildren().add(btnGameTime);				
		
	StackPane sPane = new StackPane();
//sPane.setPrefHeight(scrollPane.getPrefHeight());
//sPane.setMaxHeight(scrollPane.getMaxHeight());
//sPane.setPrefWidth(scrollPane.getPrefWidth());
	sPane.getChildren().add(gridpane);
		
            return sPane;

	}
	
    private HBox Second_Custom(TicLog log) {		
		
	HBox hBox = new HBox();
	hBox.setPrefHeight(35.0);
	hBox.setPrefWidth(372.0);
		
	Label lblType = new Label();
	lblType.setPrefHeight(17.0);
	lblType.setPrefWidth(86.0);
	lblType.setText(log.get_Type());		
	hBox.getChildren().add(lblType);
		
	Label lblTime = new Label();
	lblTime.setPrefHeight(17.0);
	lblTime.setPrefWidth(242.0);
	lblTime.setText(log.get_Time());
	lblTime.setOnMouseClicked(e->{
		System.out.println("hiiiiiiiiiiiii");
// Hide log scene.
// pass list of moves to game scene to be re-Drawed.
// Return to game scene.	
	});
	hBox.getChildren().add(lblTime);
		
            return hBox;		
	}
	
    public static void main(String[] args) {
	launch(args);	
    }
	
    private void FillGameLogs() {
	ArrayList<String> moves = new ArrayList<String>();
	moves.add("X,1");
	moves.add("O,3");
	moves.add("X,4");
	moves.add("O,2");
	moves.add("X,5");
	moves.add("O,7");
	moves.add("X,6");
	moves.add("O,8");
	moves.add("X,9");
        
	TicLog mlog = new TicLog(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()) , "Multi", moves);
	TicLog slog = new TicLog(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), "Single", moves);
	TicLog olog = new TicLog(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()), "Online", moves);
		
        for(int i=0; i < 150; i++) {
            logs.add(mlog);
            logs.add(slog);
            logs.add(olog);
	}
	}
}
