package task2019_6_9;

import java.util.ArrayList;
import java.util.List;

/*
 * 
 * 
 * 判断数组1与数组2是否相交
 * 
 */
public class arrayContain {

	public boolean contains(int[] array1, int[] array2) {

		boolean result = false;
		int length1 = array1.length;
		int length2 = array2.length;

		int i = 0; // 指向数组1的指针
		int j = 0; // 指向数组2的指针

		if (length1 <= length2) {
			while (true) {

				if (j == length2 && i < length1) { // 不相交
					break;

				}

				if (i > length1 - 1) { // 相交
					result = true;
					break;
				}

				if ((array1[i] != array2[j]) && i == 0) {

					j++;

				}

				else if (array1[i] == array2[j]) {

					i++;
					j++;

				}

				else if ((array1[i] != array2[j]) && i != 0) {

					i = 0;

				}

			}
		} else if (length1 > length2) {

			while (true) {

				if (i == length1 && j < length2) { // 不相交
					break;

				}

				if (j > length2 - 1) { // 相交
					result = true;
					break;
				}

				if ((array2[j] != array1[i]) && j == 0) {

					i++;

				}

				else if (array1[i] == array2[j]) {

					i++;
					j++;

				}

				else if ((array2[j] != array1[i]) && j != 0) {

					j = 0;

				}

			}

		}

		return result;

	}

	public static void main(String[] args) {

		arrayContain t = new arrayContain();
		
		int[] a = new int[] { 0, 1, 2, 3 };
		int[] b = new int[] { 0, 1, 2, 3, 3, 4, 5 };

		boolean result = false;
		result = t.contains(a, b);
		System.out.println(result);

	}

}
