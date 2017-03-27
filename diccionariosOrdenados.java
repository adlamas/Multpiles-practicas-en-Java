import java.util.SortedMap;
import java.util.TreeMap;


public class diccionariosOrdenados {

	
	public static void main(String args[]){
		SortedMap DOrdenado = new TreeMap();
		DOrdenado.put(1, "A");
		DOrdenado.put(2, "B");
		DOrdenado.put(3, "C");
		DOrdenado.put(4, "D");
		DOrdenado.put(5, "E");
		DOrdenado.put(6, "F");
		DOrdenado.put(7, "G");
		DOrdenado.put(8, "H");
		
		System.out.println(DOrdenado.get(4));
		
		
	}
}
