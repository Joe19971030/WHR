package task2019_6_26;
/*
 * 
 * 今有一个 char 数组，内容全是小写英文字母，且无重复，返回排列个数
 * 
 */
public class question2 {
	
	
	
	public int function(char[] array){
		
		int n=array.length;  //数组的长度
		//求n的阶乘
		int jieCheng=1;
		while(n>=1){
			
			jieCheng=jieCheng*n;
			n--;
			
			
		}
		return jieCheng;
		
	}
	
	public static void main(String[]args){
		char[] array=new char[]{'a','b','r','x'};
		int result=new question2().function(array);
		System.out.println(result);
		
	}

}
