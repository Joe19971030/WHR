import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * 
 * 
 * 使用分离链接法创建哈希表
 * 
 */
public class SeparateChainingHashTable<T> {

	// 声明一个链表数组
	private List<T>[] hashArray;
	// 链表数组的大小
	private int size;
	// 当前元素的个数
	private int currentElementNum;

	// 哈希表的构造函数
	public SeparateChainingHashTable(int size) {

		hashArray = new LinkedList[nextPrime(size)];
		this.size = hashArray.length;
		for (int i = 0; i < this.size; i++) {

			hashArray[i] = new LinkedList<T>();

		}

	}

	/**
	 * 检查某整数是否为素数
	 * 
	 * @param num
	 *            检查整数
	 * @return 检查结果
	 */
	private static boolean isPrime(int num) {
		if (num == 2 || num == 3) {
			return true;
		}
		if (num == 1 || num % 2 == 0) {
			return false;
		}
		for (int i = 3; i * i <= num; i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 返回不小于某个整数的素数
	 * 
	 * @param num
	 *            整数
	 * @return 下一个素数（可以相等）
	 */
	private static int nextPrime(int num) {
		if (num == 0 || num == 1 || num == 2) {
			return 2;
		}
		if (num % 2 == 0) {
			num++;
		}
		while (!isPrime(num)) {
			num += 2;
		}
		return num;
	}

	// 使哈希表变空
	public void makeEmpty() {

		for (List<T> list : hashArray) {

			list.clear();

		}

		currentElementNum = 0;

	}
	
	
	//检查哈希表是否包含某个元素
	//第一步，通过元素的值查找元素所在链表数组的第几条链中
	private int myhash(T x){
		
		int hashVal = x.hashCode();
		hashVal %=hashArray.length;
		if(hashVal<0){
			hashVal += hashArray.length;
				
		}
		return hashVal ;
	}
	
	public boolean contains(T value){
		
		List<T> list = hashArray[myhash(value)];
		return list.contains(value);
		
	}
	
	
	//在散列表中插入元素
	public void insert(T value){
		
		List<T> list = hashArray[myhash(value)];
		if(!list.contains(value)){
			
			list.add(value);
			currentElementNum++;
			if(currentElementNum>hashArray.length){ //哈希数组扩容
				rehash();
				
				
			}
			
			
		}else{
			
			
			
		}
		
		
		
	}
	
	
	//扩容hashArray   把原来的链表数组扩充为两倍容量
	public void rehash(){
		
		//第一步，先保存原来的数组
		List<T>[] oldLists = hashArray ;
		
		//第二步，原数组扩容
		hashArray = new LinkedList[nextPrime(oldLists.length*2)];
		for(int j =0 ; j < hashArray.length ; j++){
			
			hashArray[j] = new LinkedList<T>();
			
		}
		
		currentElementNum = 0 ;
		
		//把原来数组的内容存到新的数组中
		for(int i = 0 ; i < oldLists.length ; i++){
			for(T value :oldLists[i]){
				
				insert(value);
				
			}
			
			
		}
		
		
		
	}
	
	
	//删除哈希表中的指定元素
	public void delete(T value){
		
		//第一步 确定删除的元素所在的链表
		
	List<T> list = hashArray[myhash(value)];
		
		//第二步  在链表中删除元素
		if(list.contains(value)){
			
			list.remove(value);
			currentElementNum-- ;
			
		}
		
		
	}
	
	//输出哈希表中的内容
	public void displayTable(){
		
		for(int i = 0 ; i < hashArray.length ; i++){
			
		
				List<T> list =  hashArray[i] ;
			Iterator<T> iterator = list.iterator() ;
			while(iterator.hasNext()){
				System.out.print(iterator.next()+"  ");
				
				
			}
			
			System.out.println();
			System.out.println("-----");
			
			
		}
		
		System.out.println(hashArray.length+"asdas");
		
		
	}
	
	
	

}
