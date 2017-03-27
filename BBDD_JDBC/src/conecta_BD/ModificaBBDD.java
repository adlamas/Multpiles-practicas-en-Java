package conecta_BD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {
	
	public static void main(String args[]){
		
		try{
			//Para crear la conexión, necesitamos un objeto de tipo Connection
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java","root","");
			//La url es => ruta al driver de la base mysql : gestor de datos : localhost y 
			//puerto de mysql / nombre de Base de datos
			//Usuario y contraseña (2 y 3 campo)
			
		//2º paso: Crear un objeto statement para ejecutar una consulta SQL
			Statement miStatement = miConexion.createStatement();
			//El objeto Statement sirve para procesar sentencias SQL estáticas y obtener sus resultados
			
			String instruccionSql = "INSERT INTO productos_1(codigo,descripcion,precio,seccion,fecha) " +
					"VALUES ('4º artículo', '4º descripcion', '50.6','4º sección', '2010-02-17')";
			
			miStatement.executeUpdate(instruccionSql);//Podemos 
			
			String actualizacion = "UPDATE productos_1 SET precio = 40.0 WHERE codigo='codigo1'";
			miStatement.executeUpdate(actualizacion);
			//String eliminar = "DELETE FROM productos_1 WHERE codigo='segundo codigo' "
			
			System.out.println("Se han insertado y actualizado datos");
			
		/*
		 * //3º paso: Ejecutar SQL (Necesitaremos el objeto Statement)	
			ResultSet miResultset = miStatement.executeQuery("SELECT * FROM PRODUCTOS_1");
			//Tenemos almacenado dentro del objeto resultset(un objeto tipo tabla) la consulta a la BDD
			
		//4º paso: Recorrer o leer la tabla virtual (el resultset)
			while(miResultset.next()){//El cursor, al principio, está afuera de las columnas.
			System.out.println(miResultset.getDouble(3) + " " + miResultset.getString("descripcion") );
			}	
			
		*/
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
