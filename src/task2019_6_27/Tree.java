package task2019_6_27;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 二叉链表树            题目网址https://baijiahao.baidu.com/s?id=1632507909308553950&wfr=spider&for=pc
 */
public class Tree<T extends Comparable<T>> {

	int NodeCount;
	Node<T> root;
	int NodeCount2;

	public Tree(T data) { // 构造函数创建根结点

		root = new Node<T>(data);
		NodeCount++;

	}

	// 返回根节点
	public Node<T> getRoot() {
		return root;

	}

	// 给树添加节点
	public Node<T> addNode(Node<T> parent, boolean left, T data) {
		if (left == true) {// 添加到左子树
			if (parent.left != null) {
				throw new RuntimeException("父母结点的左子树已经存在！");

			} else {
				Node<T> newNode = new Node<T>(data);
				parent.left = newNode;
				NodeCount++;
				return newNode;
			}
		} else if (left == false) {

			if (parent.right != null) {
				throw new RuntimeException("父母结点的右子树已经存在！");

			} else {
				Node<T> newNode = new Node<T>(data);
				parent.right = newNode;
				NodeCount++;
				return newNode;
			}

		}

		return null;

	}

	// 显示这棵树 中序遍历
	public void display() {

		display(root);

	}

	private void display(Node<T> node) {

		if (node.left != null) {
			display(node.left);
		}
		System.out.println(node.data);
		if (node.right != null) {
			display(node.right);
		}

	}

	// 先序遍历
	public void preDisplay() {
		preDisplay(root);

	}

	private void preDisplay(Node<T> node) {
		System.out.println(node.data);
		if (node.left != null) {
			preDisplay(node.left);

		}
		if (node.right != null) {

			preDisplay(node.right);
		}

	}

	// 后序遍历
	public void AfterDisplay() {
		AfterDisplay(root);

	}

	private void AfterDisplay(Node<T> node) {

		if (node.left != null) {
			AfterDisplay(node.left);

		}
		if (node.right != null) {
			AfterDisplay(node.right);
		}
		System.out.println(node.data);

	}

	// 层序遍历(非递归)
	public void cengDisplay() {

		cengDisplay(root);
	}

	private void cengDisplay(Node<T> node) {

		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.offer(node);

		while (!queue.isEmpty()) {
			Node<T> queueHead = queue.peek();
			if (queueHead.left != null) {

				queue.offer(queueHead.left);
			}
			if (queueHead.right != null) {
				queue.offer(queueHead.right);

			}
			Node<T> display = queue.poll();
			System.out.print(display.data + "--->");
		}

	}

	// 层序遍历（递归）
	private void cengXuBianLi(Node<T> node, int k) {

		if (k == 1) {
			if (node != null) {
				System.out.print(node.data + "  ");
				return;
			}
		}

		if (node.left != null) {
			cengXuBianLi(node.left, k - 1);
		}
		if (node.right != null) {
			cengXuBianLi(node.right, k - 1);
		}
	}

	public void cengXuBianLiQiDong() {
		// 获得这棵树的高度（层数）
		int k = getHeight();
		for (int i = 1; i <= k; i++) {
			cengXuBianLi(root, i);
		}
	}

	// 求二叉树的高度
	public int getHeight() {

		return getHeight(root);

	}

	private int getHeight(Node<T> node) {

		if (node == null) {
			return 0;
		}
		int LH = getHeight(node.left);
		int RH = getHeight(node.right);
		if (LH >= RH) {
			return LH + 1;
		} else {
			return RH + 1;
		}

	}

	LinkedList<Node<T>> list = new LinkedList<Node<T>>(); // 用来存放与根节点距离为k的节点
	// 查找与根节点距离k的节点

	public LinkedList<Node<T>> findKDisFromRoot(int k) {

		findKDisFromRoot(root, k);
		return list;

	}

	private void findKDisFromRoot(Node<T> node, int k) {

		if (k == 0 && node != null) {
			list.add(node);
			return;
		}
		if (node != null) {
			findKDisFromRoot(node.left, k - 1);
			findKDisFromRoot(node.right, k - 1);
		}

	}

	// 在二叉树中查找给定节点的祖先节点 思路：如果一个节点的左或右子树包含给定节点，则说明该节点是给定节点的祖先节点
	public void printAncestor(Node<T> node) {

		printAncestor(node, root);

	}

	private boolean printAncestor(Node<T> node, Node<T> ansNode) {

		if (ansNode == null) {
			return false;
		}

		if (node.data == ansNode.data) {
			return true;
		}

		if (printAncestor(node, ansNode.left) || printAncestor(node, ansNode.right)) {

			System.out.print(ansNode.data + "  ");
			return true;

		}
		return false;

	}

	// 求二叉树节点的个数 我的思路：使用遍历
	public int getNodeCountByBianLi() {
		getNodeCountByBianLi(root);
		return NodeCount2;

	}

	private void getNodeCountByBianLi(Node<T> node) {

		if (node.left != null) {

			getNodeCountByBianLi(node.left);
		}
		NodeCount2++;
		if (node.right != null) {

			getNodeCountByBianLi(node.right);
		}

	}

	// 求二叉树第k层的节点个数
	int KcengNodeCount;

	public int getKcengNodeCount(int k) {

		getKcengNodeCount(k, root);
		return KcengNodeCount;
	}

