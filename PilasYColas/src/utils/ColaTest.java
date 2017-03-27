package utils;

import junit.framework.TestCase;

public class ColaTest extends TestCase {
	
	private Cola q;
	
	public ColaTest(String n){
		super(n);
	}
	
	protected void setUp() throws ColaException {
		
		q = new Cola();
		}

 	protected void tearDown() {
 		
		q = null;
	}
 
 	public void testFIFO() throws ColaException {
 		q.encolar("Algoritmos");
		q.encolar("Programacion");
		q.encolar("Rosita");
		assertEquals(q.desencolar(), "Algoritmos");
		assertEquals(q.desencolar(), "Programacion");
		assertEquals(q.desencolar(), "Rosita");
		q.encolar("Margarita");
		q.encolar("Martin");
		assertEquals(q.colaVacia(), false);
		assertEquals(q.desencolar(), "Margarita");
		assertEquals(q.desencolar(), "Martin");
		assertEquals(q.colaVacia(), true);
	}
 

}
