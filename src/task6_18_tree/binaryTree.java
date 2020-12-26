package task6_18_tree;

import org.omg.CORBA.SystemException;

/*
 * 
 * 
 * 使用数组实现二叉树
 * 
 * 
 */
public class binaryTree<T> {

	
	//树的最大层数
	int deep ;
	//树的最大结点个数
	int maxSize ;
	//树的当前结点个数
	int size ;
	//存储结点数据的数组
	T[] data ;
	
	public binaryTree(int deep){
		this.deep = deep ;
		maxSize = (int) (Math.pow(2, deep) - 1) ;
		size = 0 ;
		data = (T[]) new Object[maxSize];	
	}
	
	
	//创建根结点
	public void createRoot(T value){
		
		data[0] = value ;
		size++ ;
			
	}
	
	
	//创建子结点
	public void createNode(T value,int parentIndex,boolean left){
		//先检验父母结点是否存在
		if(data[parentIndex]==null){
			
			throw new RuntimeException("父母结点"+parentIndex+"  不存在！");
			
		}
		//再检验有没有超出maxSize
		if( (2*parentIndex+1) >= maxSize){
			
			
			throw new RuntimeException("超出最大结点数目！");
			
		
		}
		
		
		if(left==true){
			
			int nodeIndex = 2*parentIndex+1 ;
			data[nodeIndex] = value ;
			size++ ;
	
		}else{
			
			int nodeIndex = 2*parentIndex+2 ;
			data[nodeIndex] = value ;
			size++ ;
				
		}
		
	}
	
	
	//检查这棵树是否为空
	public boolean isEmpty(){
		
		if(data[0]==null){
			
			
			return true ;
		}else{
			
			
			return false ;
		}
		
		
		
	}
	
	
	
	
	
	
	//显示这棵树
	public void displayTree(){
		
		for(int i = 0 ; i < maxSize; i++){
			
			System.out.print(data[i]+"  ");
			
			
			
		}
		
		
		
	}
	
	
	
	
}
