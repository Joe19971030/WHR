package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exercise5 {
	
	 public static void main(String[] args) throws ParseException {
		 
		 SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		 String s1="1995-01-01 00:00:00";
		 String s2="1995-12-31 23:59:59";
		 Date d1=sdf.parse(s1);
		 Date d2=sdf.parse(s2);
		 long time1=d1.getTime();
		 long time2=d2.getTime();
		 long distance=time2-time1;
		 
		 long time= time1+(long)(Math.random()*distance);
		 
		 Date result=new Date(time);
		 
		 System.out.print(result);
		 
		 
		 
		 
		 
		 
		 
	 }
	
	

}
