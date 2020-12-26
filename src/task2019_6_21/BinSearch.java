package task2019_6_21;

/*
 * 
 * 
 * 
 * 
 * 二分查找非递归
 */
public class BinSearch {
	
	public int BinSearch(int[] array,int search){
		
		int length = array.length;
		int low = 0 ;
		int high = length-1;
		while(low<=high){
			int middle=(low+high)/2;
			if(array[middle]==search){
				
				return middle;
			}else if(array[middle]<search){
				
				low=middle+1;
				
			}else{
				
				high=middle-1;
				
			}
			

		}
		return -1;
		
	}
	public static void main(String[]args){ 
		
		BinSearch bs = new BinSearch();
		
		int[] array = new int[] {1,2,5,6};
		
		int index = bs.BinSearch(array, 4);
		
		System.out.println(index);
		
		
	}
	
	
	

}
