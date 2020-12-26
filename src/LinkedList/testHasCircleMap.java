package LinkedList;

import java.util.HashMap;

/*
 * 测试一个链表有没有循环   使用的是记录足迹法
 * 
 * 
 */

public class testHasCircleMap {

	public boolean testCircle(Node headNode) {

		HashMap<Node, Integer> map = new HashMap<Node, Integer>();
		if (headNode == null || headNode.next == null) {

			return false;

		}
		int index = 0;
		while (headNode != null) {

			if (map.containsKey(headNode)) {

				return true;
			} else {

				map.put(headNode, index);
				index++;
				headNode = headNode.next;

			}

		}
		return false;

	}
	
	
	
public static void main(String[] args) {
		
		testHasCircleMap t = new testHasCircleMap();
		Node node1 = null;
		Node node2 = null;
		Node node3 = null;
		
		Node node4 = null;
		

		node3 = new Node(3, null);
		node2 = new Node(2, node3);
		node1 = new Node(1, node2);
		node4 = new Node(2,node3);
		
		
		
		boolean result= t.testCircle(node1);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
