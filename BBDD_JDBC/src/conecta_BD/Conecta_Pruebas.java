package conecta_BD;
import java.sql.*;

public class Conecta_Pruebas {

	public static void main(String args[]){
		//1� paso: Crear la conexi�n
		try{
			//Para crear la conexi�n, necesitamos un objeto de tipo Connection
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java","root","");
			//La url es => ruta al driver de la base mysql : gestor de datos : localhost y 
			//puerto de mysql / nombre de Base de datos
			//Usuario y contrase�a (2 y 3 campo)
			
		//2� paso: Crear un objeto statement para ejecutar una consulta SQL
			Statement miStatement = miConexion.createStatement();
			//El objeto Statement sirve para procesar sentencias SQL est�ticas y obtener sus resultados
			
		//3� paso: Ejecutar SQL (Necesitaremos el objeto Statement)	
			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM PRODUCTOS_1");
			//Tenemos almacenado dentro del objeto resultset(un objeto tipo tabla) la consulta a la BDD
			
		//4� paso: Recorrer o leer la tabla virtual (el resultset)
			while(miResultset.next()){//El cursor, al principio, est� afuera de las columnas.
			System.out.println(miResultset.getDouble(3) + " " + miResultset.getString("descripcion") );
			}			
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
