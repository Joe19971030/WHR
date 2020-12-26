package task2019_6_21;

public class quickSort {
	
	public void quickSort(int[] array,int start,int end){
		
		int jiZhun = array[start];  //用数组的第一个元素作为比较的基准
		
		int left = start ;
		int right = end ;
		
		
		while(left<=right){
			
			while(array[left]<jiZhun && left<end){
				
				left++;
				
			}
			
			while(array[right]>jiZhun && right>start){
				
				
				right--;
				
			}
			
			if(left<=right){
				
				int tmp = 0 ;
				tmp = array[left];
				array[left] = array[right];
				array[right] = tmp ;
				right--;
				left++;
			
			}
			
		}
		
		//如果left>right
		if(right>=start){
			quickSort(array,start,right);	
		}
		
		if(left<=end){
			
			quickSort(array,left,end);	
			
		}
		
	
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		quickSort qs = new quickSort();
		
		int[] array = new int[] { 9, 3, 2, 6, 8, 5 };
		
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}

		System.out.println();
		
		qs.quickSort(array, 0, array.length-1);
		
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}

		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
