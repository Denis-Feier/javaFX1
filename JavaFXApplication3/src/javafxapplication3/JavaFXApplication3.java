package javafxapplication3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JavaFXApplication3 extends Application {
    
    Stage window;
    Button b1;
    StackPane layout;
    Scene scene;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        b1 = new Button("AlertBox");
        b1.setOnAction(e -> AlertBox.display("AlertBox", "Asta ii un alert box"));
        
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
