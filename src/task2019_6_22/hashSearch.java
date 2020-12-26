package task2019_6_22;

public class hashSearch {
	
	//声明一个整形数组，用于存储数据
	int[] hash;
	int hashLength;
	public hashSearch(){
		hash=new int[50];
		hashLength=hash.length;
	}
	
	public void insert(int data){//插入数据data
		//哈希函数
		int hashAddress=data%hashLength;
		while(hash[hashAddress]!=0){
			
			hashAddress++;
			hashAddress=hashAddress%hashLength;	
		}	
		hash[hashAddress]=data;	
	}
	
	public int search(int key){//查找key所在的数组的位置
		//哈希函数
		int hashAddress=key%hashLength;
		while(hash[hashAddress]!=0&&hash[hashAddress]!=key){
			
			hashAddress++;
			hashAddress=hashAddress%hashLength;
			
			
			
		}
		
		if(hash[hashAddress]==key){
			
			return hashAddress ;
		}
		
		return -1;
		
		
	}
	
	
	
	public static void main(String[]args){
		
		
		hashSearch hs = new hashSearch();
		hs.insert(5);
		hs.insert(15);
		hs.insert(5556);
		System.out.println(hs.search(5));
		System.out.println(hs.search(155));
		System.out.println(hs.search(5556));
		
		System.out.println(hs.hash[5]);
		System.out.println(hs.hash[15]);
		System.out.println(hs.hash[6]);
		
	}
	
	
	
	
	
	

}
