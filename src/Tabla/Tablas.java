package Tabla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class Tablas {
	private String Organizacion;
	private String Direccion;
	private String Telefono;
	private String Correo;
	private String Estado;
        private String Fecha;

	public Tablas(){
	}
	public Tablas(String organizacion, String direccion, String telefono, String correo, String estado, String fecha){
		this.Organizacion = organizacion;
		this.Direccion = direccion;
		this.Telefono = telefono;
		this.Correo = correo;
		this.Estado = estado;
                this.Fecha=fecha;
	}

	public String getOrganizacion() {
		return Organizacion;
	}

	public void setOrganizacion(String organizacion) {
		this.Organizacion = organizacion;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		this.Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		this.Telefono = telefono;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		this.Correo = correo;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		this.Estado = estado;
	}

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

	public ObservableList<Tablas> getTabla(){
	       ObservableList<Tablas> O = FXCollections.observableArrayList();
	       try{
	       String s = ("select Organizacion, Direccion, Telefono, Correo, Estado, Fecha"
		       + " from organizaciones order by Codigo");
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
		      String direc=rs.getString("Direccion");
		      String tel=rs.getString("Telefono");
		      String corr=rs.getString("Correo");
		      String esta=rs.getString("Estado");
                      String fechaa=rs.getString("Fecha");
		      
		      Tablas t = new Tablas(orga, direc, tel, corr, esta, fechaa);
		      O.add(t);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       
		}
	       return O;
}
}





