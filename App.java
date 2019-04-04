import javafx.application.Application;

import javafx.stage.Stage;
import javafx.scene.Scene;

import javafx.scene.layout.*;
import javafx.scene.control.*;

import javafx.geometry.Insets;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;



public class App extends Application {

    public void start(Stage stage)
    {
     
            
        // Die graphische Ausgabe
        Canvas canvas = new Canvas(200, 200);         // Zeichenfläche
        GraphicsContext gc = canvas.getGraphicsContext2D(); // Graphikkontext der Zeichenfläche

        Skizze skizze = new Skizze(gc);     //Mein Model

        // Das Menu
        VBox vbox = new VBox(8);
        Button button1 = new Button("Schalter");
        button1.setPrefWidth(100);
        //Button button2 = new Button("Aus");

        
        button1.setPrefWidth(100);
        //button2.setPrefWidth(100);

        
        button1.setOnAction(e -> skizze.buttonGeklickt());
        //button2.setOnAction(e -> skizze.buttonAus());
        vbox.getChildren().addAll(button1);
        vbox.setPadding(new Insets(30,30,30,30));
               
        // Oberfläche zusammenbauen
        
        HBox root = new HBox();    
        root.getChildren().addAll(canvas,vbox);

        // Fenster
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Meine Skizze");
        stage.show();
        
        

        

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
