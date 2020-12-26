package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 对队列的前k个元素进行倒序
 * 
 * 
 * 
 */
public class sortQueue {

	public void sortMyQueue(Queue<Integer> queue, int k) {

		int size = queue.size();// 原队列的大小
		int left = size - k; // 队列后面的长度
		Stack<Integer> stack = new Stack<Integer>(); // 定义一个栈
		// 压栈
		for (int i = 0; i < k; i++) {
			stack.push(queue.poll());
		}
		// 弹栈
		for (int j = 0; j < k; j++) {

			queue.offer(stack.pop());

		}

		// 把原来队列后面的元素弹出并且加入到队列的后面
		for (int l = 0; l < left; l++) {

			queue.offer(queue.poll());

		}

	}
	
	
	public static void main(String[]args){
		
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(4);
		queue.offer(3);
		queue.offer(2);
		queue.offer(1);
		sortQueue sq = new sortQueue();
		sq.sortMyQueue(queue, 3);
		System.out.println(queue.poll()+"  "+queue.poll()+"  "+queue.poll()+"  "+queue.poll());
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
