
public class hashTable {

	private DataItem[] hashArray;
	private int arraySize;
	private DataItem nonItem;

	public hashTable(int size) {

		this.arraySize = size;
		hashArray = new DataItem[this.arraySize];
		nonItem = new DataItem(-1);

	}

	public void displayTable() {

		System.out.print("Table:");
		for (int i = 0; i < arraySize; i++) {
			if (hashArray[i] != null) {

				System.out.print(hashArray[i].getKey() + " ");

			} else {

				System.out.print("** ");

			}

		}

		System.out.println();

	}

	// 首次哈希函数
	public int hashFunc1(int key) {

		return key % arraySize;
	}

	// 二次哈希函数,不能输出0，不能与第一次哈希函数相同

	public int hashFunc2(int key) {

		// stepSize = constant - (key%arraySize) 这个公式很好，constant是常数，是指数且小于数组容量
		return 5 - key % 5;

	}

	// 新增
	public void insert(int key, DataItem item) {

		int hashVal = hashFunc1(key); // 查找hash到的下标位置

		int stepSize = hashFunc2(key); // 再哈希得到探测步长
		while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) {

			hashVal += stepSize;
			hashVal %= arraySize;

		}

		hashArray[hashVal] = item;

	}

	// 删除
	public DataItem delete(int key) {

		int hashVal = hashFunc1(key); // 查找hash到的下标位置

		int stepSize = hashFunc2(key); // 再哈希得到探测步长

		while (hashArray[hashVal] != null) {

			if (hashArray[hashVal].getKey() == key) {// 找到要删的数据项

				DataItem temp = hashArray[hashVal];

				hashArray[hashVal] = nonItem;

				return temp;

			}
			hashVal += stepSize;
			hashVal %= arraySize;

		}

		return null;// 没有找到要删的数据项

	}

	// 查找
	public DataItem find(int key) {
		int hashVal = hashFunc1(key); // 查找hash到的下标位置

		int stepSize = hashFunc2(key); // 再哈希得到探测步长

		while (hashArray[hashVal] != null) {
			if (hashArray[hashVal].getKey() == key) {

				return hashArray[hashVal];

			}

			hashVal += stepSize;
			hashVal %= arraySize;

		}

		return null;

	}
	
	
	
	
	

}
