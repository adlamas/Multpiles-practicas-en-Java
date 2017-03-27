import javax.swing.JOptionPane;


public class pruebaEmpleadosPorComision {

	public static void main(String args[]){
	
	EmpleadosPorComision epc = new EmpleadosPorComision("Roberto", "Johnson", "222-22-2222", 10000, 0.06, 0);
	System.out.println("Informacion del empleado obtenida por los metodos establecer: \n" );
	System.out.printf("%s %s\n", "Su nombre es: ",epc.obtenerNombre());
	System.out.printf("%s %s\n", "Su apellido es:", epc.obtenerApellido());
	System.out.printf("%s %s\n", "Su seguro social es: ", epc.obtenerSeguro());
	System.out.printf("%s %s\n", "Las ventas brutas son: ", epc.obtenerVentasBrutas());
	System.out.printf("%s %s\n", "Su comisión es del: ", epc.obtenerTC());
	
	epc.establecerVentasBrutas( 500 ); // establece las ventas brutas
	epc.establecerTarifaComision( 0.1 ); //
	
	System.out.println();
	System.out.printf("%s %s\n", "Las ventas brutas son: ", epc.obtenerVentasBrutas());
	System.out.printf("%s %s\n", "Su comisión es del: ", epc.obtenerTC());
	
JOptionPane.showMessageDialog(null, epc.obtenerNombre() + " " + epc.obtenerApellido(), "Su nombre completo es", 1);
	
	}
}
