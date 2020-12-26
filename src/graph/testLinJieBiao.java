package graph;

public class testLinJieBiao {

	
	public static void main(String[]args){
		
		createLinJieBiaoDeTu t = new createLinJieBiaoDeTu(5);
		linJieBiaoDeBian e1 = new linJieBiaoDeBian(0,1,1);
		linJieBiaoDeBian e2 = new linJieBiaoDeBian(0,3,2);
		linJieBiaoDeBian e3 = new linJieBiaoDeBian(1,4,3);
		linJieBiaoDeBian e4 = new linJieBiaoDeBian(2,0,4);
		
		t.addEdge(e1);
		t.addEdge(e2);
		t.addEdge(e3);
		t.addEdge(e4);
		
		t.showGraph();
		
		
	}
	
	
	
	
	
	
	
	
}
