
public class PruebaDeReferencias {

	
	
	public static void main(String args[]){
	
		String n1 = "Ref 1";
		String n2 = n1;
		System.out.println(n2);
		n2 = "Ref 2";
		System.out.println(n2);
		System.out.println(n1);
	}
	
}
