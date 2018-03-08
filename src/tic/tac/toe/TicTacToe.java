/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.MouseEvent;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private int xCount = 0;
    private boolean eventFlag1 = true;
    private boolean eventFlag2 = true;
    private int oCount = 0;
    private int userChoice;
    SingleGame currentGame;
    NetGame netGame;
    boolean isListener;
    int port;
    Server server;
    Client client;
    boolean canPlay, isClosing, isListening = false;
    String host;
    private Stage stage;
    private Scene scene, scene1;
    Thread guiUpdateThread;

    AudioClip win = new AudioClip(getClass().getResource("won.wav").toString());
    AudioClip lose = new AudioClip(getClass().getResource("lose.wav").toString());

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Tice-Tac-Toe");
        stage = primaryStage;
        scene = new Scene(root, 699, 609);
        scene1 = new Scene(root1, 699, 609);
        primaryStage.setScene(scene1);
        primaryStage.show();
        primaryStage.setResizable(false);
        root1.label.setOnMouseClicked((MouseEvent event) -> {
            userChoice = 0;
            userMode(userChoice);
            primaryStage.setScene(scene);
            primaryStage.show();
            root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("computer.png").toExternalForm()));
        });
        root1.label0.setOnMouseClicked((MouseEvent event) -> {
            root1.pane0.setVisible(true);
            root1.imageView3.setOpacity(0.2);
            eventFlag1 = false;
            System.out.println("label");
            userChoice = 2;
        });
        root1.label1.setOnMouseClicked((MouseEvent event) -> {
            userChoice = 1;
            userMode(1);
            primaryStage.setScene(scene);
            primaryStage.show();
            root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("icon-person-blue.png").toExternalForm()));
        });
        root1.imageView3.setOnMouseClicked((MouseEvent event) -> {
            if (eventFlag1) {
                root1.pane16.setVisible(true);
            }
        });
        root1.imageView10.setOnMouseClicked((MouseEvent event) -> {
            root1.pane16.setVisible(false);
        });
        root1.imageView9.setOnMouseClicked((MouseEvent event) -> {
            primaryStage.close();
            System.exit(0);
        });
        root1.text0.setOnMouseClicked((MouseEvent event) -> {
            root1.pane8.setVisible(true);
            root1.pane0.setVisible(false);
        });
        root1.imageView4.setOnMouseClicked((MouseEvent event) -> {
            root1.pane0.setVisible(false);
            root1.imageView3.setOpacity(1.0);
            eventFlag1 = true;
        });
        //host button
        root1.text.setOnMouseClicked((MouseEvent event) -> {
            root1.pane3.setVisible(true);
            root1.pane0.setVisible(false);
            // argv[0]: "0" == client, "1" == host argv[1]: Ip argv[2]: port
            userMode(2, "1");
        });
        //button in pane3 (waiting for connection)
        root1.imageView5.setOnMouseClicked((MouseEvent event) -> {
            root1.pane3.setVisible(false);
            root1.pane0.setVisible(false); // host or join options
            root1.imageView3.setOpacity(1.0);
            eventFlag1 = true;
            try {
                netGame.exit();
            } catch (IOException ex) {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                isListening = false;
                System.out.println("now closing host winde isClosing: " + isClosing);
            }
        });
        root1.imageView7.setOnMouseClicked((MouseEvent event) -> {
            root1.pane8.setVisible(false);
            root1.pane0.setVisible(false);
            root1.imageView3.setOpacity(1.0);
            eventFlag1 = true;
            try {
                netGame.exit();
            } catch (IOException ex) {
                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                isListening = false;
                System.out.println("now closing host winde isClosing: " + isClosing);
            }
        });
        root1.imageView8.setOnMouseClicked((MouseEvent event) -> {
            root1.pane8.setVisible(true);
            root1.pane14.setVisible(false);
            eventFlag1 = true;
        });
        root1.imageView6.setOnMouseClicked((MouseEvent event) -> {
//            try {
            String port = root1.textField0.getText();
            String ip = root1.textField1.getText();
            //argv[0]: "0" == client, "1" == host argv[1]: Ip argv[2]: port
            userChoice = 2;
            userMode(2, "0", ip, port);

        });
        root1.text3.setOnMouseClicked((MouseEvent event) -> {
            //server ip
        });
        root1.text4.setOnMouseClicked((MouseEvent event) -> {
            //server port
        });
        root1.textField0.setOnMouseClicked((MouseEvent event) -> {
            //client ip
        });
        root1.textField1.setOnMouseClicked((MouseEvent event) -> {
            //client port
        });
        primaryStage.setResizable(false);

        for (int i = 0; i < 9; i++) {
            final int location = i;
            root.cells[i].setOnMouseClicked((MouseEvent event) -> {
                switch (userChoice) {
                    case 0:
                        if (game.move(location, game.currentPlayer)) {
                            currentGame.computerMove();
                        }
                        break;
                    case 1:
                        game.move(location, game.currentPlayer);
                        break;
                    case 2:
                        if (netGame.myTurn()) {
                            try {
                                netGame.moveAndSend(location);
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
            if (eventFlag2) {
                root.pane12.setVisible(true);
                root.gridPane.setOpacity(0.2);
                root.imageView8.setOpacity(0.2);
                root.imageView9.setOpacity(0.2);
                root.imageView12.setOpacity(0.2);
            }
        });

        root.imageView14.setOnMouseClicked((MouseEvent event) -> {
            root.pane10.setVisible(false);
            eventFlag2 = true;
            root.imageView8.setOpacity(1.0);
            root.imageView9.setOpacity(1.0);
            root.imageView12.setOpacity(1.0);
            root.gridPane.setOpacity(1.0);

        });
        root.imageView15.setOnMouseClicked((MouseEvent event) -> {
            eventFlag2 = true;
            root.imageView8.setOpacity(1.0);
            root.imageView9.setOpacity(1.0);
            root.imageView12.setOpacity(1.0);
            root.gridPane.setOpacity(1.0);
            root.pane11.setVisible(false);
            game.reset();
            System.out.println("imageview15");
            redraw();
            if (userChoice == 2) {
                try {
                    System.out.println("game over");
                    netGame.sendMessage("reset");
                } catch (IOException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        root.imageView16.setOnMouseClicked((MouseEvent event) -> {
            eventFlag2 = true;
            root.pane11.setVisible(false);
            root.pane13.setVisible(false);
            root.imageView8.setOpacity(1.0);
            root.gridPane.setOpacity(1.0);
            root.imageView9.setOpacity(1.0);
            root.imageView12.setOpacity(1.0);
            root.pane10.setVisible(false);
            primaryStage.setScene(scene1);
            primaryStage.show();
            game.reset();
            redraw();
            oCount = 0;
            xCount = 0;
            root.label.setText(String.valueOf(xCount));
            root.label0.setText(String.valueOf(oCount));
             if (userChoice == 2) {
                try {
                    netGame.sendMessage("quit");
                    netGame.exit();
                    isClosing = true;
                    System.out.println("Closing sockets from action event");
                } catch (IOException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);

                }

             }});
        root.imageView17.setOnMouseClicked((MouseEvent event) -> {
            System.out.println("imageview17");
            if (userChoice == 2) {
                try {
                    netGame.sendMessage("quit");
                    isClosing = true;
                    netGame.exit();
                    System.out.println("Closing sockets from action event");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            eventFlag2 = true;
            root.imageView8.setOpacity(1.0);
            root.imageView9.setOpacity(1.0);
            root.imageView12.setOpacity(1.0);
            root.gridPane.setOpacity(1.0);
            root.pane12.setVisible(false);
            primaryStage.setScene(scene1);
            primaryStage.show();
            game.reset();
            redraw();
            oCount = 0;
            xCount = 0;
            root.label.setText(String.valueOf(xCount));
            root.label0.setText(String.valueOf(oCount));
            root.pane9.setVisible(false);
            for (int i = 0; i < 8; i++) {
                root.lines[i].setVisible(false);
            }
        });
        root.imageView18.setOnMouseClicked((MouseEvent event) -> {
            root.pane12.setVisible(false);
            eventFlag2 = true;
            root.imageView8.setOpacity(1.0);
            root.imageView9.setOpacity(1.0);
            root.imageView12.setOpacity(1.0);
            root.gridPane.setOpacity(1.0);

        });
        root.imageView19.setOnMouseClicked((MouseEvent event) -> {
            if (userChoice == 2) {
                try {
                    netGame.sendMessage("quit");
                    netGame.exit();
                    isClosing = true;
                    System.out.println("Closing sockets from action event");
                } catch (IOException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
            primaryStage.close();
            System.exit(0);
        });
        root.imageView8.setOnMouseClicked((MouseEvent event) -> {
            root.pane9.setVisible(false);
            for (int i = 0; i < 8; i++) {
                root.lines[i].setVisible(false);
            }
            game.reset();
            redraw();
            if (userChoice == 2) {
                try {
                    netGame.sendMessage("reset");
                } catch (IOException ex) {
                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);

                }
            }
        });

        root.imageView110.setOnMouseClicked(event -> {
            eventFlag2 = true;
            root.gridPane.setOpacity(1.0);
            root.imageView8.setOpacity(1.0);
            root.imageView9.setOpacity(1.0);
            root.imageView12.setOpacity(1.0);
            root.pane13.setVisible(false);
            root.pane11.setVisible(false);
            primaryStage.setScene(scene1);
            primaryStage.show();
            game.reset();
            redraw();
            oCount = 0;
            xCount = 0;
            root.label.setText(String.valueOf(xCount));
            root.label0.setText(String.valueOf(oCount));
            System.out.println("imageview110");
        });

        ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
        int noThreads = currentGroup.activeCount();
        Thread[] lstThreads = new Thread[noThreads];
        currentGroup.enumerate(lstThreads);

        for (int i = 0; i < noThreads; i++) {
            System.out.println("Thread No:" + i + " = " + lstThreads[i].getName());
        }
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
            root.pane10.setVisible(true);
            root.lines[game.board.getWinnerLine() - 1].setVisible(true);
            eventFlag2 = false;
            root.imageView8.setOpacity(0.2);
            root.imageView9.setOpacity(0.2);
            root.imageView12.setOpacity(0.2);
            root.gridPane.setOpacity(0.2);
            root.imageView14.setImage(new Image(getClass().getResource("ok.png").toExternalForm()));
            root.pane9.setVisible(true);
            switch (userChoice) {
                case 0:
                    if (game.currentPlayer.icon == Board.State.X) {
                        root.imageView13.setLayoutX(0.0);
                        root.imageView13.setLayoutY(0.0);
                        root.imageView13.setImage(new Image(getClass().getResource("winnerx.png").toExternalForm()));
                        xCount++;
                        root.label.setText(String.valueOf(xCount));
                        win.play();
                    } else {
                        root.imageView13.setImage(new Image(getClass().getResource("loser.png").toExternalForm()));
                        root.imageView13.setLayoutX(140.0);
                        oCount++;
                        root.label0.setText(String.valueOf(oCount));
                        lose.play();
                    }
                    break;
                case 1:
                    if (game.currentPlayer.icon == Board.State.X) {
                        root.imageView13.setLayoutX(0.0);
                        root.imageView13.setLayoutY(0.0);
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
                    break;
                case 2:
                    if (netGame.myTurn()) {
                        if (game.currentPlayer.icon == Board.State.X) {
                            root.imageView13.setLayoutX(0.0);
                            root.imageView13.setLayoutY(0.0);
                            root.imageView13.setImage(new Image(getClass().getResource("winnerx.png").toExternalForm()));
                            xCount++;
                            root.label.setText(String.valueOf(xCount));
                            win.play();
                        } else {
                            root.imageView13.setLayoutX(0.0);
                            root.imageView13.setLayoutY(0.0);
                            root.imageView13.setImage(new Image(getClass().getResource("winnero.png").toExternalForm()));
                            oCount++;
                            root.label0.setText(String.valueOf(oCount));
                            win.play();
                        }
                    } else {
                        System.out.println("############################");
                        System.out.println(game.currentPlayer.icon);
                        System.out.println("now in loser.");
                        if (game.currentPlayer.icon == Board.State.X) {
                            System.out.println("x won");
                            System.out.println(xCount);
                            xCount++;
                            System.out.println(xCount);
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    root.label0.setText(String.valueOf(xCount));
                                }
                            });
                        } else {
                            System.out.println("o won");
                            System.out.println(oCount);
                            oCount++;
                            System.out.println(oCount);
                            Platform.runLater(new Runnable() {
                                @Override
                                public void run() {
                                    root.label.setText(String.valueOf(oCount));
                                }
                            });
                        }
                        System.out.println(xCount);
                        System.out.println(oCount);
                        root.imageView13.setImage(new Image(getClass().getResource("loser.png").toExternalForm()));
                        root.imageView13.setLayoutX(140.0);
                        lose.play();
                    }
                    break;
            }

        } else if (game.isFull()) {
            eventFlag2 = false;
            root.pane11.setVisible(true);
            root.imageView8.setOpacity(0.2);
            root.imageView9.setOpacity(0.2);
            root.imageView12.setOpacity(0.2);
            root.gridPane.setOpacity(0.2);
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
                guiUpdateThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        if (isListener) {
                            try {
                                System.out.println("creating server");
                                // is host
                                server = new Server(0);
                                server.start();
                                host = server.getIp();
                                // showing server ip to the host
                                root1.text3.setText(host);
                                // showing server port to the host
                                String port = "0";
                                do {
                                    port = Integer.toString(server.getPort());
                                } while (port.equals("0"));

                                root1.text4.setText(port);
                                game = server.game;
                                netGame = server.game;
                                isListening = true;
                                while (isListening && (server.connection() == null || server.game.getClient() == null || server.game.getResponse() == null)) {
                                    System.out.println(isListening);
                                    System.out.println(server.connection());
                                    System.out.println(server.game.getClient());
                                    System.out.println(server.game.getResponse());
                                }
                                if (server.connection() != null) {
                                    Platform.runLater(new Runnable() {
                                        @Override
                                        public void run() {
                                            //pane8 join popup
                                            eventFlag1 = true;
                                            root1.imageView3.setOpacity(1);
                                            root1.pane3.setVisible(false);
                                            stage.setScene(scene);
                                            stage.show();
                                            root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("online.png").toExternalForm()));
                                        }
                                    });
                                }
                            } catch (IOException ex) {
                                Logger.getLogger(TicTacToe.class
                                        .getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            // is client, has connected to server
                            host = argv[1];
                            try {
                                port = Integer.parseInt(argv[2]);
                            } catch (NumberFormatException ex) {
                                root1.pane14.setVisible(true);
                                root1.text8.setText("There Was A Problem Connecting To Server, Please Try Again.");
                                return;
                            }
                            client = new Client(host, port);
                            client.start();
                            canPlay = true;
                            game = client.game;
                            netGame = client.game;
                            isListening = true;
                            while (isListening && (client.connection() == null || client.game.getClient() == null || client.game.getResponse() == null)) {
                                System.out.println(isListening);
                                System.out.println(client.connection());
                                System.out.println(client.game.getClient());
                                System.out.println(client.game.getResponse());

                                if (client.isException) {
                                    root1.pane14.setVisible(true);
                                    root1.text8.setText("There Was A Problem Connecting To Server, Please Try Again.");
                                    return;
                                }
                            }
                            System.out.println("client out");
                            if (client.connection() != null) {
                                Platform.runLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        eventFlag1 = true;
                                        root1.imageView3.setOpacity(1);
                                        root1.pane8.setVisible(false);
                                        root1.textField0.setText("");
                                        root1.textField1.setText("");
                                        stage.setScene(scene);
                                        stage.show();
                                        root.imageView10.setImage(new Image(TicTacToe.this.getClass().getResource("online.png").toExternalForm()));

                                    }
                                });
                            }
                        }

                        String move = null;
                        while (!netGame.getGameSocket().isClosed()) {
                            try {
                                System.out.println("response : " + netGame.getResponse());
                                move = netGame.readMessage();
                                if (move == null) {
                                    netGame.exit();
                                    System.out.println("other player quit");
                                    root.pane13.setVisible(!isClosing);
                                    isClosing = false;
                                    root.text1.setText("Your Opponent is disconnected");
                                    eventFlag2 = false;
                                    root.imageView8.setOpacity(0.2);
                                    root.imageView9.setOpacity(0.2);
                                    root.gridPane.setOpacity(0.2);

                                } else if (move.equals("reset")) {
                                    game.reset();
                                    root.pane9.setVisible(false);
                                    root.pane10.setVisible(false);
                                    eventFlag2 = true;
                                    root.imageView8.setOpacity(1.0);
                                    root.imageView9.setOpacity(1.0);
                                    root.imageView12.setOpacity(1.0);
                                    root.gridPane.setOpacity(1.0);
                                    root.pane11.setVisible(false);
                                    for (int i = 0; i < 8; i++) {
                                        root.lines[i].setVisible(false);
                                    }
                                    redraw();
                                    System.out.println("reset the game");
                                } else if (move.equals("quit")) {
                                    netGame.exit();
                                    System.out.println("other player quit");
                                    root.pane13.setVisible(!isClosing);
                                    isClosing = false;
                                    root.text1.setText("Your Opponent is disconnected");
                                    eventFlag2 = false;
                                    root.imageView8.setOpacity(0.2);
                                    root.imageView9.setOpacity(0.2);
                                    root.gridPane.setOpacity(0.2);
                                } else {
                                    netGame.move(Integer.parseInt(move));
                                    redraw();
                                }
                            } catch (NumberFormatException ex) {
                                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                                try {
                                    netGame.exit();
                                    System.out.println("closing game sockets due to number format ex");
                                } catch (IOException ex1) {
                                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex1);

                                }
                                root.pane13.setVisible(!isClosing);
                                isClosing = false;
                                root.text1.setText("Your Opponent is disconnected");
                                eventFlag2 = false;
                                root.imageView8.setOpacity(0.2);
                                root.imageView9.setOpacity(0.2);
                                root.gridPane.setOpacity(0.2);

                            } catch (SocketException ex) {
                                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                                try {
                                    netGame.exit();
                                    System.out.println("closing game sockets due to socket except");
                                } catch (IOException ex1) {
                                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex1);

                                }
                                root.pane13.setVisible(!isClosing);
                                isClosing = false;
                                root.text1.setText("Your Opponent is disconnected");
                                eventFlag2 = false;
                                root.imageView8.setOpacity(0.2);
                                root.imageView9.setOpacity(0.2);
                                root.gridPane.setOpacity(0.2);

                            } catch (IOException ex) {
                                Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex);
                                try {
                                    netGame.exit();
                                    System.out.println("closing game sockets due to io exception");
                                } catch (IOException ex1) {
                                    Logger.getLogger(TicTacToe.class.getName()).log(Level.SEVERE, null, ex1);

                                }
                                root.pane13.setVisible(!isClosing);
                                isClosing = false;
                                root.text1.setText("Your Opponent is disconnected");
                                eventFlag2 = false;
                                root.imageView8.setOpacity(0.2);
                                root.imageView9.setOpacity(0.2);
                                root.gridPane.setOpacity(0.2);

                            }

                        }
                        System.out.println("end of thread");
//                        game.reset();
//                        redraw();
                    }
                }
                );
                guiUpdateThread.start();

                break;
        }

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        if (userChoice == 2) {
            isListening = false;
            try {
                netGame.exit();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
