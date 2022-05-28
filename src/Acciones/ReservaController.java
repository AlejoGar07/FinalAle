package Acciones;

import Tabla.Tablasssss;
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
    private TableView<Tablasssss> Tabla;
    @FXML
    private TableColumn<Tablasssss, String> organi;
    @FXML
    private TableColumn<Tablasssss, String> recu;
    @FXML
    private TableColumn<Tablasssss, String> activ;
    @FXML
    private TableColumn<Tablasssss, String> descri;
    @FXML
    private TableColumn<Tablasssss, String> aprob;
    @FXML
    private TableColumn<Tablasssss, String> confir;
    @FXML
    private TableColumn<Tablasssss, Date> fecha;
    @FXML
    private TableColumn<Tablasssss, Date> fecha1;
    @FXML
    private TableColumn<Tablasssss, Integer> horai;
    @FXML
    private TableColumn<Tablasssss, Integer> horaf;
    @FXML
    private Button regresar;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Tablasssss T= new Tablasssss();
        ObservableList<Tablasssss> items=T.getTablassss();
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
