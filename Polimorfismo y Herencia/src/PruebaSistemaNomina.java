
public class PruebaSistemaNomina {
	
	public static void main(String args[]){
	// crea objetos de las subclases
	 EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado( "John", "Smith", "111-11-1111", 800.00 );
	 EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras( "Karen", "Price", "222-22-2222", 16.75, 40 );
	 EmpleadoPorComision empleadoPorComision = new EmpleadoPorComision( "Sue", "Jones", "333-33-3333", 10000, .06 );
	 EmpleadoBaseMasComision2 EBMC2 = new EmpleadoBaseMasComision2( "Bob", "Lewis", "444-44-4444", 5000, .04, 300 );
	 
	 System.out.println( "Empleados procesados por separado:\n" );
	 
	 System.out.printf("%s\n%s: $%,.2f\n\n",  empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
	 System.out.printf( "%s\n%s: $%,.2f\n\n", empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos() );
	 System.out.printf( "%s\n%s: $%,.2f\n\n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos() );
	 System.out.printf( "%s\n%s: $%,.2f\n\n", EBMC2,"ingresos", EBMC2.ingresos() );
	 
	 Empleado Empleados[] = new Empleado[4];
	 
	 // inicializa el arreglo con objetos Empleado
	 Empleados[0] = empleadoAsalariado;
	 Empleados[1] = empleadoPorHoras;
	 Empleados[2] = empleadoPorComision;
	 Empleados[3] = EBMC2;	
	 
	 //Itera en el arreglo Empleados, no importa que tipo sea, la variable EmpleadoActual va a iterar por todo el arreglo Empleados
	 for(Empleado empleadoActual: Empleados){
		// determina si el elemento es un EmpleadoBaseMasComision
		// si empleadoActual es EmpleadoBaseMasComision2 tal cosa... 
		if(empleadoActual instanceof EmpleadoBaseMasComision2) {
			
			
			// conversión descendente de la referencia de Empleado
			// a una referencia de EmpleadoBaseMasComision
    EmpleadoBaseMasComision2 empleado = ( EmpleadoBaseMasComision2 ) empleadoActual;//esta línea no la entiendo, REVISAR
			 
			 
			 //empleado es un EmpleadoBaseMasComision2 ya que puede usar el método obtenerSalarioBase
			 double salarioAnterior = empleado.obtenerSalarioBase();
			 empleado.establecerSalarioBase(1.10 * salarioAnterior);
			 System.out.printf("el nuevo salario base con 10%% de aumento es : $%,.2f\n", empleado.obtenerSalarioBase());
			
		}
		System.out.printf("ingresos $%,.2f\n\n", empleadoActual.ingresos() );
		
	 }
	 
	// obtiene el nombre del tipo de cada objeto en el arreglo de empleados
	  for ( int j = 0; j < Empleados.length; j++ )
	  System.out.printf( "El empleado %d es un %s\n", j,
	  Empleados[ j ].getClass().getName() );
/*El pedazo de código de acá arriba imprime en pantalla el tipo de cada empleado, como un objeto String.
 * Todos los objetos en Java conocen su propia clase y pueden acceder a esta información a través del método getClass,
 *  que todas las clases heredan de la clase Object. El método getClass devuelve un objeto de tipo Class 
 *  (del paquete java.lang), el cual contiene información acerca del tipo del objeto, incluyendo el nombre de su clase*/
	 
	 
	 
	}
}
