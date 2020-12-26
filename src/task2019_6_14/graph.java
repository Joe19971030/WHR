package task2019_6_14;

public class graph {
	
	private int vertexNum ;
	private int edgeNum ;
	private vertex[] vertexArray ;
	
	
	public graph(){
		
		
		vertexArray = new vertex[100];
		
		
	}


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


	public vertex[] getVertexArray() {
		return vertexArray;
	}


	public void setVertexArray(vertex[] vertexArray) {
		this.vertexArray = vertexArray;
	}
	
	
	
	
	
	
	

}
