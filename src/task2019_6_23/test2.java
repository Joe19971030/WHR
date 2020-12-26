package task2019_6_23;

public class test2 {
	
	
	
	
	int[][] array=new int[][]{{1,3,5,9},{8,1,3,4},{5,0,6,1},{8,8,4,0}}; //原矩阵
	
	int[][] dp=new int[4][4]; //dp矩阵
	
	
	public int min(int a,int b){
		
		if(a<=b){
			
			return a;
		}else{
			
			return b;
		}
		
	}
	
	public int function(){
		
		dp[0][0]=array[0][0];
		
	for(int i=1;i<4;i++){  //初始化dp数组的第一行
		
		dp[0][i]=dp[0][i-1]+array[0][i];
		
	}
	
	for(int j=1;j<4;j++){ //初始化dp数组的第一列
		
		dp[j][0]=dp[j-1][0]+array[j][0];
		
	}
	
	//填充dp数组的其他位置
	for(int i=1;i<4;i++){ //行
		for(int j=1;j<4;j++){ //列
			
			dp[i][j]=min(dp[i-1][j],dp[i][j-1])+array[i][j];
			
			
			
		}
		
		
		
	}
	
	return dp[3][3];
	
	
	
	
	}
	
	
	public static void main(String[]args){
		
		test2 t = new test2();
		int n = t.function();
		System.out.println(n);
		
		
		
		
	}
	
	

}
