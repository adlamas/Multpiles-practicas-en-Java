//Escribir un método recursivo que reciba 2 enteros n y b y devuelva True si n es potencia de b. 
//Por ejemplo: es_potencia(8,2) devuelve true.

public class GuiaCincoEjTrece {

	public static boolean esPotencia(int potencia, int base){
		
		if(potencia == 1) { return true; }
		//Si potencia = 1 retorna true
		if(potencia%base != 0){ return false; }
		// Si el resto de la división de potencia y base es distinto de 0 retorna falso
		else { int nuevo = potencia/base;
		//Divide potencia por base y lo guarda en una nueva variable
			return esPotencia(nuevo, base);
			//recursión con la nueva potencia
			
			
		}
	}
	
	public static void main(String args[]){
		
		System.out.println(esPotencia(64,4));
	}
	
}
