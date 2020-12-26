package tree;

import java.util.TreeMap;

/*
 * 
 * 
 * 字典树
 */
public class Trie {

	private class Node { // 结点类

		TreeMap<Character, Node> next; // 指向下一个表示特定字符的结点
		boolean isWord; // 判断该结点是否是作为一个单词的结尾

		public Node(boolean isWord) {

			this.isWord = isWord;
			next = new TreeMap<Character, Node>();

		}

		public Node() {

			this(false);

		}

	}

	// 树的根
	private Node root;
	// 单词的数量
	private int size;

	// 获得Trie中存储的单词数量
	public int getSize() {
		return size;
	}

	// 字典树的构造函数
	public Trie() {
		root = new Node();
		size = 0;
	}

	// 向Trie中添加一个新的单词word
	public void add(String word) {

		Node curr = root;
		for (int i = 0; i < word.length(); i++) {

			char c = word.charAt(i);

			if (curr.next.get(c) == null) { // 如果没有表示该字符的结点

				curr.next.put(c, new Node());

			} else { // 如果有表示该字符的结点

			}

			curr = curr.next.get(c);

		}
		
		
		if(!curr.isWord){
			
			curr.isWord = true ;
			size++;
			
		}
		
		
		

	}

}
