
class BinaryNodeEnteros<Integer> 
 {

 private int element;
 private BinaryNodeEnteros left;
 private BinaryNodeEnteros right;

public BinaryNodeEnteros( ) 
{ this( 0, null, null ); 
}

 public BinaryNodeEnteros( int theElement, BinaryNodeEnteros lt, BinaryNodeEnteros rt)
 //paso un elemento y paso dos nodos Binarios
 { element = theElement; left = lt; right = rt; }

 public int getElement( )
 { return element; }
 public BinaryNodeEnteros getLeft( )
 { return left; }
 public BinaryNodeEnteros getRight( )
 { return right; }
 public void setElement(int x )
 { element = x; }
 public void setLeft( BinaryNodeEnteros t )
 { left = t; }
 public void setRight( BinaryNodeEnteros t )
 { right = t; }
 
 public void printPreOrder( )
 { System.out.println( element ); // Node
  if( left != null )
  left.printPreOrder( ); // Left
  if( right != null )
  right.printPreOrder( ); // Right
}
 
 public void printInOrder( )
 {
	 if( left != null ) // Left
	  left.printPostOrder( );
	  if( right != null ) // Right
	  right.printPostOrder( );
	  System.out.println( element ); // Node
	
 }
 public void printPostOrder( )
 { 
	 if( left != null ) // Left
		  left.printInOrder( );
		  System.out.println( element ); // Node
		  if( right != null )
		  right.printInOrder( ); // Right
 
 }

public int size() {
	
	
	      int size = 1;
	      if (left != null) {
	        size += left.size(); 
	      }
	      if (right != null) {
	        size += right.size();
	      }
	      return size;
	    
	}

public int height() {
	
	 int hl = -1;
     int hr = -1;
     
     //Con los if recorro el árbol completo
     if (left != null) {
       hl = left.height();
     }
     if (right != null) {
       hr = right.height();
     }
     return 1 + Math.max(hl, hr);
	
	}




}