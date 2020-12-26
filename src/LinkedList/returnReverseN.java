package LinkedList;

/*
 * 给出链表的头结点  返回链表倒数第N个节点
 * 
 * 
 * 
 * 
 */
public class returnReverseN {
	
	
	public Node answerFunction(Node headNode,int N){
		
		//先计算该链表一共有多少个结点
		int nodeCount = 0 ;
		Node testNode = headNode ;
			
		if(testNode!=null){
			nodeCount++ ;
			
		while(testNode.next!=null){
			nodeCount++ ;
			testNode = testNode.next ;
			
			
		}
		
		
		}
		
		//获得倒数第N个结点的顺数顺序
		int nodeNo = nodeCount - N + 1 ;
		
		//获得链表顺数第nodeNo个结点
		Node result = null ;
		Node toolNode = headNode ;
		for(int i = 0 ; i < nodeNo - 1 ; i++){
			
			toolNode = toolNode.next ;
			
		}
		result = toolNode ;
		
		return result ;
		
	}
	
	
public static void main(String[] args) {
		
	returnReverseN t = new returnReverseN();
		Node node1 = null;
		Node node2 = null;
		Node node3 = null;
		
		Node node4 = null;
		

		node3 = new Node(3, null);
		node2 = new Node(2, node3);
		node1 = new Node(1, node2);
		node4 = new Node(2,node1);
		
		
		Node result = t.answerFunction(node4, 4);
		
		System.out.println(result.value);
	
		System.out.println(node1.value);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
