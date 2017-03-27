//Esta clase usa la clase EmpleadoPorComision y Empleado para ejemplificar el polimorfismo

public class EmpleadoBaseMasComision2 extends EmpleadoPorComision {

	private double salarioBase;
	
	public EmpleadoBaseMasComision2(String nombre, String apellido, String nss, double ventas, double tarifa, double salario){
		//En el m�todo super hace una llamada al constructor de su superClase directa, osea EmpleadoPorComision.
		super(nombre, apellido, nss, ventas, tarifa);
	}
	public void establecerSalarioBase( double salario )
	{
	salarioBase = ( salario < 0.0 ) ? 0.0 : salario; // positivo
	}
	
	 public double obtenerSalarioBase()
	 {
	 return salarioBase;
	 } 
	 
	 
	 //Se sobreEscribe el m�todo ingresos de la superClase principal, Empleado.
	 public double ingresos(){
		 //Se devuelve una suma de salarioBase m�s lo que devuelve "ingresos" de la superClase EmpleadoPorComisi�n
		 //Ac� se reutiliza c�digo
		 return salarioBase + super.ingresos();
	 }
}
