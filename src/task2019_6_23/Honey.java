package task2019_6_23;

import java.awt.Point;
import java.util.HashMap;

public class Honey {
/*
	Point[] p ;
	
	int[][] distance;
	
	int[][] dp ;
	
	HashMap<Character,Integer> hm ;
	
	
	public int min(int[] array){ //从一个数组中查找最小值
		
		int length=array.length;
		int min=array[0];
		for(int i=1;i<length;i++){
			if(array[i]<min){
				
				min=array[i];
			}
			
			
		}
		
		return min;
	}
	
	public String tenToBinary(int num){  //把十进制数转换为二进制
		
		
		String reverse="";
		while(num!=0){
			int yuShu=num%2;
			reverse=reverse+yuShu;
			num=num/2;	
		}
		int length=reverse.length();
		String result="";
		for(int i=length-1;i>=0;i--){
			result=result+reverse.charAt(i);
			
		}
		
		return result;
		
	}
	
	
	public int d(int j,int i){
		
		//将i变为二进制形式   确定字符集合中的元素
		int[] hasChar=new int[5]; //五个字母对应的数组，当字母存在时，该位置为1，否则为0
		String iB=tenToBinary(i);
		char[] iBinary=iB.toCharArray();
		int length=iBinary.length;
		int No=4;
		for(int k=length-1;k>=0;k--){
			if(iBinary[k]=='0'){
				
				hasChar[No]=0;
				No--;
			}else{
				hasChar[No]=1;
				No--;	
			} 	
		}
		
		//先数一数hasChar数组中有多少个位置为1,1表示该位置的字母存在
		int charNum = 0 ;
		for(int z=0;z<5;z++){
			if(hasChar[z]==1){
				charNum++;
			}
		}
		
		for(int x=0;x<5;x++){
			if(hasChar[x]==1){
				
				
				
				
			}
			
			
			
			
		}
		
		
		
	}
	
	
	
	public int function(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4,int x5,int y5){   //返回最短距离
		p=new Point[6];
		Point p0=new Point(0,0);
		Point p1=new Point(x1,y1);
		Point p2=new Point(x2,y2);
		Point p3=new Point(x3,y3);
		Point p4=new Point(x4,y4);
		Point p5=new Point(x5,y5);
		p[0]=p0;
		p[1]=p1;
		p[2]=p2;
		p[3]=p3;
		p[4]=p4;
		p[5]=p5;
		//构造点与点之间的距离矩阵
		distance=new int[6][6];
		for(int i=0;i<6;i++){
			for(int j=0;j<6;j++){
				distance[i][j]=(int) Math.sqrt(Math.pow(p[i].x-p[j].x, 2)+Math.pow(p[i].y-p[j].y, 2));	
			}	
		}
		
		//构造d(O,{A,B,C,D,E})的索引
		dp=new int[6][32];
		hm = new HashMap<Character, Integer>();
		hm.put('A', 16);
		hm.put('B', 8);
		hm.put('C', 4);
		hm.put('D', 2);
		hm.put('E', 1);
		 
		char[] c1=new char[]{'O','A','B','C','D','E'};
		char[] c2=new char[]{'A','B','C','D','E'};
		
		//填表
		for(int i=0;i<32;i++){ //第i列
			for(int j=0;j<6;j++){//第j行
				
				if(i==0){
					dp[j][i]=distance[j][0];	
				}else{
					
					dp[j][i]=d(j,i);
					
				}
				
				
				
				
				
			}
			
			
			
			
			
		}
		
	
	}
	
	
	
	*/
	
	

}