	public void getKcengNodeCount(int k, Node<T> node) {
		if (node != null) {
			if (k == 1) {
				KcengNodeCount++;
				return;
			}
		}

		if (node != null) {

			getKcengNodeCount(k - 1, node.left);
			getKcengNodeCount(k - 1, node.right);
		}
	}

	// 求二叉树中叶子节点的个数
	int leafCount;

	public int getLeafCount() {

		getLeafCount(root);
		return leafCount;
	}

	private void getLeafCount(Node<T> node) {
		Queue<Node<T>> queue = new LinkedList<Node<T>>();
		queue.offer(node);// 头结点入队

		while (!queue.isEmpty()) {
			Node<T> queueHead = queue.peek();
			if (queueHead.left != null) {
				queue.offer(queueHead.left);
			}
			if (queueHead.right != null) {
				queue.offer(queueHead.right);
			}
			if (queueHead.left == null && queueHead.right == null) {
				leafCount++;
			}
			queue.poll();

		}

	}

	// 判断两棵二叉树是否相同的树
	public boolean isTheSame(Node<T> node1, Node<T> node2) {

		if (node1 == null && node2 == null) { // 如果比较的两个结点都为空，则相同

			return true;
		}
		if (node1 == null || node2 == null) {// 如果比较的两个结点其中一个为空，另外一个不为空，则不同

			return false;

		}
		if (node1.data.equals(node2.data)) {// 如果两个结点都不为空，判断数据是否相同

			return isTheSame(node1.left, node2.left) && isTheSame(node1.right, node2.right);

		} else {
			return false;
		}

	}

	// 求二叉树的镜像
	public void jingXiang(Node<T> node) {

		if (node != null) {
			Node<T> left = node.left;
			Node<T> right = node.right;
			node.left = right;
			node.right = left;
			jingXiang(left);
			jingXiang(right);

		} else {

			return;

		}
	}

	// 在二叉树中查找给定节点的祖先节点 思路：如果一个节点的左或右子树包含给定节点，则说明该节点是给定节点的祖先节点
	public void findAnc(Node<T> node) {

		findAnc(node, root);

	}

	private boolean findAnc(Node<T> node, Node<T> anc) {

		if (anc == null) {

			return false;
		}
		if (anc.data.equals(node.data)) {
			return true;
		}

		if (findAnc(node, anc.left) || findAnc(node, anc.right)) {

			System.out.print(anc.data + "  ");
			return true;

		}
		return false;
	}

	// 求从根节点到一个节点的路径
	Stack<Node<T>> path;

	public Stack<Node<T>> path(Node<T> node) {

		path = new Stack<Node<T>>();
		path(root, node);
		return path;
		/*
		 * while(!path.isEmpty()){ System.out.print(path.pop().data+"--->");
		 * 
		 * } System.out.println(node.data);
		 */
	}

	private boolean path(Node<T> node, Node<T> search) {

		if (node == null) {
			return false;
		}
		if (node.data.equals(search.data)) {
			return true;
		}
		if (path(node.left, search) || path(node.right, search)) {

			path.push(node);
			return true;
		}
		return false;

	}

	// 求二叉树中两个节点的最低公共祖先节点 第一步先求从根结点到两个节点的路径
	public Node<T> getTheSameAnc(Node<T> node1, Node<T> node2) {

		Stack<Node<T>> path1 = new Stack<Node<T>>();
		Stack<Node<T>> path2 = new Stack<Node<T>>();

		path1 = path(node1);
		path2 = path(node2);

		LinkedList<Node<T>> list1 = new LinkedList<Node<T>>();
		LinkedList<Node<T>> list2 = new LinkedList<Node<T>>();

		while (!path1.isEmpty()) {

			list1.add(path1.pop());
		}
		while (!path2.isEmpty()) {

			list2.add(path2.pop());
		}

		// 以下获得list1和list2的最后一个公共元素
		int size1 = list1.size();
		int size2 = list2.size();
		if (size1 <= size2) {

			for (int i = size1 - 1; i >= 0; i--) {
				for (int j = size2 - 1; j >= 0; j--) {

					if (list1.get(i).data.equals(list2.get(j).data)) {

						return list1.get(i);

					}

				}

			}

		}else if(  size2<size1  ){
			
			for (int i = size2 - 1; i >= 0; i--) {
				for (int j = size1 - 1; j >= 0; j--) {

					if (list2.get(i).data.equals(list1.get(j).data)) {

						return list2.get(i);

					}

				}

			}
		
		}
		return null;

	}
	
	//判断是否为二分查找树BST(二分搜索树)
	public boolean isBSTorNot(){
		
		return isBSTorNot(root);
	
	}
	
	private boolean isBSTorNot(Node<T> node){
		
		
		if(node==null){
			return true;
		}
		
		
		
			Node<T> left=node.left;
			Node<T> right=node.right;
			if(left!=null){
				if(left.data.compareTo(node.data)>0){//如果左子树的数据大于中心节点的数据
					
					return false;
					
				}	
			}
			if(right!=null){
				
				if(right.data.compareTo(node.data)<0){//如果右子树的数据小于中心节点的数据

					return false;
		
				}
				
			}
			
			//如果这个节点的左右子树符合要求  递归检查该结点的左右子树是否符合要求
			return isBSTorNot(node.left)&&isBSTorNot(node.right);
			
		
	}
	
	
	
	// 填充每个节点的下一个右侧节点指针(完美二叉树)
	
	
	
	
	
	
	
	
	

	// 获得树中节点的数目
	public int getNodeCount() {

		return this.NodeCount;
	}

}
