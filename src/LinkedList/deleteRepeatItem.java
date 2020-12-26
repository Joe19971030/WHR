package LinkedList;

import java.util.HashSet;
import java.util.Set;

/*
 * 删除链表中的重复项      
 * 
 * 
 * 
 */
public class deleteRepeatItem {

	public void deleteRepeated(Node headNode) {

		Node pre = null;
		Node current = headNode;
		Set<Integer> set = new HashSet<Integer>();

		while (current != null) {

			if (set.contains(current.value)) { // 如果集合中已经有当前节点的数值
												// 说明当前节点与前面的某个节点已经重复

				pre.next = current.next;
				current = current.next;

			} else {

				set.add(current.value);
				pre = current;
				current = current.next;

			}

		}

	}

	public static void main(String[] args) {

		// 构建一个有重复项的链表
		int[] array = { 1, 2, 3, 5, 6, 9, 3, 2, 1, 4 }; // 链表的项
		Node next = null;
		Node pre = null;
		Node headNode = new Node(array[0], null); // 头结点
		pre = headNode;
		for (int i = 1; i < array.length; i++) {

			Node node = new Node(array[i], null);
			pre.next = node;
			pre = node;

		}

		deleteRepeatItem t = new deleteRepeatItem();
		t.deleteRepeated(headNode);
		while (headNode != null) {

			System.out.println(headNode.value);

			headNode = headNode.next;
		}

	}

}
