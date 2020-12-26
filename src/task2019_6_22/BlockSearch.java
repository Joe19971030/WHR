package task2019_6_22;

import java.util.ArrayList;

/*
 * 
 * 
 * 区块查找
 */
public class BlockSearch {
	
	int[] index ; //声明索引数组
	ArrayList[] lists ; //声明区块链表数组，每一个链表代表一个区块
	
	public  BlockSearch(int[] index){
		
		if(index!=null && index.length>0){
			
			this.index=index;
			lists = new ArrayList[index.length];
			for(int i=0;i<index.length;i++){
				
				lists[i]=new ArrayList();
				
			}
			
		}else{
			
			throw new Error("索引数组不得为空！！！");
		}
	}
	
	
	
	//二分查找 查询出元素应该放入的区块
	public int binSearch(int value){
		
		int start=0;
		int end=index.length-1;
		int middle=-1;
		while(start<=end){
			middle=(start+end)/2;
			if(value>index[middle]){
				start=middle+1;
				
			}else{
				
				end=middle-1;
				
			}
			
	
		}
		return start; //返回元素应该在的区块位置
		
	}
	
	//向特定的区块中插入元素
	public void insert(int value){
		
		int blockNo = binSearch(value);
		lists[blockNo].add(value);	
	}
	
	
	//查找特定元素是否存在
	public boolean searchValue(int value){
		
		int blockNo = binSearch(value);
		
		ArrayList list = lists[blockNo];
		
		int listLength = list.size();
		
		for(int i=0;i<listLength;i++){
			if((int)list.get(i)==value){
				
				int realBlockNo=blockNo+1;
				int reali=i+1;
				System.out.println(value+"在第"+realBlockNo+"区块第"+reali+"位置");
				return true ;
			}
			
		}
		
		
		return false;
		
		
		
	}
	
	//打印出所有元素所在的区块和位置
	public void display(){
		
		for(int i=0;i<index.length;i++){
			
			ArrayList list=lists[i];
			int size=list.size();
			int blockNo=i+1;
			System.out.print("第"+blockNo+"区块的元素：");
			for(int j=0;j<size;j++){
				
				System.out.print(list.get(j)+"  ");
				
			}
			
			
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[]args){
		
		int[] index=new int[]{10,20,30};
		BlockSearch bs = new BlockSearch(index);
		bs.insert(8);
		bs.insert(11);
		bs.insert(22);
		System.out.println(bs.searchValue(8));
		System.out.println(bs.searchValue(9));
		bs.display();
		
	}
	
	
	

}
