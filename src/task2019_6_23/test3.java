package task2019_6_23;
/*
 * 
 * 给定数组arr，返回arr的最长递增子序列的长度，
 * 比如arr=[2,1,5,3,6,4,8,9,7]，最长递增子序列为[1,3,4,8,9]返回其长度为5.
 * 
 */
public class test3 {

	int[] dp;
	public int function(int[] array){
		
		int length=array.length;
		dp=new int[length]; 
		dp[0]=1;
		for(int i=1;i<length;i++){ //确定第i位的最长递增子序列
			for(int j=0;j<i;j++){
				
				if(array[i]>array[j]){
					
					if(dp[j]+1>dp[i]){
					dp[i]=dp[j]+1;
					
					}
				}	
			}
			if(dp[i]==0){
				dp[i]=1;
			}	
		}
		
		//找出dp数组的最大值
		int max=dp[0];
		for(int i=1;i<length;i++){
			if(dp[i]>max){
				
				max=dp[i];
			}	
		}
		
		return max;
	}
	
	
	public static void main(String[]args){
		
		int[] array={2,1,5,3,6,4,8,1,7};
		int n = new test3().function(array);
		System.out.println(n);
		
	}
	
	
	
}
