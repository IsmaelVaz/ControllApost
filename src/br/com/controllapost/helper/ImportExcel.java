/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.controllapost.helper;

import br.com.controllapost.model.Aluno;
import javafx.stage.*;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author Aluno
 */
public class ImportExcel {
    @SuppressWarnings({ "resource" })
    
    public static void AbrirDoc() {
        List<Aluno> listaAlunos = new ArrayList<>(); 
        FileChooser fileChooser = new FileChooser();
        File caminho = fileChooser.showOpenDialog(new Stage());

        if(caminho != null){
            HSSFWorkbook wb = null;
            /*HSSFRow row = null;
            HSSFCell cell = null;*/
            String path = caminho.toString();
            
            try {
                InputStream inp;
                inp = new FileInputStream(path);
            
                wb = new HSSFWorkbook(inp);
                HSSFSheet sheet = wb.getSheetAt(0);
                int numRow = sheet.getLastRowNum();
                System.out.println("Quantidade de linhas : " + numRow);
                
                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 11; j++) {
                        CellReference cellRef = new CellReference(i, j);
                        
                        Row row = sheet.getRow(cellRef.getRow());
                        Cell cell = row.getCell(cellRef.getCol());
                        
                        System.out.print(cell.getStringCellValue());
                        
                        System.out.print(cellRef.formatAsString());
                        System.out.print(" - \n");
                        
                        
                        /*switch (cell.getCellType()) {
                            case HSSFCell.CELL_TYPE_STRING:
                                System.out.println(cell.getRichStringCellValue().getString());
                                break;
                            case HSSFCell.CELL_TYPE_NUMERIC:
                                if (DateUtil.isCellDateFormatted(cell)) {
                                    System.out.println(cell.getDateCellValue());
                                } else {
                                    System.out.println(cell.getNumericCellValue());
                                }
                                break;
                            case HSSFCell.CELL_TYPE_BOOLEAN:
                                System.out.println(cell.getBooleanCellValue());
                                break;
                            case HSSFCell.CELL_TYPE_FORMULA:
                                System.out.println(cell.getCellFormula());
                                break;
                            default:
                                System.out.println();
                        }*/
                    }
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ImportExcel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ImportExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.out.println("ERROOOU");
        }
    }
}
