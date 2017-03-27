import java.util.Iterator;
import java.util.LinkedList;

//Escriba un método que reciba una lista de enteros y devuelva otra lista con los
//elementos de la primera elevados al cuadrado.

public class GuiaDosEjNueve {

	static LinkedList L1 = new LinkedList();
	static LinkedList L2 = new LinkedList();
	
	
	public static void llenar(){
		L1.add(2);
		L1.add(5);
		L1.add(6);
		L1.add(3);
		L1.add(7);
		
	}
	
	public static void main(String args[]){
		llenar();
		//El iterador tiene que ser de tipo integer para que pueda tratar a los objetos por los que pasa como enteros.
		Iterator<Integer> it1 = L1.iterator();
		int numero = 0;
		while(it1.hasNext()){L2.add(Math.pow((int) it1.next(), 2) ); }
		Iterator it2 = L2.iterator();
		while(it2.hasNext()){	System.out.println(it2.next() );	}
		
	}
}
