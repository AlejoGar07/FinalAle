package Acciones;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
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
import javafx.scene.control.ToggleGroup;

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
    private TextField Text34;
    @FXML
    private RadioButton adm;
    @FXML
    private RadioButton rev;
    @FXML
    private RadioButton rec;
    @FXML
    private TextField Text13;
    @FXML
    private TextField Text28;
    @FXML
    private ToggleGroup tipoo;
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
    private TextField Text35;
    @FXML
    private RadioButton adm1;
    @FXML
    private Button mod1;
    @FXML
    private RadioButton rev1;
    @FXML
    private TextField Text18;
    @FXML
    private TextField Text29;
    @FXML
    private RadioButton rec1;
    @FXML
    private ComboBox<combos> box5;
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
    private TextField Text19;
    @FXML
    private TextField Text30;
    @FXML
    private CheckBox check3;
    @FXML
    private Button camb1;
    @FXML
    private CheckBox check4;
    @FXML
    private TableView<Tablass> Tabla3;
    @FXML
    private TableColumn<Tablass, String> tipo1;
    @FXML
    private TableColumn<Tablass, String> usu1;
    @FXML
    private TableColumn<Tablass, String> contra1;
    @FXML
    private TableColumn<Tablass, String> corre1;
    @FXML
    private TableColumn<Tablass, Integer> tele1;
    @FXML
    private TableColumn<Tablass, String> direcc1;
    @FXML
    private TableColumn<Tablass, String> estado;
    @FXML
    private TextField Text20;
    @FXML
    private CheckBox aprob;
    @FXML
    private CheckBox entreg;
    @FXML
    private TextField Text21;
    @FXML
    private TextField Text22;
    
    @FXML
    private Button ag2;
    @FXML
    private ComboBox<combos> box6;
    @FXML
    private ComboBox<recurso> box;
    @FXML
    private ComboBox<recurso> box1;
    @FXML
    private TextField Text23;
    @FXML
    private TextField Text24;
    @FXML
    private TextField Text25;
    @FXML
    private CheckBox aprob1;
    @FXML
    private CheckBox entreg1;
    @FXML
    private TextField Text31;
    @FXML
    private TextField Text32;
    @FXML
    private TextField Text33;
    @FXML
    private Button mod2;
    @FXML
    private ComboBox<combos> box7;
    @FXML
    private ComboBox<recurso> box2;
     @FXML
    private ComboBox<recurso> box3;
    @FXML
    private TextField Text36;
    @FXML
    private TextField Text37;
    @FXML
    private TextField Text38;
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
    private TextField Text26;
    @FXML
    private TextField Text39;
    @FXML
    private CheckBox check9;
    @FXML
    private Button camb2;
    @FXML
    private CheckBox check10;
    @FXML
    private TableView<Tablasss> Tabla5;
    @FXML
    private TableColumn<Tablasss, String> organn1;
    @FXML
    private TableColumn<Tablasss, String> recur1;
    @FXML
    private TableColumn<Tablasss, String> aprobaci1;
    @FXML
    private TableColumn<Tablasss, String> usua1;
    @FXML
    private TableColumn<Tablasss, String> entregaa1;
    @FXML
    private TableColumn<Tablasss, String> usuae1;
    @FXML
    private TableColumn<Tablasss, Integer> tiemp1;
    @FXML
    private TableColumn<Tablasss, Integer> costo1;
    @FXML
    private TableColumn<Tablasss, String> estadoo;
    
	
            boolean activo=false;
	    boolean activo1=false;
            boolean activo2=false;
            boolean activo3=false;
            boolean activo4=false;
            boolean activo5=false;
            boolean Admin=false;
            boolean Revi=false;
            boolean Recer=false;
            boolean Admin1=false;
            boolean Revi1=false;
            boolean Recer1=false;
            boolean Apro=false;
            boolean Entre=false;
            boolean Apro1=false;
            boolean Entre1=false;
    @FXML
    private ToggleGroup tipoos;
    
    private CheckBox check5;
    private CheckBox check6;
    private CheckBox check7;
    private CheckBox check8;
   
