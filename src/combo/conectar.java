package Acciones;

import java.sql.Connection;
import java.sql.DriverManager;

public class conectar {
	Connection con=null;
	String url = "jdbc:postgresql://localhost:5432/administrador";
	String user = "postgres";
	String password = "Ale0107";
	public  Connection conect(){
	try{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection(url,user,password);
	
	}catch(Exception e){
	System.out.println("No conecta");	
	}	
	return con;
}
}
