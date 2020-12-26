package graph;

public class linJieBiaoDeBian {
	
	int from ; //边的起点
	int to ; //边的终点
	int weight ; //边的权值
	
	public linJieBiaoDeBian(int from, int to, int weight) {
		super();
		this.from = from;
		this.to = to;
		this.weight = weight;
	}
	
	public int getFrom(){
		return this.from ;
		
	}
	
	public int getTo(){
		return this.to ;
		
	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return from+"  "+to+"  "+weight;
	}
	
	
	
	

}
