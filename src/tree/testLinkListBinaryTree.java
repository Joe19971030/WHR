package tree;

import java.util.Iterator;
import java.util.List;

/*
 * 
 * 测试基于链表的二叉树
 * 
 * 
 */


public class testLinkListBinaryTree {
	
	
	
	public static void main(String[]args){
		
		linkListBinaryTree<String> tree  = new linkListBinaryTree<String>();  //创建树
		
		tree.createRoot("根结点");
		
		linkListBinaryTreeNode<String> root = tree.getRoot();  //获得该树的根结点
		
		linkListBinaryTreeNode<String> B = tree.addNode("第二层左子树", root, true);
		linkListBinaryTreeNode<String>  C =  tree.addNode("第二层右子树", root, false);
		linkListBinaryTreeNode<String>  D = tree.addNode("第三层左子树", B , true);
		linkListBinaryTreeNode<String>  E  = tree.addNode("第三层右子树", C, false);
		
		
		linkListBinaryTreeHeight<String> h =  new linkListBinaryTreeHeight<String>();
		int height = h.getTreeHeight(root);
		
		System.out.println(height);
		
		
		
		
		
		
		
		
		/*
		nodeCount<String> nc  = new nodeCount<String>();
		int nodecount = nc.countNode(root);
		
		System.out.println(nodecount);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		preIterator<String> I = new preIterator<String>();
		
		List<linkListBinaryTreeNode<String>> list = I.pre(root);
		
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			
			linkListBinaryTreeNode<String> node = (linkListBinaryTreeNode<String>) iterator.next();
			
			System.out.println(node.data);
			
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		System.out.println(root.data);
		System.out.println(root.left.data);
		System.out.println(root.right.data);
		System.out.println(B.left.data);
		if(B.right!=null){
		System.out.println(B.right.data);
		}else{
			
			System.out.println("null");
		}
		
		if(C.left!=null){
		System.out.println(C.left.data);
		}else{
			
			System.out.println("null");
		}
		System.out.println(C.right.data);
		
		*/
		
	}
	
	
	
	
	
	
	
	

}
