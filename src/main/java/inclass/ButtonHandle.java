package inclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class ButtonHandle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox pane = new HBox(10);
        pane.setAlignment(Pos.CENTER);
        Button btOk = new Button("OK");
        Button btCancel = new Button("Cancel");

        OKHandlerClass okHandlerClass = new OKHandlerClass();
        btOk.setOnAction(okHandlerClass);

        CancelHandlerClass cancelHandlerClass = new CancelHandlerClass();
        btCancel.setOnAction(cancelHandlerClass);

        pane.getChildren().addAll(btOk, btCancel);
        Scene scene = new Scene(pane, 200,100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Button Handler");
        primaryStage.show();
    }
}

class OKHandlerClass implements EventHandler<ActionEvent>{
    @Override
    public void handle (ActionEvent event){
        System.out.println("Ok Button Clicked ....");
    }
}

class CancelHandlerClass implements EventHandler<ActionEvent>{
    @Override
    public void handle (ActionEvent event){
        System.out.println("Cancel Button Clicked ....");
    }
}