import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class guiaTresEjCinco {

	public static void main(String args[]){
	
		boolean ordenado = true;
		LinkedList<Integer> lista = new LinkedList<Integer>();
		for(int i = 0; i < 10; i++){ lista.add((int)(Math.random()*100 + 1 )); };
		Iterator it = lista.iterator();
		
		
		Set<Integer> Conj = new HashSet<Integer>();
		while(it.hasNext()){ Conj.add(lista.poll()); }
		
		Iterator it2 = Conj.iterator();
		
		while(it2.hasNext()){ System.out.println(it2.next()); }
		
		
		//Parte A
		System.out.println("Acá empieza La parte B");
		//Parte B
		
		LinkedList<Integer> lista2 = new LinkedList<Integer>();
		
		for(int i = 0; i < 10; i++){ lista2.add((int)(Math.random()*100 + 1 )); };
		
		Iterator it3 = lista2.iterator();
		
		SortedSet<Integer> ConjOrd = new TreeSet<Integer>();
		
		while(it3.hasNext()){ ConjOrd.add(lista2.poll()); }
		
		Iterator it4 = ConjOrd.iterator();
		
		LinkedList<Integer> lista3 = new LinkedList<Integer>();
		
		while(it4.hasNext()){ lista3.add((Integer) it4.next()); }
		
		for(int i = 0; i < lista3.size() -1; i++){ if(lista3.get(i) > lista3.get(i + 1)){
			ordenado = false; break;
				}
			}
		
		System.out.print(ordenado);
		
	}
}
