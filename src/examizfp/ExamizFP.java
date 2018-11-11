/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examizfp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import examizfp.MySQLAccess;
import java.util.logging.Level;
import java.util.logging.Logger;
import TableControllers.MateriasController;
import Models.Materia;
import java.util.ArrayList;
/**
 *
 * @author santiago
 */
public class ExamizFP extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        ArrayList<Materia> mat = MateriasController.getMaterias();
        for (Materia materia : mat) { 
            System.out.println(materia.getName());
        }
        System.out.println("Went through loop");
        launch(args);
    }
    
}
