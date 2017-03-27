import java.util.Iterator;
import java.util.LinkedList;


public class guiaDosEjTres {

	static LinkedList L1 = new LinkedList();
	static LinkedList L2 = new LinkedList();
	static LinkedList L3 = new LinkedList();
	
	static public void llenarListas(){
		
		L1.add(2);
		L1.add(4);
		L1.add(9);
		L2.add(5);
		L2.add(3);
		L2.add(8);
		L1.add(13);
	}
	
	public static void main(String args[]){
		Iterator it1 = L1.iterator();
		Iterator it2 = L2.iterator();
		Iterator it3 = L3.iterator();
		
		llenarListas();
		//Mientras it1 o it2 estén sin vaciar entra la condición
		while(it1.hasNext() || it2.hasNext()){
			//El que tenga elementos los va a imprimir, mientras que el otro no.
			if(it1.hasNext()){ L3.add(L1.poll()); }
			if(it2.hasNext()){L3.add(L2.poll()); }
		}
		
		while(it3.hasNext()){ System.out.print(L3.poll()); }
		
	}
}
