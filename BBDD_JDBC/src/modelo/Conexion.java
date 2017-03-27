package modelo;
import java.sql.*;
//Creo y devuelvo una conexión a la base de datos
//Lo dejé en el 215

public class Conexion {
	Connection miConexion = null;
	
	public Conexion(){
		
	}
	
	public Connection dameConexion(){
		
		try {
			//1. CREAR CONEXIÓN CON LA BDD
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java","root","");
	
		}catch(Exception e){
			
		}
		
		return miConexion;//DEVUELVE LA CONEXIÓN CREADA
	}

}
