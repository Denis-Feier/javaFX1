package javafxapplication12;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApplication12 extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Mouth Gag", "Spank Me","Choke Me","Tie me up","Whips","Restraints");
        
        Button button = new Button("Submit");
        
        VBox layout = new VBox();
        layout.setPadding(new Insets(10));
        layout.getChildren().addAll(comboBox, button);
        
        comboBox.setOnAction(e -> {
            System.out.println(comboBox.getValue());
        });
        
        button.setOnAction(e -> {
            System.out.println("Order:" + comboBox.getValue());
        });
        
        comboBox.setPromptText("Chestii Inocente");
        comboBox.setEditable(true);
        
        window.setScene(new Scene(layout, 300, 300));
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
