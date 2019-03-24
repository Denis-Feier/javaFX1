package javafxapplication4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXApplication4 extends Application {
      
    Stage window;
    Button b1;
    StackPane layout;
    Scene scene;
    boolean value;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        b1 = new Button("APASA");
        b1.setOnAction(e -> {
            value = ConfirmWindow.display("ConfirmWindow", "Vrei sa pupi pisica?");
            System.out.println(value);
        });
        
        layout = new StackPane();
        layout.getChildren().add(b1);
        
        scene = new Scene(layout, 300, 300);
        
        window.setScene(scene);
        window.setTitle("Primary Window");
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
