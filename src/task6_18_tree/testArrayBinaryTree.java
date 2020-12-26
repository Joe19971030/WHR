package task6_18_tree;

public class testArrayBinaryTree {

	public static void main(String[]args){
		
		
		binaryTree<String> BT = new binaryTree<String>(3);
		
		BT.createRoot("A");
		
		BT.createNode("B", 0, true);
		BT.createNode("C", 0, false);
		
		BT.createNode("D", 1, false);
		
		BT.createNode("E", 2, false);
		
		BT.displayTree();
		
	}
	
	
	
	
	
	
	
	
}
