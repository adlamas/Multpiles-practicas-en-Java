import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;


public class ColaDeNoPrioridad {

	public static void main(String args[]){
		
		Queue cola = new LinkedList();
		cola.add(9);
		cola.add(8);
		cola.add(7);
		cola.add(6);
		cola.add(5);
		cola.add(4);
		cola.add(3);
		cola.add(2);
		cola.add(1);
		
		Iterator it = cola.iterator();
		while(it.hasNext()){ System.out.println(it.next()); }
		Set conjunto = new HashSet();
		Map diccionario = new HashMap();
		SortedSet conjuntoOrdenado = new TreeSet();
		SortedMap diccionarioOrdenado = new TreeMap();
		//Los conjuntos SI TIENEN iteradores mientras que los diccionarios NO TIENEN iteradores
		
	}
	
}
