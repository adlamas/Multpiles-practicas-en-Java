package modelo;
import java.sql.*;

//Lo dejé en el 215

public class CargaMenus {
	
	public CargaMenus(){
		miConexion = new Conexion();
	}
	
	/*public String ejecutaConsultas(){
		
		Productos miProducto = null;
		Connection accesoBBDD = miConexion.dameConexion();//Conecta con la base de datos
		
		try{
			Statement secciones = accesoBBDD.createStatement();
			rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM productos");//Guardo lo que me da la consulta
			
						
			//while(rs.next()){//Se saltea el primero(Ferretería) pero abajo lo arreglo
				
				//rs.previous(); //Volvemos el cursor una posición hacia atrás
				miProducto = new Productos();				
				miProducto.setSeccion(rs.getString(1));
				//return miProducto.getSeccion(); //Qué raro				
			//}			
			rs.close();//SIEMPRE hay que cerrar el resultset
			
		}catch(Exception e){			
		}		
		return miProducto.getSeccion();
	}*/
	
	public ResultSet ejecutaConsultas(){
		Connection accesoBBDD = miConexion.dameConexion();
		try{
			
			Statement secciones = accesoBBDD.createStatement();
			//Los statement(declaraciones)sirven para ejecutar consultas
			Statement paises = accesoBBDD.createStatement();
			
			 rs = secciones.executeQuery("SELECT DISTINCTROW SECCION FROM productos ");
			 rs2 = paises.executeQuery("SELECT DISTINCTROW PAIS FROM productos ");
			
			 
			 
		}catch(Exception e){
			
		}		
		return null;
	}
	
	Conexion miConexion;
	public ResultSet rs;
	public ResultSet rs2;

}
