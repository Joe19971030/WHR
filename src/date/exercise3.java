package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class exercise3 {

	public Date f() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String s1 = "1970-01-01 00:00:00";
		String s2 = "2001-01-01 00:00:00";
		Date d1 = sdf.parse(s1);
		Date d2 = sdf.parse(s2);
		long time1 = d1.getTime();
		long time2 = d2.getTime();
		long distance = time2 - time1;

		long time = time1 + (long) (Math.random() * distance);

		Date result = new Date(time);

		return result;

	}

	public void sortDate(Date[] array) {

		int length = array.length;
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {

				Date di = array[i];
				Date dj = array[j];

				int houri = di.getHours();
				int mini = di.getMinutes();
				int si = di.getSeconds();
				int hourj = dj.getHours();
				int minj = dj.getMinutes();
				int sj = dj.getSeconds();

				if (houri != hourj) {// 如果小时不相同

					if (hourj < houri) {

						Date tmp = array[i];
						array[i] = array[j];
						array[j] = tmp;

					}

				} else { // 如果小时数相同

					if (mini != minj) {// 如果分钟数不相同

						if (minj < mini) {

							Date tmp = array[i];
							array[i] = array[j];
							array[j] = tmp;

						}

					} else { // 如果分钟数相同

						if (si != sj) {// 如果秒数不相同

							if (sj < si) {

								Date tmp = array[i];
								array[i] = array[j];
								array[j] = tmp;

							}

						} else {// 如果秒数相同

						}

					}

				}

			}

		}

	}

	public static void main(String[] args) throws ParseException {
		exercise3 e3=new exercise3();
		
		Date[] a=new Date[9];
		
		for(int i=0;i<9;i++){
			
			a[i]=e3.f();
			
		}
		
		for(Date d:a){
			
			System.out.println(d);
			
		}
		
		System.out.println("排序后：");

		e3.sortDate(a);
		
		
for(Date d:a){
			
			System.out.println(d);
			
		}
		
		
		
		
	}

}
