package tic.tac.toe;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;

public class Tic extends AnchorPane {

    protected final Pane pane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final ColumnConstraints columnConstraints0;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints;
    protected final RowConstraints rowConstraints0;
    protected final RowConstraints rowConstraints1;
    protected final Pane pane0;
    protected final ImageView imageView;
    protected final Pane pane1;
    protected final ImageView imageView0;
    protected final Pane pane2;
    protected final ImageView imageView1;
    protected final Pane pane3;
    protected final ImageView imageView2;
    protected final Pane pane4;
    protected final ImageView imageView3;
    protected final Pane pane5;
    protected final ImageView imageView4;
    protected final Pane pane6;
    protected final ImageView imageView5;
    protected final Pane pane7;
    protected final ImageView imageView6;
    protected final Pane pane8;
    protected final ImageView imageView7;
    protected final ImageView imageView8;
    protected final ImageView imageView9;
    protected final ImageView imageView10;
    protected final ImageView imageView11;
    protected final Label label;
    protected final Label label0;
    protected final ImageView imageView12;
    protected final ImageView[] cells;

    public Tic() {

        pane = new Pane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        columnConstraints0 = new ColumnConstraints();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        rowConstraints0 = new RowConstraints();
        rowConstraints1 = new RowConstraints();
        pane0 = new Pane();
        imageView = new ImageView();
        pane1 = new Pane();
        imageView0 = new ImageView();
        pane2 = new Pane();
        imageView1 = new ImageView();
        pane3 = new Pane();
        imageView2 = new ImageView();
        pane4 = new Pane();
        imageView3 = new ImageView();
        pane5 = new Pane();
        imageView4 = new ImageView();
        pane6 = new Pane();
        imageView5 = new ImageView();
        pane7 = new Pane();
        imageView6 = new ImageView();
        pane8 = new Pane();
        imageView7 = new ImageView();
        imageView8 = new ImageView();
        imageView9 = new ImageView();
        imageView10 = new ImageView();
        imageView11 = new ImageView();
        label = new Label();
        label0 = new Label();
        imageView12 = new ImageView();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);
        setScaleShape(false);

        pane.setMaxHeight(USE_PREF_SIZE);
        pane.setMaxWidth(USE_PREF_SIZE);
        pane.setMinHeight(USE_PREF_SIZE);
        pane.setMinWidth(USE_PREF_SIZE);
        pane.setPrefHeight(609.0);
        pane.setPrefWidth(699.0);
        pane.setStyle("-fx-background-color: #6795C2;");

        gridPane.setFocusTraversable(true);
        gridPane.setGridLinesVisible(true);
        gridPane.setId("board");
        gridPane.setLayoutX(151.0);
        gridPane.setLayoutY(127.0);
        gridPane.setPrefHeight(364.0);
        gridPane.setPrefWidth(389.0);
        gridPane.setStyle("-fx-background-color: rgba(64, 116, 167,1); -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0); -fx-grid-lines-visible: true; -fx-padding: 5;");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(100.0);
        columnConstraints.setPrefWidth(100.0);

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(100.0);
        columnConstraints0.setPrefWidth(100.0);

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(100.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane0.setPrefHeight(200.0);
        pane0.setPrefWidth(200.0);

        imageView.setFitHeight(87.0);
        imageView.setFitWidth(87.0);
        imageView.setLayoutX(20.0);
        imageView.setLayoutY(13.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);

        GridPane.setColumnIndex(pane1, 1);
        pane1.setPrefHeight(200.0);
        pane1.setPrefWidth(200.0);

        imageView0.setFitHeight(87.0);
        imageView0.setFitWidth(87.0);
        imageView0.setLayoutX(20.0);
        imageView0.setLayoutY(13.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);

        GridPane.setColumnIndex(pane2, 2);
        pane2.setPrefHeight(200.0);
        pane2.setPrefWidth(200.0);

        imageView1.setFitHeight(87.0);
        imageView1.setFitWidth(87.0);
        imageView1.setLayoutX(20.0);
        imageView1.setLayoutY(13.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);

        GridPane.setRowIndex(pane3, 1);
        pane3.setPrefHeight(200.0);
        pane3.setPrefWidth(200.0);

        imageView2.setFitHeight(87.0);
        imageView2.setFitWidth(87.0);
        imageView2.setLayoutX(20.0);
        imageView2.setLayoutY(13.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);

        GridPane.setColumnIndex(pane4, 1);
        GridPane.setRowIndex(pane4, 1);
        pane4.setPrefHeight(200.0);
        pane4.setPrefWidth(200.0);

        imageView3.setFitHeight(87.0);
        imageView3.setFitWidth(87.0);
        imageView3.setLayoutX(20.0);
        imageView3.setLayoutY(13.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);

        GridPane.setColumnIndex(pane5, 2);
        GridPane.setRowIndex(pane5, 1);
        pane5.setPrefHeight(200.0);
        pane5.setPrefWidth(200.0);

        imageView4.setFitHeight(87.0);
        imageView4.setFitWidth(87.0);
        imageView4.setLayoutX(20.0);
        imageView4.setLayoutY(13.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);

        GridPane.setRowIndex(pane6, 2);
        pane6.setPrefHeight(200.0);
        pane6.setPrefWidth(200.0);

        imageView5.setFitHeight(87.0);
        imageView5.setFitWidth(87.0);
        imageView5.setLayoutX(20.0);
        imageView5.setLayoutY(13.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);

        GridPane.setColumnIndex(pane7, 1);
        GridPane.setRowIndex(pane7, 2);
        pane7.setPrefHeight(200.0);
        pane7.setPrefWidth(200.0);

        imageView6.setFitHeight(87.0);
        imageView6.setFitWidth(87.0);
        imageView6.setLayoutX(20.0);
        imageView6.setLayoutY(13.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);

        GridPane.setColumnIndex(pane8, 2);
        GridPane.setRowIndex(pane8, 2);
        pane8.setPrefHeight(200.0);
        pane8.setPrefWidth(200.0);

        imageView7.setFitHeight(87.0);
        imageView7.setFitWidth(87.0);
        imageView7.setLayoutX(20.0);
        imageView7.setLayoutY(13.0);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);

