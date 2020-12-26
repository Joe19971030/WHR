package task2019_6_26;


/*
 * 
 * 3.有 2*n 个人合影，站成前后两排，人数前后排一样，每排必须从矮到高，后排每个人也必须比前排对应的那个人高，假定这些人身高没有相等的，问一共有多少种排法。

　　该问题等价于：n个自然数1~n进栈（栈无穷大），任何一个数进栈的同时可以选择出栈，比如第一个数进栈完毕，下一个动作可以选择出栈或后一个数进栈，进栈次序为1、2、3……n，问不同的出栈次序有几种？ 

　　该问题等价于：n个1和n个0组成一个2n位的2进制数，要求从左到右扫描，1的累计数不小于0的累计数，试求满足这条件的数有多少？
 * 
 * 
 */

//等价于第二个问题的解法     卡特兰数

public class question4 {
	
	public int H(int n){
		
		if(n==0||n==1){
			
			return 1;
			
		}
		
		
		int sum=0;
		for(int i=1;i<=n;i++){
			
			sum=sum+H(i-1)*H(n-i);
			
			
		
		}
		
		return sum;
		
		
	}
	
	
	public static void main(String[]args){
		
		
		int result=new question4().H(4);
		
		
		System.out.println(result);
		
		
		
	}
	

}
