package task2019_6_25;
/*
 * 
 * 有n级台阶，一个人每次上一级或者两级，问有多少种走完n级台阶的方法
 */
public class zouTaiJie {
	
	
	static int[] dp;
	public int function(int n){
		
	
		
		if(n==1||n==2){
			return n;
			
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
		
		zouTaiJie t = new zouTaiJie();
		
		dp=new int[100];
		
		int num=t.function(4);
		
		System.out.println(num);
		
		
		
		
		
	}
	
	
	
	
	

}