        imageView8.setFitHeight(48.0);
        imageView8.setFitWidth(53.0);
        imageView8.setId("refresh");
        imageView8.setLayoutX(212.0);
        imageView8.setLayoutY(539.0);
        imageView8.setPickOnBounds(true);
        imageView8.setPreserveRatio(true);
        imageView8.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView8.setImage(new Image(getClass().getResource("Apps-Dialog-Refresh-icon.png").toExternalForm()));

        imageView9.setFitHeight(48.0);
        imageView9.setFitWidth(66.0);
        imageView9.setId("exit");
        imageView9.setLayoutX(409.0);
        imageView9.setLayoutY(539.0);
        imageView9.setPickOnBounds(true);
        imageView9.setPreserveRatio(true);
        imageView9.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView9.setImage(new Image(getClass().getResource("close-icon.png").toExternalForm()));

        imageView10.setFitHeight(69.0);
        imageView10.setFitWidth(74.0);
        imageView10.setId("playero");
        imageView10.setLayoutX(611.0);
        imageView10.setLayoutY(20.0);
        imageView10.setPickOnBounds(true);
        imageView10.setPreserveRatio(true);
        imageView10.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView10.setImage(new Image(getClass().getResource("computer.png").toExternalForm()));

        imageView11.setFitHeight(69.0);
        imageView11.setFitWidth(69.0);
        imageView11.setId("playerx");
        imageView11.setLayoutX(14.0);
        imageView11.setLayoutY(20.0);
        imageView11.setPickOnBounds(true);
        imageView11.setPreserveRatio(true);
        imageView11.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView11.setImage(new Image(getClass().getResource("person-icon.png").toExternalForm()));

        label.setId("playerxPoints");
        label.setLayoutX(97.0);
        label.setLayoutY(47.0);
        label.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
        label.setText("0");

        label0.setId("playeroPoints");
        label0.setLayoutX(579.0);
        label0.setLayoutY(47.0);
        label0.setStyle("-fx-font-size: 18; -fx-text-fill: white;");
        label0.setText("0");

        imageView12.setFitHeight(48.0);
        imageView12.setFitWidth(48.0);
        imageView12.setLayoutX(311.0);
        imageView12.setLayoutY(539.0);
        imageView12.setPickOnBounds(true);
        imageView12.setPreserveRatio(true);
        imageView12.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView12.setImage(new Image(getClass().getResource("replay.png").toExternalForm()));

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getColumnConstraints().add(columnConstraints0);
        gridPane.getColumnConstraints().add(columnConstraints1);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getRowConstraints().add(rowConstraints0);
        gridPane.getRowConstraints().add(rowConstraints1);
        pane0.getChildren().add(imageView);
        gridPane.getChildren().add(pane0);
        pane1.getChildren().add(imageView0);
        gridPane.getChildren().add(pane1);
        pane2.getChildren().add(imageView1);
        gridPane.getChildren().add(pane2);
        pane3.getChildren().add(imageView2);
        gridPane.getChildren().add(pane3);
        pane4.getChildren().add(imageView3);
        gridPane.getChildren().add(pane4);
        pane5.getChildren().add(imageView4);
        gridPane.getChildren().add(pane5);
        pane6.getChildren().add(imageView5);
        gridPane.getChildren().add(pane6);
        pane7.getChildren().add(imageView6);
        gridPane.getChildren().add(pane7);
        pane8.getChildren().add(imageView7);
        gridPane.getChildren().add(pane8);
        pane.getChildren().add(gridPane);
        pane.getChildren().add(imageView8);
        pane.getChildren().add(imageView9);
        pane.getChildren().add(imageView10);
        pane.getChildren().add(imageView11);
        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        pane.getChildren().add(imageView12);
        getChildren().add(pane);

        cells = new ImageView[] {imageView, imageView0, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7};

    }
}
