package javafxapplication5;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmBox{
    
    private static boolean answer;
    
    public static boolean display(String title, String message){
        Stage window = new Stage();
        window.setTitle(title);
        window.initModality(Modality.APPLICATION_MODAL);
        
        Button b1 = new Button("Yes");
        Button b2 = new Button("No");
        
        VBox layout = new VBox();
        
        Label l1 = new Label();
        l1.setText(message);
        
        layout.getChildren().addAll(l1 ,b1, b2);
        layout.setAlignment(Pos.CENTER);
        
        b1.setOnAction(e->{
            answer = true;
            window.close();
        });
        
        b2.setOnAction(e -> {
            answer = false;
            window.close();
        });
        
        layout.setMinSize(200, 100);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.showAndWait();
        
        return answer;
    }
}
