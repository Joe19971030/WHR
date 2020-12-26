package task2019_6_23;
/*
 * https://blog.csdn.net/uestclr/article/details/50760563
 * 
 * 有n级台阶，一个人每次上一级或者两级，问有多少种走完n级台阶的方法。
 * 
 */

public class test1 {
	
	int[] dp=new int[100];
	
	public int function(int n){
		
		if(n==1){
			
			return 1;
		}
		
		if(n==2){
			
			return 2;
		}
		
		if(dp[n-1]==0){
			
			dp[n-1]=function(n-1);
			
		}
		
			if(dp[n-2]==0){
			
			dp[n-2]=function(n-2);
			
		}
		
		return dp[n-1]+dp[n-2];
		
		
	}
	
	
	public static void main(String[]args){
		
		test1 t = new test1();
		int n = t.function(4);
		System.out.println(n);
				
		
		
	}
	
	
	
	
	
	

}
