package array;

//寻找数组中第二小的元素
public class findSecondMin {
	
	//使用快速排序把数组按照升序排序，然后取出数组的第二个元素即为数组中第二小的元素
	public void quickSort(int[] array,int start,int end){
		
		int p = array[start];
		int i = start ;
		int j = end ;
		while(i<=j){
			
			while(array[i] < p && i < end){
				
				i++ ;
				
			}
			
			while(array[j] > p && j > start){
				
				j-- ;
				
			}
			
			if(i<=j){
				
				int tmp = 0 ;
				tmp = array[i];
				array[i] = array[j];
				array[j] = tmp ;
				i++;
				j--;
			
			}
			
	
		}
		
		if(j>start){ //递归小于p的部分
			
			quickSort(array,start,j);
			
		}
		if(i<end){//递归大于p的部分
			
			quickSort(array,i,end);
			
		}
		
		
		
	}
	
	
	public static void main(String[]args){
		
		findSecondMin t = new findSecondMin();
		
        int arr[]={-4,-4,56,34,76,34,23,4,75,87,50,3,5,6};
        int length = arr.length ;
        t.quickSort(arr,0,length-1);
        for(int i = 0;i< length ; i++){
        	
        	
        	System.out.println(arr[i]);
        	
        }
		
    	System.out.println("第二小的元素为：" + arr[1]);
    	
		
		
	}
	
	
	
	

}
