package stack;

import java.util.Stack;

public class houZhuiJiSuan {

	public Double answerFunction(String houZhui) {
		Double jieGuo = new Double(0);
		int length = houZhui.length(); // 后缀表达式字符串的长度
		char[] array = houZhui.toCharArray(); // 后缀表达式字符串转换为字符数组
		Stack stack = new Stack();
		String Output = ""; // 存放操作数

		for (int i = 0; i < length; i++) { // 遍历后缀表达式

			// 如果array[i]是操作数
			while (!(array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/' || array[i] == ' ')) {

				Output = Output + array[i];
				i++;

			}

			// 如果有操作数 转换为双精度型数并且入栈
			if (!Output.equals("")) {

				Double num = Double.parseDouble(Output);
				stack.push(num);
				Output = "";
			}

			// 如果为操作符，则弹出栈顶的两个元素进行计算，把结果入栈
			if (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/') {
				double result = 0;
				Double num1 = (Double) stack.pop(); // 第一个弹出的数字
				Double  num2 = (Double) stack.pop(); // 第二个弹出的数字
				// 判断符号
				if (array[i] == '+') {

					result = num1 + num2;

				} else if (array[i] == '-') {

					result = num2 - num1;

				} else if (array[i] == '*') {
					result = num1 * num2;

				} else {

					result = num2 / num1;
				}
				// 把结果压入栈中
				stack.push(result);

			}

		}

		// 遍历完后弹出栈中的数即为结果
		jieGuo = (Double) stack.pop();

		return jieGuo;

	}
	
	
	public static void main(String[]args){
		
		houZhuiJiSuan t = new houZhuiJiSuan();
		String houZhui = "2 7/";
		Double result = t.answerFunction(houZhui);
		System.out.println(result);
		
		
		
		
		
	}
	
	
	
	

}
