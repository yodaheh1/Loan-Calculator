package events;

import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

public class MyObserver extends Application {

    private static void observable() {
        SimpleIntegerProperty smartVar = new SimpleIntegerProperty(10);

        smartVar.addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("Changed to " + newValue);
            }
        });
        smartVar.set(5);
        smartVar.set(25);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        launch();
    }
}
