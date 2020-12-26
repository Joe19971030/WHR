package array;

public class sortZhengFuZhi2 {

	public void answerFunction(int[] array) {

		int length = array.length;
		int positiveCount = 0;
		int negativeCount = 0;
		for (int i = 0; i < length; i++) {

			if (array[i] > 0) {
				positiveCount++;

			} else {

				negativeCount++;

			}

		}

		int[] positive = new int[positiveCount];
		int[] negative = new int[negativeCount];
		int p = 0;
		int n = 0;
		for (int i = 0; i < length; i++) {

			if (array[i] > 0) {

				positive[p] = array[i];
				p++;

			} else {

				negative[n] = array[i];
				n++;

			}

		}

		// 把负数覆盖原数组
		for (int k = 0; k < negativeCount; k++) {

			array[k] = negative[k];

		}

		// 把正数覆盖原数组
		for (int m = 0; m < positiveCount; m++) {

			array[negativeCount + m] = positive[m];

		}

	}
	
	
	
public static void main(String[] args) {
		
		sortZhengFuZhi2 t = new sortZhengFuZhi2();
		int[] array = {-5,2,-3,4,-8,-9,1,3,-10};
		t.answerFunction(array);
		int length = array.length;
		for(int i = 0 ; i < length; i++){
			
			System.out.print(array[i]+"  ");
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	

}
