//Esta clase es la que usa la clase abstract Empleado como superClase

public class EmpleadoPorComision extends Empleado {

	private double ventasBrutas;
	private double tarifaComision;
	
	//Constructor de esta clase
	public EmpleadoPorComision(String nombre, String apellido, String nss, double ventas, double tarifa){
		//super llama al constructor de la superClase, en este caso, Empleado
		super(nombre, apellido, nss);
		establecerVentasBrutas(ventas);
		establecerTarifaComision(tarifa);
	}
	
	
	 public void establecerTarifaComision( double tarifa )
	 {
	 tarifaComision = ( tarifa > 0.0 && tarifa < 1.0 ) ? tarifa : 0.0;
	 }
	 
	 
	 public void establecerVentasBrutas( double ventas )
	  {
	  ventasBrutas = ( ventas < 0.0 ) ? 0.0 : ventas;
	  }
	 
	 
	 public double obtenerTarifaComision()
	 {
	  return tarifaComision;
	 }
	 
	 public double obtenerVentasBrutas()
	  {
	  return ventasBrutas;
	  }
	 public double ingresos(){
		 
		 return obtenerVentasBrutas() * obtenerTarifaComision();
	 }
	 public String toString()
	  {
	  return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
	  "empleado por comision", super.toString(),
	  "ventas brutas", obtenerVentasBrutas(),
	  "tarifa de comision", obtenerTarifaComision() );
	  }


	
	public double obtenerMontoPago() {
		// TODO Auto-generated method stub
		return 0;
	}
}
