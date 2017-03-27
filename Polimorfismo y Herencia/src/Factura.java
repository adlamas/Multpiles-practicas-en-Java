//Cuando implemento la interface PorPagar tengo que adicionar los m�todos de esta �ltima clase, sino tira error

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
	 } // fin del m�todo establecerNumeroPieza
	
	 // obtener n�mero de pieza
	 public String obtenerNumeroPieza()
	 {
	 return numeroPieza;
	 } // fin del m�todo obtenerNumeroPieza
	
	 // establece la descripci�n
	 public void establecerDescripcionPieza( String descripcion )
	 {
	 descripcionPieza = descripcion;
	 } // fin del m�todo establecerDescripcionPieza
	
	 // obtiene la descripci�n
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
	// devuelve representaci�n String de un objeto Factura
	 public String toString(){
		 return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				 "factura", "numero de pieza", obtenerNumeroPieza(), obtenerDescripcionPieza(),
				 "cantidad", obtenerCantidad(), "precio por articulo", obtenerPrecioPorArticulo());
	 }
	 
	 public double obtenerMontoPago(){
		 //M�todo de la interfaz PorPagar
		 //Pareciera que se llama de forma polim�rfica
		 return obtenerCantidad() * obtenerPrecioPorArticulo();
	 }
	
}
