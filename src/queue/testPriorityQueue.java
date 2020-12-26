package queue;

import java.util.PriorityQueue;
import java.util.Queue;
/*
 * 
 * 
 * 泛型无法比较，int型无法与char型比较，因为compareTo方法会出错
 * 
 * 
 */

public class testPriorityQueue {
	
	
	public static void main(String[]args){
		
		Queue q = new PriorityQueue();
		q.offer(3);
		q.offer(1);
		q.offer(2);
		q.offer(0);
		q.offer((int)'a');
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		Object o4 = new Object();
		Object o5 = new Object();
		
		o1 = q.poll() ;
		o2 = q.poll() ;
		o3 = q.poll() ;
		o4 = q.poll() ;
		o5 = q.poll() ;
		
		System.out.println(o1+"  "+o2+"  "+o3+"  "+o4+"  "+o5);
		
		
		
		
		
	}
	
	
	
	

}
