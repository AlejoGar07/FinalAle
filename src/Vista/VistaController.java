package Vista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class VistaController implements Initializable {

    @FXML
    private MenuItem item;
    @FXML
    private MenuItem item1;
    @FXML
    private MenuItem item2;
    @FXML
    private MenuItem item3;
    @FXML
    private MenuItem item4;
    @FXML
    private MenuItem item5;


    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void click(ActionEvent event) {
        try{
        FXMLLoader cargar= new FXMLLoader();
        cargar.setLocation(VistaController.class.getResource("/Acciones/Menu.fxml"));
        Parent root= cargar.load();
        Scene scene= new Scene(root);
        Stage stage= new Stage();
        stage.setScene(scene);
        stage.showAndWait();
        
    }catch(IOException e ){
            System.out.println(e.getMessage());
    }
    }

    @FXML
    private void click1(ActionEvent event) {
    }

    @FXML
    private void click3(ActionEvent event) {
    }

    @FXML
    private void click4(ActionEvent event) {
    }

    @FXML
    private void click5(ActionEvent event) {
    }

    
    
}
