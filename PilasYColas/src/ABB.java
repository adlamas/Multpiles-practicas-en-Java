
public class ABB {
	
	
	Nodo raiz;
	
	public ABB(){
		raiz = null;
	}
	
	public int recorrerEnOrden(Nodo N){
		
		int i =0;
		if(N != null)
		{
			recorrerEnOrden(N.izq);
			System.out.println( N.llave);
			
			recorrerEnOrden(N.der);
		}
		return i;
	}
	
	/*public void imprimirNumeros(){
		recorrerEnOrden(raiz);
		int i = pila.peek();
		Iterator it = pila.iterator();
		if(it.hasNext()){System.out.println(it.next()); };
		if(it.hasNext()){System.out.println(it.next()); };
		
		
	}*/
	
	public void insertar(int key, Object valor){
		
		Nodo n = new Nodo(key);
		n.valor = valor;
		
		if(raiz == null)
		{
			raiz = n;
		}
		else{
			Nodo temporal = raiz;
			while(temporal != null)
			{
			 n.p = temporal;
			 if(n.llave >= temporal.llave)
			 {
				 temporal = temporal.der;
			 }
			 else{
				 temporal = temporal.izq;
			 	 }
			}
		if(n.llave < n.p.llave)
			{
			n.p.izq = n;
			}else{
				n.p.der = n;
			}
		
		}
	}
	
	public class Nodo{
		
		public Nodo p; //padre
		public Nodo der;
		public Nodo izq; 
		public int llave; //Como se pone en que lugar
		public Object valor;
	
	
	public Nodo(int key){
		
		llave = key;
		der = null;
		izq = null;
		p = null;
		valor = null;
		}
	}
}
