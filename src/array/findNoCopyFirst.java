package array;

//找到数组中第一个不重复出现的整数
public class findNoCopyFirst {

	public Integer answerFunction(int[] array) {

		int length = array.length;
		int tmp = 0;
		int minIndex = -1;

		for (int i = 0; i < length; i++) {
			tmp = array[i];
			for (int j = 0; j < length; j++) {
				if (j != i) {

					if (array[j] == tmp) { // 如果有重复

						break;

					}
					if (j == length - 1) { // 如果遍历到最后一个都没有重复

						if (minIndex == -1) {

							minIndex = i;

						} else {

							if (i < minIndex) {

								minIndex = i;

							}

						}

					}

				}
			}

		}
		
		if(minIndex == -1){
			
			System.out.println("数组中没有不重复出现的整数！");
			return null ;
			
			
		}else{
			
			return array[minIndex];
			
		}

	}
	
	
	public static void main(String[]args){
		
		
		findNoCopyFirst t = new findNoCopyFirst();
		
		int[] array = {1,2,3,9,7,66,5,5,4,66,3,7,0,1,4};
		
		
		
		
		Integer result = t.answerFunction(array);
		
		System.out.println(result);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
