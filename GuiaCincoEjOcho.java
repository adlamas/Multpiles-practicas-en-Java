//Escriba un m�todo recursivo que tome dos n�meros enteros y calcule la multiplicaci�n entre ellos, usando s�lo sumas.

public class GuiaCincoEjOcho {
	
	public int calcular(int n1, int n2){
		if(n2 > 0)
		return n1 + calcular(n1, n2 - 1);
		else return 0;
	}

}
