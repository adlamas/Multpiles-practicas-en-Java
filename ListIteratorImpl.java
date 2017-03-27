import java.util.NoSuchElementException;

public class ListIteratorImpl<T> implements  ListIteratorInterface<T> {
	ListNode<T> NodoCabeza; //Nodo NodoCabeza
	ListNode<T> NodoActual; //Nodo NodoActual
	
	public ListIteratorImpl(ListNode NodoCabeza){
		
		this.NodoActual=NodoCabeza; //Le pasa un nodo y ese es el NodoActual
	}

	public void first() {
		this.NodoActual=NodoCabeza;
		
	}
	
	public T getElement() {
		return NodoActual.getElement();
	}

	
	public boolean hasNext() {
		return (NodoActual.getNext()!=null); //Si NodoActual tiene un nodo siguiente, entonces es que tiene siguiente
	}
	
	
	public void next() {
		NodoActual=NodoActual.getNext(); //el NodoActual será el siguiente del NodoActual anterior
		
	}

	public void insert(T element) throws NoSuchElementException {
		ListNode temp = new ListNode(element);
		if(element == null){ throw new NoSuchElementException(); }
		else { NodoActual.setNext(temp); }
		
	}

	@Override
	public void delete(T element) throws NoSuchElementException {
		NodoActual = NodoActual.getNext();
		
	}
	
	
	
}