@Override
    public void initialize(URL url, ResourceBundle rb) {
      box.setDisable(true);
      box1.setDisable(true);
      box2.setDisable(true);
      box3.setDisable(true);
      initcombo();
      initrecurso();
      initrecursos();
      mouse();
      mouse1();
      mouse2();
      mouse3();
      mouse4();
      mouse5();
      Tablas T= new Tablas();
      ObservableList<Tablas> items=T.getTabla();
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
      this.Tabla.setItems(items);
      this.Tabla1.setItems(items);
      
      Tablass Ta= new Tablass();
      ObservableList<Tablass> itemss=Ta.getTablas();
      this.tipo.setCellValueFactory(new PropertyValueFactory("tipo"));
      this.usu.setCellValueFactory(new PropertyValueFactory("usuario"));
      this.contra.setCellValueFactory(new PropertyValueFactory("contraseña"));
      this.organ.setCellValueFactory(new PropertyValueFactory("organizacion"));
      this.corre.setCellValueFactory(new PropertyValueFactory("correo"));
      this.tele.setCellValueFactory(new PropertyValueFactory("telefono"));
      this.direcc.setCellValueFactory(new PropertyValueFactory("direccion"));
      this.Tabla2.setItems(itemss);
      
      this.tipo1.setCellValueFactory(new PropertyValueFactory("tipo"));
      this.usu1.setCellValueFactory(new PropertyValueFactory("usuario"));
      this.contra1.setCellValueFactory(new PropertyValueFactory("contraseña"));
      this.corre1.setCellValueFactory(new PropertyValueFactory("correo"));
      this.tele1.setCellValueFactory(new PropertyValueFactory("telefono"));
      this.direcc1.setCellValueFactory(new PropertyValueFactory("direccion"));
      this.estado.setCellValueFactory(new PropertyValueFactory("estado"));
      this.Tabla3.setItems(itemss);
      
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
      this.Tabla4.setItems(itemsss);
      
      this.organn1.setCellValueFactory(new PropertyValueFactory("Organizacion"));
      this.recur1.setCellValueFactory(new PropertyValueFactory("Recurso"));
      this.aprobaci1.setCellValueFactory(new PropertyValueFactory("Aprobacion"));
      this.usua1.setCellValueFactory(new PropertyValueFactory("Usuarioa"));
      this.entregaa1.setCellValueFactory(new PropertyValueFactory("Entrega"));
      this.usuae1.setCellValueFactory(new PropertyValueFactory("Usuarioe"));
      this.tiemp1.setCellValueFactory(new PropertyValueFactory("Tiempo"));
      this.costo1.setCellValueFactory(new PropertyValueFactory("Costo"));
      this.estadoo.setCellValueFactory(new PropertyValueFactory("Estado"));
      this.Tabla5.setItems(itemsss);
    }    
    
    public void initcombo(){
	 combos C=new combos();  
	 ObservableList<combos> items=C.getcombo();
	 this.box4.setItems(items);
	 this.box5.setItems(items);
         this.box6.setItems(items);
         this.box7.setItems(items);
         
        
    }
    public void initrecurso(){
         recurso E=new recurso();  
	 ObservableList<recurso> itemss=E.getrecurso();
         this.box1.setItems(itemss);
         this.box2.setItems(itemss);
    }
    public void initrecursos(){
         recurso E=new recurso();  
	 ObservableList<recurso> itemss=E.getrecursos();
         this.box.setItems(itemss);
         this.box3.setItems(itemss);
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
        Text27.setText("");
        Text28.setText("");
        Text29.setText("");
        Text30.setText("");
        Text31.setText("");
        Text32.setText("");
        Text33.setText("");
        Text34.setText("");
        Text35.setText("");
        Text36.setText("");
        Text37.setText("");
        Text38.setText("");
        Text39.setText("");
        adm.setSelected(false);
        rev.setSelected(false);
        rec.setSelected(false);
        adm1.setSelected(false);
        rev1.setSelected(false);
        rec1.setSelected(false);
        check1.setSelected(false);
        check2.setSelected(false);
        check3.setSelected(false);
        check4.setSelected(false);
        check5.setSelected(false);
        check6.setSelected(false);
        check7.setSelected(false);
        check8.setSelected(false);
        
        
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
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);
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
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);

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
		}
	}
        @FXML
	private void activar1(ActionEvent event) {
		if(check2.isSelected()){
			activo1=true;
                        activo=false;
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
            activo1=false;
	if(esta.equals("Activo")){
                Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setHeaderText(null);
                a.setTitle("ERROR");
                a.setContentText("Ya es Activo");
                a.showAndWait();
	}else{
	  String Sis;
	  if(check1.isSelected()){
                Sis="Activo";
           System.out.println(Text8.getText());
           System.out.println(Sis);
           Conexion.writeToActivo(orga, Sis);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
	Text8.setText("");
        Text27.setText("");
        check1.setSelected(false);
        activo=false;
	initcombo(); 
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);
	ObservableList<Tablas> itemss=T.getTabla();
	this.Tabla1.setItems(itemss);
                }
            }
        }
	
	if(activo1){
            activo=false;
	if(esta.equals("Inactivo")){
		Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setHeaderText(null);
                a.setTitle("ERROR");
                a.setContentText("Ya es Inactivo");
                a.showAndWait();
	}else{
		String Si;
		if(check2.isSelected()){
                Si="Inactivo";
            System.out.println(Text8.getText());
            System.out.println(Si);    
            Conexion.writeToActivo(orga, Si);
            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText(null);
            a.setTitle("CORRECTO");
            a.setContentText("Modificado");
	   a.showAndWait();
	Text8.setText("");
        Text27.setText("");
        check2.setSelected(false);
        activo1=false;
	initcombo(); 
	Tablas T= new Tablas();
	ObservableList<Tablas> items=T.getTabla();
	this.Tabla.setItems(items);
	
	ObservableList<Tablas> itemss=T.getTabla();
	this.Tabla1.setItems(itemss);
                    }
                }
            }
        }
    }
    @FXML
    private void cambi(Event event) {
        Text.setText("");
        Text1.setText("");
        Text2.setText("");
        Text3.setText("");
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
        Text27.setText("");
        check1.setSelected(false);
        check2.setSelected(false);
      }
      private void mouse() {
	 Tabla.setOnMouseClicked(new EventHandler<MouseEvent>(){	 
            @Override
            public void handle(MouseEvent event) {
                Tablas T= Tabla.getItems().get(Tabla.getSelectionModel().getSelectedIndex());
                Text4.setText(T.getOrganizacion());
		Text5.setText(T.getDireccion());
		Text6.setText(T.getTelefono());
		Text7.setText(T.getCorreo());
            }
            });
	}
	private void mouse1() {
	Tabla1.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                Tablas T= Tabla1.getItems().get(Tabla1.getSelectionModel().getSelectedIndex());
                Text8.setText(T.getOrganizacion());
		Text27.setText(T.getEstado());
            }
            }); 	
	}  
	@FXML
	private void organi(ActionEvent event) {
		combos c = this.box4.getValue();
            if (c != null) {
                this.Text28.setText(c.getOrganizacion());
            }
        }
    @FXML
    private void agregar1(ActionEvent event) {
	    Conexion conect= new Conexion();
    try{
    if(Text9.getText().equals("") || Text10.getText().equals("") || Text11.getText().equals("") || Text12.getText().equals("") || Text13.getText().equals("") || Text28.getText().equals("") || Text34.getText().equals("")){
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
      String Nom="";
      String Direc="";
      int Tel=0;
      String Corr="";
      Usu=Text9.getText();
      Contra=Text10.getText();
      Orga=Text28.getText();
      Nom=Text34.getText();
      Tel=Integer.parseInt(Text11.getText());
      Corr=Text12.getText();
      Direc=Text13.getText();
      String Estado="Activo";
      
      if(conect.existeUsu(Usu)==0){
      if(conect.Email(Text12.getText())){
	  if(adm.isSelected()){
		 Adm="Administrador";
                 Admin=true;
          }else{
                 Admin=false;
               }
          if(rev.isSelected()){
                 Adm="Revisor de Recursos";
                 Revi=true;
          }else{
                 Revi=false;
               }
          if(rec.isSelected()){
                 Adm="Recepción de Recursos";
                 Recer=true;
          }else{
                 Recer=false;
               }
         
         if(Admin){
		 System.out.println(Text9.getText());
		 System.out.println(Text10.getText());
                 System.out.println(Text28.getText());
                 System.out.println(Text34.getText());
		 System.out.println(Text12.getText());
                 System.out.println(Text11.getText());
		 System.out.println(Text13.getText());
                 Conexion.writeToDatabase1(Id, Adm, Usu, Contra, Orga, Nom, Corr, Tel, Direc, Estado);
                 Conexion.writeToDatabasee1(Id, Adm, Usu, Contra, Orga, Nom, Corr, Tel, Direc, Estado);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Agregado");
	a.showAndWait();
        Text9.setText("");
        Text10.setText("");
        Text28.setText("");
        Text11.setText("");
        Text12.setText("");
        Text13.setText("");
        Text34.setText("");
	adm.setSelected(false);
	initcombo(); 
        Tablass Ta= new Tablass();
        ObservableList<Tablass> itemss=Ta.getTablas();
        this.Tabla2.setItems(itemss);
        this.Tabla3.setItems(itemss);
	}
         if(Revi){
		 System.out.println(Text9.getText());
		 System.out.println(Text10.getText());
                 System.out.println(Text28.getText());
                 System.out.println(Text34.getText());
		 System.out.println(Text12.getText());
                 System.out.println(Text11.getText());
		 System.out.println(Text13.getText());	
                 Conexion.writeToDatabase1(Id, Adm, Usu, Contra, Orga, Nom, Corr, Tel, Direc, Estado);
                 Conexion.writeToDatabasee2(Id, Adm, Usu, Contra, Orga, Nom, Corr, Tel, Direc, Estado);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Agregado");
	a.showAndWait();
        Text9.setText("");
        Text10.setText("");
        Text28.setText("");
        Text11.setText("");
        Text12.setText("");
        Text13.setText("");
        Text34.setText("");
	rev.setSelected(false);
	initcombo(); 
	Tablass Ta= new Tablass();
        ObservableList<Tablass> itemss=Ta.getTablas();
        this.Tabla2.setItems(itemss);
        this.Tabla3.setItems(itemss);
        }
         if(Recer){
		 System.out.println(Text9.getText());
		 System.out.println(Text10.getText());
                 System.out.println(Text28.getText());
                 System.out.println(Text34.getText());
		 System.out.println(Text12.getText());
                 System.out.println(Text11.getText());
		 System.out.println(Text13.getText());	
                 Conexion.writeToDatabase1(Id, Adm, Usu, Contra, Orga, Nom, Corr, Tel, Direc, Estado);
                 Conexion.writeToDatabasee3(Id, Adm, Usu, Contra, Orga, Nom, Corr, Tel, Direc, Estado);
	Alert a=new Alert(Alert.AlertType.INFORMATION);
	a.setHeaderText(null);
	a.setTitle("CORRECTO");
	a.setContentText("Agregado");
	a.showAndWait();
        Text9.setText("");
        Text10.setText("");
        Text28.setText("");
        Text11.setText("");
        Text12.setText("");
        Text13.setText("");
        Text34.setText("");
	rec.setSelected(false);
	initcombo(); 
	Tablass Ta= new Tablass();
        ObservableList<Tablass> itemss=Ta.getTablas();
        this.Tabla2.setItems(itemss);
        this.Tabla3.setItems(itemss);
        }
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
	   a.setContentText("El Usuario ya Existe");
	   a.showAndWait();
	    }
        }
        }catch(Exception e){}  
    }
        @FXML
        private void organi1(ActionEvent event) {
                combos c = this.box5.getValue();
            if (c != null) {
                this.Text29.setText(c.getOrganizacion());
            }
        }
    @FXML
    private void modificar1(ActionEvent event) {
        Conexion conect = new Conexion();
        try{
	if(Text14.getText().equals("") || Text15.getText().equals("") || Text16.getText().equals("") || Text17.getText().equals("") || Text18.getText().equals("") || Text29.getText().equals("")|| Text35.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();	
	}else{	
        String Adm1=null;
        String Rev1=null;
        String Rec1=null;
        String usu=Text14.getText();
	String contra=Text15.getText();
        String orga=Text29.getText();
        String nom=Text35.getText();
        int tel=Integer.parseInt(Text16.getText());
	String corre=Text17.getText();
	String direc=Text18.getText();
	
	if(conect.Email(Text17.getText())){
            if(adm1.isSelected()){
		 Adm1="Administrador";
                 Admin1=true;
            }else{
                Admin1=false;
            }
            if(rev1.isSelected()){
                 Adm1="Revisor de Recursos";
                 Revi1=true;
            }else{
                 Revi1=false;
            }   
             if(rec1.isSelected()){
                 Adm1="Recepción de Recursos";
                 Recer1=true;
            }else{
                 Recer1=false;
            }
        if(Admin1){    
        System.out.println(Text14.getText());
	System.out.println(Text15.getText());
        System.out.println(Text35.getText());
        System.out.println(Text17.getText());
        System.out.println(Integer.parseInt(Text16.getText()));
	System.out.println(Text18.getText());
	
	Conexion.writeToUpdate1(Adm1, usu, contra, orga, nom, corre, tel, direc);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
           Text14.setText("");
           Text15.setText("");
           Text16.setText("");
           Text17.setText("");
           Text18.setText("");
           Text29.setText("");
           Text35.setText("");
           adm1.setSelected(false);
        initcombo(); 
        Tablass Ta= new Tablass();
        ObservableList<Tablass> itemss=Ta.getTablas();
        this.Tabla2.setItems(itemss);
        this.Tabla3.setItems(itemss);
        }
        if(Revi1){    
        System.out.println(Text14.getText());
	System.out.println(Text15.getText());
        System.out.println(Text35.getText());
        System.out.println(Text17.getText());
        System.out.println(Integer.parseInt(Text16.getText()));
	System.out.println(Text18.getText());
	
	Conexion.writeToUpdate1(Adm1, usu, contra, orga, nom, corre, tel, direc);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
           Text14.setText("");
           Text15.setText("");
           Text16.setText("");
           Text17.setText("");
           Text18.setText("");
           Text29.setText("");
           Text35.setText("");
           rev1.setSelected(false);
        initcombo(); 
        Tablass Ta= new Tablass();
        ObservableList<Tablass> itemss=Ta.getTablas();
        this.Tabla2.setItems(itemss);
        this.Tabla3.setItems(itemss);
        }
        if(Recer1){    
        System.out.println(Text14.getText());
	System.out.println(Text15.getText());
        System.out.println(Text35.getText());
        System.out.println(Text17.getText());
        System.out.println(Integer.parseInt(Text16.getText()));
	System.out.println(Text18.getText());
	
	Conexion.writeToUpdate1(Adm1, usu, contra, orga, nom, corre, tel, direc);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
           Text14.setText("");
           Text15.setText("");
           Text16.setText("");
           Text17.setText("");
           Text18.setText("");
           Text29.setText("");
           Text35.setText("");
           rec1.setSelected(false);
        initcombo(); 
        Tablass Ta= new Tablass();
        ObservableList<Tablass> itemss=Ta.getTablas();
        this.Tabla2.setItems(itemss);
        this.Tabla3.setItems(itemss);
        }
        }else{
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("El Correo es Invalido");
	   a.showAndWait();
           }
        }
        }catch (Exception e) {}
    }
        @FXML
        private void activar2(ActionEvent event) {
            if(check3.isSelected()){
			activo2=true;
                        activo3=false;
            }
        }
        @FXML
         private void activar3(ActionEvent event) {
             if(check4.isSelected()){
			activo3=true;
                        activo2=false;
             }
         }
    
    @FXML
    private void cambiar1(ActionEvent event) {
        Conexion conect=new Conexion();
	if(Text19.getText().equals("") || Text30.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();	
	}else{	
	String usu=Text19.getText();
	String esta=Text30.getText();
        
	if(activo2){
            activo3=false;
	if(esta.equals("Activo")){
                Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setHeaderText(null);
                a.setTitle("ERROR");
                a.setContentText("Ya es Activo");
                a.showAndWait();
	}else{
	  String Sis;
	  if(check3.isSelected()){
                Sis="Activo";
           System.out.println(Text19.getText());
           System.out.println(Sis);
           Conexion.writeToActivo1(usu, Sis);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
	Text19.setText("");
        Text30.setText("");
        check3.setSelected(false);
        activo2=false;
	initcombo(); 
	Tablass Ta= new Tablass();
        ObservableList<Tablass> itemss=Ta.getTablas();
        this.Tabla2.setItems(itemss);
        this.Tabla3.setItems(itemss);
                }
            }
        } 
	
	if(activo3){
            activo2=false;
	if(esta.equals("Inactivo")){
		Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setHeaderText(null);
                a.setTitle("ERROR");
                a.setContentText("Ya es Inactivo");
                a.showAndWait();
	}else{
           String Si;
           if(check4.isSelected()){
                Si="Inactivo";
           System.out.println(Text19.getText());
           System.out.println(Si);
	   Conexion.writeToActivo1(usu, Si);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
	Text19.setText("");
        Text30.setText("");
        check4.setSelected(false);
        activo3=false;
	initcombo(); 
	Tablass Ta= new Tablass();
        ObservableList<Tablass> itemss=Ta.getTablas();
        this.Tabla2.setItems(itemss);
        this.Tabla3.setItems(itemss);
                    }
                }
            }
        }
    }
    private void mouse2() {
        Tabla2.setOnMouseClicked(new EventHandler<MouseEvent>(){
	
            @Override
            public void handle(MouseEvent event) {
                Tablass T= Tabla2.getItems().get(Tabla2.getSelectionModel().getSelectedIndex());
                Text14.setText(T.getUsuario());
                Text15.setText(T.getContraseña());
                Text35.setText(T.getNombre());
		Text16.setText(T.getTelefono());
		Text17.setText(T.getCorreo());
                Text18.setText(T.getDireccion());
            }
            });
    }
    private void mouse3() {
        Tabla3.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                Tablass T= Tabla3.getItems().get(Tabla3.getSelectionModel().getSelectedIndex());
                Text19.setText(T.getUsuario());
                Text30.setText(T.getEstado());
            }
            });
    }
    @FXML
    private void cambioo(Event event) {
        Text9.setText("");
        Text10.setText("");
        Text11.setText("");
        Text12.setText("");
        Text13.setText("");
        Text28.setText("");
        Text34.setText("");
        adm.setSelected(false);
        rev.setSelected(false);
        rec.setSelected(false);
    }
    @FXML
    private void cambioo1(Event event) {
        Text14.setText("");
        Text15.setText("");
        Text16.setText("");
        Text17.setText("");
        Text18.setText("");
        Text29.setText("");
        Text35.setText("");
        adm.setSelected(false);
        rev.setSelected(false);
        rec.setSelected(false);
        adm1.setSelected(false);
        rev1.setSelected(false);
        rec1.setSelected(false);
    }
    @FXML
    private void cambioo2(Event event) {
        Text19.setText("");
        Text30.setText("");
        check3.setSelected(false);
        check4.setSelected(false);
    }
    @FXML
    private void aprobar(ActionEvent event) {
       recurso c = this.box.getValue();
            if (c != null) {
                this.Text32.setText(c.getUsuario());
            } 
    }
    @FXML
    private void entregar(ActionEvent event) {
       recurso c = this.box1.getValue();
            if (c != null) {
                this.Text33.setText(c.getUsuario());
            }  
    }
    @FXML
    private void organi2(ActionEvent event) {
        combos c = this.box6.getValue();
            if (c != null) {
                this.Text31.setText(c.getOrganizacion());
            }
    }
    @FXML
    private void Aprob(MouseEvent event) {
         if(aprob.isSelected()){
                box.setDisable(false);
             }else{
                box.setDisable(true);
             }
    }
    @FXML
    private void Entreg(MouseEvent event) {
         if(entreg.isSelected()){
                box1.setDisable(false);
             }else{
                box1.setDisable(true);
             }
    }
    @FXML
    private void agregar2(ActionEvent event) {
        Conexion conect= new Conexion();
    if(Text20.getText().equals("") || Text21.getText().equals("") || Text22.getText().equals("") || Text31.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();
    }else{
      int Id=conect.id2();
      String Si=null;
      String Orga="";
      String Recur="";
      String Aprob="";
      String UsuApro="";
      String Entr="";
      String UsuEntre="";
      int Tiemp=0;
      int Cost=0;
      Orga=Text31.getText();
      Recur=Text20.getText();
      if(conect.existeRecur(Recur)==0){
      if(aprob.isSelected()){
          Aprob="Si Necesita";
          UsuApro=Text32.getText();
      }else{
          Aprob="No Necesita";
          UsuApro="------";
      
      if(entreg.isSelected()){
          Aprob="Si Necesita";
          UsuEntre=Text33.getText();
      }else{
          Entr="No Necesita";
          UsuEntre="------";
      }
      }
      Tiemp=Integer.parseInt(Text21.getText());
      Cost=Integer.parseInt(Text22.getText());
      Si="Activo";
      
         System.out.println(Text31.getText());
	 System.out.println(Text20.getText());
         System.out.println(Aprob);
         System.out.println(UsuApro);
         System.out.println(Text32.getText());
         System.out.println(Entr);
         System.out.println(UsuEntre);
         System.out.println(Text33.getText());
	 System.out.println(Text21.getText());
	 System.out.println(Text22.getText());
         Si="Activo";	
         Conexion.writeToDatabase2(Id, Orga, Recur, Aprob, UsuApro, Entr, UsuEntre, Tiemp, Cost, Si);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Agregado");
	   a.showAndWait();
        Text20.setText("");
        Text21.setText("");
        Text22.setText("");
        Text31.setText("");
        Text32.setText("");
        Text33.setText("");
        aprob.setSelected(false);
	entreg.setSelected(false);
	initcombo();
	Tablasss Ta= new Tablasss();
        ObservableList<Tablasss> itemss=Ta.getTablass();
        this.Tabla4.setItems(itemss);
        this.Tabla5.setItems(itemss);
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
    private void aprobar1(ActionEvent event) {
        recurso c = this.box2.getValue();
            if (c != null) {
                this.Text37.setText(c.getUsuario());
            }
    }
    @FXML
    private void entregar1(ActionEvent event) {
        recurso c = this.box3.getValue();
            if (c != null) {
                this.Text38.setText(c.getUsuario());
            }  

    }
    @FXML
    private void organi3(ActionEvent event) {
        combos c = this.box7.getValue();
            if (c != null) {
                this.Text36.setText(c.getOrganizacion());
            }
    }
    @FXML
    private void Aprob1(MouseEvent event) {
         if(aprob1.isSelected()){
                box2.setDisable(false);
             }else{
                box2.setDisable(true);
             }
    }
    @FXML
    private void Entreg1(MouseEvent event) {
         if(entreg1.isSelected()){
                box3.setDisable(false);
             }else{
                box3.setDisable(true);
             }
    }
    @FXML
    private void modificar2(ActionEvent event) {
        Conexion conect= new Conexion();
    if(Text23.getText().equals("") || Text24.getText().equals("") || Text25.getText().equals("") || Text36.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();
    }else{
      int Id=conect.id2();
      String Si=null;
      String Orga="";
      String Recur="";
      String Aprob="";
      String UsuApro="";
      String Entr="";
      String UsuEntre="";
      int Tiemp=0;
      int Cost=0;
      Orga=Text36.getText();
      Recur=Text23.getText();
      
      if(aprob1.isSelected()){
          Aprob="Si Necesita";
          UsuApro=Text37.getText();
      }else{
          Aprob="No Necesita";
          UsuApro="------";
      
      if(entreg1.isSelected()){
          Aprob="Si Necesita";
          UsuEntre=Text38.getText();
      }else{
          Entr="No Necesita";
          UsuEntre="------";
      }
      }
      Tiemp=Integer.parseInt(Text24.getText());
      Cost=Integer.parseInt(Text25.getText());
      
         System.out.println(Text36.getText());
	 System.out.println(Text23.getText());
         System.out.println(Aprob);
         System.out.println(UsuApro);
         System.out.println(Text37.getText());
         System.out.println(Entr);
         System.out.println(UsuEntre);
         System.out.println(Text38.getText());
	 System.out.println(Text24.getText());
	 System.out.println(Text25.getText());
         Conexion.writeToUpdate2(Orga, Recur, Aprob, UsuApro, Entr, UsuEntre, Tiemp, Cost);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
        Text23.setText("");
        Text24.setText("");
        Text25.setText("");
        Text36.setText("");
        Text37.setText("");
        Text38.setText("");
        aprob1.setSelected(false);
	entreg1.setSelected(false);
	initcombo();
	Tablasss Ta= new Tablasss();
        ObservableList<Tablasss> itemss=Ta.getTablass();
        this.Tabla4.setItems(itemss);
        this.Tabla5.setItems(itemss);;
	}
    }
    @FXML
    private void activar4(ActionEvent event) {
        if(check9.isSelected()){
			activo4=true;
                        activo5=false;
            }
    }
    @FXML
    private void activar5(ActionEvent event) {
        if(check10.isSelected()){
			activo5=true;
                        activo4=false;
            }
    }
    @FXML
    private void cambiar2(ActionEvent event) {
        Conexion conect=new Conexion();
	if(Text26.getText().equals("") || Text39.getText().equals("")){
	   Alert a=new Alert(Alert.AlertType.ERROR);
	   a.setHeaderText(null);
	   a.setTitle("ERROR");
	   a.setContentText("Debe Ingresar Todos los datos");
	   a.showAndWait();	
	}else{	
	String recu=Text26.getText();
	String esta=Text39.getText();
        
	if(activo4){
            activo5=false;
	if(esta.equals("Activo")){
                Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setHeaderText(null);
                a.setTitle("ERROR");
                a.setContentText("Ya es Activo");
                a.showAndWait();
	}else{
	  String Sis;
	  if(check9.isSelected()){
                Sis="Activo";
           System.out.println(Text26.getText());
           System.out.println(Sis);
           Conexion.writeToActivo2(recu, Sis);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
	Text26.setText("");
        Text39.setText("");
        check9.setSelected(false);
        activo4=false;
	initcombo(); 
	Tablasss Ta= new Tablasss();
        ObservableList<Tablasss> itemss=Ta.getTablass();
        this.Tabla4.setItems(itemss);
        this.Tabla5.setItems(itemss);
                }
            }
        } 
	
	if(activo5){
            activo4=false;
	if(esta.equals("Inactivo")){
		Alert a=new Alert(Alert.AlertType.INFORMATION);
                a.setHeaderText(null);
                a.setTitle("ERROR");
                a.setContentText("Ya es Inactivo");
                a.showAndWait();
	}else{
           String Si;
           if(check10.isSelected()){
                Si="Inactivo";
           System.out.println(Text26.getText());
           System.out.println(Si);
	   Conexion.writeToActivo2(recu, Si);
	   Alert a=new Alert(Alert.AlertType.INFORMATION);
	   a.setHeaderText(null);
	   a.setTitle("CORRECTO");
	   a.setContentText("Modificado");
	   a.showAndWait();
	Text26.setText("");
        Text39.setText("");
        check10.setSelected(false);
        activo5=false;
	initcombo(); 
	Tablasss Ta= new Tablasss();
        ObservableList<Tablasss> itemss=Ta.getTablass();
        this.Tabla4.setItems(itemss);
        this.Tabla5.setItems(itemss);
                    }
                }
            }
        }
    }
    private void mouse4() {
	 Tabla4.setOnMouseClicked(new EventHandler<MouseEvent>(){	 
            @Override
            public void handle(MouseEvent event) {
                Tablasss T= Tabla4.getItems().get(Tabla4.getSelectionModel().getSelectedIndex());
                Text23.setText(T.getRecurso());
		Text24.setText(T.getTiempo());
		Text25.setText(T.getCosto());
            }
            });
    }
    private void mouse5() {
	 Tabla5.setOnMouseClicked(new EventHandler<MouseEvent>(){	 
            @Override
            public void handle(MouseEvent event) {
                Tablasss T= Tabla5.getItems().get(Tabla5.getSelectionModel().getSelectedIndex());
                Text26.setText(T.getRecurso());
		Text39.setText(T.getEstado());
            }
            });
    }
    @FXML
    private void cambiooo(Event event) {
        Text20.setText("");
        Text21.setText("");
        Text22.setText("");
        Text31.setText("");
        Text32.setText("");
        Text33.setText("");
        aprob.setSelected(false);
        entreg.setSelected(false);
        box.setDisable(true);
        box1.setDisable(true);
    }
   @FXML
    private void cambiooo1(Event event) {
        Text23.setText("");
        Text24.setText("");
        Text25.setText("");
        Text36.setText("");
        Text37.setText("");
        Text38.setText("");
        aprob1.setSelected(false);
        entreg1.setSelected(false);
        box2.setDisable(true);
        box3.setDisable(true);
    }
    @FXML
    private void cambiooo2(Event event) {
        Text26.setText("");
        Text39.setText("");
        check9.setSelected(false);
        check10.setSelected(false);
    }
}
