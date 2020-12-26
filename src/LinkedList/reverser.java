package LinkedList;

/*
 * 
 * 把一个单向链表逆序，返回头结点(遍历的方法)
 * 
 * 
 */
public class reverser {

	public Node reverse(Node node) { // 参数为原链表的头结点

		Node pre = null; // 表示上一个结点
		Node next = null; // 表示下一个结点
		while (node != null) {

			next = node.next; // 记录该结点的下一个结点
			node.next = pre;
			pre = node;
			node = next;

		}

		return pre;

	}

	public static void main(String[] args) {
		reverser t = new reverser();
		Node node1 = null;
		Node node2 = null;
		Node node3 = null;

		node3 = new Node(3, null);
		node2 = new Node(2, node3);
		node1 = new Node(1, node2);

		Node first = t.reverse(node1);
		Node second = first.next;
		Node third = second.next;
		System.out.println(first.value);
		System.out.println(second.value);
		System.out.println(third.value);
		System.out.println(node1.value);
		System.out.println(node2.value);
		System.out.println(node3.value);

	}

}
