package proyectofinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexion {
    Connection Conexion=null;
    String pass="Ale0107";
    String user="postgres";
    
    public void Conectar(){
        try{
            Conexion=DriverManager.getConnection("",user,pass);
            JOptionPane.showMessageDialog(null, "Agregado");
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    public void Ingreso(String script){
        PreparedStatement p=null;
        Conectar();
        try{
            p=Conexion.prepareStatement(script);
            p.executeUpdate();
            JOptionPane.showMessageDialog(null, "Guardado");
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
