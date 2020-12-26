package task2019_6_20;

public class testTrie {
	
	
	public static void main(String[]args){
		
		Trie t = new Trie();
		
		
		t.addWord("computer");
		
		t.addWord("hello");
		t.addWord("hello");
		
		boolean contains = t.containsAWord("com");
		boolean contains2 = t.containsAWord("comm");
		
		int preCount = t.getPreNum("he");
		
		System.out.println(contains+"****");
		System.out.println(contains2+"****");
		System.out.println(preCount+"****");
		
		
		t.preTraverse(t.root);
		
		
		
	}
	
	
	
	
	
	
	

}
