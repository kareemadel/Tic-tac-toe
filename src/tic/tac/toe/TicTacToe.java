/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author shaimaanabil
 */
public class TicTacToe extends Application {
    private Game game;
    Player pl1;
    Player pl2;
    Tic root = new Tic();
    Menu root1 = new Menu();
    Alert talert = new Alert(Alert.AlertType.INFORMATION);
    private int xCount = 0;
    private int oCount = 0;

    @Override
    public void start(Stage primaryStage)  {
        SingleGame currentGame = new SingleGame();;
        game = currentGame;
        pl1 = game.player1;
        pl2 = game.player2;
        
        Scene scene = new Scene(root, 699, 609);
        Scene scene1 = new Scene(root1,699,609);
        primaryStage.setScene(scene1);
        primaryStage.show(); 
        primaryStage.setResizable(false);
        root1.label.setOnMouseClicked((MouseEvent event) ->{
            game.mode = 0;
            primaryStage.hide();  
            primaryStage.setScene(scene);
            primaryStage.show(); 
        });
        root1.label0.setOnMouseClicked((MouseEvent event) ->{
            primaryStage.hide();
            primaryStage.setScene(scene);
            primaryStage.show(); 
            root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("online.png").toExternalForm()));
        });
        root1.label1.setOnMouseClicked((MouseEvent event) ->{
            game.mode = 1;
            primaryStage.hide();
            primaryStage.setScene(scene);
            primaryStage.show(); 
            root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("icon-person-blue.png").toExternalForm()));
        });    
        primaryStage.setResizable(false);
        root.imageView.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(0, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
                redraw();
            }
        });
         root.imageView0.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(1, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
           
                redraw();
            }
        });
      root.imageView1.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(2, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
                redraw();
            }
        });
        root.imageView2.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(3, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
                redraw();
            }
        });
           root.imageView3.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(4, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
                redraw();
            }
        });
          root.imageView4.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(5, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
                redraw();
            }
        });
          root.imageView5.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(6, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
                redraw();
            }
        });
            root.imageView6.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(7, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
                redraw();
            }
        });
            root.imageView7.setOnMouseClicked((MouseEvent event) -> {
            if (game.move(8, game.currentPlayer)) {
                if (game.mode == 0 ){
                currentGame.computerMove();
                }
                redraw();
            }
        });
    }

    public void redraw() {
        Board.State[][] board = game.board.toArray();
        
        if (board[0][0] == Board.State.X) {
            root.imageView.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView.setFitHeight(118.0);
            root.imageView.setFitWidth(126.0);
            root.imageView.setLayoutX(7.0);
            root.imageView.setLayoutY(2.0);
            root.imageView.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[0][0] == Board.State.O) {
            root.imageView.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView.setFitHeight(87.0);
            root.imageView.setFitWidth(87.0);
            root.imageView.setLayoutX(20.0);
            root.imageView.setLayoutY(13.0);
            root.imageView.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
        
        if (board[0][1] == Board.State.X) {
            root.imageView0.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView0.setFitHeight(118.0);
            root.imageView0.setFitWidth(126.0);
            root.imageView0.setLayoutX(7.0);
            root.imageView0.setLayoutY(2.0);
            root.imageView0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[0][1] == Board.State.O) {
            root.imageView0.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView0.setFitHeight(87.0);
            root.imageView0.setFitWidth(87.0);
            root.imageView0.setLayoutX(20.0);
            root.imageView0.setLayoutY(13.0);
            root.imageView0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
        
        if (board[0][2] == Board.State.X) {
            root.imageView1.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView1.setFitHeight(118.0);
            root.imageView1.setFitWidth(126.0);
            root.imageView1.setLayoutX(7.0);
            root.imageView1.setLayoutY(2.0);
            root.imageView1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[0][2] == Board.State.O) {
            root.imageView1.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView1.setFitHeight(87.0);
            root.imageView1.setFitWidth(87.0);
            root.imageView1.setLayoutX(20.0);
            root.imageView1.setLayoutY(13.0);
            root.imageView1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
        
        if (board[1][0] == Board.State.X) {
            root.imageView2.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView2.setFitHeight(118.0);
            root.imageView2.setFitWidth(126.0);
            root.imageView2.setLayoutX(7.0);
            root.imageView2.setLayoutY(2.0);
            root.imageView2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[1][0] == Board.State.O) {
            root.imageView2.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView2.setFitHeight(87.0);
            root.imageView2.setFitWidth(87.0);
            root.imageView2.setLayoutX(20.0);
            root.imageView2.setLayoutY(13.0);
            root.imageView2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
        
        if (board[1][1] == Board.State.X) {
            root.imageView3.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView3.setFitHeight(118.0);
            root.imageView3.setFitWidth(126.0);
            root.imageView3.setLayoutX(7.0);
            root.imageView3.setLayoutY(2.0);
            root.imageView3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[1][1] == Board.State.O) {
            root.imageView3.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView3.setFitHeight(87.0);
            root.imageView3.setFitWidth(87.0);
            root.imageView3.setLayoutX(20.0);
            root.imageView3.setLayoutY(13.0);
            root.imageView3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
        
        if (board[1][2] == Board.State.X) {
            root.imageView4.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView4.setFitHeight(118.0);
            root.imageView4.setFitWidth(126.0);
            root.imageView4.setLayoutX(7.0);
            root.imageView4.setLayoutY(2.0);
            root.imageView4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[1][2] == Board.State.O) {
            root.imageView4.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView4.setFitHeight(87.0);
            root.imageView4.setFitWidth(87.0);
            root.imageView4.setLayoutX(20.0);
            root.imageView4.setLayoutY(13.0);
            root.imageView4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
        
        if (board[2][0] == Board.State.X) {
            root.imageView5.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView5.setFitHeight(118.0);
            root.imageView5.setFitWidth(126.0);
            root.imageView5.setLayoutX(7.0);
            root.imageView5.setLayoutY(2.0);
            root.imageView5.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[2][0] == Board.State.O) {
            root.imageView5.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView5.setFitHeight(87.0);
            root.imageView5.setFitWidth(87.0);
            root.imageView5.setLayoutX(20.0);
            root.imageView5.setLayoutY(13.0);
            root.imageView5.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
        
        if (board[2][1] == Board.State.X) {
            root.imageView6.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView6.setFitHeight(118.0);
            root.imageView6.setFitWidth(126.0);
            root.imageView6.setLayoutX(7.0);
            root.imageView6.setLayoutY(2.0);
            root.imageView6.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[2][1] == Board.State.O) {
            root.imageView6.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView6.setFitHeight(87.0);
            root.imageView6.setFitWidth(87.0);
            root.imageView6.setLayoutX(20.0);
            root.imageView6.setLayoutY(13.0);
            root.imageView6.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
        
        if (board[2][2] == Board.State.X) {
            root.imageView7.setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
            root.imageView7.setFitHeight(118.0);
            root.imageView7.setFitWidth(126.0);
            root.imageView7.setLayoutX(7.0);
            root.imageView7.setLayoutY(2.0);
            root.imageView7.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        } else if (board[2][2] == Board.State.O) {
            root.imageView7.setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
            root.imageView7.setFitHeight(87.0);
            root.imageView7.setFitWidth(87.0);
            root.imageView7.setLayoutX(20.0);
            root.imageView7.setLayoutY(13.0);
            root.imageView7.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        }
//        System.out.println(game.currentPlayer.icon);
        if(game.isWinner()) {
            talert.setHeaderText("The Winner");
            if (game.currentPlayer.icon == Board.State.X) {
                talert.setContentText("player X wins");
                xCount++;
            } else {
                talert.setContentText("player O wins");
                oCount++;
            }
            talert.showAndWait();
        } else if (game.isFull()) {
            talert.setHeaderText("Draw");
            talert.setContentText("Draw");
        }
    }
   
    public static void main(String[] args)
    {
       launch(args);
    }
    }

    
