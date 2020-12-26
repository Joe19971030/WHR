package queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
/*
 * 
 * 
 * 
 * 队列不说明类型的话可以添加不同类型的对象
 * 
 */
public class testConcurrentLinkedQueue {
	
	public static void main(String[]args){
		
		Queue q = new ConcurrentLinkedQueue();
		q.offer(3);
		
		q.offer('a');

		Integer no1 = new Integer(0);
		Integer no2 = new Integer(0);
		Integer no3 = new Integer(0);
		Integer no4 = new Integer(0);
		Object o1 = new Object();
		Object o2 = new Object();
				
		o1 = q.poll() ;
		o2 = q.poll();
		//no2 = q.poll() ;
		//no3 = q.poll() ;
		//no4 = q.poll() ;
		
		System.out.println(no1+"  "+no2+"  "+no3+"  "+no4+"  "+o1+"  "+o2);
		
		
		
		
		
		
		
	}


}
