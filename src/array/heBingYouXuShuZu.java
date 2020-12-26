package array;

//合并两个有序数组
public class heBingYouXuShuZu {

	public void quickSort1(int[] array, int start, int end) { // start为需要排序的开始元素的下标，end为结束元素的下标

		int jiZhunZhi = array[start]; // 下标为0的元素为基准值

		// 把大于基准值的元素移动到右边，把小于基准值的元素移到左边
		int tmp = 0;
		int i = start;
		int j = end;
		while (i <= j) {

			while (array[i] < jiZhunZhi && i < end) {

				i++;

			}

			while (array[j] > jiZhunZhi && j > start) {

				j--;

			}

			if (i <= j) {

				// 两个元素交换位置
				tmp = array[i];
				array[i] = array[j];
				array[j] = tmp;
				i++;
				j--;
			}

		}
		// 如果i>j 则表示表示一次递归排序完成
		if (j > start) {

			quickSort1(array, start, j);

		}

		if (end > i) {
			quickSort1(array, i, end);

		}

	}

	public int[] answerFunction(int[] a, int[] b) {

		int alength = a.length;
		int blength = b.length;
		int length = alength + blength;
		int[] array = new int[length];
		for (int i = 0; i < alength; i++) {

			array[i] = a[i];

		}

		for (int j = 0; j < blength; j++) {

			array[j + alength] = b[j];

		}

		quickSort1(array, 0, length - 1);

		return array;

	}

	public static void main(String[] args) {

		heBingYouXuShuZu t = new heBingYouXuShuZu();
		int[] a = { 1, 6, 7, 9 };
		int[] b = { 2, 4, 5, 8 };
		int[] result = new int[a.length + b.length];
		result = t.answerFunction(a, b);
		int length = result.length;

		for (int i = 0; i < length; i++) {

			System.out.println(result[i]);

		}

	}

}
