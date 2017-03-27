import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class primeraPruebaDeDiccionarios {

	public static void main(String args[]){
		
		String Palabra = "Mi Palabra";
		
		Map Diccionario = new HashMap();
		Diccionario.put(4, "Número 4");
		Diccionario.put(3, "Número 3");
		Diccionario.put(2, "Número 2");
		Diccionario.put(5, Palabra);
		Diccionario.put(8, Palabra);
		Diccionario.put(10, "Número 10");
		Diccionario.put(7, "Número 7");
		
		System.out.println(Diccionario.get(5));
		
		System.out.println(Diccionario.size());
		System.out.println(Diccionario.get(5));
		System.out.println(Diccionario.get(8));
		System.out.println(Diccionario.remove(3));
		System.out.println(Diccionario.size());
		
		
		
		
	}
	
}
