/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controllapost.helper;

import br.com.controllapost.model.Aluno;
import javafx.scene.control.Cell;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Aluno
 */
public class ImportExcel {
    @SuppressWarnings({ "resource" })
    
    public static void AbrirDoc() throws IOException{
        List<Aluno> listaAlunos = new ArrayList<>(); 
        
        FileChooser fileChooser = new FileChooser();
        File caminho = fileChooser.showOpenDialog(new Stage());

        if(caminho != null){
            System.out.println(caminho);
            
            try {
                FileInputStream arquivo = new FileInputStream(new File(
                              caminho.toString()));

                HSSFWorkbook workbook = new HSSFWorkbook(arquivo);

                HSSFSheet sheetAlunos = workbook.getSheetAt(0);

                Iterator<Row> rowIterator = sheetAlunos.iterator();

                while (rowIterator.hasNext()) {
                       Row row = rowIterator.next();
                       Iterator<Cell> cellIterator = row.cellIterator();

                       Aluno aluno = new Aluno();
                       listaAlunos.add(aluno);
                       while (cellIterator.hasNext()) {
                              Cell cell = cellIterator.next();
                              switch (cell.getColumnIndex()) {
                              case 0:
                                    aluno.setNome(cell.getStringCellValue());
                                    break;
                              case 1:
                                    aluno.setRa(String.valueOf(cell.getNumericCellValue()));
                                    break;
                              case 2:
                                    aluno.setNota1(cell.getNumericCellValue());
                                    break;
                              case 3:
                                    aluno.setNota2(cell.getNumericCellValue());
                                    break;
                              case 4:
                                     aluno.setMedia(cell.getNumericCellValue());
                                    break;
                              case 5:
                                    aluno.setAprovado(cell.getBooleanCellValue());
                                    break;
                              }
                       }
                }
                arquivo.close();
   
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("Arquivo Excel não encontrado!");
            }  
        }else{
            System.out.println("ERROOOU");
        }
    }
}
