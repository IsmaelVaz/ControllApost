/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controllapost.view;

import br.com.controllapost.controller.PrincipalController;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class Main extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("principal.fxml"));
        loader.setController(new PrincipalController());
        
        Scene scene;
        AnchorPane module;
        
        try {
            module = (AnchorPane) loader.load();
            scene = new Scene(module);
            primaryStage.setScene(scene);
            primaryStage.setTitle("CSOP Expedição - Login");
            primaryStage.show();
            
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
