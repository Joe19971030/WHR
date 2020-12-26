package task2019_6_23;

/*
 * 
 * 背包问题
 */
public class test5 {

	static int W;// 背包的承重
	static int N;// 物品的数量
	static int[] v;// 物品的价值
	static int[] w;// 物品的重量
	int[][] dp;

	public int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

	public int function() {
		int m = N + 1;
		int n = W + 1;
		dp = new int[m][n];
		for (int i = 0; i < n; i++) {
			dp[0][i] = 0;
		}
		for (int j = 0; j < m; j++) {
			dp[j][0] = 0;
		}
		for (int k = 1; k < m; k++) {
			for (int l = 1; l < n; l++) {

				if (l >= w[k - 1]) {// 放得入

					dp[k][l] = max(dp[k - 1][l], dp[k - 1][l - w[k - 1]] + v[k - 1]);

				} else {

					dp[k][l] = dp[k - 1][l];

				}

			}

		}
		
		
		return dp[m-1][n-1];

	}

	public static void main(String[] args) {
		W = 12;
		N = 6;
		v = new int[] { 8, 10, 6, 3, 7, 2 };
		w = new int[] { 4, 6, 2, 2, 5, 1 };
		int n = new test5().function();
		System.out.println(n);
	}

}
