
public class PilaSofisticada<Item> implements StackInterface<Item> {

	 private Item[] a;         // array of items

	    private int N;            // number of elements on stack
	    
	    private PilaSofisticada PilaSof;

	// invariante de representación?:...

	   /**

	     * Initializes an empty stack.

	     */

	    public PilaSofisticada (){

	        a = (Item[]) new Object[2];

	    }

	    /**

	     * Is this stack empty?

	     * @return true if this stack is empty; false otherwise

	     */

	    public boolean isEmpty() {

	        return N == 0;

	    }

	    /**

	     * Returns the number of items in the stack.

	     * @return the number of items in the stack

	     */

	    public int size() {

	        return N;

	    }

	    // resize the underlying array holding the elements

	    private void resize(int capacity) {

	        assert capacity >= N;

	        Item[] temp = (Item[]) new Object[capacity];

	        for (int i = 0; i < N; i++) {

	            temp[i] = a[i]; //paso todos los elementos de el arreglo "a" a temp

	        }

	        a = temp; //Paso todo temp a "a" incluyendo su tamaño

	    }

	    /**

	     * Adds the item to this stack.

	     * @param item the item to add

	     */

	    public void push(Item item) {

	        if (N == a.length){ resize(a.length*2); } //Si hay tantos elementos como espacio, resize con el doble de espacio
	        // double size of array if necessary

	        // al insertar algún elemento, ya que es una pila, todos los elementos existentes deben moverse un casillero
	        // add item
	        
	        for(int i = a.length - 1; i > 0; i--){
	        	a[i] = a[i - 1]; //Si el arreglo tiene espacios corro todos los elemenos 1 más para la derecha(o abajo)
	        }
	        a[0] = item;
	        N = N+1;
	    }

	    /**

	     * Removes and returns the item most recently added to this stack.

	     * @return the item most recently added

	     * @throws java.util.NoSuchElementException if this stack is empty

	     */

	    public Item pop() throws java.util.NoSuchElementException {

	        if (isEmpty() == true){ throw new java.util.NoSuchElementException(); }

	        Item item = a[0];

	        a[0] = null;// to avoid loitering
	        
	        if(a.length > 1){
	        for(int i = 1 ; i < a.length -1; i++){
	        	a[i -1] = a[i]; //Si el arreglo tiene espacios corro todos los elemenos 1 más para la derecha(o abajo)
	        	}
	        }
	        
	       a[a.length-1] = null;
	       
	       N--; // ojo con el invariante de representación

	        // shrink size of array if necessary

	        if (N > 0 && N == a.length/4) resize(a.length/2);

	        return item;

	    }

	    /**

	     * Returns (but does not remove) the item most recently added to this stack.

	     * @return the item most recently added to this stack

	     * @throws java.util.NoSuchElementException if this stack is empty

	     */

	    public Item peek() throws java.util.NoSuchElementException  {

	        if (isEmpty()) { throw new java.util.NoSuchElementException(); };

	        return a[0];

	    }

	
	    
	    public void agregarPilaSofisticada(PilaSofisticada P){
	    	this.PilaSof = P;
	    	
	    }
	    
	    public void intercalar()throws Exception {
	    	if(this.PilaSof == null){ throw new Exception("Necesitas agregar una pila a este objeto"); }
	    
	    	
	    	ResizingArrayStack RAS = new ResizingArrayStack();
	    	
	    	
	    	while(this.isEmpty() == false || this.PilaSof.isEmpty() == false){
	    		if(this.isEmpty() == false){RAS.push(this.pop()); }
	    		if(this.PilaSof.isEmpty() == false){RAS.push(this.PilaSof.pop()); }
	    	}
	    	
	    	while(RAS.isEmpty() == false ){ System.out.println(RAS.pop());}
	    	
	    }

	}

	

