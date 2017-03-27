import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


public class primeraPruebaDeConjuntos {

	public static void main(String args[]){
		
		/*SortedSet miConjunto = new TreeSet();
		
		//Como verás esta estructura no admite elementos iguales a otro
		miConjunto.add(4);
		miConjunto.add(3);
		miConjunto.add(9);
		miConjunto.add(7);	
		miConjunto.add(3);	
		miConjunto.add(9);
		
		Iterator it = miConjunto.iterator();
		System.out.println(miConjunto); 
		while(it.hasNext()){System.out.println(it.next()); } */
		
		Set<Integer> miConj = new HashSet<Integer>();
		
		miConj.add(2);
		miConj.add(8);
		miConj.add(7);
		miConj.add(2);
		miConj.add(3);
		miConj.add(4);
		miConj.add(7);
		
		Iterator<Integer> it2 = miConj.iterator();
		System.out.println(miConj); 		
		while(it2.hasNext()){System.out.println(it2.next()); }
		
		
	}
	
	
}
