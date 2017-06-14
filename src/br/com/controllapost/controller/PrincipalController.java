/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controllapost.controller;

import br.com.controllapost.helper.ImportExcel;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;



public class PrincipalController implements Initializable{
    @FXML Button btnBuscar;
    @FXML TextField txtBusca;
    @FXML TableView tblAlunos, tbmApostilas;
    @FXML TableColumn clnAluno, clnApAtual, clnAulaAtual, clnAulaTotal, clnProxApostila;
    @FXML TableColumn clnApostila, clnQtdMes;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnBuscar.setOnAction(l-> BuscarPlanilha());
    }
    
    public void BuscarPlanilha(){
        ImportExcel.AbrirDoc();
        
    }
}
