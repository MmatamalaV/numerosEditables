package Main;


import ProgramacionNumeros.Numero4;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mario
 */
public class Main extends Application{
    double espacioNumero=0;
    double espacioSuperior=0;
    int contador=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        Path path = new Path();
        VBox general= new VBox();
        
            HBox botones=new HBox();
                Button boton4 = new Button("4");
                boton4.setMinWidth(100);
                boton4.setMaxWidth(100);
                 
                        
                        
            botones.getChildren().add(boton4);
           
        general.getChildren().addAll(botones, path);
        
        Group root= new Group(general);
        
        
        boton4.setOnAction((ActionEvent event) ->
                { 
                    double n =boton4.getHeight();
                    Numero4 numero4=new Numero4(n, espacioNumero,espacioSuperior);
                    root.getChildren().add(numero4.start(path));
                    espacioNumero+=100;
                    contador+=100;
                    if(contador>300){
                        espacioSuperior+=120;
                        contador =0;
                        espacioNumero=0;
                    }
                });
        Scene scene = new Scene(root, 700, 700);
        stage.setScene(scene);
        stage.show();
    }
    
}
