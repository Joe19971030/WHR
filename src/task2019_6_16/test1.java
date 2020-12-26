package task2019_6_16;

import java.util.Scanner;

public class test1 {

	
	public static void main(String[]args)
	{
		
		int[] a1 = new int[10];
		
		Scanner input = new Scanner(System.in);
		for(int i = 0 ; i < a1.length ; i++){
			
			a1[i] = input.nextInt() ;
			
			
		}
		
for(int i = 0 ; i < a1.length ; i++){
			
		System.out.println(a1[i]);
			
			
		}
		

		int[] a2 ;
		a2 = a1 ;
		
		for(int i = 0 ; i < a2.length ; i++){
			
			System.out.println(a2[i]);
				
				
			}
		
		
		
		int[] a3 = new int[a2.length];
		a3 = a2 ;
		
for(int i = 0 ; i < a3.length ; i++){
			
			System.out.println(a3[i]);
				
				
			}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
