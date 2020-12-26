package queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class testDelayQueue {
	
	
	public static void main(String[]args){
		
		BlockingQueue<Integer> q = new DelayQueue();
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		
		o1  =  q.poll() ;
		o2  =  q.poll() ;
		o3  =  q.poll() ;
		
		
		System.out.println(o1+"  "+o2+"  "+o3);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
