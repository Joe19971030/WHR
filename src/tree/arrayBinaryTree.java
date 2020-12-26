package tree;

public class arrayBinaryTree<T> {

	private int deep = 0; // 树的深度为deep
	private int maxSize = 0; // 树的最大结点个数
	private int size = 0; // 树的当前结点个数
	T[] data = null; // 类型为T的data数组存放结点的数据
	// 构造函数

	
	public arrayBinaryTree(int deep) {
		this.deep = deep; // 确定树的深度
		maxSize = (int) (Math.pow(2, deep) - 1); // 确定最大结点个数
		data = (T[]) new Object[maxSize];
	}

	// 添加父结点
	public void addRoot(T value) {

		data[0] = value;
		size++;

	}

	// 返回二叉树的节点数目
	public int getNodesCount() {

		return size;

	}
	
	
	//判断二叉树是否为空
	public boolean isEmpty(){
		
		if(data[0] == null){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
		
		
		
	}

	// 返回父节点的数据
	public T getRoot() {

		return data[0];

	}

	// 添加子结点 1.父节点的下标 2.子结点的数据 3.是左子树还是右子树
	public void addNode(int parentIndex, T value, boolean left) {

		int nodeIndex = 0;
		
		
		//判断父节点是不是为空
		if(data[parentIndex]==null){
			
			throw new RuntimeException(parentIndex + ": null");
			
			
		}
		
		// 判断左子结点有没有可能超出结点的最大数目
		if ((2 * parentIndex + 1) >= maxSize) {

			 throw new RuntimeException("array full");

		}

		if (left == true) { // 如果是左子树
			// 确定结点下标
			nodeIndex = 2 * parentIndex + 1;
			// 存入数据
			data[nodeIndex] = value;
			size++;

		} else { // 如果是右子树
					// 确定结点下标
			nodeIndex = 2 * parentIndex + 2;
			// 存入数据
			data[nodeIndex] = value;
			size++;

		}

	}

	// 显示树
	public void displayTree() {
		for (int i = 0; i < maxSize; i++) {

			System.out.print(data[i] + "  ");

		}
		System.out.println();

	}

}
