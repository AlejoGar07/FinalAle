package Acciones;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.RadioButton;

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
    private TextField Text8;
    @FXML
    private TextField Text27;
    @FXML
    private CheckBox check1;
    @FXML
    private CheckBox check2;
    @FXML
    private TableView<Tablas> Tabla1;
    @FXML
    private TableColumn<Tablas, String> orga1;
    @FXML
    private TableColumn<Tablas, String> direc1;
    @FXML
    private TableColumn<Tablas, Integer> tel1;
    @FXML
    private TableColumn<Tablas, String> corr1;
    @FXML
    private TableColumn<Tablas, String> esta1;
    @FXML
    private TextField Text9;
    @FXML
    private TextField Text10;
    @FXML
    private TextField Text11;
    @FXML
    private TextField Text12;
    @FXML
    private RadioButton adm;
    @FXML
    private RadioButton rev;
    @FXML
    private RadioButton rec;
    @FXML
    private TextField Text13;
    @FXML
    private ComboBox<combos> box4;
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
    private ComboBox<combos> box5;
    @FXML
    private TableView<?> Tabla2;
    @FXML
    private TableColumn<?, ?> tipo;
    @FXML
    private TableColumn<?, ?> usu;
    @FXML
    private TableColumn<?, ?> contra;
    @FXML
    private TableColumn<?, ?> organ;
    @FXML
    private TableColumn<?, ?> corre;
    @FXML
    private TableColumn<?, ?> tele;
    @FXML
    private TableColumn<?, ?> direcc;
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
    
	
            boolean activo;
	    boolean activo1;
	@FXML
	private TableColumn<?, ?> tabla4;
	
	
	
