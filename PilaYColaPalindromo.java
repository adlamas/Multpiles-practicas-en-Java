import java.util.Stack;


public class PilaYColaPalindromo {

	public boolean main(){
		
		String L1 = "A";
		String L2 = "B";
		String L3 = "C";
		String L4 = "C";
		String L5 = "B";
		String L6 = "A";
		
		Stack<String> miPila = new Stack<String>();
		miPila.push(L1);
		miPila.push(L2);
		miPila.push(L3);
		miPila.push(L4);
		miPila.push(L5);
		miPila.push(L6);
		
		String letras[] = new String[miPila.size()];
		
		int longitudDePilaDivididaDos = (miPila.size()/2);
		boolean esIgual = true;
		while(miPila.size() > longitudDePilaDivididaDos){   
		for(int i = 0; i < miPila.size(); i++){
			if(letras[i] != miPila.pop()){ esIgual = false; break; 
						}
					}
				} 
			return esIgual;
		}
	
	public void devolverTamaño(){
		Stack<String> miPila = new Stack<String>();
		int tamaño;
		//Lleno la lista con 4 objetos, por lo cual, ese sería su tamaño
		miPila.push("Algo");
		miPila.push("Nada");
		miPila.push("Todo");
		miPila.push("Poco");
		System.out.println(miPila.size());
		//acá desapilo los últimos dos objetos y su tamaño se reduce a 2
		miPila.pop();
		miPila.pop();
		//el método pop saca el elemento y lo devuelve, además
		System.out.println(miPila.pop());
		System.out.println(miPila.size());
		
		
	}
	
}
