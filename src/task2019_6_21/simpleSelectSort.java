package task2019_6_21;

public class simpleSelectSort {
	
	public void simpleSelectSort(int[] array){
		
		int length = array.length;
		for(int i=0;i<length-1;i++){
			int min = array[i];
			int minIndex = i ;
			for(int j=i+1;j<length;j++){
				
				if(array[j]<min){
					
					minIndex = j;
					min = array[j];
					
				}
		
			}
			
			//交换
			array[minIndex]=array[i];
			array[i]=min;
			
			
			
		}
		
		
		
		
		
		
	}
	
	
	public static void main(String[]args){
		
		simpleSelectSort  sss = new simpleSelectSort();
		
		
		
		int[] array = new int[] { 9, 3, 2, 6, 8, 5 };
		
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}

		System.out.println();
		
		sss.simpleSelectSort(array);
		
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
