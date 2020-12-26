package task2019_6_21;

public class shellSort {

	public void shellSort(int[] array) {

		int length = array.length;
		int gap = length / 2;

		while (gap > 0) {

			for (int i = 0; i < gap; i++) {// 确定大分组
				// int tmp = array[i] ; //第一个元素
				for (int j = i + gap; j < length; j = j + gap) {// 处理每一个小分组，对每一个小分组进行直接插入排序

					int tmp = array[j];

					for (int k = j - gap; k >= i; k = k - gap) {

						if (array[k] > tmp) {

							array[k + gap] = array[k];
							if (k == i) {

								array[i] = tmp;

							}

						} else {

							array[k + gap] = tmp;
							break;

						}

					}

				}

			}
			
			gap=gap/2;

		}

	}
	
	
	
	
	public static void main(String[] args) {
		
		
		shellSort ss = new shellSort();
		
		
		int[] array = new int[] { 9, 3, 2, 6, 8, 5 };
		
		

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}

		System.out.println();
		
		ss.shellSort(array);
		
		

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
