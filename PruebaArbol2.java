
public class PruebaArbol2 {
	
	public static void main(String args[]){
		
		BinaryTree BT = new BinaryTree();
		BinaryNode<Integer> BN1 = new BinaryNode<Integer>();
		BinaryNode<Integer> BN2 = new BinaryNode<Integer>();
		BinaryNode<Integer> BN3 = new BinaryNode<Integer>();
		BinaryNode<Integer> BN4 = new BinaryNode<Integer>();
		BinaryNode<Integer> BN5 = new BinaryNode<Integer>();
		BinaryNode<Integer> BN6 = new BinaryNode<Integer>();
		BinaryNode<Integer> BN7 = new BinaryNode<Integer>();
		BinaryNode<Integer> BN8 = new BinaryNode<Integer>();
		BinaryNode<Integer> BN9 = new BinaryNode<Integer>();
		
		BN1.setElement(1);
		BN2.setElement(2);
		BN3.setElement(3);
		BN4.setElement(4);
		BN5.setElement(5);
		BN6.setElement(6);
		BN7.setElement(7);
		
		
		BT.insertar(BN4);
		BT.insertar(BN2);
		BT.insertar(BN6);
		BT.insertar(BN5);
		BT.insertar(BN1);
		
		
		
		//System.out.println(BT.getRoot().getLeft().getElement());
		System.out.println(BT.getRoot().getElement());
		System.out.println(BT.cantidadNodosHoja(BT.getRoot()));
		System.out.println(BT.cantidadDeNodosNoHojas(BT.getRoot()));
		
	}

	
	
}
