package Tabla;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Tablass {
        private String Tipo;
        private String Usuario;
        private String Contraseña;
        private String Organizacion;
        private String Nombre;
	private String Correo;
	private String Telefono;
	private String Direccion;
        private String Estado;

        public Tablass() {
         }
        public Tablass(String tipo, String usuario, String contraseña, String organizacion, String nombre, String correo, String telefono, String direccion, String estado){
                this.Tipo = tipo;
                this.Usuario = usuario;
                this.Contraseña = contraseña;
		this.Organizacion = organizacion;
                this.Nombre= nombre;
		this.Correo = correo;
		this.Telefono = telefono;
		this.Direccion = direccion;
                this.Estado = estado;
	}

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getOrganizacion() {
        return Organizacion;
    }

    public void setOrganizacion(String Organizacion) {
        this.Organizacion = Organizacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    public ObservableList<Tablass> getTablas(){
	       ObservableList<Tablass> O = FXCollections.observableArrayList();
	       try{
	       String s = ("select Tipo, Usuario, Contraseña, Organizacion, Nombre, Correo, Telefono, Direccion, Estado"
		       + " from usuarios order by Codigo");
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
                      String tip=rs.getString("Tipo");
                      String usu=rs.getString("Usuario");
		      String contr=rs.getString("Contraseña");
                      String orga=rs.getString("Organizacion");
                      String nom=rs.getString("Nombre");
                      String corr=rs.getString("Correo");
		      String tel=rs.getString("Telefono");
		      String direc=rs.getString("Direccion");
                      String esta=rs.getString("Estado");
		      
		      
		      Tablass t = new Tablass(tip, usu, contr, orga, nom, corr, tel, direc, esta);
		      O.add(t);
	       }
	       
	       }catch(SQLException ex){
		       Logger.getLogger(Tablas.class.getName()).log(Level.SEVERE, null, ex);
	       
		}
	       return O;
}

}
