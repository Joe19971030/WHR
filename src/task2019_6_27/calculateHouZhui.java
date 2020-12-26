package task2019_6_27;

import java.util.Stack;

/*
 * 
 * 计算操作数为0-9的后缀表达式
 * 
 */
public class calculateHouZhui {

	public double calculateHouZhui(String str) {
		Stack<Double> stack = new Stack<Double>();// 用来存放操作数的栈
		char[] array = str.toCharArray();
		int length = array.length;
		for (int i = 0; i < length; i++) {

			// 如果字符是操作数 压入栈中
			if (array[i] >= '0' && array[i] <= '9') {

				stack.push((double) array[i]);

			}

			// 如果字符是操作符，则弹出栈顶的两个操作数进行计算，然后把计算结果压入栈中
			else if (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/') {

				double num1 = stack.pop();
				double num2 = stack.pop();
				double result = 0;
				if (array[i] == '+') {

					result = num2 + num1;

				} else if (array[i] == '-') {

					result = num2 - num1;
				} else if (array[i] == '*') {

					result = num2 * num1;
				} else if (array[i] == '/') {

					result = num2 / num1;
				}
				stack.push(result);

			}

		}

		return stack.pop();

	}
	
	public static void main(String[]args){
		
		calculateHouZhui t = new calculateHouZhui();
		
	String houZhui="12345+-*6/+";
	double result=t.calculateHouZhui(houZhui);
	System.out.println(result);
		
		
		
		
	}
	
	

}
