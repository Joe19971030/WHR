package stack;

import java.util.Comparator;
import java.util.Stack;

public class stackSort implements Comparator<Integer> {
	
	public static void main(String[]args){
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(1);
		stack.push(3);
		stack.sort(new stackSort());
		Integer a = stack.pop();
		Integer b =stack.pop();
		Integer c =stack.pop();
		System.out.println(a+" "+b+" "+c);
		
		
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
				
	}

	

	
	
	

}
