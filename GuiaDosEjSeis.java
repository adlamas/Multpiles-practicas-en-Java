import java.util.Iterator;
import java.util.LinkedList;

public class GuiaDosEjSeis {

	/*Escribe el método eliminarDuplicados, que recibe una lista de enteros  y
una nueva lista con los mismos elementos pero eliminando los repetidos. Por 
ejemplo, si la lista de entrada es: [1, 2, 2, 1, 4, 2, 4, 3], la salida sería: [1, 2, 4, 3]. */
	
	
	static LinkedList L1 = new LinkedList();
	static LinkedList L2 = new LinkedList();
	
	static boolean existeYa = true;
	
	static public void llenarLista(LinkedList lista){
		
		lista.add(1);
		lista.add(2);
		lista.add(2);
		lista.add(1);
		lista.add(4);
		lista.add(2);
		lista.add(4);
		lista.add(3);
	}
	
	public static void main(String args[]){
	//El iterador debe ser lo ÚLTIMO que se construya después de todo, sino te tira error ame'o
		llenarLista(L1);
		Iterator it1 = L1.iterator();
		Iterator it2 = L2.iterator();
		
		while(it1.hasNext())
		{L2.add(it1.next()); }
			
				
		
	}
	
	}
