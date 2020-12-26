package graph;

public class createGraph {

	char[] points;
	int[][] edges;
	int pointIndex;

	public createGraph() {
		points = new char[20]; // 表示顶点的字符数组
		edges = new int[20][20];// 表示边的整型二维数组
		pointIndex = 0;
	}

	public void addPoints(char c) { // 往图中添加点

		points[pointIndex] = c;
		pointIndex++;

	}

	public void addEdges(int start, int end) { // 往图中添加边

		edges[start][end] = 1;
		edges[end][start] = 1;

	}

	// 显示图
	public void showGraph() {

		System.out.print(" ");
		for (int i = 0; i < pointIndex; i++) {
			System.out.print(points[i]);
		}
		
		System.out.println();
		for (int i = 0; i < pointIndex; i++) {
			System.out.print(points[i]);
			for (int j = 0; j < pointIndex; j++) {

				System.out.print(edges[i][j]);

			}
			System.out.println();

		}

	}
	
	//主函数进行测试
	public static void main(String[] args) {
		
		createGraph graph = new createGraph();
		graph.addPoints('a');
		graph.addPoints('b');
		graph.addPoints('c');
		graph.addPoints('d');
		graph.addEdges(0, 3);
		
		graph.addEdges(1, 2);
		
		graph.showGraph();
		
		
		
		
	}
	
	
	
	

}
