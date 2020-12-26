package tree;

/*
 * 
 * 基于链表的二叉树
 * 泛型T的作用就是当用户创建一个类的对象时可以自定义对象的属性的类型
 * 
 */
public class linkListBinaryTree<T> {

	private linkListBinaryTreeNode<T> root; // 树的根结点
	private int size = 0; // 树的结点的个数

	// 创建根结点
	public void createRoot(T data) {

		if (data == null) {

			throw new RuntimeException("根结点为空");

		}

		root = new linkListBinaryTreeNode<T>(data);
		size++;

	}
	
	//返回根结点
	public linkListBinaryTreeNode<T> getRoot(){
		
		return root ;
		
	}
	
	

	// 创建子结点 然后返回该结点
	public linkListBinaryTreeNode<T> addNode(T data, linkListBinaryTreeNode<T> parentNode, boolean left) {

		if (data == null) { // 如果子结点的数据为空

			throw new RuntimeException("子结点为空");

		}

		if (parentNode == null) {

			throw new RuntimeException("父结点为空");

		}

		if (left == true) { // 如果为父节点的左结点

			if (parentNode.left != null) {

				throw new RuntimeException("父节点的左子树不为空");

			} else {

				// 添加结点
				linkListBinaryTreeNode<T> node = new linkListBinaryTreeNode<T>(data);
				parentNode.left = node;
				size++;
				return node ;
			}
		} else {
			// 如果为父节点的右结点
			if (parentNode.right != null) {

				throw new RuntimeException("父节点的右子树不为空");

			} else {

				// 添加结点
				linkListBinaryTreeNode<T> node = new linkListBinaryTreeNode<T>(data);
				parentNode.right = node;
				size++;
				return node;
			}

		}

	}
	
	
	//获得结点的数量
	public int getNodeCounts(){
		return size ;
		
		
	}
	
	
	
	

}
