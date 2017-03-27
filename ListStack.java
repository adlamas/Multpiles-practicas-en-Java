
public class ListStack<T> implements StackInterface<T> {

	

    private ListNode<T> topOfStack; //nodo top de la pila, el que está más arriba.

      // helper linked list class

    private class ListNode<AnyType> //clase ListNode
    	{
         // Constructors

    		public ListNode( AnyType theElement ) //Constructor 1

    		{   this( theElement, null );  
        
        
    		}

        
    		public ListNode( AnyType theElement, ListNode<AnyType> n ){ //Constructor 2

    		element = theElement; //pasamos el elemento del constructor a un atributo

            next = n; //pasamos el nodo del constructor a un atributo

    		}

    		public AnyType element; //atributo elemento

    		public ListNode<AnyType> next; //atributo nodo

    		}

    /**

     * Construct the stack.

     */

    public ListStack ( ){
    	
    
    	topOfStack = null;
    
    }

    /**

     * Test if the stack is logically empty.

     * @return true if empty, false otherwise.

     */

    public boolean isEmpty( )    {

        return topOfStack == null;

    }

    /**

     * Insert a new item into the stack.

     * @param x the item to insert.

     */

    public void push(T newItem ){ 
    	//http://www.javaya.com.ar/detalleconcepto.php?codigo=115&inicio=40
    	
    	/*
    	 * Tener en cuenta que cuando finaliza la ejecución del método el puntero nuevo desaparece,
    	 * pero no el nodo creado con el operador new.En caso que la lista no esté vacía,
		   el puntero sig del nodo que acabamos de crear debe apuntar al que es hasta este momento el primer nodo, 
		   es decir al nodo que apunta raiz actualmente.
    	 */
    	
    	ListNode nuevo = new ListNode(newItem, null);
    	
    	if(topOfStack == null){ topOfStack = nuevo;}
    	//Si el top no tiene nada, creo una referencia nodo y le asigno un item
    	//¿Cómo recorro los nodos?
    	else{
    		nuevo.next = topOfStack; 
    		//topOfStack es un nombre nada más, se pasa el valor de este primero al next del nodo creado
    		topOfStack = nuevo;
    		}
    	  			
    	}   

    /**

     * Get the most recently inserted item in the stack.

     * Does not alter the stack.

     * @return the most recently inserted item in the stack.

     * @throws NoSuchElementException if the stack is empty.

     */

   
    public T peek( ) throws java.util.NoSuchElementException {

        
    	if(topOfStack != null){
    	return (T) topOfStack.element;
    	}
    	else throw new java.util.NoSuchElementException();
    	
		
        
    					}
    

    /**

     * Return and remove the most recently inserted item

     * from the stack.

     * @return the most recently inserted item in the stack.

     * @throws NoSuchElementException if the stack is empty.

     */

    public T pop( ) throws java.util.NoSuchElementException

    {
    	if( isEmpty() == true){ throw new java.util.NoSuchElementException(); 	
        }
    	
    	else{ 
    		//Si la lista no está vacía guardamos en una variable local la información del primer nodo:
        	T temp = topOfStack.element;
        	//Avanzamos raiz al segundo nodo de la lista, ya que borraremos el primero:
        	topOfStack = topOfStack.next;
        	//el nodo que previamente estaba apuntado por raiz es eliminado automáticamente por la máquina virtual de Java
        	//al no tener ninguna referencia.
        	//Retornamos la información 
        	return temp;
        					
        }
        
        
    }

}        

    

