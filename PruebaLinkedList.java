
public class PruebaLinkedList {

	static LinkedListImpl lista = new LinkedListImpl();
	
	public static void main(String args[]){
		
		LinkedListImpl L = new LinkedListImpl();
		ListIteratorInterface LI = L.iterator();
		
		lista.insert(3);		
		lista.insert(10);		
		lista.insert(5);
		lista.insert(3);
		
		
		
		System.out.println(lista.buscar(2));
		System.out.println(lista.buscar(10));
		System.out.println(lista.size());
		lista.delete(3);
		System.out.println(lista.size());
		lista.delete(10);
		System.out.println(lista.size());
	}
	
}
