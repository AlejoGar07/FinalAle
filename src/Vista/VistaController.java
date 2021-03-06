package Vista;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import proyectofinal.ProyectoFinal;


public class VistaController implements Initializable {

	@FXML
	private Pane container;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}	
        @FXML
	private void admin(ActionEvent event) {
		try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(ProyectoFinal.class.getResource("/Vistas/Admin.fxml"));
			Parent root = cargar.load();
			Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.showAndWait();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
        @FXML
        private void gestion(ActionEvent event) {
                try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(ProyectoFinal.class.getResource("/Vistas/Revicion.fxml"));
			Parent root = cargar.load();
			Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.showAndWait();
		}catch(Exception e){
			e.printStackTrace();
		}
        }
        @FXML
	private void revicion(ActionEvent event) {
		try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(ProyectoFinal.class.getResource("/Vistas/Revicioon.fxml"));
			Parent root = cargar.load();
			Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.showAndWait();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
        @FXML
        private void recepcion(ActionEvent event) {
                try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(ProyectoFinal.class.getResource("/Vistas/Recepcioon.fxml"));
			Parent root = cargar.load();
			Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.showAndWait();
		}catch(Exception e){
			e.printStackTrace();
		}
        }
        @FXML
        private void reserva(ActionEvent event) {
                try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(ProyectoFinal.class.getResource("/Vistas/Reserva.fxml"));
			Parent root = cargar.load();
			Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.showAndWait();
		}catch(Exception e){
			e.printStackTrace();
		}
        }   	
        @FXML
        private void pendiente(ActionEvent event) {
                try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(ProyectoFinal.class.getResource("/Vistas/Reviciones.fxml"));
			Parent root = cargar.load();
			Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.showAndWait();
		}catch(Exception e){
			e.printStackTrace();
		}
        }

    @FXML
    private void reporte(ActionEvent event) {
        try{
			FXMLLoader cargar= new FXMLLoader();
			cargar.setLocation(ProyectoFinal.class.getResource("/Vistas/Reportes.fxml"));
			Parent root = cargar.load();
			Scene scene = new Scene (root);
			Stage stage= new Stage();
			stage.setScene(scene);
			stage.showAndWait();
		}catch(Exception e){
			e.printStackTrace();
		}
    }
}
