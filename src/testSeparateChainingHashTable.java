import java.util.Random;

public class testSeparateChainingHashTable {
	
	
	
	public static void main(String[] args) {
		Random random = new Random();
		SeparateChainingHashTable<Integer> hashTable = new SeparateChainingHashTable<Integer>(30);
		
		hashTable.insert(0);
		hashTable.insert(1);
		hashTable.insert(2);
		
		hashTable.insert(3);
		hashTable.insert(4);
		hashTable.insert(5);
		hashTable.insert(44);
		hashTable.insert(7);
		hashTable.insert(8);
		hashTable.insert(9);
		hashTable.insert(10);
		hashTable.insert(11);
		hashTable.insert(12);
		hashTable.insert(88);
		hashTable.insert(14);
		hashTable.insert(15);
		hashTable.insert(66);
		hashTable.insert(17);
		hashTable.insert(18);
		hashTable.insert(19);
		hashTable.insert(20);
		hashTable.insert(21);
		hashTable.insert(22);
		hashTable.insert(23);
		
		hashTable.insert(28);
		
		
		hashTable.displayTable();
	}

	
	
	
	
	
	

}
