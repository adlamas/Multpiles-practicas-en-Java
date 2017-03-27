import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class GuiaUnoEjTres {

	static Queue cola1 = new LinkedList();
	static Queue cola2 = new LinkedList();
	static Queue cola3 = new LinkedList();
	static Iterator it = cola3.iterator();
	
	public static void main(String args[]){
		
		cola1.add(3);
		cola1.add(8);
		cola1.add(11);
		cola2.add(13);
		cola2.add(9);
		cola2.add(5);
		
		
		while(cola1.isEmpty() == false){ cola3.add(cola1.poll()); }
		while(cola2.isEmpty() == false){ cola3.add(cola2.poll()); }
		while(it.hasNext()){ System.out.println(cola3.poll());
		//Me lo ordenó numericamente. ¿Qué onda? o.O. Si lo dejo como PRIORITYQUEUE
		//Ahora que lo cambié a LinkedList (lado derecho del igual) me lo devuelve como lo inserté
		
		}
	}
	
	
	
}
