/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.util.Optional;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
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
    public void start(Stage primaryStage) {
        SingleGame currentGame = new SingleGame();;
        game = currentGame;
        pl1 = game.player1;
        pl2 = game.player2;

        Scene scene = new Scene(root, 699, 609);
        Scene scene1 = new Scene(root1, 699, 609);
        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setResizable(false);
        root1.label.setOnMouseClicked((MouseEvent event) -> {
            game.mode = 0;
            primaryStage.hide();
            primaryStage.setScene(scene);
            primaryStage.show();
            root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("computer.png").toExternalForm()));
        });
        root1.label0.setOnMouseClicked((MouseEvent event) -> {
            primaryStage.hide();
            primaryStage.setScene(scene);
            primaryStage.show();
            root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("online.png").toExternalForm()));
        });
        root1.label1.setOnMouseClicked((MouseEvent event) -> {
            game.mode = 1;
            primaryStage.hide();
            primaryStage.setScene(scene);
            primaryStage.show();
            root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("icon-person-blue.png").toExternalForm()));
        });
        root1.imageView3.setOnMouseClicked((MouseEvent event) -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit");
            alert.setContentText("Do you want to Exit from the game ?");
            ButtonType ok = new ButtonType("Ok", ButtonBar.ButtonData.YES);
            ButtonType NO = new ButtonType("NO", ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(ok, NO);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ok) {
                primaryStage.close();
                System.exit(0);
            }
            if (result.get() == NO) {
                alert.close();
            }
        });
        primaryStage.setResizable(false);

        for (int i = 0; i < 9; i++) {
            final int location = i;
            root.cells[i].setOnMouseClicked((MouseEvent event) -> {
                if (game.move(location, game.currentPlayer)) {
                    if (game.mode == 0) {
                        currentGame.computerMove();
                    }
                    redraw();
                }
            });
        }

        root.imageView9.setOnMouseClicked((MouseEvent event) -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Exit");
            alert.setContentText("Do you want to back to the Menu?");
            ButtonType ok = new ButtonType("Ok", ButtonBar.ButtonData.YES);
            ButtonType exit = new ButtonType("Exit", ButtonBar.ButtonData.NO);
            ButtonType cancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);
            alert.getButtonTypes().setAll(ok, exit, cancel);
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == ok) {
                primaryStage.hide();
                primaryStage.setScene(scene1);
                primaryStage.show();
            }
            if (result.get() == exit) {
                primaryStage.close();
                System.exit(0);
            }

        });
        root.imageView8.setOnMouseClicked((MouseEvent event) -> {
            game.board.reset();
            redraw();
        });
    }

    public void redraw() {
        Board.State[][] board = game.board.toArray();

        for (int i = 0; i < 9; i++) {
            switch (board[i / 3][i % 3]) {
                case X:
                    root.cells[i].setImage(new Image(TicTacToe.this.getClass().getResource("X.png").toExternalForm()));
                    root.cells[i].setFitHeight(118.0);
                    root.cells[i].setFitWidth(126.0);
                    root.cells[i].setLayoutX(7.0);
                    root.cells[i].setLayoutY(2.0);
                    root.cells[i].setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                    break;
                case O:
                    root.cells[i].setImage(new Image(TicTacToe.this.getClass().getResource("O.png").toExternalForm()));
                    root.cells[i].setFitHeight(87.0);
                    root.cells[i].setFitWidth(87.0);
                    root.cells[i].setLayoutX(20.0);
                    root.cells[i].setLayoutY(13.0);
                    root.cells[i].setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
                    break;
                default:
                    root.cells[i].setImage(null);
                    break;
            }
        }

        if (game.isWinner()) {
            talert.setHeaderText("The Winner");
            if (game.currentPlayer.icon == Board.State.X) {
                talert.setContentText("player X wins");
                xCount++;
                root.label.setText(String.valueOf(xCount));
            } else {
                talert.setContentText("player O wins");
                oCount++;
                root.label0.setText(String.valueOf(oCount));

            }
            talert.showAndWait();
        } else if (game.isFull()) {
            talert.setHeaderText("Draw");
            talert.setContentText("Draw");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
