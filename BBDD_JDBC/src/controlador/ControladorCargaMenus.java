package controlador;
import java.awt.event.*;
import modelo.*;//Importamos todo el paquete modelo
import vista.*;

//Lo dejé en el 215

public class ControladorCargaMenus extends WindowAdapter {
	
	public ControladorCargaMenus(Marco_Aplicacion2 elMarco){
		
		this.elMarco = elMarco;
		this.elMarco.addWindowListener(this);
	}

	public void windowOpened(WindowEvent e){//El triángulo verde significa que sobreescribimos un método
		
		obj.ejecutaConsultas();
		try{
			
			while(obj.rs.next()){//Recorremos el ResultSet (ya lleno) de la clase CargaSecciones
				//System.out.println(obj.rs.getString(1));
				elMarco.secciones.addItem(obj.rs.getString(1));//Esto TENRÍA que ser con un setter
				
			}
			
			while(obj.rs2.next()){
				//System.out.println(obj.rs2.getString(1));
				elMarco.paises.addItem(obj.rs2.getString(1));
			}
			
			obj.rs.close();
			obj.rs2.close();
			System.out.println("Cerramos los rs's");
			
		}catch(Exception e2){
			
		}
	}
	
	CargaMenus obj = new CargaMenus();//este objeto ejecuta las consultas
	private Marco_Aplicacion2 elMarco;

}
