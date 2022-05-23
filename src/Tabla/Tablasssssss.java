package Tabla;

import Tabla.Tablas;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Tablasssssss {
        private String Organizacion;
        private String Recurso;
        private String Aprobacion;
        private String Usuarioa;
        private String Estadoa;
        private String Entrega;
	private String Usuarioe;
        private String Estadoe;
	private String Tiempo;
	private String Costo;
        private String Estado;
        
        public Tablasssssss() {
        }
        public Tablasssssss(String organizacion, String recurso, String aprobacion, String usuarioa, String estadoa, String entrega, String usuarioe, String estadoe, String tiempo, String costo, String estado){
                this.Organizacion=organizacion;
                this.Recurso=recurso;
                this.Aprobacion=aprobacion;
                this.Usuarioa=usuarioa;
                this.Estadoa=estadoa;
                this.Entrega=entrega;
                this.Usuarioe=usuarioe;
                this.Estadoe=estadoe;
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

    public String getEstadoa() {
        return Estadoa;
    }

    public void setEstadoa(String Estadoa) {
        this.Estadoa = Estadoa;
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

    public String getEstadoe() {
        return Estadoe;
    }

    public void setEstadoe(String Estadoe) {
        this.Estadoe = Estadoe;
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
    public ObservableList<Tablasssssss> getTablasssssss(){
	       ObservableList<Tablasssssss> O = FXCollections.observableArrayList();
	       try{
	       String s = ("select Organizacion, Recurso, Aprobacion, Usuarioa, Estadoa, Entrega, Usuarioe, Estadoe, Tiempo, Costo, Estado from recursos where Entrega= '"+"Si Necesita"+"' and Estadoe= '"+"Pendiente"+"' and Estado= '"+"Activo"+"' order by Codigo");
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
                      String estaa=rs.getString("Estadoa");
                      String entre=rs.getString("Entrega");
                      String usue=rs.getString("Usuarioe");
                      String estae=rs.getString("Estadoe");
		      String tiem=rs.getString("Tiempo");
		      String cost=rs.getString("Costo");
                      String esta=rs.getString("Estado");
		      
		      
		      Tablasssssss t = new Tablasssssss(orga, recur, apro, usua, estaa, entre, usue, estae, tiem, cost, esta);
		      O.add(t);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       
		}
	       return O;
}    
}
