package Acciones;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import proyectofinal.ProyectoFinal;

public class RevicioonController implements Initializable {

    @FXML
    private Button b;
    @FXML
    private TextField Usuario;
    @FXML
    private PasswordField Contra;
    @FXML
    private Button ingreso;
    @FXML
    private Button cancel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    @FXML
    private void Regresar(ActionEvent event) {
        Stage stage= (Stage) this.b.getScene().getWindow();
	stage.close();
    }
    @FXML
    private void cancel(ActionEvent event) {
        Usuario.setText("");
        Contra.setText("");
    }
    @FXML
    private void Ingresar(ActionEvent event) {
         String User=Usuario.getText();
        String Password=Contra.getText();
        
        if(User.equals("")&&Password.equals("")){
            System.out.println(User + Password);
        }else{
            try{
                
                String url = "jdbc:postgresql://localhost:5432/administrador";
                String user = "postgres";
                String password = "Ale0107";
                String s = ("select * from usuarios where Tipo='"+"Revisor de Recursos"+"' and nombre=? and Contraseña=?");
	        Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement P = con.prepareStatement(s);
                P.setString(1, User);
                P.setString(2, Password);
                ResultSet rs=P.executeQuery();
                if(rs.next()){
                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                    a.setHeaderText(null);
                    a.setTitle("CORRECTO");
                    a.setContentText("Ingreso Correcto");
                    a.showAndWait();
                    try{
			FXMLLoader cargar= new FXMLLoader();
			 cargar.setLocation(ProyectoFinal.class.getResource("/Vistas/Aprobar.fxml"));
			 Parent root = cargar.load();
			 Scene scene = new Scene (root);
			 Stage stage= new Stage();
			 stage.setScene(scene);
			 stage.showAndWait();
                         stage.close();
                         Stage stagee= (Stage) this.b.getScene().getWindow();
                         stagee.close();
                    }catch(Exception e){
			e.printStackTrace();
		}
                }else{
                    Alert a=new Alert(Alert.AlertType.INFORMATION);
                    a.setHeaderText(null);
                    a.setTitle("CORRECTO");
                    a.setContentText("Ingreso Incorrecto");
                    a.showAndWait();
                    Usuario.setText("");
                    Contra.setText("");
                }
            }catch(SQLException ex){
                Logger.getLogger(AdminController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }    
}
