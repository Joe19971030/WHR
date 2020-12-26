package testThread;

public class testMultiThread {

	
	//Thread对象才有start()方法，Thread对象可以用runnable对象构造，runnable是一个接口，所以new它的时候要实现它的抽象方法run（），相当于创建了一个匿名内部类
	
	
	public static void main(String[]args){
	
	new Thread(new Runnable(){

		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
		
		
		
		
		
		
	}).start();
		
		
		
	
		
	
	}
	
	
	
	
	
	
	
	
}
