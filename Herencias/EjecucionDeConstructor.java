
public class EjecucionDeConstructor {
	
	double primerNumero;
	double segundoNumero;
	String primerPalabra;
	String segundaPalabra;
	
	public EjecucionDeConstructor(double primer, double segundo, String PP, String SP){
		
		this.primerNumero = primer;
		this.segundoNumero = segundo;
		this.primerPalabra = PP;
		this.segundaPalabra = SP;
		
		System.out.printf("Ejecución constructor superClase", this);
		
	}
	
}
