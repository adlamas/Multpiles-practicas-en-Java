package conecta_BD;
import java.sql.*;

public class ConsultaPreparada {
//Supuestamente te devuelve los campos que tienen los parámetros indicados en los criterios
	
	public static void main(String[] args) {
		
		
		try {
			//1. CREAR CONEXIÓN
			Connection miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/curso_java","root","");
			//2. PREPARAR CONSULTA
			PreparedStatement miSentencia = miConexion.prepareStatement("SELECT codigo, descripcion FROM " +
					"productos_1"+ "WHERE descripcion=? AND codigo=?");
			
			//3. ESTABLECER PARÁMETROS DE CONSULTA
			miSentencia.setString(1, "cambiar campo");//criterio
			miSentencia.setString(2, "USA");//criterio
			
			//4. RECORRER Y EJECUTAR CONSULTA
			ResultSet rs = miSentencia.executeQuery();
			while(rs.next()){//mientras tenga un registro siguiente
				System.out.println(rs.getString(1) + " " + rs.getString(2));
			}
			
			rs.close();
			
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}

	}

}
