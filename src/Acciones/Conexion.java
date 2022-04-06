package Acciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Conexion {
	
	public int id(){
	int id=1001;
	Connection c = null;
	PreparedStatement p=null;
	ResultSet R=null;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	
	String sql="SELECT Codigo FROM organizaciones";
	try{
		c=DriverManager.getConnection(url,user,password);
		p = c.prepareStatement(sql);
		R=p.executeQuery();
		while(R.next()){
			id=R.getInt(1) + 1;
		}
	}catch(Exception e){
		System.out.println("Error"+e.getMessage());
	}return id;
	}
	
	public int id1(){
	int id=1001;
	Connection c = null;
	PreparedStatement p=null;
	ResultSet R=null;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	
	String sql="SELECT Codigo FROM Usuarios";
	try{
		c=DriverManager.getConnection(url,user,password);
		p = c.prepareStatement(sql);
		R=p.executeQuery();
		while(R.next()){
			id=R.getInt(1) + 1;
		}
	}catch(Exception e){
		System.out.println("Error"+e.getMessage());
	}return id;
	}
	
	public static void writeToDatabase(int Id, String userorganizacion, String userdireccion, int usertelefono, String usercorreo,
		String userestado){
	    
	    String url = "jdbc:postgresql://localhost:5432/administrador";
	    String user = "postgres";
	    String password = "Ale0107";
	    
	    
	    int Codigo=Id;
	    String Organizacion=userorganizacion;
	    String Direccion=userdireccion;
	    int Telefono=usertelefono;
	    String Correo=usercorreo;
	    String Estado=userestado;
	    String query="INSERT INTO organizaciones(Codigo, Organizacion, Direccion, Telefono, Correo, Estado) VALUES(?, ?, ?, ?, ?, ?)";
	    try(Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query)){
		
		p.setInt(1, Codigo);
		p.setString(2, Organizacion);
		p.setString(3, Direccion);
		p.setInt(4, Telefono);
		p.setString(5, Correo);
		p.setString(6, Estado);
		p.executeUpdate();
		System.out.println("Agregado");
	    }catch(SQLException ex){
		System.out.println("No conecta");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }
	    
	    
    }
	
	public static void writeToUpdate(String orga, String direc, int tel, String corre){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
		String Organ=orga;
		String Direc=direc;
		int Tel=tel;
		String Corr=corre;
		ResultSet s=null;
		String query="UPDATE organizaciones  SET Direccion=?, Telefono=?, Correo=? WHERE Organizacion=? ";
		
		try{
                Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query);
		
		p.setString(1, Direc);
		p.setInt(2, Tel);
		p.setString(3, Corr);
		p.setString(4, Organ);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
    }
        
	public int existeOrga(String Organizacion){
	Connection con=null;
	PreparedStatement P=null;
	ResultSet rs=null;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	String sql = "SELECT count(Codigo) FROM organizaciones WHERE Organizacion = ?";
	
		try{
		con = DriverManager.getConnection(url, user, password);
		P = con.prepareStatement(sql);
		P.setString(1, Organizacion);
		rs = P.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
			return 1001;
		}catch(SQLException ex){
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			return 1001;
	}	
	}
        
        public String activo(String Estado){
	Connection con=null;
	PreparedStatement P=null;
	ResultSet rs=null;
	String Orga;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	String sql = "UPDATE organizaciones SET Estado=? WHERE Organizacion = ?";
	
		try{
		con = DriverManager.getConnection(url, user, password);
		P = con.prepareStatement(sql);
		P.setString(1, Estado);
		P.executeUpdate();
		rs = P.executeQuery();
			if(rs.next()){
				return rs.getString(1);
			}
			return Estado;
		}catch(SQLException ex){
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			return Estado;
            }	
        }
	public static void writeToActivo(String Orga, String Estado){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
		String Organ=Orga;
		String estado=Estado;
		ResultSet s=null;
		String query="UPDATE organizaciones  SET Estado=? WHERE Organizacion= ? ";
		
		try(Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query)){
		
		p.setString(1, estado);
		p.setString(2, Organ);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
	}
        
        public static void writeToDatabase1(int Id, String usertipo, String usernombre, String usercontra,String userorganizacion, 
		String usercorreo, int usertelefono, String userdireccion, String userestado){
	    
	    String url = "jdbc:postgresql://localhost:5432/administrador";
	    String user = "postgres";
	    String password = "Ale0107";
	    
	    
	    int Codigo=Id;
	    String Tipo=usertipo;
	    String Usu=usernombre;
	    String Contra=usercontra;
	    String Organizacion=userorganizacion;
	    String Correo=usercorreo;
	    int Telefono=usertelefono;
	    String Direccion=userdireccion;
	    String Estado=userestado;
	    ResultSet R=null;
	    String query="INSERT INTO usuarios(Codigo, Tipo, Usuario, Contraseña, Organizacion, Correo, Telefono, Direccion, Estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    try(Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query)){
		
		p.setInt(1, Codigo);
		p.setString(2,Tipo);
		p.setString(3, Usu);
		p.setString(4, Contra);
		p.setString(5, Organizacion);
		p.setString(6, Correo);
		p.setInt(7, Telefono);
		p.setString(8, Direccion);
		p.setString(9, Estado);
		p.executeUpdate();
		System.out.println("Agregado");
	    }catch(SQLException ex){
		System.out.println("No conecta");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }
	}
	public static void writeToUpdate1(String tipo, String usu, String contr, String orga, String corre, int tel, String direc){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
                String Tipo=tipo;
                String Contra=contr;
		String Organ=orga;
		String Corr=corre;
		int Tel=tel;
                String Direc=direc;
                String Usua=usu;
		
		String query="UPDATE usuarios  SET Tipo=?, Contraseña=?, Organizacion=?, Correo=?, Telefono=?, Direccion=? WHERE Usuario=? ";
		
		try{
                Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query);
		p.setString(1, Tipo);
		p.setString(2, Contra);
		p.setString(3, Organ);
		p.setString(4, Corr);
                p.setInt(5, Tel);
                p.setString(6, Direc);
                p.setString(7, Usua);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
        }
        public int existeUsu(String Usuario){
            Connection con=null;
	PreparedStatement P=null;
	ResultSet rs=null;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	String sql = "SELECT count(Codigo) FROM usuarios WHERE Usuario = ?";
	
		try{
		con = DriverManager.getConnection(url, user, password);
		P = con.prepareStatement(sql);
		P.setString(1, Usuario);
		rs = P.executeQuery();
			if(rs.next()){
				return rs.getInt(1);
			}
			return 1001;
		}catch(SQLException ex){
			Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
			return 1001;
	}	
        }
        
        
	public static void writeToActivo1(String Usuario, String Estado){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
		String usuario=Usuario;
		String estado=Estado;
		ResultSet s=null;
		String query="UPDATE usuarios  SET Estado=? WHERE Usuario= ? ";
		
		try(Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query)){
		
		p.setString(1, estado);
		p.setString(2, usuario);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
	}
	public boolean Email (String Correo){
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(Correo);
        return mather.find();
        }
}
