/*5. Escriba un algoritmo que dado un arreglo de n�meros enteros y un valor entero, devuelva 
si existe dicho elemento en el arreglo. Indique el tiempo de ejecuci�n en notaci�n O.  Si 
encuentra m�s de una forma de hacerlo plantee ambas y compare la eficiencia. */


public class GuiaCuatroEjCinco {

	int[] arreglo = { 5,8,9,6,7,1,4,14,19,20,15 };
	
	
	public boolean encontrarNumero(int n){ //lectura n = 1
		
		boolean B = false; //valor variable, igualar, leer variable = 3
		
		for(int i = 0; i < arreglo.length; i++ )
		// inicializaci�n i + arreglo.length(leer condici�n, incrementar i, condici�n) 
		// 3                + n(veces que lea + veces que incrementa + veces que entra la condici�n (osea el if))	
			if(n == arreglo[i]){ B = true; break; } //
			//condici�n = Tcondici�n + TSentencia
			
		return B;
		// devolver B
	}
	
}
