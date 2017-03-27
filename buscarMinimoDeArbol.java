
public class buscarMinimoDeArbol {

	BinaryNode BN = new BinaryNode();
	
	public void buscar(BinaryNode Bn){
		
		BinaryNode temp = Bn;
	
		
		if(temp.getLeft() != null){
			temp =(temp.getLeft());
			buscar(temp);
			
		}else System.out.println(temp.getElement());
	}
	
}
