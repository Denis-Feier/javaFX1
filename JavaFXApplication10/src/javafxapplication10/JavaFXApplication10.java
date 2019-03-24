package javafxapplication10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApplication10 extends Application {
    
    
    Stage window;
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        VBox layout = new VBox(10);
        
        CheckBox cb1 = new CheckBox("Anal");
        CheckBox cb2 = new CheckBox("Oral");
        CheckBox cb3 = new CheckBox("Vaginal");
        
        Button b1 = new Button("OOO BOY!");
        b1.setOnAction(e -> {
                String aux = "Facem sex:";
            if(cb1.isSelected())
                aux = aux + " Anal";
            
            if(cb2.isSelected())
                aux = aux + " Oral";
            
            if(cb3.isSelected())
                aux = aux + " Vaginal";
            
            if(!(cb1.isSelected() || cb2.isSelected() || cb3.isSelected()))
                aux = "Faci laba";
            
            System.out.println(aux);
        });
        
        layout.getChildren().addAll(cb1, cb2, cb3);
        layout.getChildren().add(b1);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        window.setScene(new Scene(layout, 400, 400));
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
