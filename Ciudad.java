
public class Ciudad {

	public String nombre;
	public String pais;
	public double poblacion;
	
	public Ciudad(String n, String p, double d){
		nombre = n;
		pais = p;
		poblacion = d;
	}
	
	public String getNombreYPais(){
		
		return nombre + " de: " + pais;
	}
	
	public double getPoblacion(){
		
		return poblacion;
	}
	
	public int compareTo(Ciudad C){
		return (int) this.getPoblacion() - (int) C.getPoblacion();
	}
	
}
