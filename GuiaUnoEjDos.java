import java.util.Iterator;


public class GuiaUnoEjDos {

	//Funciona! :D
	
	
	public  boolean esPalindromo(String palabra){
		boolean palindromo = true;
		int letraFinal = palabra.length() -1;
		
		for(int i = 0; i < (int) (palabra.length()/2) ; i++){
		 if(palabra.charAt(i) != palabra.charAt(letraFinal)){palindromo = false; break;  }
		 
		 letraFinal --;
		}
		
		return palindromo;
	}
	
}
