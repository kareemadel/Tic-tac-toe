/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author shaimaanabil
 */
public class TicTacToe extends Application {
    private  String startgame = "X.png";
    private  int XCount = 0;
    private int OCount = 0;
    Tic root = new Tic();
    Alert talert = new Alert(Alert.AlertType.INFORMATION);
    @Override
    public void start(Stage primaryStage)  {
        
        Scene scene = new Scene(root, 699, 609);
        primaryStage.setScene(scene);
        primaryStage.show();     
        root.imageView.setOnMouseClicked((MouseEvent event) -> {
            
            root.imageView.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView.setFitHeight(118.0);
                root.imageView.setFitWidth(126.0);
                root.imageView.setLayoutX(7.0);
                root.imageView.setLayoutY(2.0);
                root.imageView.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView.setFitHeight(87.0);
                root.imageView.setFitWidth(87.0);
                root.imageView.setLayoutX(20.0);
                root.imageView.setLayoutY(13.0);
                root.imageView.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
         root.imageView0.setOnMouseClicked((MouseEvent event) -> {
            root.imageView0.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView0.setFitHeight(118.0);
                root.imageView0.setFitWidth(126.0);
                root.imageView0.setLayoutX(7.0);
                root.imageView0.setLayoutY(2.0);
                root.imageView0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView0.setFitHeight(87.0);
                root.imageView0.setFitWidth(87.0);
                root.imageView0.setLayoutX(20.0);
                root.imageView0.setLayoutY(13.0);
                root.imageView0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
      root.imageView1.setOnMouseClicked((MouseEvent event) -> {
            root.imageView1.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView1.setFitHeight(118.0);
                root.imageView1.setFitWidth(126.0);
                root.imageView1.setLayoutX(7.0);
                root.imageView1.setLayoutY(2.0);
                root.imageView1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView1.setFitHeight(87.0);
                root.imageView1.setFitWidth(87.0);
                root.imageView1.setLayoutX(20.0);
                root.imageView1.setLayoutY(13.0);
                root.imageView1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
        root.imageView2.setOnMouseClicked((MouseEvent event) -> {
            root.imageView2.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView2.setFitHeight(118.0);
                root.imageView2.setFitWidth(126.0);
                root.imageView2.setLayoutX(7.0);
                root.imageView2.setLayoutY(2.0);
                root.imageView2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView2.setFitHeight(87.0);
                root.imageView2.setFitWidth(87.0);
                root.imageView2.setLayoutX(20.0);
                root.imageView2.setLayoutY(13.0);
                root.imageView2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
           root.imageView3.setOnMouseClicked((MouseEvent event) -> {
            root.imageView3.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView3.setFitHeight(118.0);
                root.imageView3.setFitWidth(126.0);
                root.imageView3.setLayoutX(7.0);
                root.imageView3.setLayoutY(2.0);
                root.imageView3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView3.setFitHeight(87.0);
                root.imageView3.setFitWidth(87.0);
                root.imageView3.setLayoutX(20.0);
                root.imageView3.setLayoutY(13.0);
                root.imageView3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
          root.imageView4.setOnMouseClicked((MouseEvent event) -> {
            root.imageView4.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView4.setFitHeight(118.0);
                root.imageView4.setFitWidth(126.0);
                root.imageView4.setLayoutX(7.0);
                root.imageView4.setLayoutY(2.0);
                root.imageView4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView4.setFitHeight(87.0);
                root.imageView4.setFitWidth(87.0);
                root.imageView4.setLayoutX(20.0);
                root.imageView4.setLayoutY(13.0);
                root.imageView4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
          root.imageView5.setOnMouseClicked((MouseEvent event) -> {
            root.imageView5.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView5.setFitHeight(118.0);
                root.imageView5.setFitWidth(126.0);
                root.imageView5.setLayoutX(7.0);
                root.imageView5.setLayoutY(2.0);
                root.imageView5.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView5.setFitHeight(87.0);
                root.imageView5.setFitWidth(87.0);
                root.imageView5.setLayoutX(20.0);
                root.imageView5.setLayoutY(13.0);
                root.imageView5.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
            root.imageView6.setOnMouseClicked((MouseEvent event) -> {
            root.imageView6.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView6.setFitHeight(118.0);
                root.imageView6.setFitWidth(126.0);
                root.imageView6.setLayoutX(7.0);
                root.imageView6.setLayoutY(2.0);
                root.imageView6.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView6.setFitHeight(87.0);
                root.imageView6.setFitWidth(87.0);
                root.imageView6.setLayoutX(20.0);
                root.imageView6.setLayoutY(13.0);
                root.imageView6.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
            root.imageView7.setOnMouseClicked((MouseEvent event) -> {
            root.imageView7.setImage(new Image(TicTacToe.this.getClass().getResource(startgame).toExternalForm()));
            if ("X.png".equals(startgame))
            {   root.imageView7.setFitHeight(118.0);
                root.imageView7.setFitWidth(126.0);
                root.imageView7.setLayoutX(7.0);
                root.imageView7.setLayoutY(2.0);
                root.imageView7.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            }
            else
            {   root.imageView7.setFitHeight(87.0);
                root.imageView7.setFitWidth(87.0);
                root.imageView7.setLayoutX(20.0);
                root.imageView7.setLayoutY(13.0);
                root.imageView7.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                
            } player();
        });
      
                }
    public void player()
    {
      if(startgame.equals("X.png"))
      {
       startgame = "O.png";
      }
      else
      {
       startgame = "X.png";
      }
    }
   
    public static void main(String[] args)
    {
       launch(args);
    }
    }

    
