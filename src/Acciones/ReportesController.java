package Acciones;

import Tabla.Tablas;
import Tabla.Tablass;
import Tabla.Tablasss;
import java.net.URL;
import java.time.LocalDateTime;
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

public class ReportesController implements Initializable {

    @FXML
    private TableView<Tablas> Tabla;
    @FXML
    private TableColumn<Tablas, String> orga;
    @FXML
    private TableColumn<Tablas, String> direc;
    @FXML
    private TableColumn<Tablas, Integer> tel;
    @FXML
    private TableColumn<Tablas, String> corr;
    @FXML
    private TableColumn<Tablas, String> esta;
    @FXML
    private TableColumn<Tablas, LocalDateTime> fecha;
    @FXML
    private TableView<Tablass> Tabla2;
    @FXML
    private TableColumn<Tablass, String> tipo;
    @FXML
    private TableColumn<Tablass, String> usu;
    @FXML
    private TableColumn<Tablass, String> contra;
    @FXML
    private TableColumn<Tablass, String> organ;
    @FXML
    private TableColumn<Tablass, String> corre;
    @FXML
    private TableColumn<Tablass, Integer> tele;
    @FXML
    private TableColumn<Tablass, String> direcc;
    @FXML
    private TableColumn<Tablass, String> esta1;
    @FXML
    private TableColumn<Tablass, LocalDateTime> fecha1;
    @FXML
    private TableView<Tablasss> Tabla4;
    @FXML
    private TableColumn<Tablasss, String> organn;
    @FXML
    private TableColumn<Tablasss, String> recur;
    @FXML
    private TableColumn<Tablasss, String> aprobaci;
    @FXML
    private TableColumn<Tablasss, String> usua;
    @FXML
    private TableColumn<Tablasss, String> entregaa;
    @FXML
    private TableColumn<Tablasss, String> usuae;
    @FXML
    private TableColumn<Tablasss, Integer> tiemp;
    @FXML
    private TableColumn<Tablasss, Integer> costo;
    @FXML
    private TableColumn<Tablasss, String> esta2;
    @FXML
    private TableColumn<Tablasss, LocalDateTime> Fecha2;
    @FXML
    private Button regresar;
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Tablas T= new Tablas();
      ObservableList<Tablas> items=T.getTabla();
      this.orga.setCellValueFactory(new PropertyValueFactory("organizacion"));
      this.direc.setCellValueFactory(new PropertyValueFactory("direccion"));
      this.tel.setCellValueFactory(new PropertyValueFactory("telefono"));
      this.corr.setCellValueFactory(new PropertyValueFactory("correo"));
      this.esta.setCellValueFactory(new PropertyValueFactory("estado"));
      this.fecha.setCellValueFactory(new PropertyValueFactory("fecha"));
      this.Tabla.setItems(items);
      Tablass Ta= new Tablass();
      ObservableList<Tablass> itemss=Ta.getTablas();
      this.tipo.setCellValueFactory(new PropertyValueFactory("tipo"));
      this.usu.setCellValueFactory(new PropertyValueFactory("usuario"));
      this.contra.setCellValueFactory(new PropertyValueFactory("contraseña"));
      this.organ.setCellValueFactory(new PropertyValueFactory("organizacion"));
      this.corre.setCellValueFactory(new PropertyValueFactory("correo"));
      this.tele.setCellValueFactory(new PropertyValueFactory("telefono"));
      this.direcc.setCellValueFactory(new PropertyValueFactory("direccion"));
      this.esta1.setCellValueFactory(new PropertyValueFactory("estado"));
      this.fecha1.setCellValueFactory(new PropertyValueFactory("fecha"));
      this.Tabla2.setItems(itemss);
      Tablasss Taa= new Tablasss();
      ObservableList<Tablasss> itemsss=Taa.getTablass();
      this.organn.setCellValueFactory(new PropertyValueFactory("Organizacion"));
      this.recur.setCellValueFactory(new PropertyValueFactory("Recurso"));
      this.aprobaci.setCellValueFactory(new PropertyValueFactory("Aprobacion"));
      this.usua.setCellValueFactory(new PropertyValueFactory("Usuarioa"));
      this.entregaa.setCellValueFactory(new PropertyValueFactory("Entrega"));
      this.usuae.setCellValueFactory(new PropertyValueFactory("Usuarioe"));
      this.tiemp.setCellValueFactory(new PropertyValueFactory("Tiempo"));
      this.costo.setCellValueFactory(new PropertyValueFactory("Costo"));
      this.esta2.setCellValueFactory(new PropertyValueFactory("Estado"));
      this.Fecha2.setCellValueFactory(new PropertyValueFactory("Fecha"));
      this.Tabla4.setItems(itemsss);
    }    

    @FXML
    private void regresar(ActionEvent event) {
        Stage stage= (Stage) this.regresar.getScene().getWindow();
	stage.close();
    }
    
}
