import java.util.NoSuchElementException;


public interface ListInterface<T> {
	
	public boolean isEmpty();
	
	/**
	 * Inserta al final
	 * @param element
	 */
	public void insert(T element);
	
	
	/**
	 * Elimina x
	 * @param element
	 * @throws NoSuchElementException
	 */
	public void delete(T element) throws NoSuchElementException;
	
	/**
	 * devuelve un iterador, para la lista ubicado al principio por default
	 * @return
	 */
	public ListIteratorInterface iterator();
	
	/**
	 * 
	 * @param element
	 * @return
	 */
	public boolean buscar(T element);
	
	/**
	 * vacia la lista
	 */
	public void removeAll();
	

}
