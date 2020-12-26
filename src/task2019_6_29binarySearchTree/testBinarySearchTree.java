package task2019_6_29binarySearchTree;

public class testBinarySearchTree {
	
	
	public static void main(String[]args){
		
		
		binarySearchTree<Integer> tree=new binarySearchTree<Integer>();
		tree.insert(5);
		tree.insert(4);
		tree.insert(3);
		tree.insert(6);
		tree.insert(9);
		tree.insert(8);
		
		tree.printTree();
		System.out.println(tree.findMax());
		System.out.println(tree.findMin());
		System.out.println(tree.exist(6));
		
		System.out.println(tree.exist(7));
		
		tree.remove(6);
		System.out.println(tree.exist(6));
		tree.printTree();
		System.out.println(tree.findKmax(2));
		
		
		
		
	}
	
	
	
	
	
	

}
