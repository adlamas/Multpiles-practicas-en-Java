
public class PruebaArbolBinarioEnteros {

	public static void main(String args[]){
		
		BinaryTreeEnteros BTE = new BinaryTreeEnteros();
		BinaryNodeEnteros BN1 = new BinaryNodeEnteros();
		BinaryNodeEnteros BN2 = new BinaryNodeEnteros();
		BinaryNodeEnteros BN3 = new BinaryNodeEnteros();
		BinaryNodeEnteros BN4 = new BinaryNodeEnteros();
		BinaryNodeEnteros BN5 = new BinaryNodeEnteros();
		BinaryNodeEnteros BN6 = new BinaryNodeEnteros();
		BinaryNodeEnteros BN7 = new BinaryNodeEnteros();
		BinaryNodeEnteros BN8 = new BinaryNodeEnteros();
		BinaryNodeEnteros BN9 = new BinaryNodeEnteros();
		
		BN1.setElement(1);
		BN2.setElement(2);
		BN3.setElement(3);
		BN4.setElement(4);
		BN5.setElement(5);
		BN6.setElement(6);
		BN7.setElement(7);
		
		BTE.insertar(BN4);
		BTE.insertar(BN2);
		BTE.insertar(BN6);
		BTE.insertar(BN5);
		BTE.insertar(BN1);
		BTE.insertar(BN7);
		BTE.insertar(BN3);
		
		//	System.out.println(BTE.sumarTodos(BTE.getRoot()));
		//System.out.println(BTE.encontrarMinimoConWhile(BTE.getRoot()));
		BTE.encontrarMinimoRecursivamente(BTE.getRoot());
		System.out.println("---------------------------");
		BTE.imprimirNumerosEntre(3, 7, BTE.getRoot());
		System.out.println("---------------------------");
		System.out.println(BTE.alturaDelArbol(BTE.getRoot()));
		System.out.println("---------------------------");
		BTE.recorridoPreOrder(BTE.getRoot());
		System.out.println("---------------------------");
		BTE.recorridoPostOrder(BTE.getRoot());
		System.out.println("---------------------------");
		BTE.recorridoInOrder(BTE.getRoot());
	}
	
}
