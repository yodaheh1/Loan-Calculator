package inclass;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MoveText extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Text text = new Text(20,20, "Java is Cool!!");
        pane.getChildren().add(text);

        text.setOnKeyPressed(event -> {
            switch (event.getCode()){
                case DOWN:
                    text.setY(text.getY()  + 10);
                    break;
                case UP:
                    text.setY(text.getY()  - 10);
                    break;
                case LEFT:
                    text.setX(text.getX()  - 10);
                    break;
                case RIGHT:
                    text.setX(text.getX()  + 10);
                    break;
                default:
                    System.out.println("Key not assigned");
            }
        });

        Scene scene = new Scene(pane, 400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Moving Text");
        primaryStage.show();

        text.requestFocus();
    }
}
