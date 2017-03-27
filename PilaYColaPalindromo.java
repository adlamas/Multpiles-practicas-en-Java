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
	
	public void devolverTama�o(){
		Stack<String> miPila = new Stack<String>();
		int tama�o;
		//Lleno la lista con 4 objetos, por lo cual, ese ser�a su tama�o
		miPila.push("Algo");
		miPila.push("Nada");
		miPila.push("Todo");
		miPila.push("Poco");
		System.out.println(miPila.size());
		//ac� desapilo los �ltimos dos objetos y su tama�o se reduce a 2
		miPila.pop();
		miPila.pop();
		//el m�todo pop saca el elemento y lo devuelve, adem�s
		System.out.println(miPila.pop());
		System.out.println(miPila.size());
		
		
	}
	
}
