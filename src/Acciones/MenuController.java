package Acciones;

import Vista.VistaController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class MenuController implements Initializable {

    @FXML
    private Button b;
    @FXML
    private TextField Text;
    @FXML
    private TextField Text1;
    @FXML
    private TextField Text2;
    @FXML
    private TextField Text3;
    @FXML
    private TextField Text4;
    @FXML
    private TextField Text5;
    @FXML
    private TextField Text6;
    @FXML
    private TextField Text7;
    @FXML
    private TableView<?> Tabla;
    @FXML
    private CheckBox check;
    @FXML
    private TextField Text8;
    @FXML
    private CheckBox check1;
    @FXML
    private CheckBox check2;
    @FXML
    private TableView<?> Tabla1;
    @FXML
    private TextField Text9;
    @FXML
    private TextField Text10;
    @FXML
    private TextField Text11;
    @FXML
    private TextField Text12;
    @FXML
    private CheckBox adm;
    @FXML
    private CheckBox rev;
    @FXML
    private TextField Text13;
    @FXML
    private CheckBox rec;
    @FXML
    private Button ag;
    @FXML
    private Button cancel;
    @FXML
    private Button mod;
    @FXML
    private Button camb;
    @FXML
    private Button ag1;
    @FXML
    private TextField Text14;
    @FXML
    private TextField Text15;
    @FXML
    private TextField Text16;
    @FXML
    private TextField Text17;
    @FXML
    private CheckBox adm1;
    @FXML
    private Button mod1;
    @FXML
    private CheckBox rev1;
    @FXML
    private TextField Text18;
    @FXML
    private CheckBox rec1;
    @FXML
    private TableView<?> Tabla2;
    @FXML
    private TextField Text19;
    @FXML
    private CheckBox check3;
    @FXML
    private Button camb1;
    @FXML
    private CheckBox check4;
    @FXML
    private TableView<?> Tabla3;
    @FXML
    private TextField Text20;
    @FXML
    private TextField Text21;
    @FXML
    private TextField Text22;
    @FXML
    private CheckBox check5;
    @FXML
    private Button ag2;
    @FXML
    private ComboBox<?> box;
    @FXML
    private CheckBox check6;
    @FXML
    private ComboBox<?> box1;
    @FXML
    private TextField Text23;
    @FXML
    private TextField Text24;
    @FXML
    private TextField Text25;
    @FXML
    private CheckBox check7;
    @FXML
    private Button mod2;
    @FXML
    private ComboBox<?> box2;
    @FXML
    private CheckBox check8;
    @FXML
    private ComboBox<?> box3;
    @FXML
    private TableView<?> Tabla4;
    @FXML
    private TextField Text26;
    @FXML
    private CheckBox check9;
    @FXML
    private Button camb2;
    @FXML
    private CheckBox check10;
    @FXML
    private TableView<?> Tabla5;
    @FXML
    private TableColumn cod;
    @FXML
    private TableColumn orga;
    @FXML
    private TableColumn usu;
    @FXML
    private TableColumn direc;
    @FXML
    private TableColumn tel;
    @FXML
    private TableColumn corr;
    @FXML
    private TableColumn<?, ?> tabla4;
         
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void regresar(ActionEvent event) {
        Stage stage= (Stage) this.b.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void cancel(ActionEvent event) {
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
        Text4.setText("");
        Text5.setText("");
        Text6.setText("");
        Text7.setText("");
        Text8.setText("");
        Text9.setText("");
        Text10.setText("");
        Text11.setText("");
        Text12.setText("");
        Text13.setText("");
        Text14.setText("");
        Text15.setText("");
        Text16.setText("");
        Text17.setText("");
        Text18.setText("");
        Text19.setText("");
        Text20.setText("");
        Text21.setText("");
        Text22.setText("");
        Text23.setText("");
        Text24.setText("");
        Text25.setText("");
        Text26.setText("");
        
        
    }
    @FXML
    private void agregar(ActionEvent event) {
      
    
    }

    @FXML
    private void modificar(ActionEvent event) {
        
    }

    @FXML
    private void cambiar(ActionEvent event) {
    }

    @FXML
    private void agregar1(ActionEvent event) {
    }

    @FXML
    private void modificar1(ActionEvent event) {
    }

    @FXML
    private void cambiar1(ActionEvent event) {
    }

    @FXML
    private void agregar2(ActionEvent event) {
    }

    @FXML
    private void modificar2(ActionEvent event) {
    }

    @FXML
    private void cambiar2(ActionEvent event) {
    }

    
    
}
