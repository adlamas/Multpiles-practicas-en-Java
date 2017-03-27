
public class GuiaCincoEjDos {
	
	public static void main(String args[]){
		System.out.println(sumar(12));
		
	}
	
	static public int sumar(int n){
		
		if(n == 0) return 0;
		else return n+sumar(n-1);
	}
	
	//El return de sumar() es, cuando n = 0, 0. 
}
