package Acciones;

import Tabla.Tablassss;
import java.net.URL;
import java.sql.Date;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ReservaController implements Initializable {

    @FXML
    private TableView<Tablassss> Tabla;
    @FXML
    private TableColumn<Tablassss, String> organi;
    @FXML
    private TableColumn<Tablassss, String> recu;
    @FXML
    private TableColumn<Tablassss, String> activ;
    @FXML
    private TableColumn<Tablassss, String> descri;
    @FXML
    private TableColumn<Tablassss, String> aprob;
    @FXML
    private TableColumn<Tablassss, String> confir;
    @FXML
    private TableColumn<Tablassss, Date> fecha;
    @FXML
    private TableColumn<Tablassss, Date> fecha1;
    @FXML
    private TableColumn<Tablassss, Integer> horai;
    @FXML
    private TableColumn<Tablassss, Integer> horaf;
    @FXML
    private Button regresar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Tablassss T= new Tablassss();
        ObservableList<Tablassss> items=T.getTablasss();
        this.organi.setCellValueFactory(new PropertyValueFactory("organizacion"));
        this.recu.setCellValueFactory(new PropertyValueFactory("recurso"));
        this.activ.setCellValueFactory(new PropertyValueFactory("actividad"));
        this.descri.setCellValueFactory(new PropertyValueFactory("descripcion"));
        this.aprob.setCellValueFactory(new PropertyValueFactory("aprobacion"));
        this.confir.setCellValueFactory(new PropertyValueFactory("confirmacion"));
        this.fecha.setCellValueFactory(new PropertyValueFactory("fechas"));
        this.fecha1.setCellValueFactory(new PropertyValueFactory("fecha"));
        this.horai.setCellValueFactory(new PropertyValueFactory("horai"));
        this.horaf.setCellValueFactory(new PropertyValueFactory("horaf"));
        this.Tabla.setItems(items);
    }    

    @FXML
    private void regresar(ActionEvent event) {
        Stage stage= (Stage) this.regresar.getScene().getWindow();
	stage.close();
    }
}
