package task2019_6_9;

import java.util.HashSet;

/*
 * 
 * 
 * 
 * 判断数组一是否是数组二的子集
 */


public class arrayContain2 {
	
	public boolean function(int[]array1,int[]array2){
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		int length2 = array2.length ;
		
		for(int i = 0 ;  i < length2 ; i++){
			
			set.add(array2[i]);
			
			
		}
		
		int length1 = array1.length ;
		for(int j = 0 ; j < length1 ; j++){
			
			if(!set.contains(array1[j])){
				
				return false ;
				
			}
			
			
		}
		
		return true ;
		
		
		
	}
	
	public static void main(String[]args){
		
		
		
		arrayContain2 t =  new arrayContain2();
		
		
				int[]a = new int[]{0,1,2,3};
		
		int[]b = new int[]{0,1,2,1,3,4,5};
		
		
		boolean result = false ;
		result = t.function(a, b);
		
		
		System.out.println(result);
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
