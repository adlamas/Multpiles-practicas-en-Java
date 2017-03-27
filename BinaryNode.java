 //
 // *******************PUBLIC OPERATIONS**********************
 // int size( ) --> Return size of subtree at node
 // int height( ) --> Return height of subtree at node
 // void printPostOrder( ) --> Print a postorder tree traversal
 // void printInOrder( ) --> Print an inorder tree traversal
 // void printPreOrder( ) --> Print a preorder tree traversal
 // BinaryNode duplicate( )--> Return a duplicate tree

 class BinaryNode<T> implements Comparable <BinaryNode>
 {

 private T element;
 private BinaryNode<T> left;
 private BinaryNode<T> right;

public BinaryNode( ) 
{ this( null, null, null ); 
}

 public BinaryNode( T theElement, BinaryNode<T> lt, BinaryNode<T> rt)
 //paso un elemento y paso dos nodos Binarios
 { element = theElement; left = lt; right = rt; }

 public T getElement( )
 { return element; }
 public BinaryNode<T> getLeft( )
 { return left; }
 public BinaryNode<T> getRight( )
 { return right; }
 public void setElement( T x )
 { element = x; }
 public void setLeft( BinaryNode<T> t )
 { left = t; }
 public void setRight( BinaryNode<T> t )
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

@Override
public int compareTo(BinaryNode B) {
	return 0;
	
	
}



}