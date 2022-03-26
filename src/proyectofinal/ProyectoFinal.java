package proyectofinal;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ProyectoFinal extends Application {
    
    @Override
    public void start(Stage primaryStage)  {
        try{
        
        FXMLLoader cargar= new FXMLLoader();
        cargar.setLocation(ProyectoFinal.class.getResource("/Vista/vista.fxml"));
        Pane menu = (Pane) cargar.load();
        Scene s = new Scene (menu);
        primaryStage.setScene(s);
        primaryStage.show();
    }catch (IOException e){
        System.out.println(e.getMessage());
    }
    }
    
    public static void main(String[] args) {
        launch(args);
        
        Conexion c=new Conexion();
        c.Conectar();
    }
    
}
