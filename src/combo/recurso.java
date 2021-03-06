package combo;

import Tabla.Tablas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class recurso {
    private String Usuario;
    
    public recurso() {
	}
	public recurso(String usuario){
		this.Usuario = usuario;
        }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

   @Override	
	public String toString(){
        return Usuario;
        }
    	
    public ObservableList<recurso> getrecursos(String organizacion){
		ObservableList<recurso> Cb = FXCollections.observableArrayList();
		try{
	       
	       String url = "jdbc:postgresql://localhost:5432/administrador";
	       String user = "postgres";
	       String password = "Ale0107";
	       String s = ("select * from usuarios where Organizacion='"+organizacion+"' and Tipo='"+"Revisor de Recursos"+"' and Estado='"+"Activo"+"'");
	        Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement P = con.prepareStatement(s);
	        ResultSet rs=P.executeQuery();
	       
	       while (rs.next()){
                      String Usuario=rs.getString("Usuario");
		      
		      recurso c = new recurso(Usuario);
		      Cb.add(c);
	       }
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return Cb;
    } 
    public ObservableList<recurso> getrecursos1(String organizacion){
		ObservableList<recurso> Cb = FXCollections.observableArrayList();
		try{
	       
	       String url = "jdbc:postgresql://localhost:5432/administrador";
	       String user = "postgres";
	       String password = "Ale0107";
	       String s = ("select * from usuarios where Organizacion='"+organizacion+"' and Tipo='"+"Revisor de Recursos"+"' and Estado='"+"Activo"+"';");
	        Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement P = con.prepareStatement(s);
	        ResultSet rs=P.executeQuery();
	       
	       while (rs.next()){
                      String Usuario=rs.getString("Usuario");
		      
		      recurso c = new recurso(Usuario);
		      Cb.add(c);
	       }
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return Cb;
    } 
    public ObservableList<recurso> getrecurso(String organizacion){
		ObservableList<recurso> Cb = FXCollections.observableArrayList();
		try{
	       
	       String url = "jdbc:postgresql://localhost:5432/administrador";
	       String user = "postgres";
	       String password = "Ale0107";
	       String s = ("select * from usuarios where Organizacion='"+organizacion+"' and Tipo='"+"Recepci??n de Recursos"+"' and Estado='"+"Activo"+"';");
	        Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement P = con.prepareStatement(s);
	        ResultSet rs=P.executeQuery();
	       
	       while (rs.next()){
                      String Usuario=rs.getString("Usuario");
		      
		      recurso c = new recurso(Usuario);
		      Cb.add(c);
	       }
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return Cb;
    } public ObservableList<recurso> getrecurso1(String organizacion){
		ObservableList<recurso> Cb = FXCollections.observableArrayList();
		try{
	       
	       String url = "jdbc:postgresql://localhost:5432/administrador";
	       String user = "postgres";
	       String password = "Ale0107";
	       String s = ("select * from usuarios where Organizacion='"+organizacion+"' and Tipo='"+"Recepci??n de Recursos"+"' and Estado='"+"Activo"+"';");
	        Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement P = con.prepareStatement(s);
	        ResultSet rs=P.executeQuery();
	       
	       while (rs.next()){
                      String Usuario=rs.getString("Usuario");
		      
		      recurso c = new recurso(Usuario);
		      Cb.add(c);
	       }
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return Cb;
    } 
}
