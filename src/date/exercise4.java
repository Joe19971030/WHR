package date;

import java.util.Calendar;
import java.util.Date;

//找出下个月的倒数第3天是哪天 
public class exercise4 {
	
	
	public static void main(String[] args) {
		
		Calendar c=Calendar.getInstance();
		Date now=new Date();
		c.setTime(now);
		
		
		c.add(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH,1);
		c.add(Calendar.DAY_OF_MONTH, -3);
		
		Date rsult=c.getTime();
		System.out.println(rsult);
		
		
		
		
		
		
	}
	
	
	
	
	

}
