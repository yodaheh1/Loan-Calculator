package inclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonApp extends Application {

    private static int numberOfClicks = 0;

    @Override
    public void start (Stage primaryStage) throws Exception {
        Label label = new Label("Not clicked");
        Button button = new Button("Clicked");

//        //To get action when button is clicked on
//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                label.setText("Clicked, Again!!!");
//            System.out.println("Clicked!!!");
//            }
//        });

//        button.setOnAction(e -> {
//            label.setText("Clicked via Lambda!");
//        });

        //Shows how many times the button was clicked in the terminal
        button.setOnAction(event -> {
            numberOfClicks++;
            System.out.println("Clicks: " + numberOfClicks + "times.");
            System.out.println(event.toString());
        });


        HBox hBox = new HBox(label,button);
        //To center it no matter what the window size
        hBox.setAlignment(Pos.CENTER);
        //To space out the text and the button
        hBox.setSpacing(20.0);
        Scene scene = new Scene(hBox,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
