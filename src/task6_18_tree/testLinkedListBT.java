package task6_18_tree;

public class testLinkedListBT {

	
	
	public static void main(String[]args){
		
	
		
		LinkListBT<String> tree = new LinkListBT<String>();
		
		LinkListBtNode<String> root = tree.createRoot("A");
		
		
		LinkListBtNode<String> B = tree.createNode("B", root, true);
		
		
		LinkListBtNode<String> C = tree.createNode("C", root, false);
		
		
		LinkListBtNode<String> D = tree.createNode("D", B, true);
		
		
		LinkListBtNode<String> E = tree.createNode("E", C, false);
		LinkListBtNode<String> F = tree.createNode("F", C, true);
		
		
		
		tree.middle(root);
		
		System.out.println(tree.getHeight());
		
		tree.findDistanceKfromRoot(2);
		
		tree.printAncestors(root, E);
		
		
	}
	
	
	
	
	
	
	
	
}
