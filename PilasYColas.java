import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;


public class PilasYColas {

	
	Stack pila1 = new Stack();
	Stack pila2 = new Stack();
	PriorityQueue cola1 = new PriorityQueue();
	PriorityQueue cola2 = new PriorityQueue();
	int[] miArreglo = new int[5];
	
	public void probarPilas(){
		
		System.out.println(pila1.isEmpty());		
		pila1.add(43);
		pila1.add(50);
		pila1.add(48);
		pila1.add(35);
		System.out.println(pila1.isEmpty());
		System.out.println(pila1.getClass());
		System.out.println(pila1.elementAt(0));
		System.out.println(pila1.isEmpty());
		pila1.pop();
		System.out.println(pila1.isEmpty());	
		System.out.println(pila1.size());
		System.out.println(pila1.elementAt(2));
		pila2.add(pila1.pop());
		System.out.println(pila1.indexOf(43));
				
	}
	
	public void probarColas(){
		
		cola1.add(28);
		cola1.add(30);
		cola1.add(32);
		cola1.add(34);
		cola1.add(36);
		//devuelve y quita primer elemento
		System.out.println(cola1.poll());
		System.out.println(cola1.poll());
		System.out.println(cola1.size());
		//devuelve pero no quita ningún elemento de la cola
		System.out.println(cola1.peek());
		System.out.println(cola1.size());
		
		
		
		
	}
	
}
