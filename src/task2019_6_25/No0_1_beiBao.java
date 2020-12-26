package task2019_6_25;

public class No0_1_beiBao {
	
	static int[] weight; //物品重量数组
	static int[] value; //物品价值数组
	static int M=150;
	
	public double function(int[] weight,int[] value,int M){
		
		double sumValue=0;
		int num=weight.length;
		double[] divide=new double[num];
		for(int i=0;i<num;i++){
			
			divide[i]=(double)value[i]/(double)weight[i];
			
		}
		
		//从divide数组中选出最大的单位价值
		while(M>0){
		double max=0;
		int maxIndex=0;
		for(int j=0;j<num;j++){
			if(divide[j]>max){
				max=divide[j];
				maxIndex=j;
			}	
		}
		if(M>=weight[maxIndex]){//如果放的下整件物品
			
			sumValue=sumValue+value[maxIndex];
			M=M-weight[maxIndex];
		
		}else{ //如果放不下整件物品
			sumValue=sumValue+(double)M*divide[maxIndex];
			M=0;
		}
		divide[maxIndex]=-1;
		}
		
		return sumValue;
		
		
	}

	
	public static void main(String[]args){
		
		weight=new int[]{35,30,60,50};
		value=new int[]{10,40,30,50};
		double sum=new No0_1_beiBao().function(weight,value,M);
		System.out.println(sum);
		
	}
	

}
