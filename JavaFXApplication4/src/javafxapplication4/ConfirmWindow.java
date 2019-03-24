package javafxapplication4;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmWindow {
    
    static boolean value;
    
    public static boolean display(String title, String message){
        
        
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        
        Button b1 = new Button("YES");
        b1.setOnAction(e -> {
            value = true;
            window.close();
        });
        
        Button b2 = new Button("NO");
        b2.setOnAction(e -> {
            value = false;
            window.close();
        });
        
        
        Label l1 = new Label(message);
        
        VBox layout = new VBox();
        layout.setMinWidth(200);
        layout.getChildren().add(l1);
        layout.getChildren().addAll(b1, b2);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.showAndWait();
        
        return value;
    }
}