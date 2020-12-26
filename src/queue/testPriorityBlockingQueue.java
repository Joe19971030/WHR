package queue;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class testPriorityBlockingQueue {
	
	public static void main(String[]args){
		
		Queue q = new PriorityBlockingQueue();
		
		q.offer('a');
		q.offer('g');
		q.offer('b');
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		
		o1  =  q.poll() ;
		o2  =  q.poll() ;
		o3  =  q.poll() ;
		
		
		System.out.println(o1+"  "+o2+"  "+o3);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
