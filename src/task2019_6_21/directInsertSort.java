package task2019_6_21;

public class directInsertSort {

	public void directInsertSort(int[] array) {

		int length = array.length;

		for (int i = 1; i < length; i++) {
			int tmp = array[i];
			for (int j = i - 1; j >= 0; j--) {

				if (array[j] > tmp) {

					array[j + 1] = array[j];
					if (j == 0) {

						array[j] = tmp;

					}

				} else {

					array[j + 1] = tmp;

					break;
				}

			}

		}

	}

	public static void main(String[] args) {

		directInsertSort dis = new directInsertSort();
		int[] array = new int[] { 9, 3, 2, 6, 8, 5 };

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}

		System.out.println();

		dis.directInsertSort(array);

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + "  ");

		}

	}

}