@Override
    public void initialize(URL url, ResourceBundle rb) {
	initcombo(); 
      this.orga.setCellValueFactory(new PropertyValueFactory("organizacion"));
      this.direc.setCellValueFactory(new PropertyValueFactory("direccion"));
      this.tel.setCellValueFactory(new PropertyValueFactory("telefono"));
      this.corr.setCellValueFactory(new PropertyValueFactory("correo"));
      this.esta.setCellValueFactory(new PropertyValueFactory("estado"));
      
      this.orga1.setCellValueFactory(new PropertyValueFactory("organizacion"));
      this.direc1.setCellValueFactory(new PropertyValueFactory("direccion"));
      this.tel1.setCellValueFactory(new PropertyValueFactory("telefono"));
      this.corr1.setCellValueFactory(new PropertyValueFactory("correo"));
      this.esta1.setCellValueFactory(new PropertyValueFactory("estado"));
      
      Tablas T= new Tablas();
      ObservableList<Tablas> items=T.getTabla();
      this.Tabla.setItems(items);
      this.Tabla1.setItems(items);
      
    }    
    
    public void initcombo(){
	 combos C=new combos();  
	 ObservableList<combos> items=C.getcombo();
	 this.box4.setItems(items);
	 this.box5.setItems(items);
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
	    Conexion conect= new Conexion();
	    
     if(Text.getText().equals("") || Text1.getText().equals("") || Text2.getText().equals("") || Text3.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();
     }else{
	
      int Id=conect.id();
      String Si=null;
      String Orga="";
      String Direc="";
      int Tel=0;
      String Corr="";
      Orga=Text.getText();
      Direc=Text1.getText();
      Tel=Integer.parseInt(Text2.getText());
      Corr=Text3.getText();
      
      if(conect.existeOrga(Orga)==0){
      if(conect.Email(Text3.getText())){
	      
	 System.out.println(Text.getText());
	 System.out.println(Text1.getText());
	 System.out.println(Text2.getText());
	 System.out.println(Text3.getText());
	 Si="Activo";		
         Conexion.writeToDatabase(Id,Orga, Direc, Tel, Corr, Si);
      
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Agregado");
	   a.showAndWait();
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
	
	initcombo(); 
	this.orga.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta.setCellValueFactory(new PropertyValueFactory("estado"));
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);
	
	this.orga1.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc1.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel1.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr1.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta1.setCellValueFactory(new PropertyValueFactory("estado"));
	ObservableList<Tablas> itemss=T.getTabla();
	this.Tabla1.setItems(itemss);
	}else{
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("El Correo es Invalido");
	   a.showAndWait();
	     }
	}else{
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("La Organizacion ya Existe");
	   a.showAndWait();
	     }
        }
    }

    @FXML
    private void modificar(ActionEvent event) {
	    Conexion conect = new Conexion();
	if(Text4.getText().equals("") || Text5.getText().equals("") || Text6.getText().equals("") || Text7.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();	
	}else{	
	String orga=Text4.getText();
	String direc=Text5.getText();
	int tel=Integer.parseInt(Text6.getText());
	String corre=Text7.getText();
	
	if(conect.Email(Text7.getText())){	
	System.out.println(Text4.getText());
	System.out.println(Text5.getText());
	System.out.println(Integer.parseInt(Text6.getText()));
	System.out.println(Text7.getText());
	
	Conexion.writeToUpdate(orga, direc, tel, corre);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
	Text4.setText("");
        Text5.setText("");
        Text6.setText("");
        Text7.setText("");
	
	initcombo(); 
	this.orga.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta.setCellValueFactory(new PropertyValueFactory("estado"));
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);
	
	this.orga1.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc1.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel1.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr1.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta1.setCellValueFactory(new PropertyValueFactory("estado"));
	ObservableList<Tablas> itemss=T.getTabla();
	this.Tabla1.setItems(itemss);
	}else{
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("El Correo es Invalido");
	   a.showAndWait();
	}
    }
    }
        @FXML
	private void activar(ActionEvent event) {
		if(check1.isSelected()){
			activo=true;
			activo1=false;
		}else{
			Alert a=new Alert(Alert.AlertType.INFORMATION);
			a.setHeaderText(null);
			a.setTitle("ERROR");
			a.setContentText("Seleccione");
			a.showAndWait();
		}
	}
        @FXML
	private void activar1(ActionEvent event) {
		if(check2.isSelected()){
			activo1=true;
			activo=false;
		}else{
			Alert a=new Alert(Alert.AlertType.INFORMATION);
			a.setHeaderText(null);
			a.setTitle("ERROR");
			a.setContentText("Seleccione");
			a.showAndWait();
		}
	}	
    @FXML
    private void cambiar(ActionEvent event) {
	    Conexion conect=new Conexion();
	   if(Text8.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();	
	}else{	
	
	String orga=Text8.getText();
	String esta=Text27.getText();
	if(activo){
		
	if(conect.activo(esta)=="Activo"){
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Ya es Activo");
	}else{
	  String Sis;
	  if(check1.isSelected()){
                Sis="Activo";
		
	Conexion.writeToActivo(orga, Sis);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
	Text8.setText("");
	
	initcombo(); 
	this.orga.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta.setCellValueFactory(new PropertyValueFactory("estado"));
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);
	
	this.orga1.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc1.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel1.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr1.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta1.setCellValueFactory(new PropertyValueFactory("estado"));
	ObservableList<Tablas> itemss=T.getTabla();
	this.Tabla1.setItems(itemss);
	  }else{
		Alert a=new Alert(Alert.AlertType.INFORMATION);
		a.setHeaderText(null);
		a.setTitle("ERROR");
		a.setContentText("Seleccione");
		a.showAndWait();
	  }
	  
	}
	}
	
	if(activo1){
	if(conect.activo(esta)=="Inactivo"){
		Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Ya es Inactivo");
	}else{
		String Si;
		if(check2.isSelected()){
                Si="Inactivo";
	   Conexion.writeToActivo(orga, Si);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
	Text8.setText("");
	
	initcombo(); 
	this.orga.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta.setCellValueFactory(new PropertyValueFactory("estado"));
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);
	
	this.orga1.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc1.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel1.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr1.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta1.setCellValueFactory(new PropertyValueFactory("estado"));
	ObservableList<Tablas> itemss=T.getTabla();
	this.Tabla1.setItems(itemss);
		}else{
		Alert a=new Alert(Alert.AlertType.INFORMATION);
		a.setHeaderText(null);
		a.setTitle("ERROR");
		a.setContentText("Seleccione");
		a.showAndWait();  
		}
	}
    }
	   }
    }
    @FXML
      private void cambio(Event event) {
        Text4.setText("");
        Text5.setText("");
        Text6.setText("");
        Text7.setText("");
      }
    @FXML
      private void cambio1(Event event) {
	      
        Text8.setText("");
      }
    @FXML
      private void mouse(MouseEvent event) {
	 Tabla.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tablas>(){
	 @Override
	 public void changed(ObservableValue<? extends Tablas> arg0, Tablas valorAnterior, Tablas valorSeleccionado) {
		 
		 Text4.setText(valorSeleccionado.getOrganizacion());
		 Text5.setText(valorSeleccionado.getDireccion());
		 Text6.setText(valorSeleccionado.getTelefono());
		 Text7.setText(valorSeleccionado.getCorreo());
		 Text8.setText(valorSeleccionado.getOrganizacion());
	 }
	});
	}
    @FXML
	private void mouse1(MouseEvent event) {
	Tabla1.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Tablas>(){
	 @Override
	 public void changed(ObservableValue<? extends Tablas> arg0, Tablas valorAnterior, Tablas valorSeleccionado) {
		 
		 Text8.setText(valorSeleccionado.getOrganizacion());
		 Text27.setText(valorSeleccionado.getEstado());
		 	 } 
	}); 	
	}  
		
	
	@FXML
	private void organi(ActionEvent event) {
		
	}
    @FXML
    private void agregar1(ActionEvent event) {
	    Conexion conect= new Conexion();
	 
          if(Text9.getText().equals("") || Text10.getText().equals("") || Text11.getText().equals("") || Text12.getText().equals("") || Text13.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();
     }else{
	
      int Id=conect.id1();
      String Adm=null;
      String Rev=null;
      String Rec=null;
      String Usu="";
      String Contra="";
      String Orga="";
      String Direc="";
      int Tel=0;
      String Corr="";
      Usu=Text9.getText();
      Contra=Text10.getText();
      Tel=Integer.parseInt(Text11.getText());
      Corr=Text12.getText();
      Direc=Text13.getText();
      String Estado="Activo";
      
      if(conect.existeOrga(Usu)==0){
      if(conect.Email(Text12.getText())){
	 if(adm.isSelected()){
		 Adm="Administracion";
		 System.out.println(Text9.getText());
		 System.out.println(Text10.getText());
		 System.out.println(Text11.getText());
		 System.out.println(Text12.getText());
		 System.out.println(Text13.getText());	
		Conexion.writeToDatabase1(Id, Adm, Usu, Usu, Contra, Corr, Tel, Direc, Estado);
	 } 
	 else if(rev.isSelected()){
		 Rev="Revisor";
	 }
	 else if(rec.isSelected()){
		 Rec="Recepcion";
	 }
	 
	 
	 
      
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Agregado");
	   a.showAndWait();
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
	
	initcombo(); 
	this.orga.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta.setCellValueFactory(new PropertyValueFactory("estado"));
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);
	
	this.orga1.setCellValueFactory(new PropertyValueFactory("organizacion"));
	this.direc1.setCellValueFactory(new PropertyValueFactory("direccion"));
	this.tel1.setCellValueFactory(new PropertyValueFactory("telefono"));
	this.corr1.setCellValueFactory(new PropertyValueFactory("correo"));
	this.esta1.setCellValueFactory(new PropertyValueFactory("estado"));
	ObservableList<Tablas> itemss=T.getTabla();
	this.Tabla1.setItems(itemss);
	}else{
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("El Correo es Invalido");
	   a.showAndWait();
	     }
	}else{
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("La Organizacion ya Existe");
	   a.showAndWait();
	     }
        }
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
