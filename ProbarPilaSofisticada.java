
public class ProbarPilaSofisticada {

	static PilaSofisticada PS = new PilaSofisticada();
	static PilaSofisticada PS2 = new PilaSofisticada();
	
	public static void main(String args[]) throws Exception{
		
		
		PS.push(2);
		PS.push(4);
		
	//	while(PS.PilaSof.isEmpty() == false){ System.out.println(PS.PilaSof.pop()); }
		while(PS.isEmpty() == false){ System.out.println(PS.pop()); }
	}
	
}
