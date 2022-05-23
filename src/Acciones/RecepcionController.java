package Acciones;

import Tabla.Tablassssss;
import Tabla.Tablasssssss;
import java.net.URL;
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

public class RecepcionController implements Initializable {

    @FXML
    private TableView<Tablasssssss> Tabla;
    @FXML
    private TableColumn<Tablasssssss, String> organn;
    @FXML
    private TableColumn<Tablasssssss, String> recur;
    @FXML
    private TableColumn<Tablasssssss, String> aprobaci;
    @FXML
    private TableColumn<Tablasssssss, String> usua;
    @FXML
    private TableColumn<Tablasssssss, String> entregaa;
    @FXML
    private TableColumn<Tablasssssss, String> usuae;
    @FXML
    private TableColumn<Tablasssssss, Integer> tiemp;
    @FXML
    private TableColumn<Tablasssssss, Integer> costo;
    @FXML
    private TextField Text;
    @FXML
    private RadioButton aprobar;
    @FXML
    private ToggleGroup seleccionar;
    @FXML
    private RadioButton rechazar;
    @FXML
    private Button aceptar;
    @FXML
    private Button cancel;
    @FXML
    private Button regresar;

    boolean SII=false;
    boolean NOO=false;
    boolean check=false;
    boolean check1=false;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mouse();
        Tablasssssss Taa= new Tablasssssss();
        ObservableList<Tablasssssss> itemsss=Taa.getTablasssssss();
        this.organn.setCellValueFactory(new PropertyValueFactory("Organizacion"));
        this.recur.setCellValueFactory(new PropertyValueFactory("Recurso"));
        this.aprobaci.setCellValueFactory(new PropertyValueFactory("Aprobacion"));
        this.usua.setCellValueFactory(new PropertyValueFactory("Usuarioa"));
        this.entregaa.setCellValueFactory(new PropertyValueFactory("Entrega"));
        this.usuae.setCellValueFactory(new PropertyValueFactory("Usuarioe"));
        this.tiemp.setCellValueFactory(new PropertyValueFactory("Tiempo"));
        this.costo.setCellValueFactory(new PropertyValueFactory("Costo"));
        this.Tabla.setItems(itemsss);
    }    
    @FXML
    private void cancel(ActionEvent event) {
        Text.setText("");
        aprobar.setSelected(false);
        rechazar.setSelected(false);
    }
    @FXML
    private void regresar(ActionEvent event) {
        Stage stage= (Stage) this.regresar.getScene().getWindow();
	stage.close();
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
		 
                 Conexion.writeToUpdate6(Activi, SI);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Modificar");
	a.showAndWait();
        Text.setText("");
        aprobar.setSelected(false);
        rechazar.setSelected(false);
        Tablasssssss Taa= new Tablasssssss();
        ObservableList<Tablasssssss> itemsss=Taa.getTablasssssss();
        this.Tabla.setItems(itemsss);
	}
         if(NOO){
		 System.out.println(Text.getText());
		 
                 Conexion.writeToUpdate6(Activi, NO);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Agregado");
	a.showAndWait();
        Text.setText("");
        aprobar.setSelected(false);
        rechazar.setSelected(false);
        Tablasssssss Taa= new Tablasssssss();
        ObservableList<Tablasssssss> itemsss=Taa.getTablasssssss();
        this.Tabla.setItems(itemsss);
       }  
    }
    }catch (Exception e) {}
    }
    private void mouse() {
        Tabla.setOnMouseClicked(new EventHandler<MouseEvent>(){	 
            @Override
            public void handle(MouseEvent event) {
                Tablasssssss T= Tabla.getItems().get(Tabla.getSelectionModel().getSelectedIndex());
                Text.setText(T.getRecurso());
            }
            });
    }   
}
