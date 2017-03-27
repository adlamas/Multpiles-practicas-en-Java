package principal;
import javax.swing.JFrame;

//Lo dejé en el 215

import controlador.ControladorCargaMenus;

import vista.*;//Importamos el paquete vista

public class EjecutaModeloVistaControlador {

	
	public static void main(String[] args) {
		
		Marco_Aplicacion2 miMarco = new Marco_Aplicacion2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		ControladorCargaMenus Controlador = new ControladorCargaMenus(miMarco);
		

	}

}
