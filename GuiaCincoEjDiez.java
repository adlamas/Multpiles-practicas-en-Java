//Escribir un método recursivo que tome un vector de números enteros y devuelva la suma de todos sus elementos.

public class GuiaCincoEjDiez {

	public static int sumar(int []a){
		int n = a.length;
		if(n < 0) return 0;
		
		else return a[n -1] + sumar(a);
		
	}
	
	public static void main(String args[]){
		int a[] = {10,20,30,40,50 };
		
		sumar(a);
	}
	
}
