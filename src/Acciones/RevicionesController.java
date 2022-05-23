package Acciones;

import Tabla.Tablassss;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class RevicionesController implements Initializable {

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
    private TableColumn<Tablassss, Date> fecha;
    @FXML
    private TableColumn<Tablassss, Integer> horai;
    @FXML
    private TableColumn<Tablassss, Integer> horaf;
    @FXML
    private Button regresar;
    @FXML
    private TextField Text;
    @FXML
    private RadioButton aprobar;
    @FXML
    private RadioButton rechazar;
    @FXML
    private ToggleGroup seleccionar;
    @FXML
    private Button aceptar;
    @FXML
    private Button cancel;
    
    boolean SII=false;
    boolean NOO=false;
    boolean check=false;
    boolean check1=false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mouse();
        Tablassss T= new Tablassss();
        ObservableList<Tablassss> items=T.getTablasss();
        this.organi.setCellValueFactory(new PropertyValueFactory("organizacion"));
        this.recu.setCellValueFactory(new PropertyValueFactory("recurso"));
        this.activ.setCellValueFactory(new PropertyValueFactory("actividad"));
        this.descri.setCellValueFactory(new PropertyValueFactory("descripcion"));
        this.aprob.setCellValueFactory(new PropertyValueFactory("aprobacion"));
        this.fecha.setCellValueFactory(new PropertyValueFactory("fecha"));
        this.horai.setCellValueFactory(new PropertyValueFactory("horai"));
        this.horaf.setCellValueFactory(new PropertyValueFactory("horaf"));
        this.Tabla.setItems(items);
    }    

    @FXML
    private void regresar(ActionEvent event) {
        Stage stage= (Stage) this.regresar.getScene().getWindow();
	stage.close();
    }
    @FXML
    private void cancel(ActionEvent event) {
        Text.setText("");
        aprobar.setSelected(false);
        rechazar.setSelected(false);
    }
    @FXML
    private void aprobar(ActionEvent event) {
         if(aprobar.isSelected()){
			check=true;
                        check1=false;
            }
    }
    @FXML
    private void rechazar(ActionEvent event) {
        if(rechazar.isSelected()){
			check1=true;
                        check=false;
            }
    }
    @FXML
    private void aceptar(ActionEvent event) {
        Conexion conect= new Conexion();
    try{
    if(Text.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();
     }else{
      String SI=null;
      String NO=null;
      String Activi="";
      Activi=Text.getText();
      
            if(aprobar.isSelected()){
		 SI="Aprobado";
                 SII=true;
            }else{
                 SII=false;
               }
            if(rechazar.isSelected()){
                 NO="Rechazado";
                 NOO=true;
          }else{
                 NOO=false;
               }
          
        if(SII){
		 System.out.println(Text.getText());
		 
                 Conexion.writeToUpdate4(Activi, SI);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Modificar");
	a.showAndWait();
        Text.setText("");
        aprobar.setSelected(false);
        rechazar.setSelected(false);
        Tablassss T= new Tablassss();
        ObservableList<Tablassss> items=T.getTablasss();
        this.Tabla.setItems(items);
	}
         if(NOO){
		 System.out.println(Text.getText());
		 
                 Conexion.writeToUpdate4(Activi, NO);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Agregado");
	a.showAndWait();
        Text.setText("");
        aprobar.setSelected(false);
        rechazar.setSelected(false);
        Tablassss T= new Tablassss();
        ObservableList<Tablassss> items=T.getTablasss();
        this.Tabla.setItems(items);
       }  
    }
    }catch (Exception e) {}
    }
    private void mouse() {
	 Tabla.setOnMouseClicked(new EventHandler<MouseEvent>(){	 
            @Override
            public void handle(MouseEvent event) {
                Tablassss T= Tabla.getItems().get(Tabla.getSelectionModel().getSelectedIndex());
                Text.setText(T.getActividad());
            }
            });
	}
}
