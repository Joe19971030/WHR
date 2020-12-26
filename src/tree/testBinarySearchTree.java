package tree;

public class testBinarySearchTree {
	
	
	public static void main(String[]args){
		
		BinarySearchTree<Integer> t = new BinarySearchTree<Integer>();
		
		t.insert(8);
		t.insert(4);
		t.insert(12);
		t.insert(3);
		t.insert(7);
		t.insert(5);
		t.insert(6);
		
		t.printTree();
		System.out.println(t.getMax());
		System.out.println(t.getMin());
		System.out.println(t.contains(4));
		System.out.println(t.contains(1));
		
	}
	
	
	
	
	

}
