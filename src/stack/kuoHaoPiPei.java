package stack;

import java.util.Stack;

public class kuoHaoPiPei {

	public boolean answerFunction(String str) {

		// 原来的字符串表达式转换为字符数组
		char[] array = str.toCharArray();
		// 字符数组的长度
		int length = array.length;
		// 定义一个栈
		Stack<Character> stack = new Stack<Character>();
		// 遍历原表达式的字符数组
		for (int i = 0; i < length; i++) {

			// 如果是左括号[{(的话就压栈
			if (array[i] == '[' || array[i] == '(' || array[i] == '{') {

				stack.push(array[i]);

			}

			// 如果右括号]})的话就检查栈顶元素，如果匹配的话的弹出栈顶元素；如果不匹配的话就把右括号也压栈
			if (array[i] == ']') {
				char topOfStack = stack.peek();
				if (topOfStack == '[') {// 如果匹配

					stack.pop();

				} else { // 如果不匹配
					stack.push(array[i]);

				}

			}

			if (array[i] == '}') {
				char topOfStack = stack.peek();
				if (topOfStack == '{') {// 如果匹配

					stack.pop();

				} else { // 如果不匹配
					stack.push(array[i]);

				}

			}

			if (array[i] == ')') {
				char topOfStack = stack.peek();
				if (topOfStack == '(') {// 如果匹配

					stack.pop();

				} else { // 如果不匹配
					stack.push(array[i]);

				}

			}

		}
		
		//遍历完毕
		if(stack.isEmpty()){
			
			return true ;
			
		}else{
			
			return false;
			
		}

	}
	
	
	 public static void main(String[] args) {
		 
		 kuoHaoPiPei t = new kuoHaoPiPei();
		 
		 boolean result = false ;
		 boolean result2 = false ;
		 
		 String reg = "{a+[b+(c*a)/(d-e)]}";
		 
		 result = t.answerFunction(reg);
		 
		 System.out.println(result);
		 
		 String reg2 = "([a+b)-(c*e)]+{a+b}";
		 
		 result2 = t.answerFunction(reg2);
		 
		 System.out.println(result2);
		 
		 
		 
		 
	 }
	
	
	
	

}
