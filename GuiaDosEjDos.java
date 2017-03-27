import java.util.Iterator;
import java.util.LinkedList;


public class GuiaDosEjDos {

		
	public static void main(String args[]){
		Cliente C = new Cliente("Alberto", "Lescano", "4544367");
		Cliente C2 = new Cliente("Pablo", "Suarez", "42318709");
		Cliente C3 = new Cliente("Juan", "Perez", "43948544");
		

		LinkedList<Cliente> lista = new LinkedList();
		Iterator it = lista.iterator();
		lista.add(C);
		lista.add(C2);
		lista.add(C3);
		while(it.hasNext()){System.out.printf(lista.peek().getNombre() + lista.poll().getApellido()); }
		
		
	}
	
}
