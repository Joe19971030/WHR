package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class exercise2 {
	
	
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar c=Calendar.getInstance();
		Date now=new Date();
		
		c.setTime(now);
		c.add(Calendar.MONTH, 1);
		Date d1=c.getTime();
		System.out.println(sdf.format(d1));
		
		
		c.setTime(now);
		c.add(Calendar.YEAR, -1);
		d1=c.getTime();
		System.out.println(sdf.format(d1));
		
		c.setTime(now);
		c.add(Calendar.MONTH, -1);
		c.set(Calendar.DATE, 3);
		d1=c.getTime();
		System.out.println(sdf.format(d1));
		
		
	}
	
	

}
