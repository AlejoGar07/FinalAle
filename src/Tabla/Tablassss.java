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

public class Tablassss {
        private String Organizacion;
        private String Recurso;
        private String Actividad;
        private String Descripcion;
        private String Aprobacion;
	private String Confirmacion;
	private Date Fecha;
	private String Horai;
        private String Horaf;
        private Date Fechas;
        
        public Tablassss() {
        }
        public Tablassss(String organizacion, String recurso, String actividad, String descripcion, String aprobacion, String confirmacion,Date fecha, String horai, String horaf, Date fechas){
            this.Organizacion=organizacion;
            this.Recurso=recurso;
            this.Actividad=actividad;
            this.Descripcion=descripcion;
            this.Aprobacion=aprobacion;
            this.Confirmacion=confirmacion;
            this.Fecha=fecha;
            this.Horai=horai;
            this.Horaf=horaf;
            this.Fechas=fechas;
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

    public String getActividad() {
        return Actividad;
    }

    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getAprobacion() {
        return Aprobacion;
    }

    public void setAprobacion(String Aprobacion) {
        this.Aprobacion = Aprobacion;
    }

    public String getConfirmacion() {
        return Confirmacion;
    }

    public void setConfirmacion(String Confirmacion) {
        this.Confirmacion = Confirmacion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public String getHorai() {
        return Horai;
    }

    public void setHorai(String Horai) {
        this.Horai = Horai;
    }

    public String getHoraf() {
        return Horaf;
    }

    public void setHoraf(String Horaf) {
        this.Horaf = Horaf;
    }
    
    public Date getFechas() {
        return Fechas;
    }

    public void setFechas(Date Fechas) {
        this.Fechas = Fechas;
    }
    public ObservableList<Tablassss> getTablasss(){
	       ObservableList<Tablassss> O = FXCollections.observableArrayList();
	       try{
	       String s = ("select Organizacion, Recurso, Actividad, Descripcion, Aprobacion, Confirmacion, Fecha, Horai, Horaf, Fechas from solicitudes where Aprobacion= '"+"Si Necesita"+"' and Confirmacion= '"+"Pendiente"+"' order by Codigo");
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
		      String acti=rs.getString("Actividad");
                      String descri=rs.getString("Descripcion");
                      String aprob=rs.getString("Aprobacion");
                      String confi=rs.getString("Confirmacion");
		      Date fecha=rs.getDate("Fecha");
		      String horai=rs.getString("Horai");
                      String horaf=rs.getString("Horaf");
                      Date fechas=rs.getDate("Fechas");
		      
		      Tablassss t = new Tablassss(orga, recur, acti, descri, aprob, confi, fecha, horai, horaf, fechas);
		      O.add(t);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tablassss.class.getName()).log(Level.SEVERE, null, ex);
	       }
	       return O;
}        
}

