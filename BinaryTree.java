

// BinaryTree class; stores a binary tree.
 //
 // CONSTRUCTION: with (a) no parameters or (b) an object to
 // be placed in the root of a one-element tree.
 //
 // *******************PUBLIC OPERATIONS**********************
 // Various tree traversals, size, height, isEmpty.
 // *******************ERRORS*********************************
 // No errors.

 public class BinaryTree
 {
 private BinaryNode root;
 private int cant;

// Constructores
 public BinaryTree( )
 	{ root = null; }
 
 public BinaryTree( Object rootItem )
	{ root = new BinaryNode( rootItem, null, null ); }

 public BinaryNode getRoot( )
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
	 
	 
     
 	
 
 
 public void insertar(BinaryNode<Integer> BN){    
     
     if (root == null)
         root = BN;
     else
     {
         BinaryNode anterior = null, reco;
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
 
  
 
 }

