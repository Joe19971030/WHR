package queue;
/*
 * 
 * 测试LinkedList队列
 * 
 */
import java.util.LinkedList;
import java.util.Queue;

public class testQueue {
	
	
	public static void main(String[]args){
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		boolean flag1,flag2,flag3 ;
		flag1 = queue.offer(1);
		flag2 = queue.offer(2);
		flag3 = queue.offer(3);
		int no1 = 0 ;
		Integer no2 = new Integer(0);
		no1 = queue.poll(); 
		no2 = queue.poll();
		System.out.println(flag1+"  "+flag2+"  "+flag3+"  "+no1+"  "+no2);
		
		
		
		
	}
	
	
	
	
	

}
