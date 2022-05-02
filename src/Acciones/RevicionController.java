package Acciones;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;


public class RevicionController implements Initializable {

	@FXML
	private Button b;
    @FXML
    private ComboBox<?> box;
    @FXML
    private TextField Text;
    @FXML
    private ComboBox<?> box1;
    @FXML
    private TextArea TextArea;
    @FXML
    private TextField Text1;
    @FXML
    private TextField Text2;
    @FXML
    private TextField Text3;
    @FXML
    private RadioButton si;
    @FXML
    private ToggleGroup aprobacion;
    @FXML
    private RadioButton no;
    @FXML
    private Button gestionar;
    @FXML
    private Button cancel;

	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}	

	@FXML
	private void regresar(ActionEvent event) {
		Stage stage= (Stage) this.b.getScene().getWindow();
		stage.close();
	}

    @FXML
    private void gestionar(ActionEvent event) {
    }

    @FXML
    private void cancel(ActionEvent event) {
    }
	
}
