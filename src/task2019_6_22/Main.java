package task2019_6_22;

import java.util.Scanner;

public class Main {

	public void function(int num, String str) {
		int length = str.length();
		char[] array = str.toCharArray();
		for (int i = 0; i < length; i = i + 9) {
			if (array[i] == '0') {// 如果是小端
				int start = i + 1;
				int end = i + 8;
				for (int j = end; j >= start; j--) {

					System.out.print(array[j]);

				}

				if (i + 9 != length) {
					System.out.print(" ");
				} 

			} else if (array[i] == '1') {// 如果是大端
				int start = i + 1;
				int end = i + 8;
				for (int j = start; j <= end; j++) {

					System.out.print(array[j]);

				}

				if (i + 9 != length) {
					System.out.print(" ");
				} 

			}

		}

	}
	
	
	public static void main(String[]args){
		 Main m = new  Main();
		 Scanner input = new Scanner(System.in);
		 System.out.println("请输入数据结构的个数:");
		 int num=input.nextInt();
		 input.nextLine();
		 System.out.println("请输入数据结构：");
		 String str=input.nextLine();
		 m.function(num, str);
		
		
		
	}
	
	

}
