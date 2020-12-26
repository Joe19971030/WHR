package task2019_6_26;

public class test {

	
	
public String tenToBinary(int num){  //十进制整数转化为二进制字符串
		
		String str="";
		while(num!=0){
			
			
			str=str+num%2;
			num=num/2;		
	
		}
		
		String result="";
		int length=str.length();
		int j=0;
		char[] tmp=new char[length];
		for(int i=length-1;i>=0;i--){
			tmp[j]=str.charAt(i);
			j++;
		}
		
		for(int i=0;i<length;i++){
			result=result+tmp[i];
		}
		
		
		
		return result;
		
	}
	
	public static void main(String[]args){
		
		String result=new test().tenToBinary(6);
		System.out.println(result);
		
	}
	
}
