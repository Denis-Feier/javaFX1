package javafxapplication2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApplication2 extends Application {
    
    private Stage window;
    private Scene scene1, scene2;
    private Button b1, b2;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        
        b1 = new Button("Go to Scene2");
        b1.setOnAction(e -> {
            window.setScene(scene2);
            window.setTitle("Scene2");
                });
        
        TextField text1 = new TextField("Scene1");
        
        VBox layout1 = new VBox();
        
        layout1.getChildren().add(text1);
        layout1.getChildren().add(b1);
        
        scene1 = new Scene(layout1, 300, 300);
        
        
        b2 = new Button("Go to Scene1");
        b2.setOnAction(e -> {
            window.setScene(scene1);
            window.setTitle("Scene2");
        });
        
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(b2);
        
        scene2 = new Scene(layout2, 600, 600);
        
        window.setTitle("A random title");
        window.setScene(scene1);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
