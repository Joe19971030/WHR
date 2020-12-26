package Map;

import java.util.HashMap;
import java.util.TreeMap;

public class testHashMap {
	
	public static void main(String[]args){
		
		
		HashMap<Integer,String> HM =  new HashMap<Integer, String>();
		HM.put(1, "aa");
		HM.put(4, "dd");
		HM.put(3, "cc");
		HM.put(2, "bb");
		System.out.println(HM);
		
	TreeMap<Integer,String> TM =  new TreeMap<Integer, String>();
	TM.put(1, "aa");
	TM.put(4, "dd");
	TM.put(3, "cc");
	TM.put(2, "bb");
		System.out.println(TM);
		
		
		
		
	}
	
	

}
