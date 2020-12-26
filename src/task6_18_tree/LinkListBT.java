package task6_18_tree;

public class LinkListBT<T> {

	//声明根结点
	LinkListBtNode<T>   root ;
	
	//记录结点的个数
	int size ;
	
	//创建根结点并返回根结点
	public LinkListBtNode<T> createRoot(T data){
		
		root = new LinkListBtNode<T>(data);
		size++;
		
		return root ;
		
	}
	
	//创建其他结点并且返回该结点
	public LinkListBtNode<T> createNode(T data,LinkListBtNode<T> parentNode,boolean left){
		
		if(left==true){
			
			if(parentNode.left!=null){
				
				throw new RuntimeException("父母结点的左子树已存在！");
				
			}else{
			
			
			LinkListBtNode<T> newNode = new LinkListBtNode<T>(data);
			
			parentNode.left  = newNode ;
			
			size++ ;
			
			return newNode ;
			
			}
				
		}else{
			
			
			
				if(parentNode.right!=null){
				
				throw new RuntimeException("父母结点的右子树已存在！");
				
			}else{
			
			
			LinkListBtNode<T> newNode = new LinkListBtNode<T>(data);
			
			parentNode.right = newNode ;
			
			size++ ;
			
			return newNode ;
			
			}
			

		}
			
	}
	
	
	//返回这棵树的结点个数
	public int getNodeCount(){
		
		return this.size ;
		
	}
	
	//求这课二叉树的高度
	public int getHeight(){
		
		return getHeight(root);
			
	}
	
	private int getHeight(LinkListBtNode<T> node){
		
		if(node==null){
			
			
			return 0 ;
		}
		
		
		int lHeight = getHeight(node.left);
		
		int rHeight = getHeight(node.right);
		
		if(lHeight>rHeight){
			
			return lHeight + 1 ;
			
			
		}else{
			
			
			return rHeight + 1 ;
			
		}
		
		
	}
	
public void middle(LinkListBtNode<T> root){ 
		
		
		if(root.left!=null){
			
			
			middle(root.left);
			
		}
		
		System.out.println(root.data);
		
		
		if(root.right!=null){
			
			
			middle(root.right);
			
		}
		
		
	}
	
	

//查找与根节点距离k的节点

public void findDistanceKfromRoot(int k){
	
	findDistanceKfromRoot(k,root);
	

}


private void findDistanceKfromRoot(int k,LinkListBtNode<T> node){
	
	
	
	if(node==null){
		
		return ;
	}
	if(k==0){
		
		System.out.println("与根节点距离为k的节点名称为："+node.data);
		
	}else{
		
		findDistanceKfromRoot(k-1,node.left);
		
		
		findDistanceKfromRoot(k-1,node.right);
		
	}
	
	
	
}
	
	
	//在二叉树中查找给定节点的祖先节点
	public boolean printAncestors(LinkListBtNode<T> rootNode,LinkListBtNode<T> node){
		
		if(rootNode==null){
			
			return false;
			
		}
		if(rootNode.data.equals(node.data)){
			
			return true ;
			
		}
		
		if(printAncestors(rootNode.left,node)||printAncestors(rootNode.right,node)){
			
			System.out.println(rootNode.data+"  ");
			return true ;
			
		}
		return false;
		
		
		
	}
	




	
	
}
