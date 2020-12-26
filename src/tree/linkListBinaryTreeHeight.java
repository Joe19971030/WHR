package tree;

/*
 * 
 * 给出链表二叉树的根结点 ，求出树的高度
 * 
 * 
 */
public class linkListBinaryTreeHeight<T> {
	
	public int getTreeHeight(linkListBinaryTreeNode<T> root){
		
		if(root==null){
			
			return 0 ;
		}
		
		int lh = getTreeHeight(root.left);
		int rh = getTreeHeight(root.right);
		
		if(lh>=rh){
			
			return lh+1;
			
		}else{
			
			return rh+1 ;
		}
		
	}
	
	
	
	

}
