package LinkedList;

/*
 * 
 * 给出链表的头结点，判断链表中是否有循环   快慢指针法
 * 
 * 
 * 
 * 
 */
public class testHasCircle {

	public boolean hasCircleOrNot(Node headNode) {

		if (headNode == null) {
			return false;
		}

		// 创建一个快指针和一个慢指针
		Node p1 = headNode; // 慢指针
		Node p2 = headNode.next; // 快指针
		// 两个指针同时遍历链表，如果快指针跳出链表则跳出循环，如果两个指针相遇则说明有循环

		while (p2 != null && p2.next != null) {
			p1 = p1.next;
			p2 = p2.next.next;
			if (p2 == null) {

				return false;
			} else if (p1 == p2) {

				return true;
			}

		}

		return false;

	}
	
	
	public static void main(String[] args) {
		
		testHasCircle t = new testHasCircle();
		Node node1 = null;
		Node node2 = null;
		Node node3 = null;

		node3 = new Node(3, null);
		node2 = new Node(2, node3);
		node1 = new Node(1, node2);
		node3.setNext(node1);
		
		
		
		boolean result= t.hasCircleOrNot(node1);
		System.out.println(result);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
