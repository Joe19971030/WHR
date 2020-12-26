package queue;
/*
 * 
 * 用队列实现栈功能
 * 
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {

	private Queue<Integer> queue;

	public MyStack() {
		queue = new LinkedList<Integer>();
	}

	public Queue<Integer> getQueue() {

		return queue;
	

	}

	public void push(int x) {

		int size = queue.size();
		queue.offer(x);
		for (int i = 0; i < size; i++) {

			queue.offer(queue.poll());

		}

	}

	public int pop() {
		return queue.poll();
	}

	public int top() {
		return queue.peek();
	}

	public boolean empty() {

		return queue.isEmpty();

	}
	
	
	public static void main(String[]args){
		
		
		MyStack mystack = new MyStack();
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		int first = mystack.pop();
		int second = mystack.pop();
		int third = mystack.top();
		
		System.out.println(first+"  "+second+"  "+third);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
