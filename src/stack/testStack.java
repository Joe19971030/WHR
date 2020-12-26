package stack;

import java.util.Iterator;
import java.util.Stack;

public class testStack {
	
	public static void main(String[]args){
		
		
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Iterator iterator = stack.iterator();
		while(iterator.hasNext()){
			
			int element = (int)iterator.next();
			System.out.println(element);
			
		}
		System.out.println(stack.peek());
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
