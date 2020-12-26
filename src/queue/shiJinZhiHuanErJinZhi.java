package queue;

import java.util.Stack;

public class shiJinZhiHuanErJinZhi {
	
	public String answerFunction(int n){
		
		
		Stack<Integer> stack = new Stack<Integer>();
		int yuShu = 0 ;
		
		while(true){
			
			yuShu = n%2 ;
			stack.push(yuShu);
			n = n/2 ;
			if(n==0){
				
				break;
			}
			
		}
		
		
		String str = "";
		while(!stack.isEmpty()){
			
			str = str + stack.pop() ;
			
		}
		return str ;
		
		
	}
	
	
	
	public static void main(String[]args){
		
		int n = 4 ;
		shiJinZhiHuanErJinZhi t = new shiJinZhiHuanErJinZhi();
		String result = t.answerFunction(n);
		System.out.println(result);
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
