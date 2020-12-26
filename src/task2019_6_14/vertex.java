package task2019_6_14;

public class vertex {

	private String vertexName;
	private vertex next;
	private int vistied;

	public vertex() {

		this.vistied = 0;
	}

	public int getVistied() {
		return vistied;
	}

	public void setVistied(int vistied) {
		this.vistied = vistied;
	}

	public String getVertexName() {
		return vertexName;
	}

	public void setVertexName(String vertexName) {
		this.vertexName = vertexName;
	}

	public vertex getNext() {
		return next;
	}

	public void setNext(vertex next) {
		this.next = next;
	}

}
