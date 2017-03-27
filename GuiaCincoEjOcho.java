//Escriba un método recursivo que tome dos números enteros y calcule la multiplicación entre ellos, usando sólo sumas.

public class GuiaCincoEjOcho {
	
	public int calcular(int n1, int n2){
		if(n2 > 0)
		return n1 + calcular(n1, n2 - 1);
		else return 0;
	}

}
