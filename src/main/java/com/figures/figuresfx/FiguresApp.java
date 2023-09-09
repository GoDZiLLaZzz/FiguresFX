package com.figures.figuresfx;

import com.figures.interfaces.IShape;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FiguresApp extends Application {


    private WritableImage image;
    private GraphicsContext graphicsContext;
    private int figuresCount = 0;
    private int pointsCount = 0;
    private List<IShape> listFigures = new ArrayList<>();
    private List<Double> listPoints = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {


        FXMLLoader fxmlLoader = new FXMLLoader(FiguresApp.class.getResource("hello-view.fxml"));
        VBox root = fxmlLoader.load();


        // Получаем контроллер
        FiguresController controller = fxmlLoader.getController();

        // Устанавливаем зависимость
        controller.setApplication(this);


        Scene scene = new Scene(root, 950, 700);
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());
        stage.setTitle("FiguresApp");
        stage.setScene(scene);
        stage.show();

        // Assuming you have a Canvas component in your FXML named "canvas"
        Canvas canvas = (Canvas) root.lookup("#canvas");
        graphicsContext = canvas.getGraphicsContext2D();

        // Initialize the image with the canvas size
        image = new WritableImage((int) canvas.getWidth(), (int) canvas.getHeight());
        graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.drawImage(image, 0, 0);

        // Draw X and Y axes
        drawAxes(canvas.getWidth(), canvas.getHeight());
    }

    public void drawAxes(double canvasWidth, double canvasHeight) {
        graphicsContext.setStroke(Color.GRAY);
        graphicsContext.setLineWidth(1);

        // X-axis
        graphicsContext.strokeLine(0, canvasHeight / 2, canvasWidth, canvasHeight / 2);

        // Y-axis
        graphicsContext.strokeLine(canvasWidth / 2, 0, canvasWidth / 2, canvasHeight);
    }

    public void setPointsCount(int value) {
        pointsCount = value;
    }


    public void setFiguresCount(int value) {
        figuresCount = value;
    }

    public void incPointsCount(){
        pointsCount++;
    }

    public void incFiguresCount(){
        figuresCount++;
    }

    public void decFiguresCount(){
       figuresCount--;
    }

    public int getPointsCount() {
        return pointsCount;
    }

    public int getFiguresCount() {
        return figuresCount;
    }


    public List<Double> getListPoints(){
        return listPoints;
    }

    public List<IShape> getListFigures(){
        return listFigures;
    }


    public static void main(String[] args) {
        launch();
    }
}
