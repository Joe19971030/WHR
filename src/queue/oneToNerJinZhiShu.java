package queue;

import java.util.Stack;

public class oneToNerJinZhiShu {
	
	public void answerFunction(int n){
		int num = 0 ;
		String str = "";
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 1 ; i <= n ; i++){ //1到n
			
			num = i ;
			while(num!=0){
				
				
				
				stack.push(num%2);
				num = num/2;
				
				
				
				
				
			}
			
			while(!stack.isEmpty()){
				
				str = str + stack.pop();
				
				
			}
			
			System.out.println(i+"的二进制数为："+str);
			
			str="";
			
			
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	public static void main(String[]args){
		
		oneToNerJinZhiShu t = new oneToNerJinZhiShu();
		t.answerFunction(4);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
