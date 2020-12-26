package task2019_6_21;

/*
 * 
 * 顺序查找
 * 
 */
public class orderSearch {

	public int orderSearch(int[] array, int search) {

		int length = array.length;

		for (int i = 0; i < length; i++) {

			if (array[i] == search) {

				return i;
			}

		}

		return -1;

	}
	
	
	public static void main(String[]args){ 
		
		orderSearch os = new orderSearch();
		
		int[] array = new int[] { 9, 3, 2, 6, 8, 5 };
		
		int index = os.orderSearch(array, 7);
		
		System.out.println(index);
		
		
		
		
		
	}
	
	
	

}
