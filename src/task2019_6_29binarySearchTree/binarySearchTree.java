package task2019_6_29binarySearchTree;

import java.util.LinkedList;

public class binarySearchTree<T extends Comparable<T>> {
	
	
	//定义树的根结点
	private Node<T> root;
	//构造函数，初始化树的根结点
	public binarySearchTree(){
		
		//root=new Node<T>(data);
		
		root=null;
	}
	//查找最小的结点的值   从根结点开始查找
	public T findMin(){
		
		return findMin(root);
		
	}
	private T findMin(Node<T> node){
		
		
		Node<T> N=node;
		
		if(N==null){
			return null;
		}
		while(N.left!=null){
			
			N=N.left;
			
		}
		return N.data;
			
	}
	
	//查找最大的结点的值   从根结点开始找
	public T findMax(){
		
		return findMax(root);
		
	}
	
	private T findMax(Node<T> node){
		Node<T> N=node;
		if(N==null){
			return null;
		}
		while(N.right!=null){
			N=N.right;
		}
		return N.data;	
	}
	
	
	//确定二叉搜索树中是否存在某个元素的结点
	public boolean exist(T data){
		
		return exist(data,root);
	
	}
	private boolean exist(T data,Node<T> node){
		
		if(node==null){
			return false;
		}
		
		if(node.data.equals(data)){
			
			return true;
			
		}else if(node.data.compareTo(data)>0){ //如果结点的值大于要查找的值
			
			return exist(data,node.left);
			
		}else{
			
			
			return exist(data,node.right);
			
			
		}
		
	}
	
	
	
	//往二叉搜索树中插入元素
	public void insert(T data){
		
		root=insert(data,root);
			
	}
	private Node<T> insert(T data,Node<T> node){
		
		if(node==null){
			return new Node<T>(data);
			
		}
		
		if(node.data.compareTo(data)<0){//如果结点的数据小于要插入的数据
			
			node.right=insert(data,node.right);
				
		}else if(  node.data.compareTo(data)>0  ){
			
			node.left=insert(data,node.left);
			
		}
		
		return node;
			
	}
	
	
	
	//移除搜索二叉树中的元素
	public void remove(T data){
		
		root=remove(data,root);
		
	}
	
	private Node<T> remove(T data,Node<T> node){
		
		if(node==null){
			return null;
		}
		
		if(node.data.compareTo(data)>0){
			
			node.left=remove(data,node.left);
		}else if(node.data.compareTo(data)<0){
			
			node.right=remove(data,node.right);
			
		}else{//如果当前节点为要删除的结点
			
			if(node.left==null&&node.right==null){  //如果删除的结点为叶子结点
				return null;	
			}else if(  ( node.left==null&&node.right!=null  )||(    node.left!=null&&node.right==null )   ){  //如果删除的结点有一个子结点
				
				if(     node.left==null&&node.right!=null                 ){//如果是右节点不为空
					
					return node.right;
					
					
				}else if(   node.left!=null&&node.right==null   ){ //如果是左节点不为空
					
					return node.left;
					
					
				}

			}else if(node.left!=null&&node.right!=null){ //如果要删除的结点有两个子结点
				
				//把该结点右子树中的最小值赋给该结点的值
				node.data=findMin(node.right);
				//删除该节点的右子树的最小值
				node.right=remove(node.data,node.right);
				
				return node;
			}
				
		}
		
		return node;
		
	}
	
	//中序遍历打印
	public void printTree(){
		
		printTree(root);
		System.out.println();
		
	}
	
	private void printTree(Node<T> node){
		
		if(node.left!=null){
			
			printTree(node.left);
			
		}
		System.out.print(node.data+"  ");
		if(node.right!=null){
			
			printTree(node.right);
			
		}
		
		
		
		
	}
	
	//在二叉搜索树中查找第k个最大值     
	LinkedList<T> findKmaxList;
	public T findKmax(int k){
		
		findKmaxList=new LinkedList<T>();
		findKmax(root);
		return findKmaxList.get(findKmaxList.size()-k);
		
		
	}
	private void findKmax(Node<T> node){
		if(node.left!=null){
			
			findKmax(node.left);
			
		}
		
		findKmaxList.add(node.data);
		
		if(node.right!=null){
			
			findKmax(node.right);
		}
		
	}
	
	
	
	
	

}
