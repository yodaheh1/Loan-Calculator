package inclass;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MovingCircle extends Application {

    private static final double CIRCLE_RADIUS = 20;
    private Circle circle;

    @Override
    public void start(Stage primaryStage) {
        // Create a circle
        circle = new Circle(CIRCLE_RADIUS, Color.PINK);
        circle.setCenterX(100);
        circle.setCenterY(100);

        // Create a pane
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        // Create a scene and add the pane to it
        Scene scene = new Scene(pane, 300, 300);

        // Set the event handler for key presses
        scene.setOnKeyPressed(event -> {
            // Move the circle based on the arrow key pressed
            KeyCode code = event.getCode();
            switch (code) {
                case UP:
                    circle.setCenterY(circle.getCenterY() - 10);
                    break;
                case DOWN:
                    circle.setCenterY(circle.getCenterY() + 10);
                    break;
                case LEFT:
                    circle.setCenterX(circle.getCenterX() - 10);
                    break;
                case RIGHT:
                    circle.setCenterX(circle.getCenterX() + 10);
                    break;
                default:
                    break;
            }
        });

        // Set the scene to the stage and show it
        primaryStage.setScene(scene);
        primaryStage.setTitle("Circle Movement");
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}

