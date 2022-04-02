package Acciones;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class RevicionController implements Initializable {

	@FXML
	private Button b;

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@FXML
	private void regresar(ActionEvent event) {
		Stage stage= (Stage) this.b.getScene().getWindow();
		stage.close();
	}
	
}
