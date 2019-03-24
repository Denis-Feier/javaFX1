package javafxapplication1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApplication1 extends Application implements EventHandler<ActionEvent>{
    
    Button b1 = new Button();
    Button b2 = new Button("Butonul Magic");
    Button b3 = new Button("Butonul Magic");
    
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("Denis are mere");
        
        b1.setText("APASA-MA");
        
        //StackPane pane = new StackPane(); asta le pune unul peste celalalt
        //pane.setLayoutX(100);
        //pane.setLayoutY(100);
        
        VBox pane = new VBox(5); // le aseaza intr-o coloana la margine de window 20-nr de pixeli intre obiecte
        
        pane.getChildren().addAll(b1, b2);
        pane.getChildren().add(b3);
        
        b1.setOnAction(this);
        b2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Printeaza alta smecherie, din clasa anonima");
            }
        });
        b3.setOnAction(e -> {
            System.out.print("Alt buton");
            System.out.println("Din lamda function");
        });
        
        Scene scene = new Scene(pane, 600, 600);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }    

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == b1){
            System.out.println("NU mai apasa butonul, asta ii metoda grea");
        }
        //else if(event.getSource() == b2){
        //    System.out.println("NU il apasa nici pe asta");
        //}
    }
}
