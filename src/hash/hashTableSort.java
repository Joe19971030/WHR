package hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class hashTableSort {
	//list: arrayList Vector LinkedList
	public static void main(String[] args) {
		Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();
		hashtable.put(1, "aa");
		hashtable.put(2, "bb");
		hashtable.put(3, "cc");
		hashtable.put(4, "dd");
		
		
		System.out.println(hashtable);
		
		Iterator<Integer> iterator = hashtable.keySet().iterator() ;  //只有set对象才有迭代器
		
		while(iterator.hasNext()){
			Integer key = iterator.next() ;
			System.out.println(key+"   "+hashtable.get(key)) ;
		}
		
		//Collections.sort排序
		//把hashtable转化为list对象
		List<Map.Entry<Integer, String>>   list =  new ArrayList<Map.Entry<Integer, String>>(hashtable.entrySet());
		Collections.sort(list,new Comparator<Map.Entry<Integer, String>>(){

			@Override
			public int compare(Map.Entry<Integer, String> arg0, Map.Entry<Integer, String> arg1) {
				// TODO Auto-generated method stub
				
				return arg1.getValue().compareTo(arg0.getValue());
				
			}
		});
		
		
		//循环输出实体集
		for(Map.Entry<Integer, String> entry:list){
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
			
		}
		
		
		
	}
	
	
	

}
