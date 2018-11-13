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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
        
/**
 *
 * @author EstebanTorres
 */
public class LoginController implements Initializable {
    
    @FXML
    private AnchorPane rootPane;
    @FXML
    private javafx.scene.control.Button Login;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    private void loadHome(ActionEvent event) throws IOException {
        Stage stage;
        Parent root;
        stage = (Stage) Login.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("home.fxml"));
        rootPane.getChildren().setAll(root);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}
