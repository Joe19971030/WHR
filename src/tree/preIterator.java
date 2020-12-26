package tree;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 
 * 
 * 
 * 链表存储的二叉树的先序遍历 
 * 
 * 
 * 
 */
public class preIterator<T> {
	
	
	
	
	public List<linkListBinaryTreeNode<T>> pre(linkListBinaryTreeNode<T> root){
		
		
		List<linkListBinaryTreeNode<T>> list = new ArrayList<linkListBinaryTreeNode<T>>(); //创建存储结点的链表

		
		list.add(root);
		
		if(root.left!=null){
			
			list.addAll(pre(root.left));
			
		}
		
		if(root.right!=null){
			
			list.addAll(pre(root.right));
			
		}
		return list ;
		
		

	}
	
	
	
	
	
	
	
	
	

}
