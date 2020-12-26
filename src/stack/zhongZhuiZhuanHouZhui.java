package stack;

import java.util.Stack;

public class zhongZhuiZhuanHouZhui {

	public String answerFunction(String zhongZhuiBiaoDaShi) {

		String outPut = ""; // 输出字符串

		char[] array = zhongZhuiBiaoDaShi.toCharArray(); // 把字符串转换为字符数组处理

		int length = array.length; // 字符数组的长度

		Stack stack = new Stack(); // 初始化一个栈

		for (int i = 0; i < length; i++) { // 遍历字符数组

			// 如果为操作数 直接输出
			if (!(array[i] == '+' || array[i] == '-' || array[i] == '*' || array[i] == '/' || array[i] == '('
					|| array[i] == ')')) {

				outPut = outPut + array[i];

			}
			
			
			
			
			

			// 如果遇到操作符，通过查看栈顶元素确定是否要马上入栈或者先弹出栈顶元素再入栈 如果为+-
			if (array[i] == '+' || array[i] == '-') {
				outPut = outPut + ' ';
				// 如果栈为空 直接入栈
				if (stack.isEmpty()) {
					stack.push(array[i]);

				} else {
					// 如果栈不为空
					while (!stack.isEmpty()) {
						char topOfStack = (char) stack.peek();
						if (topOfStack == '+' || topOfStack == '-' || topOfStack == '*' || topOfStack == '/') {

							outPut = outPut + stack.pop();

						} else {

							break;

						}

					}
					stack.push(array[i]);

				}

			}
			// 如果遇到操作符，通过查看栈顶元素确定是否要马上入栈或者先弹出栈顶元素再入栈 如果为*/
			if (array[i] == '*' || array[i] == '/') {
				outPut = outPut + ' ';
				// 如果栈为空 直接入栈
				if (stack.isEmpty()) {
					stack.push(array[i]);

				}else {
					// 如果栈不为空
					while (!stack.isEmpty()) {
						char topOfStack = (char) stack.peek();
						if (topOfStack == '*' || topOfStack == '/') {

							outPut = outPut + stack.pop();

						} else {

							break;

						}

					}
					stack.push(array[i]);

				}
			
			}
			//如果遇到左括号，则直接压入栈中
			if(array[i] == '('){	
				stack.push(array[i]);		
			}
			
			//如果遇到右括号 ， 直到遇到左括号之前的栈顶元素都要输出，然后弹出左括号
			if(array[i] == ')'){
				
				char topOfStack = (char) stack.peek() ;
				while(topOfStack!='('){
					
					outPut = outPut + stack.pop();
					 topOfStack = (char) stack.peek() ;
					
				}
			stack.pop(); //弹出'('
			}
				
		}
		
		while(!stack.isEmpty()){
			
			
			outPut = outPut + stack.pop();
		}
		
		
		return outPut ;

	}
	
	
	
	
	public static void main(String[]args){
		
		zhongZhuiZhuanHouZhui  t = new zhongZhuiZhuanHouZhui();
		String zhongZhuiBiaoDaShi = "12+2";
		
		String houZhui = t.answerFunction(zhongZhuiBiaoDaShi);
		char[] array = houZhui.toCharArray();
		int arrayLength = array.length;
		System.out.println(houZhui);
		System.out.println(houZhui.length());
		for(int i = 0 ; i< arrayLength;i++){
			
			System.out.print(array[i]);
			
			
		}
		System.out.println(arrayLength);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
