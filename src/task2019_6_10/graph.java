package task2019_6_10;

/*
 * 
 * 邻接表  用顶点作为对象  构建图
 * 
 * 
 */

public class graph {

	private int vertexNum = 0 ;  //点的个数
	private int edgeNum = 0 ;  //边的个数
	 Vertex[] points = new Vertex[100] ;  //点的数组
	public int getVertexNum() {
		return vertexNum;
	
	}
	public void setVertexNum(int vertexNum) {
		this.vertexNum = vertexNum;
	}
	public int getEdgeNum() {
		return edgeNum;
	}
	public void setEdgeNum(int edgeNum) {
		this.edgeNum = edgeNum;
	}
	public Vertex[] getPoints() {
		return points;
	}
	public void setPoints(Vertex[] points) {
		this.points = points;
	}
	
	
	
	
}
