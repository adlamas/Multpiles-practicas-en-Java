/*1.Implemente la clase ListNode que define los objetos nodo de una lista enlazada. La clase
	tendrá dos constructores: 
	a) ListNode (Object d) que toma un dato d y construye un nodo único, es decir que 
	b) ListNode (Object d, NodoLista n) que toma un dato d y un nodo n y construye 
	no apunta a un nodo siguiente, nuevo nodo que contiene el dato d y apunta al siguiente nodo n. */


public class ListNode<T>
    {

        private T   element;
        private ListNode<T> next;

          // Constructors
        public ListNode( T theElement )
        {
            this( theElement, null );
        }

        public ListNode( T theElement, ListNode<T> n )
        {
            element = theElement;
            next    = n;
        }

		public T getElement() {
			return element;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public ListNode<T> getNext() {
			return next;
		}

		public void setNext(ListNode<T> next) {
			this.next = next;
		}
        
        
    }
