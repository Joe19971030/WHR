package task2019_6_10;

import java.util.Scanner;

//创建图    (无向图)
public class CreateGraph {
	graph g ;
	
	//测试一个点是否存在
	public Vertex pointExistOrNot(String name){
		
		boolean exist = false ;
		int vertexNum= this.g.getVertexNum() ;
		for(int k = 0 ; k <vertexNum;k++){
			
			if(this.g.points[k].getVertexName().equals(name)){
				
				
				return this.g.points[k];
				
			}
			
			
			
			
		}
		
		
		return null;
		
		
	}
	
	
	
	
	
	public void initGraph(graph g){
		
		this.g = g ;
		//输入图的顶点数和边数
		Scanner input = new Scanner(System.in);
		System.out.println("请输入图的顶点数：");
		this.g.setVertexNum(input.nextInt());
		System.out.println("请输入图的边数：");
		this.g.setEdgeNum(input.nextInt());
		String s = input.nextLine();
		//输入顶点名称：
		int pointIndex = 0 ;
		for(int i = 0 ; i < this.g.getVertexNum() ;i++){
			
			int j = i + 1 ;
			System.out.println("请输入第"+j+"个顶点的名称：");
			String name = input.nextLine() ;
			Vertex vt = new Vertex();
			vt.setVertexName(name);
			vt.setNext(null);
			this.g.points[i] = vt ;
			
		}
		
		//初始化边  需要知道两个顶点的名称
		for(int j = 0 ; j < this.g.getEdgeNum();j++){
			
			int k = j+1 ;
			System.out.println("请输入第"+k+"条边的两个顶点的名称：");
			String name1 = input.nextLine() ;
			String name2 = input.nextLine() ;
			
			Vertex v1 = pointExistOrNot(name1);
			Vertex v2 = pointExistOrNot(name2);
			
			if(v1==null || v2==null){
				
				System.out.println("顶点不存在,请重新输入");
				j-- ;
				
			}else{
				
				//v1指向v2
				Vertex newPoint2 = new Vertex();
				newPoint2.setVertexName(name2);
				newPoint2.setNext(v1.getNext());
				v1.setNext(newPoint2);
				
				//v2指向v1
				Vertex newPoint1 = new Vertex();
				newPoint1.setVertexName(name1);
				newPoint1.setNext(v2.getNext());
				v2.setNext(newPoint1);
				
				
			}
			
			
			
		}
		
		
		
		
			
	}
	
	
	//输出图
	public void disPlayGraph(){
		
		
		int length = this.g.getVertexNum() ;
		for(int i = 0 ;  i < length ; i++){
			
			Vertex vt = this.g.points[i] ;
			while(vt.getNext()!=null){
				
				System.out.print(vt.getVertexName()+"--->");
				
				vt = vt.getNext() ;
				
			}
			System.out.print(vt.getVertexName());
			
			System.out.println();
			
			
			
			
			
		}
		
		
		
	}
	
	
	
	
	

}
