package queue;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class testSynchronousQueue {
	
	
	public static void main(String[]args){
		
		
		BlockingQueue<Character> q = new SynchronousQueue<Character>();
		
		
		q.offer('a');
		//q.offer('g');
		//q.offer('b');
		
		Object o1 = new Object();
		//Object o2 = new Object();
		//Object o3 = new Object();
		
		o1  =  q.poll() ;
		//o2  =  q.poll() ;
		//o3  =  q.poll() ;
		
		System.out.println(o1);
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
