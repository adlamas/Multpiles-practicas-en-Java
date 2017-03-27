
public class ProbarImplementacionPilas {

	static ResizingArrayStack R = new ResizingArrayStack();
	static ListStack L = new ListStack();
	
	public static void main(String args[]){
		
		System.out.println(R.isEmpty());
		R.push(8);
		System.out.println(R.isEmpty());
		R.push(9);
		//R.push(11);				
		//System.out.println(R.pop());
		System.out.println(R.pop());
		System.out.println(R.pop());
		System.out.println(R.isEmpty());
		System.out.println();
		System.out.println("Hasta acá Pila con array");
		System.out.println();
		System.out.println(L.isEmpty());
		L.push(3);
		System.out.println(L.isEmpty());
		L.push(4);
		System.out.println(L.peek());
		L.push(5);		
		System.out.println(L.pop());
		System.out.println(L.pop());
		System.out.println(L.pop());
		System.out.println(L.isEmpty());
		
		
		//Pareciera que ambas pilas funcionan bien.
	}
	
}
