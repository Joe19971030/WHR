package task2019_6_20;

/*
 * 
 * 
 * 字典树
 */
public class Trie {

	private class TrieNode { // 节点类

		private char c;
		private TrieNode[] sons;
		private int wordNum;
		private boolean isEnd;

		public TrieNode() {

			sons = new TrieNode[200];
			wordNum = 1;
			isEnd = false;
		}
	}

	// 声明根节点
	TrieNode root;

	// 初始化字典树
	public Trie() {

		root = new TrieNode();

	}

	// 往字典树中添加单词
	public void addWord(String word) {

		char[] newWord = word.toCharArray();
		TrieNode node = this.root;
		for (int i = 0; i < newWord.length; i++) {

			int index = newWord[i] - 'a'; // 确定每一个字母的存储位置相同
			if (node.sons[index] != null) { // 如果结点的子结点中包含所需要的字符 该节点的单词数+1

				node.sons[index].wordNum++;

			} else {

				node.sons[index] = new TrieNode();
				node.sons[index].c = newWord[i];

			}

			node = node.sons[index];
		}

		node.isEnd = true;

	}

	// 在字典树中查找是否完全匹配一个指定的字符串
	public boolean containsAWord(String word) {

		boolean flag = true;
		TrieNode node = root;
		char[] newWord = word.toCharArray();
		int length = newWord.length;
		for (int i = 0; i < length; i++) {

			int index = newWord[i] - 'a';
			if (node.sons[index] != null) {

				node = node.sons[index];

			} else {

				flag = false;
				break;

			}

		}
		return flag;

	}

	// 前序遍历字典树.
	public void preTraverse(TrieNode node) {
		if (node != null) {
			System.out.println(node.c);
			int length = node.sons.length;
			for (int i = 0; i < length; i++) {

				if (node.sons[i] != null) {

					TrieNode child = node.sons[i];
					preTraverse(child);

				}

			}

		}

	}
	
	// 计算单词前缀的数量
	public int getPreNum(String word){
		
		int num = 0 ;
		TrieNode node = root;
		char[] pre = word.toCharArray();
		int length = pre.length;
		for(int i = 0 ; i < length ; i++){
			
			int index = pre[i] - 'a' ;
			if(node.sons[index]!=null){
				
				node = node.sons[index];
				
				
			}else{
				
				return num ;
				
				
			}
			
				
		}
		
		num = node.wordNum ;
		return num ;
		
		
		
	}
	
	
	

}
