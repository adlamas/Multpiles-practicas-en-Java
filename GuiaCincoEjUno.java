
//1. Escribir un método recursivo que tome una palabra y diga si es palíndroma.

public class GuiaCincoEjUno {

	public static boolean esPalindroma(String palabra){
		
		if(palabra.length() <= 1) { return true; }
		//Si tiene una sola letra o ninguna retorna true
		else {
			char Primero = palabra.charAt(0);
			char Final = palabra.charAt(palabra.length() -1);
			//guarda la primera y última letra de la palabra
			String palabraSinExtremos = palabra.substring(1, palabra.length() -1 );
			//Crea una palabra sin sus extremos. Smiles --> mile
			return (Primero == Final)&& esPalindroma(palabraSinExtremos);
			//retorna true, si la primera letra es igual a la ultima letra y si la subPalabra también es palíndroma
		}		
		
	}
	
	public static void main(String args[]){
		
		System.out.println(esPalindroma("adda"));
	}
	
	
}


/*public boolean palindroma(String palabra){
boolean B = true;
String palabraAcortada = null;
if (palabra.length() == 1){ return true; }

if (palabra.length() == 2 && palabra.charAt(0) == palabra.charAt(1)){ return true; }

if(palabra.length() > 2 && palabra.charAt(0) == palabra.charAt(palabra.length() -1) ){ 
	palabraAcortada = palabra.substring(1, palabra.length() - 2); }

if(palabraAcortada.length() > 2 && palabraAcortada.charAt(0) == palabraAcortada.charAt(palabraAcortada.length() -1) ){ 
	palabraAcortada = palabraAcortada.substring(1, palabraAcortada.length() - 2);
	palindroma(palabraAcortada);}

if( palabraAcortada.length() > 2 && palabraAcortada.charAt(0) != palabraAcortada.charAt(palabraAcortada.length() -1) ){
	B = false;	}


return B;*/
