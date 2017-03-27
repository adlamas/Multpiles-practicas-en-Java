import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Iterator;

public class GuiaUnoEjNueve {
	/*Escribir un método que recibe un Array de números enteros y lo devuelve ordenado de
	  manera ascendente, sin usar algoritmos de ordenamiento, sólo una estructura de datos 
      adecuada. Por ejemplo si recibe el array [45, 27, 31, 8] devuelve el array [8, 27, 32, 45]. */
	
	static int [] arreglo = new int [5];
	static Queue cola = new PriorityQueue();
	
	public static void llenar(){
		
		arreglo[0] = 4;
		arreglo[1] = 2;
		arreglo[2] = 5;
		arreglo[3] = 9;
		arreglo[4] = 4;
		
		cola.add(arreglo[0]);
		cola.add(arreglo[1]);
		cola.add(arreglo[2]);
		cola.add(arreglo[3]);
		cola.add(arreglo[4]);
		
	}
	public static void main(String args[]){
		llenar();
		Iterator it1 = cola.iterator();
		while(cola.isEmpty() == false){ System.out.println(cola.poll()); }
		
	}
	
}
