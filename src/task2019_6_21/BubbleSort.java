package task2019_6_21;

public class BubbleSort {
	
	public void BubbleSort(int[] array){
		
		int length = array.length;
		for(int i=0;i<length-1;i++){
			for(int j=i+1;j<length;j++){
				
				if(array[j]<array[i]){
					
					int tmp=0;
					tmp=array[j];
					array[j]=array[i];
					array[i]=tmp;
					
				}
		
				
			}
			
		
		}
		
	}
	
	
	public static void main(String[]args){ 
		
		BubbleSort bs = new BubbleSort();
		
	int[] array = new int[] { 9, 3, 2, 6, 8, 5 };
		
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}

		System.out.println();
		
		
		bs.BubbleSort(array);
		
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
