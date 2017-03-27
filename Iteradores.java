import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;

public class Iteradores {
	
	ClientesIteradores Juan = new ClientesIteradores("Juan","Perez",45467039, 30203298);
	ClientesIteradores Pedro = new ClientesIteradores("Pedro","González", 43456576, 28809345);
	ClientesIteradores Andres = new ClientesIteradores("Andrés", "Barrios", 42329089, 32495004);
	//Crea objetos ClientesIteradores
	
	LinkedList<ClientesIteradores> Lista = new LinkedList<ClientesIteradores>();
	//Crea una lista enlazada
	
	public static void main(String args[]){
		
		//Prueba del funcionamiento de la lista y el iterador
		ArrayList<Integer> listaArray = new ArrayList<Integer>();
		listaArray.add(2);
		listaArray.add(5);		
		listaArray.add(8);		
		listaArray.add(12);		
		listaArray.add(16);
	
		//Parece que tengo que poner el iterador después de agregar todos los elementos a la lista, sino, tira error
		Iterator<Integer> miIterador = listaArray.iterator();		
		while(miIterador.hasNext()){ System.out.println(miIterador.next()); }
	}
	
	public void imprimirListaDeString(LinkedList <String> unaLista){
		
		Iterator miIterador = unaLista.iterator();
		while(miIterador.hasNext()){ System.out.println(miIterador.next() + ", "); }
		 
	}
	
	public String toString(LinkedList <ClientesIteradores> misClientes, int n){
		
		return String.format( misClientes.get(n).getNombre() + misClientes.get(n).getApellido()
			 + misClientes.get(n).getTelefono() + misClientes.get(n).getDni() );
	}
	
	public void imprimirClientes(){
		Lista.add(Juan);
		Lista.add(Pedro);
		Lista.add(Andres);
		
		Iterator<ClientesIteradores> Ite = Lista.iterator();
		while(Ite.hasNext()){ System.out.println(Lista.getFirst().getNombre() + Lista.getFirst().getApellido() +
				Lista.getFirst().getTelefono() + Lista.getFirst().getDni() );
		}
		
	}
}
