package task2019_6_27;

public class Node<T> { // 二叉链表树的结点类

	T data;// 节点的数据
	Node<T> left;
	Node<T> right;

	public Node(T data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public Node(T data, Node<T> left, Node<T> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public Node() {

		this.data = null;
		this.left = null;
		this.right = null;

	}

}
