package task2019_6_23;

/*
 * 
 * 最长公共子序列长度
 */
public class test4 {

	int[][] dp;

	// 三个数比较返回最大的数
	public int max(int a, int b, int c) {

		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;

	}

	public int function(String a, String b) {

		int alength = a.length();
		int blength = b.length();
		int m = alength + 1;
		int n = blength + 1;
		dp = new int[m][n];
		for (int i = 0; i < n; i++) { // 初始化dp数组的第一行
			dp[0][i] = 0;
		}
		for (int j = 0; j < m; j++) { // 初始化dp数组的第一列
			dp[j][0] = 0;
		}

		// 填写dp数组
		for (int k = 1; k < m; k++) {
			for (int l = 1; l < n; l++) {
				if (a.charAt(k - 1) == b.charAt(l - 1)) {

					dp[k][l] = max(dp[k][l - 1], dp[k - 1][l - 1], dp[k - 1][l]) + 1;

				} else {
					dp[k][l] = max(dp[k][l - 1], dp[k - 1][l - 1], dp[k - 1][l]);

				}

			}

		}
		return dp[m-1][n-1];

	}
	
	
	
	
	public static void main(String[]args){
		
		
		test4 t = new test4();
		
		String str1="1A2C3D4B56" ;
				String str2="B1D23CA45B6A";
		
		int n = t.function(str1, str2);
		System.out.println(n);
		
		
		
		
		
	}
	
	
	
	
	
	

}
