
public class testHashTable {
	
	public static void main(String[] args){
		
		
		hashTable ht = new hashTable(15);
		int key = 120;
		DataItem dataItem = new DataItem(key);
		ht.insert(key, dataItem);
		
		
		int key1 = 30;
		DataItem dataItem1 = new DataItem(key1);
		ht.insert(key1, dataItem1);
		
		
		int key2 = 11;
		DataItem dataItem2 = new DataItem(key2);
		ht.insert(key2, dataItem2);
		
		int key3 = 15;
		DataItem dataItem3 = new DataItem(key3);
		ht.insert(key3, dataItem3);
		
		ht.displayTable();
		
		ht.delete(15);
		
		ht.displayTable();
		
		if(ht.find(120)!=null){
			
			
			 System.out.println("找到了");
		}else{
			
			System.out.println("没找到");
			
		}
		
		
		
		
	}
	
	
	
	
	
	

}
