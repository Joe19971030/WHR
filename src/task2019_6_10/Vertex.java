package task2019_6_10;
//点类
public class Vertex {
	
	private String VertexName ;  //顶点名称
	private Vertex next ;  //下一个顶点
	public String getVertexName() {
		return VertexName;
	}
	public void setVertexName(String vertexName) {
		VertexName = vertexName;
	}
	public Vertex getNext() {
		return next;
	}
	public void setNext(Vertex next) {
		this.next = next;
	}
	
	

}
