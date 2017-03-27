import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class dosColas {

	int numero1 = 5;
	int numero2 = 8;
	int numero3 = 10;
	int numero4 = 12;
	int numero5 = 15;
	
	PriorityQueue Cola1 = new PriorityQueue();
	PriorityQueue Cola2 = new PriorityQueue();
	PriorityQueue Cola3 = new PriorityQueue();
	
	public void llenarColas(){
		Cola1.add(numero1);
		Cola1.add(numero2);
		Cola1.add(numero3);
		Cola2.add(numero4);
		Cola2.add(numero5);
		System.out.println(Cola1.size());
		//El método poll desencola el primero que se introdujo, en este caso, numero1
		}
	
	public void terceraCola(){
		
		int tamaño = Cola1.size() + Cola2.size();
		for(int i = 0; i < Cola1.size(); i++){ Cola3.add(Cola1.poll());  
	    }
		for(int i = 0; i < Cola2.size(); i++){ Cola3.add(Cola2.poll());
		}
		
		for(int i = 0; i < tamaño; i++){ System.out.print(Cola3.poll());
		}
		
	}
	
	
	
}
