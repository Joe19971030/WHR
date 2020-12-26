package task2019_6_26;

/*
 * 
 * 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数。
 * 
 */
public class question1 {

	// 求一个数的所有因子：num%i==0 i是1~num/2
	public void function() {
		for (int i = 2; i < 1000; i++) {

			int sumi = 0;
			for (int j = 1; j <= i / 2; j++) {

				if (i % j == 0) {

					sumi = sumi + j;

				}

			}
			if (sumi == i) { // 是完数
				System.out.println(sumi);

			}

		}

	}
	
	
	
	public static void main(String[]args){
		
		
		
		new question1().function();
		
		
		
	}
	
	
	
	
	
	

}
