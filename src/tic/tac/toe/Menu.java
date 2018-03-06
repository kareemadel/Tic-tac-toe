package tic.tac.toe;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

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
    protected final Pane pane0;
    protected final Rectangle rectangle;
    protected final GridPane gridPane2;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints2;
    protected final Pane pane1;
    protected final Text text;
    protected final GridPane gridPane3;
    protected final ColumnConstraints columnConstraints4;
    protected final RowConstraints rowConstraints3;
    protected final Pane pane2;
    protected final Text text0;
    protected final ImageView imageView4;
    protected final Pane pane3;
    protected final Rectangle rectangle0;
    protected final GridPane gridPane4;
    protected final ColumnConstraints columnConstraints5;
    protected final RowConstraints rowConstraints4;
    protected final Pane pane4;
    protected final Text text1;
    protected final GridPane gridPane5;
    protected final ColumnConstraints columnConstraints6;
    protected final RowConstraints rowConstraints5;
    protected final Pane pane5;
    protected final Text text2;
    protected final ImageView imageView5;
    protected final Pane pane6;
    protected final Text text3;
    protected final Pane pane7;
    protected final Text text4;
    protected final Text text5;
    protected final Pane pane8;
    protected final Pane pane9;
    protected final TextField textField;
    protected final Rectangle rectangle1;
    protected final GridPane gridPane6;
    protected final ColumnConstraints columnConstraints7;
    protected final RowConstraints rowConstraints6;
    protected final Pane pane10;
    protected final Text text6;
    protected final GridPane gridPane7;
    protected final ColumnConstraints columnConstraints8;
    protected final RowConstraints rowConstraints7;
    protected final Pane pane11;
    protected final Text text7;
    protected final Pane pane12;
    protected final TextField textField0;
    protected final ImageView imageView6;
    protected final ImageView imageView7;
    protected final Pane pane13;
    protected final TextField textField1;
    protected final Pane pane14;
    protected final Rectangle rectangle2;
    protected final ImageView imageView8;
    protected final Pane pane15;
    protected final Text text8;
    protected final Pane pane16;
    protected final Rectangle rectangle3;
    protected final GridPane gridPane8;
    protected final ColumnConstraints columnConstraints9;
    protected final RowConstraints rowConstraints8;
    protected final Text text9;
    protected final ImageView imageView9;
    protected final ImageView imageView10;

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
        pane0 = new Pane();
        rectangle = new Rectangle();
        gridPane2 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        pane1 = new Pane();
        text = new Text();
        gridPane3 = new GridPane();
        columnConstraints4 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        pane2 = new Pane();
        text0 = new Text();
        imageView4 = new ImageView();
        pane3 = new Pane();
        rectangle0 = new Rectangle();
        gridPane4 = new GridPane();
        columnConstraints5 = new ColumnConstraints();
        rowConstraints4 = new RowConstraints();
        pane4 = new Pane();
        text1 = new Text();
        gridPane5 = new GridPane();
        columnConstraints6 = new ColumnConstraints();
        rowConstraints5 = new RowConstraints();
        pane5 = new Pane();
        text2 = new Text();
        imageView5 = new ImageView();
        pane6 = new Pane();
        text3 = new Text();
        pane7 = new Pane();
        text4 = new Text();
        text5 = new Text();
        pane8 = new Pane();
        pane9 = new Pane();
        textField = new TextField();
        rectangle1 = new Rectangle();
        gridPane6 = new GridPane();
        columnConstraints7 = new ColumnConstraints();
        rowConstraints6 = new RowConstraints();
        pane10 = new Pane();
        text6 = new Text();
        gridPane7 = new GridPane();
        columnConstraints8 = new ColumnConstraints();
        rowConstraints7 = new RowConstraints();
        pane11 = new Pane();
        text7 = new Text();
        pane12 = new Pane();
        textField0 = new TextField();
        imageView6 = new ImageView();
        imageView7 = new ImageView();
        pane13 = new Pane();
        textField1 = new TextField();
        pane14 = new Pane();
        rectangle2 = new Rectangle();
        imageView8 = new ImageView();
        pane15 = new Pane();
        text8 = new Text();
        pane16 = new Pane();
        rectangle3 = new Rectangle();
        gridPane8 = new GridPane();
        columnConstraints9 = new ColumnConstraints();
        rowConstraints8 = new RowConstraints();
        text9 = new Text();
        imageView9 = new ImageView();
        imageView10 = new ImageView();

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

        pane0.setLayoutX(58.0);
        pane0.setLayoutY(220.0);
        pane0.setPrefHeight(250.0);
        pane0.setPrefWidth(588.0);
        pane0.setVisible(false);

        rectangle.setArcHeight(30.0);
        rectangle.setArcWidth(30.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#6795c2"));
        rectangle.setHeight(250.0);
        rectangle.setStroke(javafx.scene.paint.Color.valueOf("#4074a7"));
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setStrokeWidth(7.0);
        rectangle.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        rectangle.setWidth(588.0);

        gridPane2.setLayoutX(79.0);
        gridPane2.setLayoutY(64.0);
        gridPane2.setPrefHeight(78.0);
        gridPane2.setPrefWidth(111.0);
        gridPane2.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane1.setPrefHeight(66.0);
        pane1.setPrefWidth(93.0);

        text.setFill(javafx.scene.paint.Color.valueOf("#e8e5e5"));
        text.setLayoutX(13.0);
        text.setLayoutY(50.0);
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("Host");
        text.setWrappingWidth(85.7294921875);
        text.setFont(new Font(33.0));

        gridPane3.setLayoutX(400.0);
        gridPane3.setLayoutY(64.0);
        gridPane3.setPrefHeight(78.0);
        gridPane3.setPrefWidth(111.0);
        gridPane3.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints4.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints4.setMinWidth(10.0);
        columnConstraints4.setPrefWidth(100.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane2.setPrefHeight(200.0);
        pane2.setPrefWidth(200.0);

        text0.setFill(javafx.scene.paint.Color.valueOf("#e8e5e5"));
        text0.setLayoutX(22.0);
        text0.setLayoutY(50.0);
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Join");
        text0.setWrappingWidth(85.7294921875);
        text0.setFont(new Font(33.0));

        imageView4.setFitHeight(60.0);
        imageView4.setFitWidth(43.0);
        imageView4.setLayoutX(273.0);
        imageView4.setLayoutY(176.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView4.setImage(new Image(getClass().getResource("NO.png").toExternalForm()));

        pane3.setLayoutX(58.0);
        pane3.setLayoutY(220.0);
        pane3.setPrefHeight(300.0);
        pane3.setPrefWidth(588.0);
        pane3.setVisible(false);

        rectangle0.setArcHeight(30.0);
        rectangle0.setArcWidth(30.0);
        rectangle0.setFill(javafx.scene.paint.Color.valueOf("#6795c2"));
        rectangle0.setHeight(300.0);
        rectangle0.setStroke(javafx.scene.paint.Color.valueOf("#4074a7"));
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setStrokeWidth(7.0);
        rectangle0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        rectangle0.setWidth(588.0);

        gridPane4.setLayoutX(79.0);
        gridPane4.setLayoutY(64.0);
        gridPane4.setPrefHeight(40.0);
        gridPane4.setPrefWidth(111.0);
        gridPane4.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints5.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints5.setMinWidth(10.0);
        columnConstraints5.setPrefWidth(100.0);

        rowConstraints4.setMinHeight(10.0);
        rowConstraints4.setPrefHeight(30.0);
        rowConstraints4.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane4.setPrefHeight(66.0);
        pane4.setPrefWidth(93.0);

        text1.setFill(javafx.scene.paint.Color.valueOf("#e8e5e5"));
        text1.setLayoutX(13.0);
        text1.setLayoutY(30.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setText("Your IP");
        text1.setWrappingWidth(85.7294921875);
        text1.setFont(new Font(21.0));

        gridPane5.setLayoutX(79.0);
        gridPane5.setLayoutY(131.0);
        gridPane5.setPrefHeight(40.0);
        gridPane5.setPrefWidth(111.0);
        gridPane5.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints6.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints6.setMinWidth(10.0);
        columnConstraints6.setPrefWidth(100.0);

        rowConstraints5.setMinHeight(10.0);
        rowConstraints5.setPrefHeight(30.0);
        rowConstraints5.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane5.setPrefHeight(200.0);
        pane5.setPrefWidth(200.0);

        text2.setFill(javafx.scene.paint.Color.valueOf("#e8e5e5"));
        text2.setLayoutX(10.0);
        text2.setLayoutY(25.0);
        text2.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text2.setStrokeWidth(0.0);
        text2.setText("Your Port");
        text2.setWrappingWidth(101.7294921875);
        text2.setFont(new Font(21.0));

        imageView5.setFitHeight(60.0);
        imageView5.setFitWidth(43.0);
        imageView5.setLayoutX(257.0);
        imageView5.setLayoutY(211.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView5.setImage(new Image(getClass().getResource("NO.png").toExternalForm()));

        pane6.setLayoutX(257.0);
        pane6.setLayoutY(62.0);
        pane6.setPrefHeight(43.0);
        pane6.setPrefWidth(293.0);
        pane6.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        text3.setFill(javafx.scene.paint.Color.valueOf("#e4dede"));
        text3.setLayoutX(16.0);
        text3.setLayoutY(28.0);
        text3.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text3.setStrokeWidth(0.0);
        text3.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text3.setWrappingWidth(261.7294921875);
        text3.setFont(new Font(22.0));

        pane7.setLayoutX(257.0);
        pane7.setLayoutY(130.0);
        pane7.setPrefHeight(43.0);
        pane7.setPrefWidth(293.0);
        pane7.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        text4.setFill(javafx.scene.paint.Color.valueOf("#e4dede"));
        text4.setLayoutY(31.0);
        text4.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text4.setStrokeWidth(0.0);
        text4.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text4.setWrappingWidth(261.7294921875);
        text4.setFont(new Font(22.0));

        text5.setFill(javafx.scene.paint.Color.valueOf("#f8f4f4"));
        text5.setLayoutX(174.0);
        text5.setLayoutY(281.0);
        text5.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text5.setStrokeWidth(0.0);
        text5.setText("Waiting for connection ...");
        text5.setFont(new Font(19.0));

        pane8.setLayoutX(58.0);
        pane8.setLayoutY(220.0);
        pane8.setPrefHeight(300.0);
        pane8.setPrefWidth(588.0);
        pane8.setVisible(false);

        pane9.setLayoutX(257.0);
        pane9.setLayoutY(62.0);
        pane9.setPrefHeight(43.0);
        pane9.setPrefWidth(293.0);
        pane9.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        rectangle1.setArcHeight(30.0);
        rectangle1.setArcWidth(30.0);
        rectangle1.setFill(javafx.scene.paint.Color.valueOf("#6795c2"));
        rectangle1.setHeight(300.0);
        rectangle1.setStroke(javafx.scene.paint.Color.valueOf("#4074a7"));
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setStrokeWidth(7.0);
        rectangle1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        rectangle1.setWidth(588.0);

        gridPane6.setLayoutX(79.0);
        gridPane6.setLayoutY(64.0);
        gridPane6.setPrefHeight(40.0);
        gridPane6.setPrefWidth(111.0);
        gridPane6.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints7.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints7.setMinWidth(10.0);
        columnConstraints7.setPrefWidth(100.0);

        rowConstraints6.setMinHeight(10.0);
        rowConstraints6.setPrefHeight(30.0);
        rowConstraints6.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane10.setPrefHeight(66.0);
        pane10.setPrefWidth(93.0);

        text6.setFill(javafx.scene.paint.Color.valueOf("#e8e5e5"));
        text6.setLayoutX(50.0);
        text6.setLayoutY(30.0);
        text6.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text6.setStrokeWidth(0.0);
        text6.setText("IP");
        text6.setWrappingWidth(85.7294921875);
        text6.setFont(new Font(21.0));

        gridPane7.setLayoutX(79.0);
        gridPane7.setLayoutY(131.0);
        gridPane7.setPrefHeight(40.0);
        gridPane7.setPrefWidth(111.0);
        gridPane7.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints8.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints8.setMinWidth(10.0);
        columnConstraints8.setPrefWidth(100.0);

        rowConstraints7.setMinHeight(10.0);
        rowConstraints7.setPrefHeight(30.0);
        rowConstraints7.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        pane11.setPrefHeight(200.0);
        pane11.setPrefWidth(200.0);

        text7.setFill(javafx.scene.paint.Color.valueOf("#e8e5e5"));
        text7.setLayoutX(36.0);
        text7.setLayoutY(25.0);
        text7.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text7.setStrokeWidth(0.0);
        text7.setText("Port");
        text7.setWrappingWidth(101.7294921875);
        text7.setFont(new Font(21.0));

        pane12.setLayoutX(257.0);
        pane12.setLayoutY(130.0);
        pane12.setPrefHeight(43.0);
        pane12.setPrefWidth(293.0);
        pane12.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        textField0.setLayoutX(-1.0);
        textField0.setLayoutY(9.0);
        textField0.setPrefHeight(26.0);
        textField0.setPrefWidth(262.0);

        imageView6.setFitHeight(60.0);
        imageView6.setFitWidth(95.0);
        imageView6.setLayoutX(335.0);
        imageView6.setLayoutY(222.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView6.setImage(new Image(getClass().getResource("connect.png").toExternalForm()));

        imageView7.setFitHeight(43.0);
        imageView7.setFitWidth(60.0);
        imageView7.setLayoutX(180.0);
        imageView7.setLayoutY(217.0);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);
        imageView7.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView7.setImage(new Image(getClass().getResource("NO.png").toExternalForm()));

        pane13.setLayoutX(257.0);
        pane13.setLayoutY(63.0);
        pane13.setPrefHeight(43.0);
        pane13.setPrefWidth(293.0);
        pane13.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        textField1.setLayoutX(-1.0);
        textField1.setLayoutY(9.0);
        textField1.setPrefHeight(26.0);
        textField1.setPrefWidth(262.0);

        pane14.setLayoutX(58.0);
        pane14.setLayoutY(220.0);
        pane14.setPrefHeight(300.0);
        pane14.setPrefWidth(588.0);
        pane14.setVisible(false);

        rectangle2.setArcHeight(30.0);
        rectangle2.setArcWidth(30.0);
        rectangle2.setFill(javafx.scene.paint.Color.valueOf("#6795c2"));
        rectangle2.setHeight(300.0);
        rectangle2.setStroke(javafx.scene.paint.Color.valueOf("#4074a7"));
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setStrokeWidth(7.0);
        rectangle2.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        rectangle2.setWidth(588.0);

        imageView8.setFitHeight(43.0);
        imageView8.setFitWidth(60.0);
        imageView8.setLayoutX(273.0);
        imageView8.setLayoutY(221.0);
        imageView8.setPickOnBounds(true);
        imageView8.setPreserveRatio(true);
        imageView8.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView8.setImage(new Image(getClass().getResource("ok.png").toExternalForm()));

        pane15.setLayoutX(36.0);
        pane15.setLayoutY(28.0);
        pane15.setPrefHeight(168.0);
        pane15.setPrefWidth(519.0);
        pane15.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.2), 30, 0.5, 0, 0); -fx-background-color: #4074a7;");

        text8.setFill(javafx.scene.paint.Color.valueOf("#f2ecec"));
        text8.setLayoutX(9.0);
        text8.setLayoutY(78.0);
        text8.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text8.setStrokeWidth(0.0);
        text8.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text8.setWrappingWidth(501.72948837280273);
        text8.setFont(new Font(21.0));

        pane16.setLayoutX(85.0);
        pane16.setLayoutY(229.0);
        pane16.setPrefHeight(250.0);
        pane16.setPrefWidth(535.0);
        pane16.setVisible(false);

        rectangle3.setArcHeight(30.0);
        rectangle3.setArcWidth(30.0);
        rectangle3.setFill(javafx.scene.paint.Color.valueOf("#6795c2"));
        rectangle3.setHeight(260.0);
        rectangle3.setLayoutX(-1.0);
        rectangle3.setStroke(javafx.scene.paint.Color.valueOf("#4074a7"));
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setStrokeWidth(7.0);
        rectangle3.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        rectangle3.setWidth(535.0);

        gridPane8.setLayoutX(115.0);
        gridPane8.setLayoutY(90.0);
        gridPane8.setPrefHeight(40.0);
        gridPane8.setPrefWidth(320.0);
        gridPane8.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints9.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints9.setMinWidth(10.0);
        columnConstraints9.setPrefWidth(100.0);

        rowConstraints8.setMinHeight(10.0);
        rowConstraints8.setPrefHeight(30.0);
        rowConstraints8.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        text9.setFill(javafx.scene.paint.Color.valueOf("#f5f3f3"));
        text9.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text9.setStrokeWidth(0.0);
        text9.setText("Do you want to exit the game?");
        text9.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text9.setWrappingWidth(321.3564453125);
        text9.setFont(new Font(15.0));

        imageView9.setFitHeight(40.0);
        imageView9.setFitWidth(48.0);
        imageView9.setLayoutX(326.0);
        imageView9.setLayoutY(176.0);
        imageView9.setPickOnBounds(true);
        imageView9.setPreserveRatio(true);
        imageView9.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView9.setImage(new Image(getClass().getResource("ok.png").toExternalForm()));

        imageView10.setFitHeight(40.0);
        imageView10.setFitWidth(40.0);
        imageView10.setLayoutX(161.0);
        imageView10.setLayoutY(176.0);
        imageView10.setPickOnBounds(true);
        imageView10.setPreserveRatio(true);
        imageView10.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView10.setImage(new Image(getClass().getResource("NO.png").toExternalForm()));

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
        pane0.getChildren().add(rectangle);
        gridPane2.getColumnConstraints().add(columnConstraints3);
        gridPane2.getRowConstraints().add(rowConstraints2);
        pane1.getChildren().add(text);
        gridPane2.getChildren().add(pane1);
        pane0.getChildren().add(gridPane2);
        gridPane3.getColumnConstraints().add(columnConstraints4);
        gridPane3.getRowConstraints().add(rowConstraints3);
        pane2.getChildren().add(text0);
        gridPane3.getChildren().add(pane2);
        pane0.getChildren().add(gridPane3);
        pane0.getChildren().add(imageView4);
        pane.getChildren().add(pane0);
        pane3.getChildren().add(rectangle0);
        gridPane4.getColumnConstraints().add(columnConstraints5);
        gridPane4.getRowConstraints().add(rowConstraints4);
        pane4.getChildren().add(text1);
        gridPane4.getChildren().add(pane4);
        pane3.getChildren().add(gridPane4);
        gridPane5.getColumnConstraints().add(columnConstraints6);
        gridPane5.getRowConstraints().add(rowConstraints5);
        pane5.getChildren().add(text2);
        gridPane5.getChildren().add(pane5);
        pane3.getChildren().add(gridPane5);
        pane3.getChildren().add(imageView5);
        pane6.getChildren().add(text3);
        pane3.getChildren().add(pane6);
        pane7.getChildren().add(text4);
        pane3.getChildren().add(pane7);
        pane3.getChildren().add(text5);
        pane.getChildren().add(pane3);
        pane9.getChildren().add(textField);
        pane8.getChildren().add(pane9);
        pane8.getChildren().add(rectangle1);
        gridPane6.getColumnConstraints().add(columnConstraints7);
        gridPane6.getRowConstraints().add(rowConstraints6);
        pane10.getChildren().add(text6);
        gridPane6.getChildren().add(pane10);
        pane8.getChildren().add(gridPane6);
        gridPane7.getColumnConstraints().add(columnConstraints8);
        gridPane7.getRowConstraints().add(rowConstraints7);
        pane11.getChildren().add(text7);
        gridPane7.getChildren().add(pane11);
        pane8.getChildren().add(gridPane7);
        pane12.getChildren().add(textField0);
        pane8.getChildren().add(pane12);
        pane8.getChildren().add(imageView6);
        pane8.getChildren().add(imageView7);
        pane13.getChildren().add(textField1);
        pane8.getChildren().add(pane13);
        pane.getChildren().add(pane8);
        pane14.getChildren().add(rectangle2);
        pane14.getChildren().add(imageView8);
        pane15.getChildren().add(text8);
        pane14.getChildren().add(pane15);
        pane.getChildren().add(pane14);
        pane16.getChildren().add(rectangle3);
        gridPane8.getColumnConstraints().add(columnConstraints9);
        gridPane8.getRowConstraints().add(rowConstraints8);
        gridPane8.getChildren().add(text9);
        pane16.getChildren().add(gridPane8);
        pane16.getChildren().add(imageView9);
        pane16.getChildren().add(imageView10);
        pane.getChildren().add(pane16);
        getChildren().add(pane);

    }
}
