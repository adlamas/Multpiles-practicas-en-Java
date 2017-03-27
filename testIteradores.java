import org.junit.Test;
import org.junit.Assert;
import java.util.LinkedList;

public class testIteradores {

@Test
public void probarIteradorDeClientes(){
	
	Iteradores iterador = new Iteradores();
	//Crea objeto iteradores
	
	ClientesIteradores Juan = new ClientesIteradores("Juan","Perez",45467039, 30203298);
	ClientesIteradores Pedro = new ClientesIteradores("Pedro","González", 43456576, 28809345);
	ClientesIteradores Andres = new ClientesIteradores("Andrés", "Barrios", 42329089, 32495004);
	//Crea objetos ClientesIteradores
	
	LinkedList<ClientesIteradores> Lista = new LinkedList<ClientesIteradores>();
	//Crea una lista enlazada
	
	Lista.add(Juan);
	Lista.add(Pedro);
	Lista.add(Andres);
	//Llena la lista con clientesIteradores
	
	Assert.assertEquals("Juan" + "Perez" + 45467039 + 30203298, iterador.toString(Lista,0));
	Assert.assertEquals("Pedro" + "González" + 43456576 + 28809345, iterador.toString(Lista,1) );
	
}
	
}
