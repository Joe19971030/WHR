package task2019_6_25;

import java.util.LinkedList;
import java.util.Scanner;

public class orderNumber {
	
	
	public void function(int n,String[] numbers){
		
		LinkedList<String> list = new LinkedList<String>();
		for(int i=0;i<n;i++){
			list.add(numbers[i]);
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				
				if( (list.get(i)+list.get(j)).compareTo(list.get(j)+list.get(i))<0 ){
					String tmp="";
					tmp=list.get(i);
					list.set(i, list.get(j));
					list.set(j,tmp);	
				}
			}
		
		}
		
		for(int i=0;i<n;i++){
			System.out.print(list.get(i));
			
		}
		System.out.println();
		
		
	}
	
	
	
	
	
	
	public static void main(String[]args){
		
		
		int n=0;
		Scanner input=new Scanner(System.in);
		System.out.println("请输入n：");
		n=input.nextInt();
		input.nextLine();
		String[] numbers=new String[n];
		for(int i=0;i<n;i++){
			numbers[i]=input.next();
		}
		
		new orderNumber().function(n,numbers);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
