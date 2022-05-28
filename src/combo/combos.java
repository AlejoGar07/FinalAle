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

public class combos {
	private String organizacion;
	
	public combos() {
	}
	public combos(String Organizacion){
		this.organizacion = Organizacion;
	}

    public String getOrganizacion() {
        return organizacion;
    }

    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
	
	@Override	
	public String toString(){
		return organizacion;
	}
	public ObservableList<combos> getcombo(){
		ObservableList<combos> Cb = FXCollections.observableArrayList();
		try{
	       
	       String url = "jdbc:postgresql://localhost:5432/administrador";
	       String user = "postgres";
	       String password = "Ale0107";
	       String s = ("select * from organizaciones where Estado='"+"Activo"+"'");
	        Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement P = con.prepareStatement(s);
	        ResultSet rs=P.executeQuery();
	       
	       while (rs.next()){
		      String organizacion=rs.getString("Organizacion");
		      
		      
		      combos c = new combos(organizacion);
		      Cb.add(c);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return Cb;
}
}

