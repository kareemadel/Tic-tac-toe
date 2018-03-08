package tic.tac.toe;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

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
    protected final Pane pane9;
    protected final Line line;
    protected final Line line0;
    protected final Line line1;
    protected final Line line2;
    protected final Line line3;
    protected final Line line4;
    protected final Line line5;
    protected final Line line6;
    protected final Pane pane10;
    protected final ImageView imageView13;
    protected final ImageView imageView14;
    protected final Pane pane11;
    protected final Rectangle rectangle;
    protected final GridPane gridPane0;
    protected final ColumnConstraints columnConstraints2;
    protected final RowConstraints rowConstraints2;
    protected final Text text;
    protected final ImageView imageView15;
    protected final ImageView imageView16;
    protected final Pane pane12;
    protected final Rectangle rectangle0;
    protected final GridPane gridPane1;
    protected final ColumnConstraints columnConstraints3;
    protected final RowConstraints rowConstraints3;
    protected final Text text0;
    protected final ImageView imageView17;
    protected final ImageView imageView18;
    protected final ImageView imageView19;
    protected final Pane pane13;
    protected final Rectangle rectangle1;
    protected final ImageView imageView110;
    protected final Pane pane14;
    protected final Text text1;
    protected final ImageView[] cells;
    protected final Line[] lines;
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
        pane9 = new Pane();
        line = new Line();
        line0 = new Line();
        line1 = new Line();
        line2 = new Line();
        line3 = new Line();
        line4 = new Line();
        line5 = new Line();
        line6 = new Line();
        pane10 = new Pane();
        imageView13 = new ImageView();
        imageView14 = new ImageView();
        pane11 = new Pane();
        rectangle = new Rectangle();
        gridPane0 = new GridPane();
        columnConstraints2 = new ColumnConstraints();
        rowConstraints2 = new RowConstraints();
        text = new Text();
        imageView15 = new ImageView();
        imageView16 = new ImageView();
        pane12 = new Pane();
        rectangle0 = new Rectangle();
        gridPane1 = new GridPane();
        columnConstraints3 = new ColumnConstraints();
        rowConstraints3 = new RowConstraints();
        text0 = new Text();
        imageView17 = new ImageView();
        imageView18 = new ImageView();
        imageView19 = new ImageView();
        pane13 = new Pane();
        rectangle1 = new Rectangle();
        imageView110 = new ImageView();
        pane14 = new Pane();
        text1 = new Text();

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
//        imageView12.setVisible(false);

        pane9.setLayoutX(143.0);
        pane9.setLayoutY(130.0);
        pane9.setPrefHeight(364.0);
        pane9.setPrefWidth(402.0);
        pane9.setVisible(false);

        line.setEndY(110.0);
        line.setLayoutX(75.0);
        line.setLayoutY(245.0);
        line.setStartY(-240.0);
        line.setStrokeWidth(3.0);
        line.setVisible(false);

        line0.setEndY(110.0);
        line0.setLayoutX(200.0);
        line0.setLayoutY(245.0);
        line0.setStartY(-240.0);
        line0.setStrokeWidth(3.0);
        line0.setVisible(false);

        line1.setEndY(110.0);
        line1.setLayoutX(325.0);
        line1.setLayoutY(245.0);
        line1.setStartY(-240.0);
        line1.setStrokeWidth(3.0);
        line1.setVisible(false);

        line2.setEndX(115.0);
        line2.setLayoutX(275.0);
        line2.setLayoutY(60.0);
        line2.setStartX(-260.0);
        line2.setStrokeWidth(3.0);
        line2.setVisible(false);

        line3.setEndX(100.0);
        line3.setLayoutX(290.0);
        line3.setLayoutY(179.0);
        line3.setStartX(-277.0);
        line3.setStrokeWidth(3.0);
        line3.setVisible(false);

        line4.setEndX(100.0);
        line4.setLayoutX(290.0);
        line4.setLayoutY(296.0);
        line4.setStartX(-277.0);
        line4.setStrokeMiterLimit(0.0);
        line4.setStrokeWidth(3.0);
        line4.setVisible(false);

        line5.setEndX(-578.0);
        line5.setEndY(333.0);
        line5.setLayoutX(600.0);
        line5.setLayoutY(30.0);
        line5.setRotate(-91.0);
        line5.setStartX(-220.0);
        line5.setStartY(-35.0);
        line5.setStrokeWidth(3.0);
        line5.setVisible(false);

        line6.setEndX(-578.0);
        line6.setEndY(333.0);
        line6.setLayoutX(600.0);
        line6.setLayoutY(30.0);
        line6.setRotate(3.0);
        line6.setStartX(-220.0);
        line6.setStartY(-35.0);
        line6.setStrokeWidth(3.0);
        line6.setVisible(false);

        pane10.setLayoutX(74.0);
        pane10.setLayoutY(89.0);
        pane10.setPrefHeight(273.0);
        pane10.setPrefWidth(548.0);
        pane10.setVisible(false);

        imageView13.setFitHeight(239.0);
        imageView13.setFitWidth(548.0);
        imageView13.setPickOnBounds(true);
        imageView13.setPreserveRatio(true);
        imageView13.setImage(new Image(getClass().getResource("winnero.png").toExternalForm()));

        imageView14.setFitHeight(48.0);
        imageView14.setFitWidth(48.0);
        imageView14.setLayoutX(379.0);
        imageView14.setLayoutY(203.0);
        imageView14.setPickOnBounds(true);
        imageView14.setPreserveRatio(true);
        imageView14.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView14.setImage(new Image(getClass().getResource("ok.png").toExternalForm()));

        pane11.setLayoutX(135.0);
        pane11.setLayoutY(225.0);
        pane11.setPrefHeight(182.0);
        pane11.setPrefWidth(425.0);
        pane11.setVisible(false);

        rectangle.setArcHeight(30.0);
        rectangle.setArcWidth(30.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#6795c2"));
        rectangle.setHeight(182.0);
        rectangle.setStroke(javafx.scene.paint.Color.valueOf("#4074a7"));
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setStrokeWidth(7.0);
        rectangle.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        rectangle.setWidth(425.0);

        gridPane0.setLayoutX(58.0);
        gridPane0.setLayoutY(60.0);
        gridPane0.setPrefHeight(40.0);
        gridPane0.setPrefWidth(320.0);
        gridPane0.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints2.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints2.setMinWidth(10.0);
        columnConstraints2.setPrefWidth(100.0);

        rowConstraints2.setMinHeight(10.0);
        rowConstraints2.setPrefHeight(30.0);
        rowConstraints2.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        text.setFill(javafx.scene.paint.Color.valueOf("#f5f3f3"));
        text.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text.setStrokeWidth(0.0);
        text.setText("No Winners , Do you want to play again ?");
        text.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text.setWrappingWidth(321.3564453125);
        text.setFont(new Font(15.0));

        imageView15.setFitHeight(40.0);
        imageView15.setFitWidth(48.0);
        imageView15.setLayoutX(283.0);
        imageView15.setLayoutY(120.0);
        imageView15.setPickOnBounds(true);
        imageView15.setPreserveRatio(true);
        imageView15.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView15.setImage(new Image(getClass().getResource("ok.png").toExternalForm()));

        imageView16.setFitHeight(40.0);
        imageView16.setFitWidth(40.0);
        imageView16.setLayoutX(112.0);
        imageView16.setLayoutY(120.0);
        imageView16.setPickOnBounds(true);
        imageView16.setPreserveRatio(true);
        imageView16.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView16.setImage(new Image(getClass().getResource("NO.png").toExternalForm()));

        pane12.setLayoutX(135.0);
        pane12.setLayoutY(225.0);
        pane12.setPrefHeight(182.0);
        pane12.setPrefWidth(425.0);
        pane12.setVisible(false);

        rectangle0.setArcHeight(30.0);
        rectangle0.setArcWidth(30.0);
        rectangle0.setFill(javafx.scene.paint.Color.valueOf("#6795c2"));
        rectangle0.setHeight(182.0);
        rectangle0.setStroke(javafx.scene.paint.Color.valueOf("#4074a7"));
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setStrokeWidth(7.0);
        rectangle0.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        rectangle0.setWidth(425.0);

        gridPane1.setLayoutX(58.0);
        gridPane1.setLayoutY(34.0);
        gridPane1.setPrefHeight(40.0);
        gridPane1.setPrefWidth(320.0);
        gridPane1.setStyle("-fx-background-color: #4074a7; -fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");

        columnConstraints3.setHgrow(javafx.scene.layout.Priority.SOMETIMES);
        columnConstraints3.setMinWidth(10.0);
        columnConstraints3.setPrefWidth(100.0);

        rowConstraints3.setMinHeight(10.0);
        rowConstraints3.setPrefHeight(30.0);
        rowConstraints3.setVgrow(javafx.scene.layout.Priority.SOMETIMES);

        text0.setFill(javafx.scene.paint.Color.valueOf("#f5f3f3"));
        text0.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text0.setStrokeWidth(0.0);
        text0.setText("Do you want to back to the Menu?");
        text0.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text0.setWrappingWidth(321.3564453125);
        text0.setFont(new Font(15.0));

        imageView17.setFitHeight(40.0);
        imageView17.setFitWidth(48.0);
        imageView17.setLayoutX(316.0);
        imageView17.setLayoutY(130.0);
        imageView17.setPickOnBounds(true);
        imageView17.setPreserveRatio(true);
        imageView17.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView17.setImage(new Image(getClass().getResource("ok.png").toExternalForm()));

        imageView18.setFitHeight(40.0);
        imageView18.setFitWidth(40.0);
        imageView18.setLayoutX(193.0);
        imageView18.setLayoutY(130.0);
        imageView18.setPickOnBounds(true);
        imageView18.setPreserveRatio(true);
        imageView18.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView18.setImage(new Image(getClass().getResource("NO.png").toExternalForm()));

        imageView19.setFitHeight(40.0);
        imageView19.setFitWidth(69.0);
        imageView19.setLayoutX(76.0);
        imageView19.setLayoutY(130.0);
        imageView19.setPickOnBounds(true);
        imageView19.setPreserveRatio(true);
        imageView19.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView19.setImage(new Image(getClass().getResource("exit.png").toExternalForm()));

        pane13.setLayoutX(58.0);
        pane13.setLayoutY(220.0);
        pane13.setPrefHeight(300.0);
        pane13.setPrefWidth(588.0);
        pane13.setVisible(false);

        rectangle1.setArcHeight(30.0);
        rectangle1.setArcWidth(30.0);
        rectangle1.setFill(javafx.scene.paint.Color.valueOf("#6795c2"));
        rectangle1.setHeight(300.0);
        rectangle1.setStroke(javafx.scene.paint.Color.valueOf("#4074a7"));
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setStrokeWidth(7.0);
        rectangle1.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        rectangle1.setWidth(588.0);

        imageView110.setFitHeight(43.0);
        imageView110.setFitWidth(60.0);
        imageView110.setLayoutX(273.0);
        imageView110.setLayoutY(221.0);
        imageView110.setPickOnBounds(true);
        imageView110.setPreserveRatio(true);
        imageView110.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0) dropshadow(three-pass-box, rgba(0, 0, 0, 0.32), 30, 0.5, 0, 0);");
        imageView110.setImage(new Image(getClass().getResource("ok.png").toExternalForm()));

        pane14.setLayoutX(36.0);
        pane14.setLayoutY(28.0);
        pane14.setPrefHeight(168.0);
        pane14.setPrefWidth(519.0);
        pane14.setStyle("-fx-effect: dropshadow(three-pass-box, rgba(0, 0, 0, 0.2), 30, 0.5, 0, 0); -fx-background-color: #4074a7;");

        text1.setFill(javafx.scene.paint.Color.valueOf("#f2ecec"));
        text1.setLayoutX(9.0);
        text1.setLayoutY(78.0);
        text1.setStrokeType(javafx.scene.shape.StrokeType.OUTSIDE);
        text1.setStrokeWidth(0.0);
        text1.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        text1.setWrappingWidth(501.72948837280273);
        text1.setFont(new Font(21.0));

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
        pane9.getChildren().add(line);
        pane9.getChildren().add(line0);
        pane9.getChildren().add(line1);
        pane9.getChildren().add(line2);
        pane9.getChildren().add(line3);
        pane9.getChildren().add(line4);
        pane9.getChildren().add(line5);
        pane9.getChildren().add(line6);
        pane.getChildren().add(pane9);
        pane10.getChildren().add(imageView13);
        pane10.getChildren().add(imageView14);
        pane.getChildren().add(pane10);
        pane11.getChildren().add(rectangle);
        gridPane0.getColumnConstraints().add(columnConstraints2);
        gridPane0.getRowConstraints().add(rowConstraints2);
        gridPane0.getChildren().add(text);
        pane11.getChildren().add(gridPane0);
        pane11.getChildren().add(imageView15);
        pane11.getChildren().add(imageView16);
        pane.getChildren().add(pane11);
        pane12.getChildren().add(rectangle0);
        gridPane1.getColumnConstraints().add(columnConstraints3);
        gridPane1.getRowConstraints().add(rowConstraints3);
        gridPane1.getChildren().add(text0);
        pane12.getChildren().add(gridPane1);
        pane12.getChildren().add(imageView17);
        pane12.getChildren().add(imageView18);
        pane12.getChildren().add(imageView19);
        pane.getChildren().add(pane12);
        pane13.getChildren().add(rectangle1);
        pane13.getChildren().add(imageView110);
        pane14.getChildren().add(text1);
        pane13.getChildren().add(pane14);
        pane.getChildren().add(pane13);
        getChildren().add(pane);
        cells = new ImageView[] {imageView, imageView0, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7};
        lines = new Line[] {line,line0,line1,line2,line3,line4,line5,line6};

    }
}
