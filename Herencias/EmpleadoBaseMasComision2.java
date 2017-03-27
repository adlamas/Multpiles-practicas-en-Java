
public class EmpleadoBaseMasComision2 extends EmpleadosPorComision {

	private double salarioBase;
	private double numeroDePrueba;
	
	//Constructor de la subClase con los parámetros de la superClase IDENTICOS
	//En el constructor de la subClase van los nombres y los tipos de los parámetros
	public EmpleadoBaseMasComision2(String nombre, String apellido,
			String seguro, double ventasBrutas, double tarifaComision,
			double salario) {
//invoca al constructor de EmpleadoPorComision con cinco argumentos (los que tiene el constructor de la SuperClase)
		super(nombre, apellido, seguro, ventasBrutas, tarifaComision, salario);
		
		//Este método de la súper clase hace que si salario es menos que cero, este sea cero
		establecerSalarioBase(salario);
	}


	public String toString(){
		//Imprimo los atributos de la SuperClase
		//Todos los atributos deben ser protected o public para que se pueda llamarlos desde la SubClase
		//El obtenerNombre y obtenerApellido son métodos ya que los atributos son private, excepto numeroSeguroSocial.
		//Este último es protected y se puede llamar directamente
		return String.format("%s: %s %s ",obtenerNombre(), obtenerApellido(),numeroSeguroSocial );
	}
	
	public void asignarNumeroDePrueba(double ndp){
		this.numeroDePrueba = ((ndp > 0) ? ndp: 0  );
	}
	public double devolverNumeroDePrueba(){
		return this.numeroDePrueba;
	}
	

}
