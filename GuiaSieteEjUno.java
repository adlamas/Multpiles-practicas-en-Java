
public class GuiaSieteEjUno {

	static ListStack LS = new ListStack();
	static ResizingArrayStack RS = new ResizingArrayStack();
	
	public static void main(String args[]){
		System.out.println(LS.isEmpty());
		LS.push(3);
		LS.push("hola ameo");
		System.out.println(LS.isEmpty());
		System.out.println(LS.peek());
		System.out.println(LS.pop());
		System.out.println(LS.peek());
		System.out.println(LS.pop()); 
		//FUNCIONA TODO DE DIEZ!!!
		
		System.out.println(RS.size());
		RS.push(2);		
		RS.push(3);		
		RS.push(0);		
		
		
		System.out.println(RS.pop());
		System.out.println(RS.size());
		System.out.println(RS.peek());
		System.out.println(RS.pop());
		System.out.println(RS.size());
		System.out.println(RS.peek());
		System.out.println(RS.pop());
		System.out.println(RS.size());
		System.out.println(RS.peek());
		
		
		
		
		
	
		
	}
	
}
