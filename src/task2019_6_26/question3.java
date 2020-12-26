package task2019_6_26;

/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 
 * 
 */
public class question3 {

	public void function(int[] array) {

		int length = array.length;

		// 寻找第一个奇数的位置
		int oddIndex = 0;
		int evenIndex = 0;
		for (int i = 0; i < length; i++) {
			if (array[i] % 2 != 0) {
				oddIndex = i;
				// 寻找第一个偶数的位置
				for (int j = 0; j < length; j++) {
					if (array[j] % 2 == 0) {
						evenIndex = j;
						break;

					}
				}

				if (evenIndex < oddIndex) { // 如果偶数在奇数前面

					int odd = array[oddIndex];
					for (int k = oddIndex - 1; k >= evenIndex; k--) {
						array[k + 1] = array[k];

					}
					array[evenIndex] = odd;

				} else {

				}

			}

		}

	}
	
	
	
	public static void main(String[]args){
		
		int[] array=new int[]{3,2,4,1,6,7,5};
		int length=array.length;
		for(int i=0;i<length;i++){
			
			System.out.print(array[i]+" ");
		}
		System.out.println();
		new question3().function(array);
for(int i=0;i<length;i++){
			
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}
	

}
