package inclass;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoanCalc extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create labels and text fields for input
        Label investmentLabel = new Label("Investment Amount:");
        TextField investmentField = new TextField();

        Label yearsLabel = new Label("Number of Years:");
        TextField yearsField = new TextField();

        Label rateLabel = new Label("Annual Interest Rate:");
        TextField rateField = new TextField();

        // Create a button to calculate the future value
        Button calculateButton = new Button("Calculate");

        // Create a label to display the future value
        Label futureValueLabel = new Label("Future Value:");
        TextField futureValueField = new TextField();
        futureValueField.setEditable(false); // Make it read-only

        // Set up the layout
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        // Add components to the grid pane
        gridPane.add(investmentLabel, 0, 0);
        gridPane.add(investmentField, 1, 0);
        gridPane.add(yearsLabel, 0, 1);
        gridPane.add(yearsField, 1, 1);
        gridPane.add(rateLabel, 0, 2);
        gridPane.add(rateField, 1, 2);
        gridPane.add(calculateButton, 0, 3);
        gridPane.add(futureValueLabel, 0, 4);
        gridPane.add(futureValueField, 1, 4);

        // Event handler for the calculate button
        calculateButton.setOnAction(event -> {
            // Get input values
            double investmentAmount = Double.parseDouble(investmentField.getText());
            int numberOfYears = Integer.parseInt(yearsField.getText());
            double annualInterestRate = Double.parseDouble(rateField.getText());

            // Calculate monthly interest rate
            double monthlyInterestRate = annualInterestRate / 100 / 12;

            // Calculate future value
            double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

            // Display future value
            futureValueField.setText(String.format("%.2f", futureValue));
        });

        // Create the scene and set it to the stage
        Scene scene = new Scene(gridPane, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Future Value Calculator");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

