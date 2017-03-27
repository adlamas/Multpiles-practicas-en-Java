/*La clase Empleado (fi gura 10.4) proporciona los m�todos ingresos y toString, adem�s de los m�todos obtener
y establecer que manipulan las variables de instancia de Empleado. Es evidente que un m�todo ingresos se aplica
en forma gen�rica a todos los empleados. Pero cada c�lculo de los ingresos depende de la clase de empleado. Por
lo tanto, declaramos a ingresos como abstract en la superclase Empleado, ya que una implementaci�n predeterminada
no tiene sentido para ese m�todo; no hay sufi ciente informaci�n para determinar qu� monto debe
devolver ingresos. Cada una de las subclases redefi ne a ingresos con una implementaci�n apropiada. 
Para calcular los ingresos de un empleado,
la aplicaci�n asigna una referencia al objeto de empleado a una variable de la superclase Empleado
 y despu�s invoca al m�todo ingresos en esa variable. */

/*Al declarar este m�todo abstract, indicamos que cada subclase concreta debe proporcionar una implementaci�n
apropiada para ingresos, y que un programa podr� utilizar las variables de la superclase Empleado
para invocar al m�todo ingresos en forma polim�rfi ca, para cualquier tipo de Empleado.
 */

/*Al incluir a ingresos como un m�todo abstracto en Empleado, se obliga a cada subclase directa
  de Empleado a sobrescribir el m�todo ingresos para poder convertirse en una clase concreta.
 */

//el m�todo abstract ingresos, que las subclases deben implementar.	

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
		 } // fin del m�todo establecerPrimerNombre
		
		 // devuelve el primer nombre
		 public String obtenerPrimerNombre()
	{
		 return primerNombre;
		 } // fin del m�todo obtenerPrimerNombre
		
		 // establece el apellido paterno
		 public void establecerApellidoPaterno( String apellido )
		 {
		 apellidoPaterno = apellido;
		 } // fin del m�todo establecerApellidoPaterno
		
		 // devuelve el apellido paterno
		 public String obtenerApellidoPaterno()
		 {
		 return apellidoPaterno;
		 } // fin del m�todo obtenerApellidoPaterno
		
		 // establece el n�mero de seguro social
		 public void establecerNumeroSeguroSocial( String nss )
		 {
		 numeroSeguroSocial = nss; // debe validar
		 } // fin del m�todo establecerNumeroSeguroSocial
		
		 // devuelve el n�mero de seguro social
		 public String obtenerNumeroSeguroSocial()
		 {
		 return numeroSeguroSocial;
		 } // fin del m�todo obtenerNumeroSeguroSocial
		 
		 public String toString(){
			 
		 return String.format("numero de seguro Social: ", obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
		 }
		 
		// Nota: Aqu� no implementamos el m�todo obtenerMontoPago de PorPagar, as� que
		 // esta clase debe declararse como abstract para evitar un error de compilaci�n. Sino se produce un error
		 
		// m�todo abstracto sobrescrito por las subclases
		// no tiene implementaci�n 
		 public abstract double ingresos();
			 
		 
}
