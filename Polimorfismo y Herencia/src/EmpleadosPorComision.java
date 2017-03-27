//La sección 9.7 muestra un resumen de los métodos de la clase Object.

public class EmpleadosPorComision extends Object {

	private String primerNombre;
	private String apellidoPaterno;
	//Acá cambiamos la visisibilidad de numeroSeguroSocial para usarlo en la subClase EBMC2, antes era private
	protected String numeroSeguroSocial;
	private double ventasBrutas; // ventas semanales totales
	private double tarifaComision;
	private double salarioBase;
	
	public EmpleadosPorComision(String nombre, String apellido, String seguro, double ventasBrutas, double tarifaComision, double salario){
		
		// la llamada implícita al constructor del objeto, osea de la super clase, ocurre aquí
		this.primerNombre = nombre;
		this.apellidoPaterno = apellido;
		this.numeroSeguroSocial = seguro;
		establecerVentasBrutas(ventasBrutas);
		establecerTarifaComision( tarifaComision );
		
	}

	public void establecerTarifaComision(double tf) {
//Este método actúa automaticamente (cuando se usa el constructor) sin ser llamado limitando el valor de tarifaComision
//TF tiene que ser mayor a 0 y menor de 1, sino será 0 automaticamente		
		this.tarifaComision = ((tf > 0.0 && tf < 1.0) ? tf:0.0);
	}
	
	public double obtenerTC(){
		
		return this.tarifaComision;
	}

	public void establecerVentasBrutas(double ventasBrutas2) {
		
		//ventasbrutas debe ser mayor a 0 por que sino, se convertirá automaticamente en 0
//Este método actúa automaticamente (al llamar al constructor) sin ser llamado limitando el valor de ventasBrutas2
		this.ventasBrutas = (ventasBrutas2 < 0.0) ? 0.0 :ventasBrutas2;
	}
	
	public double obtenerVentasBrutas(){
		
		return this.ventasBrutas;
	}
	
	public void establecerSeguro(String seguro){
		
		this.numeroSeguroSocial = seguro;
	}
	public String obtenerSeguro(){
		
		return this.numeroSeguroSocial;
	}
	
	public void establecerNombre(String Nombre){
		
		this.primerNombre = Nombre;
	}
	public String obtenerNombre(){
		
		return this.primerNombre;
	}
	public void establecerApellido(String Apellido){
		
		this.apellidoPaterno = Apellido;
	}
	public String obtenerApellido(){
		
		return this.apellidoPaterno;		
	}

	
	
	public String toString(){
	/*El método toString es especial: es uno de los métodos que hereda cualquier clase de manera
	directa o indirecta de la clase Object
	 */
	 
	 return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f",
	 "empleado por comision", primerNombre, apellidoPaterno,
	 "numero de seguro social", numeroSeguroSocial,
	 "ventas brutas", ventasBrutas,
	 "tarifa de comision", tarifaComision );
	
	 }
	
	// establece el salario base
	public void establecerSalarioBase( double salario )
	 {
	 salarioBase = (( salario < 0.0) ? salario: 0.0);
	 } // fin del método establecerSalarioBase
	
	 // devuelve el salario base
	 public double obtenerSalarioBase()
	 {
	 return salarioBase;
	 }
	// calcula los ingresos
	 public double ingresos() {
		 
	  return salarioBase + ( tarifaComision * ventasBrutas );
	  } //fin del método ingresos// fin del método obtenerSalarioBase
}

/*El método toString devuelve un String que representa a un objeto. 
Un programa llama a este método de manera implícita cada vez que un objeto debe convertirse en una
representación de cadena, como cuando se imprime un objeto mediante printf o el método format de String,
usando el especificador de formato %s. El método toString de la clase Object devuelve un String que incluye
el nombre de la clase del objeto. En esencia, es un receptáculo que puede sobrescribirse por una subclase
para especificar una representación de cadena apropiada de los datos en un objeto de la subclase.
El método toString de la clase EmpleadoPorComision sobrescribe (redefine) al método toString de la clase Object. 
Al invocarse, el método toString de EmpleadoPorComision usa el método String llamado format para devolver un String
que contiene información acerca del EmpleadoPorComision. Para sobrescribir a un método de una superclase,
una subclase debe declarar un método con la misma firma (nombre del método, número de parámetros, tipos de
los parámetros y orden de los tipos de los parámetros) que el método de la superclase; el método toString
de Object no recibe parámetros, por lo que EmpleadoPorComision declara a toString sin parámetros.
 */ 
