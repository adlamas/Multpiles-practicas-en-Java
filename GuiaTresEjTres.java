import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;


public class GuiaTresEjTres {

	
	
	public static void main(String args[]){
		
		Map<Integer, String> Diccionario1 = new HashMap<Integer, String>();
		
		String Rodrigo = "Rodrigo";
		String David = "David";
		String Omar = "Omar";
		String Raul = "Raúl";
		String Sebastian = "Sebastián";
		String Nahuel = "Nahuel";
		
		Diccionario1.put(1, Rodrigo);
		Diccionario1.put(2, David);
		Diccionario1.put(3, Omar);
		Diccionario1.put(4, Raul);
		Diccionario1.put(5, Sebastian);
		Diccionario1.put(6, Nahuel);
		
		
		int numero = (int)(Math.random()*6 + 1);
		System.out.println(numero);
		System.out.print(Diccionario1.get(numero));
		
		Queue<String> cola = new ArrayDeque<String>();
		
		cola.add(Rodrigo);
		cola.add(David);
		cola.add(Omar);
		
		
	}
	
	
}
