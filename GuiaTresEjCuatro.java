import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;


public class GuiaTresEjCuatro {

	public static void main(String args[]){
		
	//El ejercicio es con un arreglo pero acá lo hice con listas, es lo mismo solo hay que hacer un for	
	LinkedList<Integer> Lista = new LinkedList<Integer>();
	Lista.add(5);
	Lista.add(4);
	Lista.add(8);
	Lista.add(4);
	Lista.add(2);
	Lista.add(5);
	Lista.add(9);
	Lista.add(8);
	Iterator it = Lista.iterator();
	
	Set<Integer> conjunto = new HashSet<Integer>();
	while(it.hasNext()){ conjunto.add(Lista.poll()); }
	
	Iterator it2 = conjunto.iterator();
	while(it2.hasNext()){ System.out.println(it2.next()); }
	
	}
	
	
}
