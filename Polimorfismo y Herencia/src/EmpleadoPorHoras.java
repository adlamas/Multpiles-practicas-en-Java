
public class EmpleadoPorHoras extends Empleado {

	private double sueldo; // sueldo por hora
	private double horas; // horas trabajadas por semana
	
	public EmpleadoPorHoras(String nombre, String apellido, String nss, double sueldo, double horas){
		super(nombre, apellido, nss);
		establecerSueldo(sueldo);
	}
	
	public void establecerSueldo(double sueldoPorHoras){
		
		sueldo = ( sueldoPorHoras < 0.0 ) ? 0.0 : sueldoPorHoras;
	}
	public void establecerHoras(double horasTrabajadas){
		horas = ( ( horasTrabajadas >= 0.0 ) && ( horasTrabajadas <= 168.0 ) ) ? horasTrabajadas : 0.0;
	}
	
	public double obtenerSueldo(){
		return sueldo;
	}
	
	public double obtenerHoras(){
		return horas;
	}
	
	public double ingresos(){
		//Modifica el método abstract ingresos de la superClase, lo implementa a su manera
		if( obtenerHoras() <= 40 ) // no hay tiempo extra
			 return obtenerSueldo() * obtenerHoras();
		else return 40 * obtenerSueldo() + ( obtenerHoras() - 40 ) * obtenerSueldo() * 1.5;
	}
	
	public String toString(){
	//SobreEscribe el método toString agregándole cosas pertinentes de esta clase en particular
	//devuelve el tipo del empleado, a saber, "empleado por horas: ",e información específica para ese Empleado		
		return String.format("empleado por horas: %s\n%s: $%,.2f; %s: %,.2f", super.toString(),
				"sueldo por hora", obtenerSueldo(),
				 "horas trabajadas", obtenerHoras());
	}
	
	public String miString(){
		return super.toString();
	}
	
	public double obtenerMontoPago(){
		return 0;
	}
	
}
