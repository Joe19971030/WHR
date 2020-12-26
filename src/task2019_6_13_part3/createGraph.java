package task2019_6_13_part3;

import java.util.Scanner;

public class createGraph {
	
	
	graph g ;
	vertex[] vertexArray  ;
	
	
	public int getVertexIndexByName(String name){
		
		//vertex[] vertexArray = g.getVertexArray() ;
		for(int i = 0 ; i < g.getVertexNum() ; i++){
			
		//	System.out.println(vertexArray[i].getVertexName()+"***************");
			
			
			if(vertexArray[i].getVertexName().equals(name)){
				
				
				return i ;
				
			}
			
			
			
			
			
			
			
		}
		
		return -1 ;
		
	}
	
	
	
	public void CG(){
		
		g = new graph();
		vertexArray = g.getVertexArray() ;
		Scanner input = new Scanner(System.in);
		//确定图的顶点数和边数
		int vertexNum = 0 ;
		int edgeNum = 0 ;
		System.out.println("请输入图的顶点数：");
		vertexNum = input.nextInt() ;
		g.setVertexNum(vertexNum);
		System.out.println("请输入图的边数：");
		edgeNum = input.nextInt() ;
		g.setEdgeNum(edgeNum);
		input.nextLine();
		
		
		//初始化顶点数组
		//vertex[] vertexArray = g.getVertexArray() ;
		for(int i = 0 ; i < vertexNum ; i++){
			int j = i + 1 ;
			String vertexName = null ;
			System.out.println("请输入第"+j+"个点的名称：");
			vertexName = input.nextLine() ;
			vertex v = new vertex();
			v.setVertexName(vertexName);
			vertexArray[i] = v ;	
		}
		
		
		//添加边
		for(int j = 0 ; j < edgeNum ; j++){
			int k = j + 1 ;
			System.out.println("现在创建第"+k+"条边：");
			String v1Name = null ;
			String v2Name = null ;
			System.out.println("请输入初始顶点的名称：");
			v1Name = input.nextLine();
			System.out.println("请输入末尾顶点的名称：");
			v2Name = input.nextLine();
			double edgeValue = 0 ;
			System.out.println("请输入该边的权值：");
			edgeValue = input.nextDouble();
			input.nextLine() ;
			
			//通过顶点的名称找出他们在顶点数组中的下标位置
			int v1Index = 0 ;
			int v2Index = 0 ;
			v1Index = getVertexIndexByName(v1Name);
			v2Index = getVertexIndexByName(v2Name);
			//创建表示从v1指向v2的边，并且将边加入邻接链表中
			edge eV2  = new edge();
			eV2.setEdgeName(v2Index);
			eV2.setEdgeValue(edgeValue);
			eV2.setNext(vertexArray[v1Index].getFirstEdge().getNext());
			vertexArray[v1Index].getFirstEdge().setNext(eV2);
			
			
		}
		
	
	}
	
	
	
	
	
	public void display(){
		
		
		//vertex[] vertexArray = g.getVertexArray() ;
		int vertexNum = g.getVertexNum() ;
		
		for(int i = 0 ; i < vertexNum ; i++){
			
			System.out.print(vertexArray[i].getVertexName());
			
			
			edge e  = vertexArray[i].getFirstEdge() ;
			
			while(e.getNext()!=null){
				
				
				e = e.getNext() ;
				System.out.print("--"+e.getEdgeValue()+"-->" + vertexArray[e.getEdgeName()].getVertexName());
				
				
				
				
				
				
				
				
			}
			
			System.out.println();
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
