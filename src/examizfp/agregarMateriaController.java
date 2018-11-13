/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examizfp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author EnriqueVilla
 */
public class agregarMateriaController implements Initializable {
    
    @FXML
    private Pane rootPane;
    @FXML
    private javafx.scene.control.Button exit;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    private void loadInterface2(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        stage = (Stage) exit.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("interface2.fxml"));
        rootPane.getChildren().setAll(root);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
