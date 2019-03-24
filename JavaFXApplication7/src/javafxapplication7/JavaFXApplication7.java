package javafxapplication7;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class JavaFXApplication7 extends Application {
    
    Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        
        
        Button b1 = new Button("Vaginal");
        Button b2 = new Button("Oral");
        Button b3 = new Button("Anal");
        
        HBox upLayout = new HBox();
        upLayout.getChildren().addAll(b1, b2, b3);
        upLayout.setAlignment(Pos.CENTER);
        
        Button b4 = new Button("Usor");
        Button b5 = new Button("Tare");
        Button b6 = new Button("Nu da tata");
        
        VBox leftLayout = new VBox();
        leftLayout.getChildren().addAll(b4, b5, b6);
        leftLayout.setAlignment(Pos.CENTER);
        
        leftLayout.setMinSize(300, 300);
        BorderPane mainLayout = new BorderPane();
        mainLayout.setLeft(leftLayout);
        mainLayout.setTop(upLayout);
        mainLayout.setCenter(new TextArea("Baga ceva"));
        
        window.setScene(new Scene(mainLayout, 600, 600));
        window.show();
        
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
