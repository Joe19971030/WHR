package task2019_6_26;

import java.util.Iterator;
import java.util.LinkedList;

/*
 *
 * 
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 
 *
 * 
 */

public class question3_2 {
	
	public void function(int[] array){
		
		int length=array.length;
		LinkedList<Integer> listOdd = new LinkedList<Integer>();
		LinkedList<Integer> listEven = new LinkedList<Integer>();
		for(int i=0;i<length;i++){
			if(array[i]%2!=0){
				listOdd.add(array[i]);
			}else{
				listEven.add(array[i]);
			}	
		}
		
		int index=0;
		Iterator<Integer> iterator = listOdd.iterator();
		while(iterator.hasNext()){
			
			array[index]=iterator.next();
			index++;
			
		}
		Iterator<Integer> iteratorEven = listEven.iterator();
		while(iteratorEven.hasNext()){
			
			array[index]=iteratorEven.next();
			index++;
			
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
public static void main(String[]args){
		
		int[] array=new int[]{3,2,4,1,6,7,5};
		int length=array.length;
		for(int i=0;i<length;i++){
			
			System.out.print(array[i]+" ");
		}
		System.out.println();
		new question3_2().function(array);
for(int i=0;i<length;i++){
			
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}

}
