
public class PruebaInterfazPorPagar {

	
	
	public static void main(String args[]){
		// crea arreglo PorPagar con cuatro elementos
		PorPagar objetosPorPagar [] = new PorPagar[4];
		
		//Llena el arreglo, prestar atención a la forma de llenarlo
		//Relación: Factura "Es un" PorPagar, ya que este implementa esta interfaz
		//EmpleadoAsalariado también "es un" PorPagar ya que extiende empleado, que a su vez, implementa esa interfaz
		//No puedo crear un objeto empleado por que esa superclase es de tipo abstract
		objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
		objetosPorPagar[ 1 ] = new Factura( "56789", "llanta", 4, 79.95 );
		objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
		objetosPorPagar[3] = new EmpleadoAsalariado("Lisa", "Barnes", "888-88-8888", 1200.00);
	
		System.out.println( "Facturas y Empleados procesados en forma polimorfica:\n" );
		
		//La variable que querés que cuente tiene que ser del mismo tipo que el arreglo, sino tira error...GATO
		for(PorPagar porPagarActual: objetosPorPagar){
			// imprime porPagarActual y su monto de pago apropiado
			//El método toString que use es depende del tipo del objeto actual (Factura o EmpleadoAsalariado)
			//Cuando iniciás la aplicación los objetos Factura devuelven un toString distinto de los EmpleadoAsalariado
	System.out.printf( "%s \n%s: $%,.2f\n\n", porPagarActual.toString(),"pago vencido", porPagarActual.obtenerMontoPago() );
			
		}
	}
	
}
