//Cuando implemento la interface PorPagar tengo que adicionar los métodos de esta última clase, sino tira error

public class Factura implements PorPagar {

	private String numeroPieza;
	private String descripcionPieza;
	private int cantidad;
	private double precioPorArticulo;
	
	public Factura(String pieza, String descripcion, int cuenta, double precio){
		
		numeroPieza = pieza;
		descripcionPieza = descripcion;
		establecerCantidad(cuenta);
		
	}
	
	public void establecerNumeroPieza( String pieza )
	 {
	 numeroPieza = pieza;
	 } // fin del método establecerNumeroPieza
	
	 // obtener número de pieza
	 public String obtenerNumeroPieza()
	 {
	 return numeroPieza;
	 } // fin del método obtenerNumeroPieza
	
	 // establece la descripción
	 public void establecerDescripcionPieza( String descripcion )
	 {
	 descripcionPieza = descripcion;
	 } // fin del método establecerDescripcionPieza
	
	 // obtiene la descripción
	 public String obtenerDescripcionPieza()
	 {
	 return descripcionPieza;
	 }
	
	public void establecerCantidad(int C){
		
		cantidad = (C < 0) ? 0 :C;
	}
	public int obtenerCantidad()
	 {
	 return cantidad;
	 }
	
	public void establecerPrecioPorArticulo( double precio )
	 {
		this.precioPorArticulo = (precio  < 0) ? 0.0: precio; //valida el precio
	 }
	
	 public double obtenerPrecioPorArticulo(){
		 return precioPorArticulo;
	 }
	// devuelve representación String de un objeto Factura
	 public String toString(){
		 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				 "factura", "numero de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(),
				 "cantidad", obtenerCantidad(), "precio por articulo", obtenerPrecioPorArticulo());
	 }
	 
	 public double obtenerMontoPago(){
		 //Método de la interfaz PorPagar
		 //Pareciera que se llama de forma polimórfica
		 return obtenerCantidad() * obtenerPrecioPorArticulo();
	 }
	
}
