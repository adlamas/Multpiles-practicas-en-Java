
public class EmpleadoAsalariado extends Empleado {

	private double salarioSemanal;
	public EmpleadoAsalariado(String nombre, String apellido, String nss, double Salario) {
		super(nombre, apellido, nss);
		establecerSalarioSemanal(Salario);
	}
	
	public void establecerSalarioSemanal(double salario){
		
		salarioSemanal = salario < 0.0 ? 0.0: salario;
		}
		
	public double obtenerSalarioSemanal(){
			
			return salarioSemanal;
		}
	// calcula los ingresos; sobrescribe el m�todo abstracto ingresos en Empleado
	public double ingresos(){
			return obtenerSalarioSemanal();
		}
	
	public String toString(){
		//Ac� se sobreescribe el m�todo toString y con el "super.toString" se llama al m�todo de la superClase		
		return String.format( "empleado asalariado: %s\n%s: $%,.2f",
				 super.toString(), "salario semanal", obtenerSalarioSemanal() );}
	
	public double obtenerMontoPago(){
	// calcula los ingresos; implementa el m�todo de la interfaz PorPagar que era abstracto en la superclase Empleado
		return obtenerSalarioSemanal();
	}

}


/*Cuando una clase implementa a una interfaz, se aplica la misma relaci�n �es un� que proporciona la herencia.
Por ejemplo, la clase Empleado implementa a PorPagar, por lo que podemos decir que un objeto Empleado
es un objeto PorPagar. De hecho, los objetos de cualquier clase que extienda a Empleado son tambi�n objetos
PorPagar. Por ejemplo, los objetos EmpleadoAsalariado son objetos PorPagar. Al igual que con las relaciones
de herencia, un objeto de una clase que implemente a una interfaz puede considerarse como un objeto del
tipo de la interfaz. Los objetos de cualquier subclase de la clase que implementa a la interfaz tambi�n pueden
considerarse como objetos del tipo de la interfaz. Por ende, as� como podemos asignar la referencia de un objeto
EmpleadoAsalariado a una variable de la superclase Empleado, tambi�n podemos asignar la referencia de un
objeto EmpleadoAsalariado a una variable de la interfaz PorPagar. Factura implementa a PorPagar, por lo
que un objeto Factura tambi�n es un objeto PorPagar, y podemos asignar la referencia de un objeto Factura a
una variable PorPagar.*/
