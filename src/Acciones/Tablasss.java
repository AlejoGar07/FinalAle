package Acciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Tablasss {
        private String Organizacion;
        private String Recurso;
        private String Aprobacion;
        private String Usuarioa;
        private String Entrega;
	private String Usuarioe;
	private String Tiempo;
	private String Costo;
        private String Estado;
        
        public Tablasss() {
        }
        public Tablasss(String organizacion, String recurso, String aprobacion, String usuarioa, String entrega, String usuarioe, String tiempo, String costo, String estado){
                this.Organizacion=organizacion;
                this.Recurso=recurso;
                this.Aprobacion=aprobacion;
                this.Usuarioa=usuarioa;
                this.Entrega=entrega;
                this.Usuarioe=usuarioe;
                this.Tiempo=tiempo;
                this.Costo=costo;
                this.Estado=estado;
        }

    public String getOrganizacion() {
        return Organizacion;
    }

    public void setOrganizacion(String Organizacion) {
        this.Organizacion = Organizacion;
    }

    public String getRecurso() {
        return Recurso;
    }

    public void setRecurso(String Recurso) {
        this.Recurso = Recurso;
    }

    public String getAprobacion() {
        return Aprobacion;
    }

    public void setAprobacion(String Aprobacion) {
        this.Aprobacion = Aprobacion;
    }

    public String getUsuarioa() {
        return Usuarioa;
    }

    public void setUsuarioa(String Usuarioa) {
        this.Usuarioa = Usuarioa;
    }

    public String getEntrega() {
        return Entrega;
    }

    public void setEntrega(String Entrega) {
        this.Entrega = Entrega;
    }

    public String getUsuarioe() {
        return Usuarioe;
    }

    public void setUsuarioe(String Usuarioe) {
        this.Usuarioe = Usuarioe;
    }
    public String getTiempo() {
        return Tiempo;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

    public String getCosto() {
        return Costo;
    }

    public void setCosto(String Costo) {
        this.Costo = Costo;
    }
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    public ObservableList<Tablasss> getTablass(){
	       ObservableList<Tablasss> O = FXCollections.observableArrayList();
	       try{
	       String s = ("select Organizacion, Recurso, Aprobacion, Usuarioa, Entrega, Usuarioe, Tiempo, Costo, Estado"
		       + " from recursos order by Codigo");
	       Connection con=null;
	       PreparedStatement  P=null;
	       ResultSet rs=null;
	       String url = "jdbc:postgresql://localhost:5432/administrador";
	       String user = "postgres";
	       String password = "Ale0107";
	       
	        con = DriverManager.getConnection(url,user,password);
		P = con.prepareStatement(s);
	        rs=P.executeQuery();
	       
	       while (rs.next()){
                      String orga=rs.getString("Organizacion");
                      String recur=rs.getString("Recurso");
		      String apro=rs.getString("Aprobacion");
                      String usua=rs.getString("Usuarioa");
                      String entre=rs.getString("Entrega");
                      String usue=rs.getString("Usuarioe");
		      String tiem=rs.getString("Tiempo");
		      String cost=rs.getString("Costo");
                      String esta=rs.getString("Estado");
		      
		      
		      Tablasss t = new Tablasss(orga, recur, apro, usua, entre, usue, tiem, cost, esta);
		      O.add(t);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       
		}
	       return O;
}    
       
}
