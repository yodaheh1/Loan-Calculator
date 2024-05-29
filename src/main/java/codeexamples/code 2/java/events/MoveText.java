package events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MoveText extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Text text = new Text(20 , 20, "Java is fun!!");
        pane.getChildren().add(text);

        text.setOnKeyPressed(e -> {
            switch (e.getCode()){
                case DOWN:
                    text.setY(text.getY() - 10);
                    break;
                case UP:
                    text.setY(text.getY() + 10);
                case LEFT:
                    text.setX(text.getX() - 10);
                case RIGHT:
                    text.setX(text.getX() + 10);
                default:
//                    if(Character.isLetterOrDigit(e.getText().charAt(0)));
            }
        });

        Scene scene = new Scene(pane, 400 , 300);
        primaryStage.setTitle("Moving Text");
        primaryStage.setScene(scene);
        primaryStage.show();

        text.requestFocus();
    }
}
