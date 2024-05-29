package inclass;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DragRectangle extends Application {

    private double offsetX;
    private double offsetY;

    @Override
    public void start(Stage primaryStage) {
        // Create a rectangle
        Rectangle rectangle = new Rectangle(100, 100, Color.POWDERBLUE);
        rectangle.setX(100);
        rectangle.setY(100);

        // Create a pane
        Pane pane = new Pane();
        pane.getChildren().add(rectangle);

        // Create a scene and add the pane to it
        Scene scene = new Scene(pane, 400, 400);

        // Add event handlers for mouse events
        rectangle.setOnMousePressed(event -> {
            // Calculate the offset between mouse position and rectangle position
            offsetX = event.getX() - rectangle.getX();
            offsetY = event.getY() - rectangle.getY();
        });

        rectangle.setOnMouseDragged(event -> {
            // Update the rectangle position based on mouse position
            double newX = event.getX() - offsetX;
            double newY = event.getY() - offsetY;
            rectangle.setX(newX);
            rectangle.setY(newY);
        });

        // Set the scene to the stage and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("Drag Rectangle");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

