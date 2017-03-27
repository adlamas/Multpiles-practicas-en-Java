
public class BinarySearchTree {

	private BinaryNode root;
	
	BinarySearchTree(){
		root = null;
	}
	
	public void insertar (BinaryNode<Integer> BN){
		{    
		     
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
	
	public void remover(int x){
		
		BinaryNode<Integer> reco = root;
		
		
		while( reco != null){
			if(reco.getElement() < x ){
				reco = reco.getLeft();
			}else if(reco.getElement() > x){
				reco = reco.getRight();
			}else if( reco.getElement() == x ){
				
			}
		}
		
	}
	
}
