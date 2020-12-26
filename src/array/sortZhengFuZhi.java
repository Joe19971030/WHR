package array;

//重新排列数组中的正值和负值
public class sortZhengFuZhi {

	public void answerFunction(int[] array) {

		int length = array.length;
		int tmp = 0;

		int i = 0;
		int j = i + 1;

		while (i < length - 1) {

			if (array[i] > 0 && array[j] < 0) { // 如果前面的数是正数，后面的数为负数，则调换位置

				tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				i = 0;
				j = i + 1;
			} else {

				i = i + 1;
				j = i + 1;

			}

		}

	}
	
	
	
	
	public static void main(String[] args) {
		
		sortZhengFuZhi t = new sortZhengFuZhi();
		int[] array = {-5,2,-3,4,-8,-9,1,3,-10};
		t.answerFunction(array);
		int length = array.length;
		for(int i = 0 ; i < length; i++){
			
			System.out.print(array[i]+"  ");
			
		}
		
		
	}
	
	
	

}
