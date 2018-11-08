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
import java.sql.*;
import examizfp.MySQLAccess;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
            MySQLAccess dao = new MySQLAccess();
        try {
            dao.readDataBase("select * from Examiz.Materia");
        } catch (Exception ex) {
            Logger.getLogger(ExamizFP.class.getName()).log(Level.SEVERE, null, ex);
        }

        launch(args);
    }
    
}
