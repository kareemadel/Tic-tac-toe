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

public class Menu extends AnchorPane {
   
    protected final Pane pane;
    protected final GridPane gridPane;
    protected final ColumnConstraints columnConstraints;
    protected final RowConstraints rowConstraints;
    protected final Pane pane0;
    protected final Label label;
    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints0;
    protected final RowConstraints rowConstraints0;
    protected final Pane pane1;
    protected final Label label0;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints1;
    protected final RowConstraints rowConstraints1;
    protected final Pane pane2;
    protected final Label label1;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;

    public Menu() {

        pane = new Pane();
        gridPane = new GridPane();
        columnConstraints = new ColumnConstraints();
        rowConstraints = new RowConstraints();
        pane0 = new Pane();
        label = new Label();
        imageView = new ImageView();
        imageView0 = new ImageView();
        gridPane0 = new GridPane();
        columnConstraints0 = new ColumnConstraints();
        rowConstraints0 = new RowConstraints();
        pane1 = new Pane();
        label0 = new Label();
        gridPane1 = new GridPane();
        columnConstraints1 = new ColumnConstraints();
        rowConstraints1 = new RowConstraints();
        pane2 = new Pane();
        label1 = new Label();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        pane.setPrefHeight(609.0);
        pane.setPrefWidth(699.0);
        pane.setStyle("-fx-background-color: #6795C2;");

        gridPane.setLayoutX(177.0);
        gridPane.setLayoutY(245.0);
        gridPane.setPrefHeight(60.0);
        gridPane.setPrefWidth(351.0);
        gridPane.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0); -fx-background-color: rgba(64, 116, 167,1);");

        columnConstraints.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints.setMinWidth(10.0);
        columnConstraints.setPrefWidth(100.0);

        rowConstraints.setMinHeight(10.0);
        rowConstraints.setPrefHeight(30.0);
        rowConstraints.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane0.setPrefHeight(200.0);
        pane0.setPrefWidth(200.0);

        label.setLayoutX(-1.0);
        label.setPrefHeight(60.0);
        label.setPrefWidth(351.0);
        label.setText("      One VS Computer");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f5f4f4"));
        label.setFont(new Font(28.0));

        imageView.setFitHeight(172.0);
        imageView.setFitWidth(404.0);
        imageView.setLayoutX(148.0);
        imageView.setLayoutY(42.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("logo.png").toExternalForm()));

        imageView0.setFitHeight(63.0);
        imageView0.setFitWidth(60.0);
        imageView0.setLayoutX(439.0);
        imageView0.setLayoutY(42.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("XOIcon.png").toExternalForm()));

        gridPane0.setLayoutX(177.0);
        gridPane0.setLayoutY(448.0);
        gridPane0.setPrefHeight(60.0);
        gridPane0.setPrefWidth(351.0);
        gridPane0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0); -fx-background-color: rgba(64, 116, 167,1);");

        columnConstraints0.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints0.setMinWidth(10.0);
        columnConstraints0.setPrefWidth(100.0);

        rowConstraints0.setMinHeight(10.0);
        rowConstraints0.setPrefHeight(30.0);
        rowConstraints0.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane1.setPrefHeight(200.0);
        pane1.setPrefWidth(200.0);

        label0.setPrefHeight(60.0);
        label0.setPrefWidth(351.0);
        label0.setText("     One VS One Onine");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#f5f4f4"));
        label0.setFont(new Font(28.0));

        gridPane1.setLayoutX(177.0);
        gridPane1.setLayoutY(346.0);
        gridPane1.setPrefHeight(60.0);
        gridPane1.setPrefWidth(351.0);
        gridPane1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0); -fx-background-color: rgba(64, 116, 167,1);");

        columnConstraints1.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints1.setMinWidth(10.0);
        columnConstraints1.setPrefWidth(100.0);

        rowConstraints1.setMinHeight(10.0);
        rowConstraints1.setPrefHeight(30.0);
        rowConstraints1.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane2.setPrefHeight(200.0);
        pane2.setPrefWidth(200.0);

        label1.setPrefHeight(60.0);
        label1.setPrefWidth(351.0);
        label1.setText("          One VS One ");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#f5f4f4"));
        label1.setFont(new Font(28.0));

        imageView1.setFitHeight(60.0);
        imageView1.setFitWidth(60.0);
        imageView1.setLayoutX(110.0);
        imageView1.setLayoutY(245.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView1.setImage(new Image(getClass().getResource("computer.png").toExternalForm()));

        imageView2.setFitHeight(69.0);
        imageView2.setFitWidth(68.0);
        imageView2.setLayoutX(107.0);
        imageView2.setLayoutY(439.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.2), 30, 0.5, 0, 0);");
        imageView2.setImage(new Image(getClass().getResource("online.png").toExternalForm()));

        imageView3.setFitHeight(69.0);
        imageView3.setFitWidth(71.0);
        imageView3.setLayoutX(99.0);
        imageView3.setLayoutY(342.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.2), 30, 0.5, 0, 0);");
        imageView3.setImage(new Image(getClass().getResource("two.png").toExternalForm()));

        gridPane.getColumnConstraints().add(columnConstraints);
        gridPane.getRowConstraints().add(rowConstraints);
        pane0.getChildren().add(label);
        gridPane.getChildren().add(pane0);
        pane.getChildren().add(gridPane);
        pane.getChildren().add(imageView);
        pane.getChildren().add(imageView0);
        gridPane0.getColumnConstraints().add(columnConstraints0);
        gridPane0.getRowConstraints().add(rowConstraints0);
        pane1.getChildren().add(label0);
        gridPane0.getChildren().add(pane1);
        pane.getChildren().add(gridPane0);
        gridPane1.getColumnConstraints().add(columnConstraints1);
        gridPane1.getRowConstraints().add(rowConstraints1);
        pane2.getChildren().add(label1);
        gridPane1.getChildren().add(pane2);
        pane.getChildren().add(gridPane1);
        pane.getChildren().add(imageView1);
        pane.getChildren().add(imageView2);
        pane.getChildren().add(imageView3);
        getChildren().add(pane);

    }
}
