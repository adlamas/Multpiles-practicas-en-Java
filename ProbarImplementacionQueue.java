
public class ProbarImplementacionQueue {

	static ListQueue cola = new ListQueue();
	static ResizingArrayQueue colaArreglo = new ResizingArrayQueue();
	
	public static void main(String args[]){
		
		System.out.println(cola.isEmpty());
		
		cola.enqueue(4);
		System.out.println(cola.isEmpty());
		cola.enqueue(6);
		cola.enqueue(9);	
		
		System.out.println(cola.dequeue());
		System.out.println(cola.dequeue());
		
		System.out.println(cola.peek());
		System.out.println(cola.dequeue());
		System.out.println(cola.isEmpty());
		
		System.out.println(); 
		
		System.out.println(colaArreglo.isEmpty());
		colaArreglo.enqueue(3);
		colaArreglo.enqueue(7);
		colaArreglo.enqueue(4);
		System.out.println(colaArreglo.isEmpty());
		System.out.println(colaArreglo.peek());
		System.out.println(colaArreglo.dequeue());
		System.out.println(colaArreglo.peek());
		System.out.println(colaArreglo.dequeue());
		System.out.println(colaArreglo.dequeue());		
		System.out.println(colaArreglo.isEmpty());
		
		
		//Todo parece funcionar bien, ambas colas trabajan como deberían.
	}
	
}
