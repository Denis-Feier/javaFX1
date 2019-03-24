package javafxapplication8;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXApplication8 extends Application {
    
    Stage window;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Titlul");
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(10);
        grid.setVgap(10);
        
        Label username = new Label("Username:");
        GridPane.setConstraints(username, 0, 0);
        
        TextField insetname = new TextField();
        GridPane.setConstraints(insetname, 1, 0);
        
        
        Label password = new Label("Password:");
        GridPane.setConstraints(password, 0, 1);
        
        TextField insetpassword = new TextField();
        GridPane.setConstraints(insetpassword, 1, 1);
        
        Button button = new Button("Submit");
        GridPane.setConstraints(button, 1, 2);
        
        grid.getChildren().addAll(username, insetname, password, insetpassword, button);
        window.setScene(new Scene(grid));
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
