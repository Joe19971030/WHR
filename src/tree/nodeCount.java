package tree;

public class nodeCount<T> {

	public int countNode(linkListBinaryTreeNode<T> root){
		
		if(root==null){
			
			return 0 ;
			
		}
		
		return 1+countNode(root.left)+countNode(root.right);
		
		
		
		
	}
	
	
	
	
	
	
	
}
