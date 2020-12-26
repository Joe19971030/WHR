package task2019_6_26;

import java.awt.Point;

public class miFeng {

	int[][] distance = new int[4][4];
	int[][] dp = new int[4][8];
	public int min(int a,int b){
		
		if(a<b){
			return a;
		}
		else{
			return b;
		}
	}
	
	public int min3(int a,int b,int c){
		
		int min=a ;
		if(b<min){
			min=b;
		}
		if(c<min){
			min=c;
		}
		
		return min;
	}
	
	public String BinaryThree(String binary){//把所有的二进制数转换为3位的二进制数
		int length=binary.length();
		if(length==1){
			return "00"+binary;
		}else if(length==2){
			
			return "0"+binary;
			
		}else{
			
			return binary;
		}
	}
	

	public String tenToBinary(int num) { // 十进制整数转化为二进制字符串

		String str = "";
		while (num != 0) {

			str = str + num % 2;
			num = num / 2;

		}

		String result = "";
		int length = str.length();
		int j = 0;
		char[] tmp = new char[length];
		for (int i = length - 1; i >= 0; i--) {
			tmp[j] = str.charAt(i);
			j++;
		}

		for (int i = 0; i < length; i++) {
			result = result + tmp[i];
		}

		return result;

	}

	public int function(int x1, int y1, int x2, int y2, int x3, int y3) { // 先做三个点的

		Point[] points = new Point[4];
		Point p0 = new Point(0, 0);
		Point pA = new Point(x1, y1);
		Point pB = new Point(x2, y2);
		Point pC = new Point(x3, y3);
		points[0] = p0;
		points[1] = pA;
		points[2] = pB;
		points[3] = pC;
		// 构造距离矩阵
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				distance[i][j] = (int) Math
						.sqrt(Math.pow(points[i].x - points[j].x, 2) + Math.pow(points[i].y - points[j].y, 2));
			}
		}

		// 填表dp
		// 先填写第一列的数据
		for (int i = 0; i < 4; i++) {
			dp[i][0] = distance[i][0];
		}

		// 填写后续的数据
		for (int i = 1; i < 8; i++) { // 列
			for (int j = 0; j < 4; j++) { // 行
				//通过列的十进制数获得对应的二进制数从而得知点集中的元素
				String bin=tenToBinary(i);
				String binary=BinaryThree(bin);
				int length=binary.length();
				int num=0;
				for(int k=0;k<length;k++){ //计算有多少个地点
					if(binary.charAt(k)=='1'){
						num++;
					}	
				}
				if(num==1){ //如果只有一个地点
					int index=0;
					for(int k=0;k<3;k++){
						
						if(binary.charAt(k)=='1'){
							index=k;
						}
						
					}
					
					if(index==0){//如果为A
						
					dp[j][i]=distance[j][1]+dp[1][0];
					}else if(index==1){ //如果为B
						
						dp[j][i]=distance[j][2]+dp[2][0];
						
					}else if(index==2){//如果为C
						dp[j][i]=distance[j][3]+dp[3][0];
					}
		
				}else if(num==2){//如果有两个地点
					
					if(binary.charAt(0)=='1'&& binary.charAt(1)=='1'){//如果为A和B
						
						//dp[j][i]=min(distance[j][1]+dp[1][2],distance[j][2]+dp[2][4]);                       );
						
					}else if(binary.charAt(0)=='1'&&binary.charAt(2)=='1'){//如果为A和C
						
						dp[j][i]=min(distance[j][1]+dp[1][1],distance[j][3]+dp[3][4]);
						
					}else if(binary.charAt(1)=='1'&&binary.charAt(2)=='1'){//如果为B和C
						dp[j][i]=min(distance[j][2]+dp[2][1],distance[j][3]+dp[3][2]);
						
						
					}
						 
				}else if(num==3){  //三个点
					dp[j][i]=min3(distance[j][1]+dp[1][3],distance[j][2]+dp[2][5],distance[j][3]+dp[3][6]);
					
					
					
					
				}
				
				

			}

		}
		
		int answer=dp[0][7];
		return answer;
	
	
	}
	
	
	public static void main(String[]args){
		
		int num=new miFeng().function(0, 1, 0, 2, 0, 3);
		
		
		
	}
	

}
