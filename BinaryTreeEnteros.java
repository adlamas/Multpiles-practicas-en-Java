


public class BinaryTreeEnteros {

	private BinaryNodeEnteros root;
	 

	// Constructores
	 public BinaryTreeEnteros( )
	 	{ root = null; }
	 
	 public BinaryTreeEnteros( int rootItem )
		{ root = new BinaryNodeEnteros( rootItem, null, null ); }

	 public BinaryNodeEnteros getRoot( )
	 	{ return root; }
	 
	 public int size( )
	 	{ return root.size(); }
	 
	 public int height( )
	 	{ return root.height(); }

	 public void printPreOrder( )
	 	{ if( root != null ) root.printPreOrder( ); }
	 	
	 public void printInOrder( )
	 	{ if( root != null ) root.printInOrder( ); }
	 
	 public void printPostOrder( )
	 	{ if( root != null ) root.printPostOrder( ); }
	 
	 
	 public boolean isEmpty( )
	 	{ return root == null; }
	 
	 public int encontrarMinimoConWhile(BinaryNodeEnteros BN){ //
		 
		 BinaryNodeEnteros temp = BN;
		 
		while(temp.getLeft() != null){
			temp = temp.getLeft();
		 }
		 
		 return temp.getElement();
	 } 
	 
	 public void encontrarMinimoRecursivamente(BinaryNodeEnteros BN){ 		
		 
		if(BN.getLeft() != null){			
			encontrarMinimoRecursivamente(BN.getLeft());
		 }
		 
		else{ System.out.println(BN.getElement()); }
	 }

	 public void imprimirNumerosEntre(int a, int b, BinaryNodeEnteros BN){
		 
		 if(BN != null){
			 if(BN.getElement() > a && BN.getElement() < b){
				 System.out.println(BN.getElement());
			 }
			 
			 imprimirNumerosEntre(a, b, BN.getLeft());
			 imprimirNumerosEntre(a,b,BN.getRight());
			 
		 }
	 }
	 
	 public int alturaDelArbol(BinaryNodeEnteros BN){
		 
		 int izq = 0;
		 int der = 0;
		 
		 if(BN != null){
			 izq = alturaDelArbol(BN.getLeft());
			 der = alturaDelArbol(BN.getRight());
		 }
		 
		 if(BN == null){
			 return 0;
		 }
		 
		 return 1 + Math.max(izq, der);
	 }
		
		 
		 public int cantidadNodosHoja(BinaryNode reco) {
			 
			 int izq = 0;
			 int der = 0;
			 int centro = 0;
			 
			 if(reco != null){
				 
				 if(reco.getLeft() == null && reco.getRight() == null){
					 centro++;
				 }
				 
				 izq = cantidadNodosHoja(reco.getLeft());
				 der = cantidadNodosHoja(reco.getRight());
				 
			 }
			 
			 return (centro + izq + der);
			 
			 //Esta es OTRA FORMA de hacerlo
		       /* if (reco!=null) {
		            if (reco.getLeft()==null && reco.getRight()==null)
		                cant++;
		            cantidadNodosHoja(reco.getLeft());
		            cantidadNodosHoja(reco.getRight());
		        }
		    }
		 
		 public int cantidadNodosHoja() {
		        cant=0;
		        cantidadNodosHoja(root);
		        return cant;*/
		    }
		 
		
		 
		 public int cantidadDeNodosNoHojas(BinaryNode BN){
			int Der = 0;
			int Izq = 0;
			int raiz = 0;
			
			 if(BN != null){
				 if(BN.getLeft() != null || BN.getRight() != null){
					 raiz++; 
				 }
				 
				Izq = cantidadDeNodosNoHojas(BN.getLeft());
				Der = cantidadDeNodosNoHojas(BN.getRight());
				 
			 }
			 
			 return (raiz + Der + Izq);
			 
		 }
		 
		 public int sumarTodos(BinaryNodeEnteros BN){
			 	int Der = 0;
				int Izq = 0;
				int centro = 0;
				
				if(BN != null){
					
					centro =  BN.getElement();
					Izq = sumarTodos(BN.getLeft());
					Der = sumarTodos(BN.getRight());
				}
				
			 return (centro + Izq + Der);
		 }
	     
	 	
	 
	 
	 public void insertar(BinaryNodeEnteros BN){    
	     
	     if (root == null)
	         root = BN;
	     else
	     {
	         BinaryNodeEnteros anterior = null;
			BinaryNodeEnteros reco;
	         reco = root;
	         while (reco != null)
	         {
	             anterior = reco;
	             if (BN.getElement() < (Integer)root.getElement())
	                 reco = reco.getLeft();
	             else
	            	 reco = reco.getRight();
	         }
	         if (BN.getElement() <(Integer) anterior.getElement())
	             anterior.setLeft(BN);
	         else
	        	 anterior.setRight(BN);
	     }
	 }
	 
	 public void recorridoPreOrder(BinaryNodeEnteros BN){
		 
		 if(BN != null){
			 
			 System.out.println(BN.getElement());
			 recorridoPreOrder(BN.getLeft());
			 recorridoPreOrder(BN.getRight());
			 
		 }		 
	 }
	 
	 public void recorridoPostOrder(BinaryNodeEnteros BN){
		 if(BN != null){
			 recorridoPostOrder(BN.getLeft());
			 recorridoPostOrder(BN.getRight());
			 System.out.println(BN.getElement());
		 }
	 }
	 
	 public void recorridoInOrder(BinaryNodeEnteros N){
			
			
			if(N != null)
			{
				recorridoInOrder(N.getLeft());
				System.out.println(N.getElement());		
				recorridoInOrder(N.getRight());
			}
			
		}
	 
	 
}
