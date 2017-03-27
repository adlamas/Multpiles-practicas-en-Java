import java.util.ArrayList;
import java.util.Iterator;


// Escriba un método que reciba un número entero y una lista de enteros y elimine
// todas las apariciones de dicho número en la lista.

public class GuiaDosEjSiete{
	
	static ArrayList lista = new ArrayList();
	static ArrayList lista2 = new ArrayList();
	static Object Sacar = 7; //Número que no quiero que aparezca en la nueva lista
	
	public static void llenar(){
		//[5, 7, 8, 9, 5, 69, 7, 3, 7]
		
		lista.add(5);
		lista.add(7);
		lista.add(8);
		lista.add(9);
		lista.add(5);
		lista.add(69);
		lista.add(7);
		lista.add(3);
		lista.add(7);
	}
	
	public static void main(String args[]){
		
		llenar();
		Iterator it1 = lista.iterator();
		Object numero = 0;
		
		while(it1.hasNext())
		{ numero = it1.next();   
		if(numero != Sacar ){ lista2.add(numero);
			}
		
		}
		
		Iterator it2 = lista2.iterator();
		while(it2.hasNext()){ System.out.println(it2.next()); }
	}
	
	
}