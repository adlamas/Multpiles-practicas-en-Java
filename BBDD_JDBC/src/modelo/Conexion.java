package modelo;
import java.sql.*;
//Creo y devuelvo una conexi�n a la base de datos
//Lo dej� en el 215

public class Conexion {
	Connection miConexion = null;
	
	public Conexion(){
		
	}
	
	public Connection dameConexion(){
		
		try {
			//1. CREAR CONEXI�N CON LA BDD
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java","root","");
	
		}catch(Exception e){
			
		}
		
		return miConexion;//DEVUELVE LA CONEXI�N CREADA
	}

}
