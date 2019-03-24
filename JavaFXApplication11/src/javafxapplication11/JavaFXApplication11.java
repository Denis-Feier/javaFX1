package javafxapplication11;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApplication11 extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        ChoiceBox<String> choiseBox = new ChoiceBox<>();
        
        choiseBox.getItems().add("Anakin");
        choiseBox.getItems().add("Kitty");
        choiseBox.getItems().addAll("Darth Vader", "Palpatin", "Biscuite");
        choiseBox.setValue("Anakin");
        
        Button button = new Button("Submit");
        
        button.setOnAction(e -> {
            String randomWords = choiseBox.getValue();
            System.out.println(randomWords);
        });
        
        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(choiseBox, button);
        
        
        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
