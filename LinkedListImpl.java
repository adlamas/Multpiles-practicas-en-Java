public class LinkedListImpl<T> implements ListInterface<T>
 {
	private ListNode<T> cabeza;
	private ListNode<T> cola;
	 
	 

	public LinkedListImpl(){
		cabeza=cola=null;
	}
	
	public ListNode getCabeza(){
		return cabeza;
	}
	
	public int size(){
		int i = 0;
		ListNode temp = cabeza;
		while(temp != null){
			temp = temp.getNext();
			i++; //i empieza en cero pero cambia durante el método y se devuelve el último i que quedó.
		}
		return i;
	}
	 
	
	public boolean buscar(T element) { //lo hice yo
		ListNode temporal = cabeza;
		while(temporal != null){
			if(element.equals(temporal.getElement())){
				return true;
			}else temporal = temporal.getNext();
		}
		
		return false;
	}

	
	public void delete(T element) { //Ya funciona bien
		
				
		if(this.cabeza.getElement().equals(element)){
			cabeza = cabeza.getNext();
		} else {
		ListNode actual = cabeza;
		
		while(actual.getNext() != null){ //Si el actual tiene algo
			if(actual.getNext().getElement().equals(element)){ //Si el elemento del actual coincide con mi elemento
				//REVISAR ESTO DE ARRIBA ---> actual.getElement()
				actual.setNext(actual.getNext().getNext()); 
				
			}
			actual = actual.getNext(); //el actual pasa a ser el siguiente del actual anterior
			}
		}
		
	}
	
	public void eliminar(int index){ //elimina el objeto que se encuentra en la posición index
		
		int contador = 0;
		ListNode LN = cabeza;
		while(contador < index - 1){
			LN = LN.getNext();
			contador++;
		}
		LN.setNext(LN.getNext().getNext()); 
		
	}

	@Override
	public void insert(T element) {
		ListNode<T> nuevoNodo= new ListNode<T>(element);
		if (isEmpty()){
			cabeza=cola=nuevoNodo;
		}
		else //agrego al final
			{	cola.setNext(nuevoNodo); //pasa nuevoNodo al siguiente del último
				cola=cola.getNext(); //define que nuevoNodo sea el último
			
		}
	}

	
	public boolean isEmpty() {
		return (cabeza==null);
	}

	
	public ListIteratorInterface iterator() {
		ListIteratorInterface iterator= new ListIteratorImpl<T>(cabeza);
		return iterator;
		
	}

	@Override
	public void removeAll() {
		
		
		
	}
	 
}