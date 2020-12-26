package task2019_6_25;

import java.util.Scanner;

public class card {
	
	
	public int function(int n,int[] array){
		
		int change=0;
		//计算平均每堆纸牌最后有多少张牌
		int sum=0;
		for(int i=0;i<n;i++){
			sum=sum+array[i];
		}
		int v=0;
		v=sum/n;  //平均每堆纸牌最后有多少张牌(v)
		for(int i=0;i<n;i++){
			if(array[i]<v){ //如果第i堆牌的牌数小于v，需要从i+1堆牌移动v-array【i】张牌到第i堆牌
	
				array[i+1]=array[i+1]-(v-array[i]);
				array[i]=v;
				change++;
				
				
			}else if(array[i]>v){//如果第i堆牌的牌数大于v，需要移动array[i]-v张牌到第i+1堆牌
				array[i+1]=array[i+1]+(array[i]-v);
				array[i]=v;
				change++;
			}else{
				
				
			}
		
		}
		return change ;
		
		
		
		
	}

	
	public static void main(String[]args){
		
		int[] array;
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入纸牌的堆数：");
		n=input.nextInt();
		input.nextLine();
		array=new int[n];
		for(int i=0;i<n;i++){
		
				array[i]=input.nextInt();
			
		}
		
		
		int num=new card().function(n,array);
		System.out.println(num);
		
	}
	
	

}
