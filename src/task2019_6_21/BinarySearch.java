package task2019_6_21;
/*
 * 
 * 
 * 二分搜索递归实现
 */
public class BinarySearch {

	
	public int BinarySearch(int[] array,int search,int low,int high){
		
		if(low<=high){
			int middle=(low+high)/2;
			if(array[middle]==search){
				
				return middle;
				
				
			}else if(array[middle]>search){
				
				return BinarySearch(array,search,low,middle-1);
				
			}else{
				
				
				return BinarySearch(array,search,middle+1,high);
				
			}
	
		}else{
			
			
			return -1;
		}
	
	}
	
	public static void main(String[]args){ 
		
		BinarySearch  bs = new BinarySearch();
		
		
		int[] array = new int[] {1,2,5,6};
		
		int index = bs.BinarySearch(array, 5, 0,array.length-1);
		
		System.out.println(index);
		
		
		
		
		
	}
	
	
	
	
}
