package task2019_6_27;

import java.util.Stack;

public class zhongXuZhuanHouZhui {

	public String zhongXuZhuanHouZhui(String str) {

		char[] array = str.toCharArray(); // 把中序表达式存储在字符数组中
		int length = array.length; // 中序表达式的长度
		Stack<Character> stack = new Stack<Character>();// 用来操作操作符
		String result = "";// 结果字符串
		for (int i = 0; i < length; i++) {

			// 如果字符为操作数，直接拼接入结果字符串中
			if (array[i] != '+' && array[i] != '-' && array[i] != '*' && array[i] != '/' && array[i] != '('
					&& array[i] != ')') {
				result = result + array[i];
			
			}

			// 如果字符为操作符，且栈为空，直接把字符压入栈中
			else if (  (array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/' || array[i] == '('
					|| array[i] == ')' ) && stack.isEmpty()) {
				//System.out.println(array[i]+"       "+"***");
				stack.push(array[i]);

			}

			// 如果字符为操作符 + - ， 栈不为空
			else if ((array[i] == '+' || array[i] == '-') && !stack.isEmpty()) {

				while (!stack.isEmpty()) {
					if (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/') {

						result = result + stack.pop();

					} else {

						break;

					}

				}
				stack.push(array[i]);
			}

			// 如果字符为操作符* /，栈不为空
			else if ((array[i] == '*' || array[i] == '/') && !stack.isEmpty()) {

				while (!stack.isEmpty()) {
					if (stack.peek() == '*' || stack.peek() == '/') {
						
						result = result + stack.pop();
						

					} else {

						break;

					}

				}
				stack.push(array[i]);
			}

			// 如果字符为操作符( ，栈不为空
			else if (array[i] == '(' && !stack.isEmpty()) {

				stack.push(array[i]);

			}

			// 如果字符为操作符) ，栈不为空
			else if (array[i] == ')' && !stack.isEmpty()) {

				while (!stack.isEmpty()) {

					if (stack.peek() != '(') {

						result = result + stack.pop();

					} else {

						stack.pop();
						break;

					}

				}

			}

		}

		// 中序表达式字符串遍历完后要把栈中的元素添加到result字符串中
		while (!stack.isEmpty()) {

		//	System.out.println(stack.peek());
			
			result = result + stack.pop();
		}

		return result;

	}
	
	
	
	
	
	
	
	public static void main(String[]args){
		
		zhongXuZhuanHouZhui object = new zhongXuZhuanHouZhui();
		String zhongXu="1+2*(3-(4+5))/6";
		String houZhui=object.zhongXuZhuanHouZhui(zhongXu);
		System.out.println(houZhui);
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
