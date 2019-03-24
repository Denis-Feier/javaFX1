package javafxapplication9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class JavaFXApplication9 extends Application {
    
    Stage window;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        
        Label username = new Label("Username:");
        GridPane.setConstraints(username, 0, 0);
        
        Label password = new Label("Password:");
        GridPane.setConstraints(password, 0, 1);
        
        TextField fieldUsername = new TextField();
        GridPane.setConstraints(fieldUsername, 1, 0);
        
        PasswordField fieldPassword = new PasswordField();
        GridPane.setConstraints(fieldPassword, 1, 1);
        
        Button submit = new Button("Submit");
        GridPane.setConstraints(submit, 1, 2);
        
        submit.setOnAction(e ->{
            String s_username = fieldUsername.getText();
            String s_password = fieldPassword.getText();
            
            if(s_password.length() != 0 && s_username.length() != 0){
                fieldPassword.setText("");
                fieldUsername.setText("");
                
                System.out.println("Username: " + s_username + "\nPassword: " + s_password);
            }
        });
        
        grid.getChildren().addAll(username, fieldUsername, password, fieldPassword, submit);
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.setTitle("Titlu");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
