import java.util.Iterator;
import java.util.Stack;

/*	Escribir un método que calcule recursivamente cuántos elementos hay en una pila,
	suponiendo que la pila sólo tiene los métodos apilar(x), desapilar() y esVacia(), y no 
	altere el contenido de la pila. */


public class GuiaCincoEjSeis {
	 Stack pila = new Stack();
	 Stack pila2 = new Stack();
	
	public void AgregarElementos(){
		
		pila.add(3);
		pila.add(5);
		pila.add(1);
		pila.add(8);
		pila.add(7);		
	}
	
	public void Contar(){
	int i = 0;
		
	if(pila.isEmpty() == true && pila2.isEmpty() == true){ AgregarElementos(); 
			}
	
	if(pila.isEmpty() == false){pila2.add(pila.pop());  Contar();
		if(pila.isEmpty() == true){ i = pila2.size(); }
		}
	
	 System.out.println(i);
	 Iterator it = pila2.iterator();
	 while(it.hasNext()){ pila.add(pila2.pop()); }
	 System.out.println(pila.size());
	 
	}
	
	
	
}
