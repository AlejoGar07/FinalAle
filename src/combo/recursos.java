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

public class recursos {
    private String Recurso;
public recursos() {
}
    public recursos(String recurso){
		this.Recurso = recurso;
    }

    public String getRecurso() {
        return Recurso;
    }

    public void setRecurso(String Recurso) {
        this.Recurso = Recurso;
    }
@Override	
	public String toString(){
        return Recurso;
        }        
    public ObservableList<recursos> getRecursos(String organizacion){
		ObservableList<recursos> Cb = FXCollections.observableArrayList();
		try{
	       
	       String url = "jdbc:postgresql://localhost:5432/administrador";
	       String user = "postgres";
	       String password = "Ale0107";
	       String s = ("select * from recursos where Organizacion='"+organizacion+"';");
	        Connection con = DriverManager.getConnection(url,user,password);
		PreparedStatement P = con.prepareStatement(s);
	        ResultSet rs=P.executeQuery();
	       
	       while (rs.next()){
                      String Recurso=rs.getString("Recurso");
		      
		      recursos c = new recursos(Recurso);
		      Cb.add(c);
	       }
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return Cb;
}     
}
