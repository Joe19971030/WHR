package queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class testArrayBlockingQueue {
	
	
	
	public static void main(String[]args){
		
		
		Queue q = new ArrayBlockingQueue(3);
		
		
		q.offer('a');
		q.offer(1);
		q.offer("asd");
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		
		o1  =  q.poll() ;
		o2  =  q.poll() ;
		o3  =  q.poll() ;
		
		
		System.out.println(o1+"  "+o2+"  "+o3);
		
		
		
	}
	
	
	
	
	
	
	

}
