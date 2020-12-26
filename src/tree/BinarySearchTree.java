package tree;

/*
 * 
 * 用链表实现二叉搜索树
 * 
 * 
 * 
 */

public class BinarySearchTree<T extends Comparable<T>> {
	
	//创建结点类
	private class Node<T>{
		
		T data ;
		Node<T> left ;
		Node<T> right ;
		public Node(T data){	
			this.data = data ;	
			this.left = null ;
			this.right = null ;
		}
		public Node(T data,Node<T> left,Node<T> right){	
			this.data = data ;	
			this.left = left ;
			this.right = right ;
		}	
	}
	
	//定义根结点
	private Node<T> root ;
	
	//二叉搜索树的构造函数
	public BinarySearchTree(){
		
		root = null ;
	}
	
	/*
	//创建根结点   并返回根结点
	public Node<T> createRoot(T data){
		
		root = new Node(data);
		return root;
	}
	*/
	
	//查找最小的结点的值   从根结点开始查找
	public T getMin(){  //公有函数接口
		
		return getMin(root);
		
	}
	//私有函数
	private T getMin(Node<T> node){
		
		if(node==null){
			
			return null ;
		}
		
		while(node.left!=null){
			
			node = node.left ;
		}
		return node.data;	
	}
	
	//查找最大的结点的值   从根结点开始找
	public T getMax(){  //公有函数接口
		return getMax(root);	
	}
	
	private T getMax(Node<T> node){//私有函数
		
		if(node==null){
			
			return null ;
		}
		
		while(node.right!=null){
			
			node = node.right ;
		}
		return node.data;
		
	}
	
	
	//确定二叉搜索树中是否存在某个元素的结点
	public boolean contains(T value){ //公有函数接口
		return contains(value,root);
		
	}
	private boolean contains(T value,Node<T> node){ //私有函数
		
		if(node==null){
			
			return false;
		}
		
		int result = value.compareTo(node.data);
		
		if(result<0){
			
			return contains(value,node.left);
			
		}else if(result>0){
			
			return contains(value,node.right);
			
		}else{
			
			return true ;
			
		}
	
	}
	
	
	//往二叉搜索树中插入元素
	public void insert(T value){ //公有函数接口
		
		root = insert(value,root);
		
	}
	//私有函数
	private Node<T> insert(T value,Node<T> node){
		
		if(node==null){  //如果当前节点为空，则创建一个新的结点
			
		return  new Node(value) ;
			
			
		}
		
		int result = value.compareTo(node.data);
		
		if(result<0){
			
			node.left = insert(value,node.left);
			
		}else if(result > 0){
			
			node.right = insert(value,node.right);
			
		}
		
		return node;
		
		
		
	}
	
	//移除搜索二叉树中的元素
	public void remove(T value){
		
		root = remove(value,root);
		
	}
	
	private  Node<T> remove(T value,Node<T> node){
		
		if(node==null){
			
			return null ;
		}
		
		int result = value.compareTo(node.data);
		if(result<0){
			
			
			node.left = remove(value,node.left);
			
		}else if(result>0){
			
			node.right = remove(value,node.right);
		}else if(node.left!=null&&node.right!=null){
			
			node.data = getMin(node.right) ;
			
			node.right = remove(node.data,node.right);
		}else{
			
	 node=(node.left!=null)?node.left:node.right;	
			
			
		}
		
		return node ;
		
		
	}
	
	//中序遍历打印
	public void printTree(){
		
		printTree(root);
		
	}
	
	
	private void printTree(Node<T> node){
		
		if(node != null){
			printTree(node.left);
			System.out.println(node.data);
			printTree(node.right);
			
			
		}
		
		
	}
	
	

}
