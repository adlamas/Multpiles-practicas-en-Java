/*La clase Empleado (fi gura 10.4) proporciona los métodos ingresos y toString, además de los métodos obtener
y establecer que manipulan las variables de instancia de Empleado. Es evidente que un método ingresos se aplica
en forma genérica a todos los empleados. Pero cada cálculo de los ingresos depende de la clase de empleado. Por
lo tanto, declaramos a ingresos como abstract en la superclase Empleado, ya que una implementación predeterminada
no tiene sentido para ese método; no hay sufi ciente información para determinar qué monto debe
devolver ingresos. Cada una de las subclases redefi ne a ingresos con una implementación apropiada. 
Para calcular los ingresos de un empleado,
la aplicación asigna una referencia al objeto de empleado a una variable de la superclase Empleado
 y después invoca al método ingresos en esa variable. */

/*Al declarar este método abstract, indicamos que cada subclase concreta debe proporcionar una implementación
apropiada para ingresos, y que un programa podrá utilizar las variables de la superclase Empleado
para invocar al método ingresos en forma polimórfi ca, para cualquier tipo de Empleado.
 */

/*Al incluir a ingresos como un método abstracto en Empleado, se obliga a cada subclase directa
  de Empleado a sobrescribir el método ingresos para poder convertirse en una clase concreta.
 */

//el método abstract ingresos, que las subclases deben implementar.	

public abstract class Empleado implements PorPagar {

	private String primerNombre;
	private String apellidoPaterno;
	private String numeroSeguroSocial;

	public Empleado(String nombre, String apellido, String nss){
		
		primerNombre = nombre;
		apellidoPaterno = apellido;
		numeroSeguroSocial = nss;
	}
	
	public void establecerPrimerNombre( String nombre )
		 {
		 primerNombre = nombre;
		 } // fin del método establecerPrimerNombre
		
		 // devuelve el primer nombre
		 public String obtenerPrimerNombre()
	{
		 return primerNombre;
		 } // fin del método obtenerPrimerNombre
		
		 // establece el apellido paterno
		 public void establecerApellidoPaterno( String apellido )
		 {
		 apellidoPaterno = apellido;
		 } // fin del método establecerApellidoPaterno
		
		 // devuelve el apellido paterno
		 public String obtenerApellidoPaterno()
		 {
		 return apellidoPaterno;
		 } // fin del método obtenerApellidoPaterno
		
		 // establece el número de seguro social
		 public void establecerNumeroSeguroSocial( String nss )
		 {
		 numeroSeguroSocial = nss; // debe validar
		 } // fin del método establecerNumeroSeguroSocial
		
		 // devuelve el número de seguro social
		 public String obtenerNumeroSeguroSocial()
		 {
		 return numeroSeguroSocial;
		 } // fin del método obtenerNumeroSeguroSocial
		 
		 public String toString(){
			 
		 return String.format("numero de seguro Social: ", obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
		 }
		 
		// Nota: Aquí no implementamos el método obtenerMontoPago de PorPagar, así que
		 // esta clase debe declararse como abstract para evitar un error de compilación. Sino se produce un error
		 
		// método abstracto sobrescrito por las subclases
		// no tiene implementación 
		 public abstract double ingresos();
			 
		 
}
