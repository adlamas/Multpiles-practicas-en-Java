import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class guiaTresEjOnce {

	public void devolverConjunto(String palabra){
		SortedSet Conj = (SortedSet) new TreeSet();
		LinkedList lista = new LinkedList();
		for(int i = 0; i < palabra.length(); i++){
			lista.add(palabra.charAt(i));
		}
		
		Iterator itList = lista.iterator();
		
		
		while(itList.hasNext()){ Conj.add(itList.next()); }
		Iterator itConj = Conj.iterator();
		
		while(itConj.hasNext()){ System.out.println(itConj.next()); }
		//Imprime solo una vez cada letra de la palabra
	}
	
	public void devolverVocales(String palabra){
		Set Conj = new HashSet();
		for(int i = 0; i < palabra.length(); i++ ){
			if ((palabra.charAt(i)=='a') || (palabra.charAt(i)=='e') || (palabra.charAt(i)=='i') ||
					(palabra.charAt(i)=='o') || (palabra.charAt(i)=='u'))
			{ Conj.add(palabra.charAt(i)); }
		}
		Iterator it = Conj.iterator();
		while(it.hasNext()){ System.out.println(it.next()); }
	}
	
	public void devolverConsonantes(String palabra){
		SortedSet Conj = new TreeSet();
		for(int i = 0; i < palabra.length(); i++ ){
			if ((palabra.charAt(i)!='a') && (palabra.charAt(i)!='e') && (palabra.charAt(i)!='i') &&
				(palabra.charAt(i)!='o') && (palabra.charAt(i)!='u')){
				
				Conj.add(palabra.charAt(i)); }
		}
		Iterator it = Conj.iterator();
		while(it.hasNext()){ System.out.println(it.next()); }
		
	}
}
