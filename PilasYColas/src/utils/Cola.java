package utils;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;


public class Cola<T> implements ColaInteface {
	private ArrayList datos;
	
	/**
	 * Cola generica FIFO
	 * Si hay espacio en memoria siempre permite
	 * agregar elementos
	 */
	public Cola(){
		datos=new ArrayList<T>();
	}
	
	/**
	 * Cola con tama�o espec�fico
	 * Si tamanio es negativo levanta una excepcion
	 * Si se desea controlar el tama�o de la Cola, lo debe
	 * hacer el que usa la clase Cola
	 */
	public Cola(int tamanio) throws ColaException{
		try{
			datos=new ArrayList(tamanio);
		} catch (IllegalArgumentException e) {
			throw new ColaException("Tama�o Invalido: No se puede crear la cola");
		}
	}
	
	/**
	 * Devuelve verdadero si la cola est� vac�a
	 */
	public boolean colaVacia(){
		return datos.isEmpty();
	}
	
	/**
	 * Encola un objeto
	 * Si el objeto a encolar es nulo, levanta una excepcion
	 */
	public void encolar(Object e) throws ColaException{
		if (e == null){
			throw new ColaException("Dato inv�lido: No se puede encolar un dato nulo");
		}
		datos.add(e);
	}
	
	/**
	 * Desencola un objeto
	 * Si la cola esta vac�a, levanta una excepcion
	 */
	public T desencolar() throws ColaException{
		
		if (this.colaVacia()){
			throw new ColaException("Desencolar: La cola esta vacia");
		}
		return((T)datos.remove(0));
		
	}

}
