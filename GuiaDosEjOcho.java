import java.util.Iterator;
import java.util.LinkedList;

//Escriba un método que reciba una lista de enteros y la devuelva invertida. 
//Por ejemplo si recibe la lista [1,2,3,4,5] devolverá la lista [5,4,3,2,1].


public class GuiaDosEjOcho {

	static LinkedList L1 = new LinkedList();
	static LinkedList L2 = new LinkedList();
	
	
	public static void llenar(){
		L1.add(5);
		L1.add(4);
		L1.add(3);
		L1.add(2);
		L1.add(1);
		
	}
	
	public static void main(String args[]){
		llenar();
		while(L1.isEmpty() == false){ L2.add(L1.getLast()); L1.removeLast(); }
		Iterator it2 = L2.iterator();
		
		while(it2.hasNext()){ System.out.println(it2.next());
	}
}
}
