package task2019_6_13;

import java.util.Scanner;

public class createGraph {

	graph g;

	// 通过顶点的名称获得顶点在顶点数组的下标
	public int findIndexByName(String vertexName) {

		for (int i = 0; i < this.g.vertexNum; i++) {

			if (this.g.vertexArray[i].vertexName.equals(vertexName)) {

				return i;

			}

		}

		return -1;

	}

	public void CG() { // 创建图的函数

		g = new graph();

		Scanner input = new Scanner(System.in);
		int vertexNum = 0;
		int edgeNum = 0;
		System.out.println("请输入点的个数：");
		vertexNum = input.nextInt();
		g.vertexNum = vertexNum;
		System.out.println("请输入边的数目：");
		edgeNum = input.nextInt();
		g.edgeNum = edgeNum;
		input.nextLine();
		// 初始化图的顶点数组
		for (int i = 0; i < vertexNum; i++) {

			int j = i + 1;
			String vertexName = null;
			System.out.println("请输入第" + j + "个点的名称：");
			vertexName = input.nextLine();

			vertex v = new vertex();
			v.vertexName = vertexName;
			v.next = null;
			g.vertexArray[i] = v;

		}

		
		
		// 初始化边 输入两个顶点的名称 通过名称找到该顶点在顶点数组的下标
		for (int j = 0; j < edgeNum; j++) {

			String v1Name = null;
			String v2Name = null;
			System.out.println("请输入第1个点的名称：");
			
			v1Name = input.nextLine();
			System.out.println("请输入第2个点的名称：");
			v2Name = input.nextLine();
			// 点1在顶点数组的下标:
			int v1Index = 0;
			v1Index = findIndexByName(v1Name);
			// 点2在顶点数组的下标:
			int v2Index = 0;
			v2Index = findIndexByName(v2Name);
			if (v1Index != -1 && v2Index != -1) { // 找到两个点的下标

				// 实现点1指向点2
				vertex newV2 = new vertex();
				newV2.vertexName = v2Name;
				newV2.next = this.g.vertexArray[v1Index].next;
				this.g.vertexArray[v1Index].next = newV2;

				// 实现点2指向点1
				vertex newV1 = new vertex();
				newV1.vertexName = v1Name;
				newV1.next = this.g.vertexArray[v2Index].next;
				this.g.vertexArray[v2Index].next = newV1;

			}

		}

	}

	public void displayGraph() {

		for (int i = 0; i < g.vertexNum; i++) {

			vertex v = this.g.vertexArray[i];
			while (v.next != null) {

				System.out.print(v.vertexName + "--->");
				v = v.next;

			}

			System.out.println(v.vertexName);

		}

	}

}
