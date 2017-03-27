import java.util.*;

public class ListQueue<AnyType> implements QueueInterface<AnyType>

{

    private ListNode<AnyType> front; //Nodo frontal, primera posición. Objeto de la clase ListNode
    					
    private ListNode<AnyType> back; //Nodo trasero, segunda posición.  Objeto de la clase ListNode 

    //helper class

    // la clase lista enlazada no es pública

    private class ListNode<AnyType>

    {

          // Constructors

        public ListNode( AnyType theElement ) //elemento, osea, el dato que tiene el nodo
        {
            this( theElement, null ); //dato y referencia
        }

        public ListNode( AnyType theElement, ListNode<AnyType> n )
        {

            element = theElement; //elemento
            next    = n; //Siguiente nodo
        }

        public AnyType   element;
        public ListNode<AnyType> next;

    }

    

/**

     * Construct the queue.

     */

    public ListQueue ( )
    {
        front = back = null; //primer nodo y último son nulos, los inicializa así
    }

    /**

     * Test if the queue is logically empty.

     * @return true if empty, false otherwise.

     */

    public boolean isEmpty( ) //es vacía
    {
        return front == null; //Si el primer nodo es nulo, el resultado será verdadero
    }

    /**

     * Insert a new item into the queue.

     * @param x the item to insert.

     */

    public void enqueue( AnyType x ) //Encolar
    {
    	ListNode nuevo = new ListNode(x, null);
    	
        if( isEmpty()){ front = nuevo; back = nuevo; }    // Make queue of one element
        
        else{ back.next = nuevo; //El siguiente del último será este nuevo nodo
        	  back = nuevo; // El nuevo nodo será el último  	
        }
           

    }

    /**

     * Return and remove the least recently inserted item

     * from the queue.

     * @return the least recently inserted item in the queue.

     * @throws NoSuchElementException if the queue is empty.

     */

    public AnyType dequeue( ) throws java.util.NoSuchElementException //desencolar 
    {
    	AnyType returnValue = front.element;
    	
    	if(front == back){ //Compara referencias y NO valores, ame'o
    		
    	//if(front.equals(back)){ 
    	//De esta manera se compararían LOS VALORES Y NO LAS REFERENCIAS.
    //Igualmente sería el mismo resultado, ya que al apuntar al mismo objeto, los valores de front y back serían iguales
    		
    	//Ahora funciona, osea, el front no me coincide con el back cuando hay solo 1 elemento
    		front = null; back = null;
    		return returnValue;
    		};
    	
        if( isEmpty() ){ throw new java.util.NoSuchElementException("No hay elementos"); }
        else{                     
        front = front.next; //El siguiente de front es el nuevo front              
        }
        return returnValue;
    }

    /**

     * Get the least recently inserted item in the queue.

     * Does not alter the queue.

     * @return the least recently inserted item in the queue.

     * @throws NoSuchElementException if the queue is empty.

     */

    public AnyType peek( ) throws java.util.NoSuchElementException //mirar el primero
    {
        if( isEmpty()) { throw new java.util.NoSuchElementException(); }
        else return front.element;
    }

}