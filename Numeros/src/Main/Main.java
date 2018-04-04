package Main;


import ProgramacionNumeros.Numero0;
import ProgramacionNumeros.Numero1;
import ProgramacionNumeros.Numero4;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
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
    Path path = new Path();  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        
        VBox general= new VBox();
        
            HBox botones=new HBox();
            botones.setAlignment(Pos.CENTER);
                Button boton0 = new Button("0");
                boton0.setMinWidth(50);
                boton0.setMaxWidth(50);
                boton0.setDisable(false);
                
                Button boton1 = new Button("1");
                boton1.setMinWidth(50);
                boton1.setMaxWidth(50);
                boton1.setDisable(false);
                
                Button boton2 = new Button("2");
                boton2.setMinWidth(50);
                boton2.setMaxWidth(50);
                boton2.setDisable(true);
                
                Button boton3 = new Button("3");
                boton3.setMinWidth(50);
                boton3.setMaxWidth(50);
                boton3.setDisable(true);
                
                Button boton4 = new Button("4");
                boton4.setMinWidth(50);
                boton4.setMaxWidth(50);
                
                Button boton5 = new Button("5");
                boton5.setMinWidth(50);
                boton5.setMaxWidth(50);
                boton5.setDisable(true);
               
                Button boton6 = new Button("6");
                boton6.setMinWidth(50);
                boton6.setMaxWidth(50);
                boton6.setDisable(true);
                
                Button boton7 = new Button("7");
                boton7.setMinWidth(50);
                boton7.setMaxWidth(50);
                boton7.setDisable(true);
                
                Button boton8 = new Button("8");
                boton8.setMinWidth(50);
                boton8.setMaxWidth(50);
                boton8.setDisable(true);
                
                Button boton9 = new Button("9");
                boton9.setMinWidth(50);
                boton9.setMaxWidth(50);
                boton9.setDisable(true);
                 
                        
                        
            botones.getChildren().addAll(boton0,boton1,boton2,boton3,boton4,boton5,boton6,boton7,boton8,boton9);
         
        general.getChildren().addAll(botones, path);
        
        Group root= new Group(general);
        
        
        boton0.setOnAction((ActionEvent event) ->
        { 
            double n =boton0.getHeight();
            Numero0 numero0=new Numero0(n, espacioNumero,espacioSuperior);
            root.getChildren().add(numero0.start(path));
            //contador para el salto de linea en la pantalla
            espacioNumero+=100;
            contador+=100;
            if(contador>300){
                espacioSuperior+=120;
                contador =0;
                espacioNumero=0;
            }
        });
        
        boton1.setOnAction((ActionEvent event) ->
        { 
            double n =boton1.getHeight();
            Numero1 numero1=new Numero1(n, espacioNumero,espacioSuperior);
            root.getChildren().add(numero1.start(path));
            //contador para el salto de linea en la pantalla
            espacioNumero+=100;
            contador+=100;
            if(contador>300){
                espacioSuperior+=120;
                contador =0;
                espacioNumero=0;
            }
        });
        
        boton4.setOnAction((ActionEvent event) ->
        { 
            double n =boton4.getHeight();
            Numero4 numero4=new Numero4(n, espacioNumero,espacioSuperior);
            root.getChildren().add(numero4.start(path));
            //contador para el salto de linea en la pantalla
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
