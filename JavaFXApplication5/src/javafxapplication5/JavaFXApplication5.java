package javafxapplication5;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFXApplication5 extends Application {
    
    private Stage window;
    
    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        Button b1 = new Button("Insertu' Pulii");
        String s1 = updateStage() + "";
        Label l1 = new Label(s1);
        
        window.setOnCloseRequest(e -> {
            e.consume();
            boolean value = ConfirmBox.display("CEVA", "DA SAU BAA?");
                if(value)
                    window.close();
        });
        
        b1.setOnAction(e -> {
                boolean value = ConfirmBox.display("CEVA", "DA SAU BAA?");
                if(value)
                    window.close();
        });
        
        VBox layput = new VBox();
        layput.getChildren().addAll(l1, b1);
        layput.setMinSize(200, 200);
        layput.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(layput);
        
        window.setScene(scene);
        window.show();
    }
    
    public static void main(String[] args) {
        //updateStage();
        launch(args);
    }
    
    private static int updateStage(){
        int aux = 0;
       try{
            BufferedReader r =
                    new BufferedReader(new InputStreamReader(
                        new FileInputStream("newfile.txt")));
            
            aux = Integer.parseInt(r.readLine());
            
            System.out.println(aux);
            
            PrintStream file_complex_stream =
                new PrintStream(new FileOutputStream("newfile.txt"));
            
            file_complex_stream.print(aux + 1);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return aux;
    }
    
}
