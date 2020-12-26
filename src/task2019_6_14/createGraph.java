package task2019_6_14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class createGraph {

	graph g;
	vertex[] vertexArray;
	private int[] visited ;
	public int getVertexIndexByName(String Name) {

		int verNum = g.getVertexNum();

		for (int i = 0; i < verNum; i++) {

			if (vertexArray[i].getVertexName().equals(Name)) {

				return i;

			}

		}

		return -1;

	}

	public int getVertexIndex(vertex v) {

		for (int i = 0; i < g.getVertexNum(); i++) {

			if (v.getVertexName().equals(vertexArray[i].getVertexName())) {

				return i;

			}

		}

		return -1;

	}

	public void CG() {

		g = new graph();
		Scanner input = new Scanner(System.in);
		int vertexNum = 0;
		int edgeNum = 0;
		System.out.println("请输入图的顶点数：");
		vertexNum = input.nextInt();
		g.setVertexNum(vertexNum);
		System.out.println("请输入图的边数：");
		edgeNum = input.nextInt();
		input.nextLine();
		g.setEdgeNum(edgeNum);
		
		 visited = new int[g.getVertexNum()];
		
		// 初始化图的顶点数组
		vertexArray = g.getVertexArray();
		for (int i = 0; i < g.getVertexNum(); i++) {

			int j = i + 1;
			vertex v = new vertex();
			System.out.println("请输入第" + j + "个顶点的名称：");
			String vName = null;
			vName = input.nextLine();
			v.setNext(null);
			v.setVertexName(vName);
			vertexArray[i] = v;
		}

		// 初始化边
		for (int j = 0; j < g.getEdgeNum(); j++) {

			String v1Name = null;
			String v2Name = null;
			System.out.println("请输入第一个点的名称：");
			v1Name = input.nextLine();
			System.out.println("请输入第二个点的名称：");
			v2Name = input.nextLine();
			// 通过顶点的名称找出该点在顶点数组的下标位置
			int v1Index = getVertexIndexByName(v1Name);
			int v2Index = getVertexIndexByName(v2Name);
			// 实现点1指向点2
			vertex v2 = new vertex();
			v2.setVertexName(v2Name);
			v2.setNext(vertexArray[v1Index].getNext());
			vertexArray[v1Index].setNext(v2);
			// 实现点2指向点1
			vertex v1 = new vertex();
			v1.setVertexName(v1Name);
			v1.setNext(vertexArray[v2Index].getNext());
			vertexArray[v2Index].setNext(v1);

		}

	}

	public void displayGraph() {

		int verNum = g.getVertexNum();
		for (int i = 0; i < verNum; i++) {

			System.out.print(vertexArray[i].getVertexName());

			vertex v = vertexArray[i];

			while (v.getNext() != null) {

				v = v.getNext();

				System.out.print("--->" + v.getVertexName());

			}

			System.out.println();

		}

	}
	
	
	// BFS算法 广度优先遍历算法
	public void BFS() {

		// 新建一个队列 记录待访问的结点
		Queue<vertex> queue = new LinkedList<vertex>();
		// 新建一个集合 用来记录访问过的结点
		Set<vertex> set = new HashSet<vertex>();
		// 新建一个队列 记录待访问结点的名称
		Queue<String> vertexsNameQueue = new LinkedList<String>();
		// 新建一个集合 用来记录访问过的结点的名称
		Set<String> vertexsNameSet = new HashSet<String>();
		// 新建一个链表，用来记录访问结点的顺序
		ArrayList<vertex> list = new ArrayList<vertex>();
		// 给出初始结点
		vertex start = vertexArray[0];
		// 将初始结点加入队列中
		queue.offer(start);
		// 初始结点的名称加入队列
		vertexsNameQueue.offer(start.getVertexName());

		while (true) {

			// 找出与队头结点相连的结点，把他们放入队列中
			vertex queueHead = queue.peek();
			int queueHeadIndex = getVertexIndex(queueHead); // 获得队列头元素在顶点数组中的下标

			if (vertexArray[queueHeadIndex].getNext() != null) { // 找出与队头结点相连的结点，把他们放入队列中
				vertex v = vertexArray[queueHeadIndex].getNext();
				while (v != null) {

					String vName = v.getVertexName(); // 获得顶点的名称

					if (!vertexsNameSet.contains(vName) && !vertexsNameQueue.contains(vName)) {

						queue.add(v);
						vertexsNameQueue.add(vName);

						v = v.getNext();

					} else {

						v = v.getNext();

					}
				}
			}

			// 队列头元素出队，并且把元素加入set和list中
			vertex out = queue.poll();
			vertexsNameQueue.poll();
			set.add(out);
			vertexsNameSet.add(out.getVertexName());
			list.add(out);
			// 退出循环的条件可以为queue为空
			if (queue.isEmpty()) {

				break;

			}

		}

		// 输出遍历结果 输出list的结果
		int size = list.size();
		for (int i = 0; i < size; i++) {

			System.out.print(list.get(i).getVertexName() + "  ");

		}
		if(g.getVertexNum()==size){  //是全联通图
			
		//	图的边数=节点数-1
			int edgeNum = 0 ;
			for(int i = 0 ; i < g.getVertexNum() ; i++){
				
					vertex v =  vertexArray[i] ;
					while(v.getNext()!=null){
						edgeNum++ ;
						
						v = v.getNext() ;
						
						
					}
			}
			edgeNum = edgeNum/2 ;
			
			if(edgeNum==g.getVertexNum()-1){
				
				System.out.println("这个图是树");
				
			}
			
			
			
			
		}
		
		
		

	}  
	
	
	//DFS 深度优先遍历算法
	public void DFS(vertex search){
		
		//从顶点数组的第0个位置的结点开始访问
		DFSuser(g,0,search);
		
	}
	
	
	private void DFSuser(graph g,int index,vertex search){
		
		//输出被访问的结点
		System.out.println(vertexArray[index].getVertexName());
		visited[index] = 1 ; //表示该下标的结点已经被访问
		if(vertexArray[index].getVertexName().equals(search.getVertexName())){
			
			System.out.println("找到结点名称为："+vertexArray[index].getVertexName());
			return ;
		}
		
		//往下遍历
		
		vertex v = new vertex();
		v = vertexArray[index].getNext();

		
		while(v!=null){
			//获得顶点在顶点数组中的下标位置
			int vIndex =   getVertexIndex(v);
			if(visited[vIndex]!=1){ //还未被访问
				
				DFSuser(g,vIndex,search);
				
			}
			
			v = v.getNext() ;
			
			
		}
		
		
		
	}
	
	
	//计算图的边数
	public void calculateEdgeNum(){
		int count = 0 ;
		int length = g.getVertexNum() ;
		for(int i = 0 ; i < length ; i++){
			
			vertex headVertex = vertexArray[i] ;
			
			while(headVertex.getNext()!=null){
				
				count++ ;
				headVertex = headVertex.getNext();
				
			}
				
		}
		
		count = count/2 ;
		System.out.println("图的总边数为："+count);
		
	}
	
	

}
