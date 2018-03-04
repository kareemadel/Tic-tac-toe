package tic.tac.toe;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;

public  class Menu extends AnchorPane {

    protected final Pane pane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final Label label;
    protected final ImageView imageView;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints0;
    protected final Label label0;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints1;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints1;
    protected final Label label1;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;

    public Menu() {

        pane = new Pane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        label = new Label();
        imageView = new ImageView();
        gridPane0 = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints0 = new RowConstraints();
        label0 = new Label();
        gridPane1 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints1 = new RowConstraints();
        label1 = new Label();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        pane.setPrefHeight(609.0);
        pane.setPrefWidth(699.0);
        pane.setStyle("-fx-background-color: #6795C2;");

        gridPane.setLayoutX(178.0);
        gridPane.setLayoutY(230.0);
        gridPane.setPrefHeight(60.0);
        gridPane.setPrefWidth(351.0);
        gridPane.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0); -fx-background-color: rgba(64, 116, 167,1);");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label.setPrefHeight(60.0);
        label.setPrefWidth(351.0);
        label.setText("      One VS Computer");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f5f4f4"));
        label.setFont(new Font(28.0));

        imageView.setFitHeight(161.0);
        imageView.setFitWidth(492.0);
        imageView.setLayoutX(132.0);
        imageView.setLayoutY(14.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("logo.png").toExternalForm()));

        gridPane0.setLayoutX(174.0);
        gridPane0.setLayoutY(414.0);
        gridPane0.setPrefHeight(60.0);
        gridPane0.setPrefWidth(351.0);
        gridPane0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0); -fx-background-color: rgba(64, 116, 167,1);");

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        label0.setPrefHeight(60.0);
        label0.setPrefWidth(351.0);
        label0.setText("     One VS One Onine");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#f5f4f4"));
        label0.setFont(new Font(28.0));

        gridPane1.setLayoutX(178.0);
        gridPane1.setLayoutY(324.0);
        gridPane1.setPrefHeight(60.0);
        gridPane1.setPrefWidth(351.0);
        gridPane1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0); -fx-background-color: rgba(64, 116, 167,1);");

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        GridPane.setColumnIndex(label1, 1);
        label1.setPrefHeight(60.0);
        label1.setPrefWidth(351.0);
        label1.setText("          One VS One ");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#f5f4f4"));
        label1.setFont(new Font(28.0));

        imageView0.setFitHeight(60.0);
        imageView0.setFitWidth(60.0);
        imageView0.setLayoutX(105.0);
        imageView0.setLayoutY(230.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView0.setImage(new Image(getClass().getResource("computer.png").toExternalForm()));

        imageView1.setFitHeight(69.0);
        imageView1.setFitWidth(68.0);
        imageView1.setLayoutX(103.0);
        imageView1.setLayoutY(410.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.2), 30, 0.5, 0, 0);");
        imageView1.setImage(new Image(getClass().getResource("online.png").toExternalForm()));

        imageView2.setFitHeight(69.0);
        imageView2.setFitWidth(71.0);
        imageView2.setLayoutX(100.0);
        imageView2.setLayoutY(320.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.2), 30, 0.5, 0, 0);");
        imageView2.setImage(new Image(getClass().getResource("two.png").toExternalForm()));

        imageView3.setFitHeight(60.0);
        imageView3.setFitWidth(69.0);
        imageView3.setLayoutX(323.0);
        imageView3.setLayoutY(524.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.2), 30, 0.5, 0, 0);");
        imageView3.setImage(new Image(getClass().getResource("close-icon.png").toExternalForm()));

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        gridPane.getChildren().add(label);
        pane.getChildren().add(gridPane);
        pane.getChildren().add(imageView);
        gridPane0.getColumnConstraints().add(columnConstraints0);
        gridPane0.getRowConstraints().add(rowConstraints0);
        gridPane0.getChildren().add(label0);
        pane.getChildren().add(gridPane0);
        gridPane1.getColumnConstraints().add(columnConstraints1);
        gridPane1.getColumnConstraints().add(columnConstraints2);
        gridPane1.getRowConstraints().add(rowConstraints1);
        gridPane1.getChildren().add(label1);
        pane.getChildren().add(gridPane1);
        pane.getChildren().add(imageView0);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(imageView2);
        pane.getChildren().add(imageView3);
        getChildren().add(pane);

    }
}
