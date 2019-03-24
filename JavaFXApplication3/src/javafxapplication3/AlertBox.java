package javafxapplication3;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AlertBox {
    public static void display(String title, String message){
        
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        
        Button b1 = new Button("Exit window");
        b1.setOnAction(e -> window.close());
        
        Label l1 = new Label(message);
        
        VBox layout = new VBox();
        layout.setMinWidth(200);
        layout.getChildren().add(l1);
        layout.getChildren().add(b1);
        layout.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.showAndWait();
    }
}
