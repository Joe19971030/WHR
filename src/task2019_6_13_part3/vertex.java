package task2019_6_13_part3;

public class vertex {
	
	private String vertexName ;
	private edge firstEdge ;
	
	
	
	
	
	
	public String getVertexName() {
		return vertexName;
	}






	public void setVertexName(String vertexName) {
		this.vertexName = vertexName;
	}






	public edge getFirstEdge() {
		return firstEdge;
	}






	public void setFirstEdge(edge firstEdge) {
		this.firstEdge = firstEdge;
	}






	public vertex(){
		
		firstEdge = new edge();
		firstEdge.setNext(null);
		
	}
	
	
	
	
	
	

}
