package modelo;
//Clase que crea objetos con atributos String
//Lo dejé en el 215


public class Productos {
	
	public Productos(){
		
		codigo = "";
		nArticulo = "";
		seccion = "";
		pais = "";
		precio = "";
	}

	private String codigo;
	private String nArticulo;
	private String seccion;
	private String pais;
	private String precio;
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getnArticulo() {
		return nArticulo;
	}
	
	public void setnArticulo(String nArticulo) {
		this.nArticulo = nArticulo;
	}
	
	public String getSeccion() {
		return seccion;
	}
	
	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}

	
}
