/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableControllers;
import examizfp.MySQLAccess;
import Models.Materia;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author santiago
 */
public class MateriasController {
    
    
    public static ArrayList<Materia> getMaterias() {
        MySQLAccess db = new MySQLAccess();
        ResultSet result = null;
        ArrayList<Materia> materiaList = new ArrayList<Materia>();
        String currName = " ";
        int currID = 0;
        try {
            result = db.readDataBase("select * from Examiz.Materia");
            while (result.next()) {
                
                currName = result.getString("MNombre");
                currID = result.getInt("ID");
                Materia mat = new Materia(currID, currName);
                materiaList.add(mat);
            }
            result.close();
        } catch (Exception ex) {
            Logger.getLogger(MateriasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return materiaList;
    }
}
