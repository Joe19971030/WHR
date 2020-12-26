package tree;

public class testArrayBinaryTree {

	
	public static void main(String[]args){
		
		
		arrayBinaryTree<String> tree = new arrayBinaryTree<String>(3);
		/*
		tree.addRoot("根结点");
		tree.addNode(0, "第二层左结点", true);
		tree.addNode(0, "第二层右结点", false);
		tree.addNode(1, "第三层右结点", false);
		tree.addNode(2, "第三层左结点", true);
		
		tree.addNode(3, "第四层左结点", true);
		tree.addNode(4, "第四层左结点", true);
		
		int size = tree.getNodesCount();
		System.out.println("结点个数为：  " + size);
		tree.displayTree();
		*/
		
		System.out.println(tree.isEmpty());
		tree.addRoot("根结点");
		System.out.println(tree.isEmpty());
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
