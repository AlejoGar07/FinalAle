package Acciones;

import combo.combos;
import combo.recursos;
import Tabla.Tablasssss;
import java.net.URL;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class RevicionController implements Initializable {

    @FXML
    private Button b;
    @FXML
    private ComboBox<combos> box;
    @FXML
    private TextField Text;
    @FXML
    private ComboBox<recursos> box1;
    @FXML
    private TextArea TextArea;
    @FXML
    private TextField Text1;
    @FXML
    private TextField Text2;
    @FXML
    private TextField Text3;
    @FXML
    private TextField Text4;
    @FXML
    private RadioButton si;
    @FXML
    private RadioButton no;
    @FXML
    private DatePicker fecha;
    @FXML
    private Button gestionar;
    @FXML
    private Button cancel;
    @FXML
    private ToggleGroup aprobacion;
    @FXML
    private ComboBox<combos> box2;
    @FXML
    private TextField Text5;
    @FXML
    private ComboBox<recursos> box3;
    @FXML
    private TextArea TextArea1;
    @FXML
    private TextField Text6;
    @FXML
    private TextField Text7;
    @FXML
    private TextField Text8;
    @FXML
    private TextField Text9;
    @FXML
    private RadioButton si1;
    @FXML
    private RadioButton no1;
    @FXML
    private ToggleGroup aprobacion1;
    @FXML
    private DatePicker fecha1;
    @FXML
    private Button modificar;
    @FXML
    private Button cancel1;
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
    private TableColumn<Tablasssss, Date> fecha2;
    @FXML
    private TableColumn<Tablasssss, Integer> horai;
    @FXML
    private TableColumn<Tablasssss, Integer> horaf;
    
    boolean SII=false;
    boolean NOO=false;
    boolean SIII=false;
    boolean NOOO=false;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        mouse();
	initcombo();
        Tablasssss T= new Tablasssss();
        ObservableList<Tablasssss> items=T.getTablassss();
        this.organi.setCellValueFactory(new PropertyValueFactory("organizacion"));
        this.recu.setCellValueFactory(new PropertyValueFactory("recurso"));
        this.activ.setCellValueFactory(new PropertyValueFactory("actividad"));
        this.descri.setCellValueFactory(new PropertyValueFactory("descripcion"));
        this.aprob.setCellValueFactory(new PropertyValueFactory("aprobacion"));
        this.fecha2.setCellValueFactory(new PropertyValueFactory("fecha"));
        this.horai.setCellValueFactory(new PropertyValueFactory("horai"));
        this.horaf.setCellValueFactory(new PropertyValueFactory("horaf"));
        this.Tabla.setItems(items);
    }	
    public void initcombo(){
	 combos C=new combos();  
	 ObservableList<combos> items=C.getcombo();
	 this.box.setItems(items);
         this.box2.setItems(items);
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
        TextArea.setText("");
        si.setSelected(false);
        no.setSelected(false);
        box.setValue(null);
        box1.setValue(null);
        box2.setValue(null);
        box3.setValue(null);
        fecha.setValue(null);
        fecha1.setValue(null);
    }
    @FXML
    private void Organi(ActionEvent event) {
        combos c = this.box.getValue();
            if (c != null) {
                this.Text3.setText(c.getOrganizacion());
            }
        recursos E=new recursos();  
	ObservableList<recursos> itemss=E.getRecursos(Text3.getText());
        this.box1.setItems(itemss);
    }
    @FXML
    private void Recur(ActionEvent event) {
        recursos c = this.box1.getValue();
            if (c != null) {
                this.Text4.setText(c.getRecurso());
            }
    }
    @FXML
    private void gestionar(ActionEvent event) {
       Conexion conect= new Conexion();
    try{
    if(Text.getText().equals("") || TextArea.getText().equals("") || Text1.getText().equals("") || Text2.getText().equals("") || Text3.getText().equals("") || Text4.getText().equals("") ){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();
     }else{
      
      int Id=conect.id3();
      String SI=null;
      String NO=null;
      String Organi="";
      String Recur="";
      String Activi="";
      String Descri="";
      String Direc="";
      LocalDate Fecha;
      int Horai=0;
      int Horaf=0;
      Organi=Text3.getText();
      Recur=Text4.getText();
      Activi=Text.getText();
      Descri=TextArea.getText();
      Fecha=fecha.getValue();
      Horai=Integer.parseInt(Text1.getText());
      Horaf=Integer.parseInt(Text2.getText());
      
	  if(si.isSelected()){
		 SI="Si Necesita";
                 NO="Pendiente";
                 SII=true;
          }else{
                 SII=false;
               }
          if(no.isSelected()){
                 SI="No Necesita";
                 NO="Aprobada";
                 NOO=true;
          }else{
                 NOO=false;
               }
          
         if(SII){
		 System.out.println(Text3.getText());
		 System.out.println(Text4.getText());
                 System.out.println(Text.getText());
                 System.out.println(Fecha);
                 System.out.println(TextArea.getText());
		 System.out.println(Text1.getText());
                 System.out.println(Text2.getText());
                 Conexion.writeToDatabase3(Id, Organi, Recur, Activi, Descri, SI, NO, Fecha, Horai, Horaf);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Agregado");
	a.showAndWait();
        Text3.setText("");
        Text4.setText("");
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        TextArea.setText("");
	si.setSelected(false);
        box.setValue(null);
        box1.setValue(null);
        fecha.setValue(null);
        initcombo();
        Tablasssss T= new Tablasssss();
        ObservableList<Tablasssss> items=T.getTablassss();
        this.Tabla.setItems(items);
	}
         if(NOO){
		 System.out.println(Text3.getText());
		 System.out.println(Text4.getText());
                 System.out.println(Text.getText());
                 System.out.println(Fecha);
                 System.out.println(TextArea.getText());
		 System.out.println(Text1.getText());
                 System.out.println(Text2.getText());	
                 Conexion.writeToDatabase3(Id, Organi, Recur, Activi, Descri, SI, NO, Fecha, Horai, Horaf);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Agregado");
	a.showAndWait();
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
        Text4.setText("");
        TextArea.setText("");
	no.setSelected(false);
        box.setValue(null);
        box1.setValue(null);
        fecha.setValue(null);
        initcombo();
        Tablasssss T= new Tablasssss();
        ObservableList<Tablasssss> items=T.getTablassss();
        this.Tabla.setItems(items);
	}  
    }
    }catch (Exception e) {}
    }
    private void organi(MouseEvent event) {
        recursos E=new recursos();  
	ObservableList<recursos> itemss=E.getRecursos(Text3.getText());
        this.box1.setItems(itemss);
    }

    @FXML
    private void Organi1(ActionEvent event) {
        combos c = this.box2.getValue();
            if (c != null) {
                this.Text8.setText(c.getOrganizacion());
            }
        recursos E=new recursos();  
	ObservableList<recursos> itemss=E.getRecursos(Text8.getText());
        this.box3.setItems(itemss);
    }

    @FXML
    private void Recur1(ActionEvent event) {
        recursos c = this.box3.getValue();
            if (c != null) {
                this.Text9.setText(c.getRecurso());
            }
    }
    private void mouse() {
	 Tabla.setOnMouseClicked(new EventHandler<MouseEvent>(){	 
            @Override
            public void handle(MouseEvent event) {
                Tablasssss T= Tabla.getItems().get(Tabla.getSelectionModel().getSelectedIndex());
                Text5.setText(T.getActividad());
                TextArea1.setText(T.getDescripcion());
                Text6.setText(T.getHorai());
                Text7.setText(T.getHoraf());
            }
            });
	}
    @FXML
    private void modificar(ActionEvent event) {
        
    }
    @FXML
    private void cambio(Event event) {
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
        Text4.setText("");
        TextArea.setText("");
        box.setValue(null);
        box1.setValue(null);
        fecha.setValue(null);
        si.setSelected(false);
        no.setSelected(false);
    }

    @FXML
    private void cambio1(Event event) {
        Text5.setText("");
        Text6.setText("");
        Text7.setText("");
        Text8.setText("");
        Text9.setText("");
        TextArea1.setText("");
        box2.setValue(null);
        box3.setValue(null);
        fecha1.setValue(null);
        si1.setSelected(false);
        no1.setSelected(false);
    }
}
