
public class ClientesIteradores {

	private String nombre;
	private String apellido;
	private long telefono;
	private long dni;
	
	public ClientesIteradores(String nombre,String apellido, long telefono, long dni ){
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.dni = dni;
		
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public long getTelefono(){
		return telefono;
	}
	public long getDni(){
		return dni;
	}
}
