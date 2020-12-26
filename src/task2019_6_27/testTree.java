package task2019_6_27;

import java.util.Iterator;
import java.util.LinkedList;

public class testTree {
	
	public static void main(String[]args){
		
		Tree<Character> tree=new Tree<Character>('A');
		Node<Character> root=tree.getRoot();
		Node<Character> B=tree.addNode(root, true, 'B');
		Node<Character> C=tree.addNode(root, false, 'C');
		Node<Character> D=tree.addNode(B, true, 'D');
		Node<Character> E=tree.addNode(B, false, 'E');
		
		Node<Character> anc=tree.getTheSameAnc(root, C);
		if(anc==null){
			System.out.println("null");
		}else{
		System.out.println("最低公共祖先节点为："+anc.data);
		}
		
		System.out.println(tree.isBSTorNot());
		
		Tree<Character> tree3=new Tree<Character>('B');
		Node<Character> root3=tree3.getRoot();
		Node<Character> A3=tree.addNode(root3, true, 'A');
		Node<Character> C3=tree.addNode(root3, false, 'C');
		
		
		System.out.println(tree3.isBSTorNot());
		
		
		
		
		Tree<Character> tree2=new Tree<Character>('A');
		Node<Character> root2=tree2.getRoot();
		Node<Character> B2=tree.addNode(root2, true, 'B');
		Node<Character> C2=tree.addNode(root2, false, 'C');
		Node<Character> D2=tree.addNode(B2, true, 'D');
		Node<Character> E2=tree.addNode(B2, false, 'F');
		
		
		
		
		
		tree.AfterDisplay();
		System.out.println("这棵树的高度为："+tree.getHeight());
		LinkedList<Node<Character>> list=new LinkedList<Node<Character>>(); //用来存放与根节点距离为k的节点
		list=tree.findKDisFromRoot(0);
		Iterator<Node<Character>> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.print(iterator.next().data+"--->");
		}
		System.out.println();
		tree.printAncestor(D);
		System.out.println();
		tree.cengXuBianLiQiDong();
		System.out.println();
		System.out.println(tree.getNodeCountByBianLi());
		System.out.println(tree.getKcengNodeCount(1));
		System.out.println(tree.getLeafCount());
		System.out.println(tree.isTheSame(root, root2));
		
	}
	
	
	
	
	
	
	
	
	

}
