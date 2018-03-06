/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.net.Socket;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 *
 * @author shaimaanabil
 */
public class TicTacToe extends Application {


    private Game game;
    Tic root = new Tic();
    Menu root1 = new Menu();
    Alert talert = new Alert(Alert.AlertType.INFORMATION);
    private int xCount = 0;
    private int oCount = 0;
    private int userChoice;
    SingleGame currentGame;
    NetGame netGame;
    boolean isListener;
    int port;
    Server server;
    Client client;
    boolean canPlay;
    String host;
  
    AudioClip win = new AudioClip(getClass().getResource("won.wav").toString());
    
    @Override
    public void start(Stage primaryStage) {

        Scene scene = new Scene(root, 699, 609);
        Scene scene1 = new Scene(root1, 699, 609);
        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setResizable(false);
        root1.label.setOnMouseClicked((MouseEvent event) -> {
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
                switch (userChoice) {
                    case 0:
                        game.move(location, game.currentPlayer);
                        currentGame.computerMove();
                        break;
                    case 1:
                        game.move(location, game.currentPlayer);
                        break;
                    case 2:
                        if (netGame.myTurn()) {
                            try {
                                netGame.move(location);
                            } catch (Exception ex) {
                                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        break;
                }
                redraw();
            });
        }

        root.imageView9.setOnMouseClicked((MouseEvent event) -> {
           root.pane11.setVisible(true);
        });
            root.imageView14.setOnMouseClicked((MouseEvent event) -> {
                root.pane9.setVisible(false);
                root.gridPane.setOpacity(1.0);
                game.board.reset();
                redraw();
            });
             root.imageView15.setOnMouseClicked((MouseEvent event) -> {
                 root.pane10.setVisible(false);
                 game.board.reset();
                 redraw();
             });  
             root.imageView16.setOnMouseClicked((MouseEvent event) -> {
                 root.pane10.setVisible(false);
                 primaryStage.hide();
                 primaryStage.setScene(scene1);
                 primaryStage.show(); 
                 game.board.reset();
                 redraw();
                  oCount = 0;
                 xCount = 0;
                root.label.setText(String.valueOf(xCount));
                root.label0.setText(String.valueOf(oCount));
                 
             }); 
             root.imageView17.setOnMouseClicked((MouseEvent event) -> {
                 root.pane11.setVisible(false);
                 primaryStage.hide();
                 primaryStage.setScene(scene1);
                 primaryStage.show();
                 game.board.reset();
                 redraw();
                 oCount = 0;
                 xCount = 0;
                root.label.setText(String.valueOf(xCount));
                root.label0.setText(String.valueOf(oCount));
             }); 
             root.imageView18.setOnMouseClicked((MouseEvent event) -> {
                 root.pane11.setVisible(false);
                 
             }); 
             root.imageView19.setOnMouseClicked((MouseEvent event) -> {
                 primaryStage.close();
                System.exit(0);
             }); 
           root.imageView9.setOnMouseClicked((MouseEvent event) -> {
               root.pane11.setVisible(true);
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
            root.gridPane.setOpacity(0.2);
            root.pane9.setVisible(true);
            root.imageView14.setImage(new Image(getClass().getResource("ok.png").toExternalForm()));

            if (game.currentPlayer.icon == Board.State.X) {
                root.imageView13.setImage(new Image(getClass().getResource("winnerx.png").toExternalForm()));
                xCount++;
                root.label.setText(String.valueOf(xCount));
                win.play();
            } else {
                root.imageView13.setImage(new Image(getClass().getResource("winnero.png").toExternalForm()));
                oCount++;
                root.label0.setText(String.valueOf(oCount));
                 win.play();


            }
        } else if (game.isFull()) {
            root.pane10.setVisible(true);
        }
    }
    
    /**
     * Initializes the the game object and application based on the user's
     * choice.
     *
     * @param userChoice either 0 (vs computer), 1 (vs human on the same
     * machine) or 2 (vs player over network)
     * @param argv optional arguments for the network mode, there are three of
     * them argv[0]: "0" == client, "1" == host argv[1]: Ip argv[2]: port
     */
    public void userMode(int userChoice, String... argv) {
        switch (userChoice) {
            case 0:
            case 1:
                currentGame = new SingleGame();
                game = currentGame;
                break;
            case 2:
                isListener = argv[0].equals("1");
                if (isListener) {
                    try {
                        // is host
                        server = new Server(0);
                        host = server.getIp();
                    } catch (Exception ex) {
                        Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    // will be presented using gui
                    this.port = server.connection().getLocalPort();
                    if (server.hasConnection()) {
                        // if a client has connected, can start game
                        canPlay = true;
                    } else {
                        // client connection failed, abort
                        System.out.println("Connection to peer failed!");
                        return;
                    }
                } else {
                    // is client, has connected to server
                    host = argv[1];
                    this.port = Integer.parseInt(argv[2]);
                    client = new Client(host, port);
                    canPlay = true;
                }
                if (canPlay) {
                    // am i using client or server socket
                    Socket gameSocket = (isListener ? server.connection() : client.connection());

                    try {
                        // initialize new game with the correct socket and host statu
                        game = new NetGame(gameSocket, isListener);
                    } catch (Exception ex) {
                        Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                Thread guiUpdateThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String move = null;
                        while (true) {
                            try {
                                move = netGame.readMessage();
                            } catch (Exception ex) {
                                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            try {
                                netGame.move(Integer.parseInt(move));
                            } catch (Exception ex) {
                                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            redraw();
                        }
                    }
                });
                guiUpdateThread.start();

                break;
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
