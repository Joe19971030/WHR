package task2019_6_23;

public class test6 {

	public int min(int a, int b, int c) {

		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;

	}

	public int function(String str1, String str2, int ic, int dc, int rc) {

		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		int length1 = s1.length;
		int length2 = s2.length;
		int m = length1 + 1;
		int n = length2 + 1;

		int[][] dp = new int[m][n];
		for (int i = 0; i < n; i++) {
			dp[0][i] = i * ic;
		}
		for (int j = 0; j < m; j++) {
			dp[j][0] = j * dc;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {

				if (s1[i - 1] == s2[j - 1]) {

					dp[i][j] = min(dp[i][j - 1] + ic, dp[i - 1][j] + dc, dp[i - 1][j - 1]);

				} else {

					dp[i][j] = min(dp[i][j - 1] + ic, dp[i - 1][j] + dc, dp[i - 1][j - 1] + rc);

				}

			}

		}

		return dp[m - 1][n - 1];

	}

	
	
	public static void main(String[] args) {
		
		
		test6 t = new test6();
		int n = t.function("abc", "adc", 5, 3, 2);
		
		System.out.println(n);
		
		
		
	}
	
	
	
	
	
	
	
}
