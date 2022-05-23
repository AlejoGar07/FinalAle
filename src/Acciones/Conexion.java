package Acciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
	
	String sql="SELECT Codigo FROM Organizaciones";
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
	
	String sql="SELECT Codigo FROM usuarios";
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
	public int id2(){
	int id=1001;
	Connection c = null;
	PreparedStatement p=null;
	ResultSet R=null;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	
	String sql="SELECT Codigo FROM recursos";
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
        public int id3(){
	int id=1001;
	Connection c = null;
	PreparedStatement p=null;
	ResultSet R=null;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	
	String sql="SELECT Codigo FROM solicitudes";
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
        public static void writeToDatabase1(int Id, String usertipo, String usernombre, String usercontra,String userorganizacion,  String usernombree,
		String usercorreo,int usertelefono, String userdireccion, String userestado){
	    
	    String url = "jdbc:postgresql://localhost:5432/administrador";
	    String user = "postgres";
	    String password = "Ale0107";
	    
	    
	    int Codigo=Id;
	    String Tipo=usertipo;
	    String Usu=usernombre;
	    String Contra=usercontra;
	    String Organizacion=userorganizacion;
            String Nombre=usernombree;
	    String Correo=usercorreo;
	    int Telefono=usertelefono;
	    String Direccion=userdireccion;
	    String Estado=userestado;
	    ResultSet R=null;
	    String query="INSERT INTO usuarios(Codigo, Tipo, Usuario, Contraseña, Organizacion, Nombre, Correo, Telefono, Direccion, Estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    try(Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query)){
		
		p.setInt(1, Codigo);
		p.setString(2,Tipo);
		p.setString(3, Usu);
		p.setString(4, Contra);
		p.setString(5, Organizacion);
                p.setString(6, Nombre);
		p.setString(7, Correo);
		p.setInt(8, Telefono);
		p.setString(9, Direccion);
		p.setString(10, Estado);
		p.executeUpdate();
		System.out.println("Agregado");
	    }catch(SQLException ex){
		System.out.println("No conecta");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }
	}
        public static void writeToUpdate1(String tipo, String usu, String contr, String orga, String nomb , String corre, int tel, String direc){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
                String Tipo=tipo;
                String Contra=contr;
		String Organ=orga;
                String Nombre=nomb;
		String Corr=corre;
		int Tel=tel;
                String Direc=direc;
                String Usua=usu;
		
		String query="UPDATE usuarios  SET Tipo=?, Contraseña=?, Organizacion=?, Nombre=?, Correo=?, Telefono=?, Direccion=? WHERE Usuario=? ";
		
		try{
                Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query);
		p.setString(1, Tipo);
		p.setString(2, Contra);
		p.setString(3, Organ);
                p.setString(4, Nombre);
		p.setString(5, Corr);
                p.setInt(6, Tel);
                p.setString(7, Direc);
                p.setString(8, Usua);
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
        
        public static void writeToDatabase2(int Id, String userorganizacion, String recurso, String aprobar, String userapro, String estadoa,  
		String entre, String userentre, String estadoe, int tiempo, String costo, String estado){
	    
	    String url = "jdbc:postgresql://localhost:5432/administrador";
	    String user = "postgres";
	    String password = "Ale0107";
	    
	    int Codigo=Id;
            String Organizacion=userorganizacion;
	    String Recurso=recurso;
            String Aprobar=aprobar;
	    String Usu=userapro;
            String Estadoa=estadoa;
	    String Entrega=entre;
	    String UsuEnt=userentre;
            String Estadoe=estadoe;
	    int Tiempo=tiempo;
	    String Costo=costo;
            String Estado=estado;
            
	    ResultSet R=null;
	    String query="INSERT INTO recursos(Codigo, Organizacion, Recurso, Aprobacion, Usuarioa, Estadoa, Entrega, Usuarioe, Estadoe, Tiempo, Costo, Estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    try(Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query)){
		
		p.setInt(1, Codigo);
                p.setString(2,Organizacion);
		p.setString(3,Recurso);
		p.setString(4, Aprobar);
		p.setString(5, Usu);
                p.setString(6, Estadoa);
		p.setString(7, Entrega);
		p.setString(8, UsuEnt);
                p.setString(9, Estadoe);
		p.setInt(10, Tiempo);
		p.setString(11, Costo);
                p.setString(12, Estado);
		p.executeUpdate();
		System.out.println("Agregado");
	    }catch(SQLException ex){
		System.out.println("No conecta");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }
	}
        public static void writeToUpdate2(String orga, String recur, String apro, String usua, String estadoa, String entre, String usue, String estadoe, int tiem, String costo){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
                String Organ=orga;
		String Aprob=apro;
                String UsuA=usua;
                String Estaa=estadoa;
		String Entre=entre;
                String UsuE=usue;
                String Estae=estadoe;
		int Tiemp=tiem;
                String Costo=costo;
                String Recurs=recur;
                 
		String query="UPDATE recursos  SET Organizacion=?, Aprobacion=?, Usuarioa=?, Estadoa=?, Entrega=?, Usuarioe=?, Estadoe=?, Tiempo=?, Costo=? WHERE Recurso=? ";
		
		try{
                Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query);
		p.setString(1, Organ);
		p.setString(2, Aprob);
                p.setString(3, UsuA);
                p.setString(4, Estaa);
		p.setString(5, Entre);
                p.setString(6, UsuE);
                p.setString(7, Estae);
                p.setInt(8, Tiemp);
                p.setString(9, Costo);
                p.setString(10, Recurs);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
        }
        public static void writeToActivo2(String Recurso, String Estado){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
		String recurso=Recurso;
		String estado=Estado;
		ResultSet s=null;
		String query="UPDATE recursos  SET Estado=? WHERE Recurso= ? ";
		
		try(Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query)){
		
		p.setString(1, estado);
		p.setString(2, recurso);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
	}
        public int existeRecur(String Recurso){
	Connection con=null;
	PreparedStatement P=null;
	ResultSet rs=null;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	String sql = "SELECT count(Codigo) FROM recursos WHERE Recurso = ?";
	
		try{
		con = DriverManager.getConnection(url, user, password);
		P = con.prepareStatement(sql);
		P.setString(1, Recurso);
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
        public static void writeToDatabase3(int Id, String organizacion, String recurso, String actividad, String descripcion, String aprobacion, String confirmacion, LocalDate fecha, int horai, int horaf){
	    
	    String url = "jdbc:postgresql://localhost:5432/administrador";
	    String user = "postgres";
	    String password = "Ale0107";
	    
	    int Codigo=Id;
	    String Organizacion=organizacion;
	    String Recurso=recurso;
            String Actividad=actividad;
            String Descripcion=descripcion;
            String Aprobacion=aprobacion;
            String Confirmacion=confirmacion;
            LocalDate Fecha=fecha;
	    int Horai=horai;
	    int Horaf=horaf;
	    String query="INSERT INTO solicitudes(Codigo, Organizacion, Recurso, Actividad, Descripcion, Aprobacion, Confirmacion, Fecha, Horai, Horaf, Fechas) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
	    try(Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query)){
		
		p.setInt(1, Codigo);
		p.setString(2, Organizacion);
		p.setString(3, Recurso);
		p.setString(4, Actividad);
		p.setString(5, Descripcion);
		p.setString(6, Aprobacion);
                p.setString(7, Confirmacion);
                p.setDate(8, (java.sql.Date.valueOf(Fecha)));
                p.setInt(9, Horai);
                p.setInt(10, Horaf);
                p.setObject(11, LocalDate.now());
		p.executeUpdate();
		System.out.println("Agregado");
	    }catch(SQLException ex){
		System.out.println("No conecta");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }
	}
        public static void writeToUpdate4(String acti, String confi){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
                String Acti=acti;
		String Confi=confi;
		String query="UPDATE solicitudes  SET Confirmacion=? WHERE Actividad=? ";
		
		try{
                Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query);
		p.setString(1, Confi);
                p.setString(2, Acti);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
        }
        public static void writeToUpdate5(String acti, String confi){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
                String Acti=acti;
		String Confi=confi;
		String query="UPDATE recursos  SET Estadoa=? WHERE Recurso=? ";
		
		try{
                Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query);
		p.setString(1, Confi);
                p.setString(2, Acti);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
        }
        public static void writeToUpdate6(String acti, String confi){
		String url = "jdbc:postgresql://localhost:5432/administrador";
		String user = "postgres";
		String password = "Ale0107";
                String Acti=acti;
		String Confi=confi;
		String query="UPDATE recursos  SET Estadoe=? WHERE Recurso=? ";
		
		try{
                Connection c = DriverManager.getConnection(url,user,password);
		PreparedStatement p = c.prepareStatement(query);
		p.setString(1, Confi);
                p.setString(2, Acti);
		p.executeUpdate();
		System.out.println("Modificado");
	    }catch(SQLException ex){
		System.out.println("No Modificado");
		Logger lo = Logger.getLogger(Conexion.class.getName());
		lo.log(Level.SEVERE, ex.getMessage(), ex);
	    }   
        }
         
}
