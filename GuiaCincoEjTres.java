//Escriba un método recursivo que tome un entero n devuelva su factorial.

public class GuiaCincoEjTres {

	public static void main(String args[]){
		
		System.out.println(factorial(5));
	}
	
	public static int factorial(int n){
		if(n == 0) return 1; //Axioma
		else return n*factorial(n -1); //Formula recursiva
		
	}
	
}

