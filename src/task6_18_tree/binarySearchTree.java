package task6_18_tree;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * 
 * 
 * 使用链表实现二叉查找树
 */


public class binarySearchTree<T extends Comparable<T>> {
	
	//内部类结点
	private class Node<T>{
		
		private T data ;
		private Node<T> left ;
		private Node<T> right ;
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
	
	
	//声明根节点
	private Node<T> root ;
	
	//构造函数，根节点为null
	public binarySearchTree(){
		
		root = null ;
	}
	
	//清空二叉查找树
	public void makeEmpty(){
		root = null;
		
	}
	
	//判断树是否为空
	public boolean isEmpty(){
		
		return root==null ;
		
	}
	
	//查找树中是否存在某个元素
	
	
	public boolean contains(T data){
		
		return contains(data,root) ;
		
	}
	
	private boolean contains(T data,Node<T> root){
		
		if(root==null){
			
			return false ;
		}
		
		if(data.compareTo(root.data)>0){  //如果要查找的值大于节点的数据的值
			
			return contains(data,root.right);
				
		}else if(data.compareTo(root.data)<0){
			
			
			return contains(data,root.left);
			
		}else{
			
			return true ;
			
		}	
		
		
	}
	
	//查找树中的最小值
	public T findMin(){
		
		
		return findMin(root).data ;
			
	}
	
	private Node<T> findMin(Node<T> node){
		
		if(node==null){
			
			return null ;
		}else if(node.left==null){
			
			return node ;
			
		}
		
		return findMin(node.left);
		
	}
	
	//查找树中的最大值
	public T findMax(){
		
		return findMax(root).data ;
		
	}
	
	
	private Node<T> findMax(Node<T> node){
		
		if(node==null){
			
			return null ;
		}else if(node.right==null){
			
			return node ;
			
		}
		
		return findMax(node.right);
			
	}
	
	
	/*
	//在树中插入元素    
	//如果要插入的值比
	public void insert(T data){
		
		root = insert(data,root) ;
	
	}
	
	private Node<T> insert(T data,Node<T> node){
		
		if(node==null){
			
			return new Node(data,null,null);
			
		}
		//要插入的数据大于该结点的数据
		if(data.compareTo(node.data)>0){
			
			node.right = insert(data,node.right);
			
		}else if(data.compareTo(node.data)<0){
			node.left = insert(data,node.left);
			
			
		}
		
		
		return node ;
		
		
	}
	
	*/
	
	public void insert(T data){
		
		root = insert(data,root);
		
	}
	private Node<T> insert(T data,Node<T> node){
		
		if(node==null){
			
			return new Node(data,null,null);
		}
		
		if(data.compareTo(node.data)<0){
			
			node.left = insert(data,node.left);
			
		}else if(data.compareTo(node.data)>0){
			
			node.right = insert(data,node.right);
			
			
		}
		
		return node ;
		
		
	}
	
	//移除元素
	public void remove(T data){
		
		root = remove(data,root);
		
		
	}
	
	private Node<T> remove(T data,Node<T> node){
		
		if(node==null){
			
			return node ;
			
		}
		
		if(data.compareTo(node.data) < 0){
			
			node.left = remove(data,node.left);
			
		}else if(data.compareTo(node.data) > 0){
			
			
			node.right = remove(data,node.right);
			
			
			
		}else if(node.left!=null&&node.right!=null){
			
			
			node.data = findMin(node.right).data;
			node.right = remove(node.data,node.right);
			
		}else{
			
			if(node.left!=null){
				
				node = node.left ;
				
			}else{
				
				node = node.right ;
				
			}
			
			
			
		}
		
		
		return node ;
		
		
		
	}
	
	//中序遍历打印
	public void printTree(){
		
		printTree(root);
		
	}
	
	public void printTree(Node<T> node){
		
		if(node!=null){
			
			printTree(node.left);
			System.out.println(node.data);
			printTree(node.right);
			
		}
		
		
	}
	 
	//在二叉搜索树中查找第k个最大值   思路:先得到中序遍历的结果 再从中序遍历（从小到大排列）中得到结果
	public T findKmax(int k){
		
		middle(root);
		
		int size = listForMiddle.size();
		
		int Index = size - k ;
		
		return listForMiddle.get(Index);
		
		
	}
	
	LinkedList<T> listForMiddle = new LinkedList<T>() ;
	
	public void middle(Node<T> node){
		
		if(node!=null){
			
			middle(node.left);
			listForMiddle.add(node.data);
			middle(node.right);
	
		}
		
		
	}
	
	
	
	
	
	
	

}
