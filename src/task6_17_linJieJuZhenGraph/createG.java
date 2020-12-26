package task6_17_linJieJuZhenGraph;

import java.util.Scanner;

public class createG {

	char[] vertexNames;
	int[][] edges;
	int vertexNum;
	int edgeNum;

	public createG() {

		vertexNames = new char[20];

		edges = new int[20][20];

	}

	public void createGraph() {

		Scanner input = new Scanner(System.in);
		System.out.println("请输入顶点数目：");
		vertexNum = input.nextInt();
		System.out.println("请输入边的数目：");
		edgeNum = input.nextInt();
		input.nextLine();
		for (int i = 0; i < vertexNum; i++) {
			int j = i + 1;

			System.out.println("请输入第" + j + "个顶点的名称：");
			vertexNames[i] = input.nextLine().charAt(0);

		}

		for (int i = 0; i < edgeNum; i++) {
			int n = i + 1;
			String v1Name = null;
			String v2Name = null;
			System.out.println("现在创建第" + n + "条边   " + "请输入两个顶点的名称：");
			v1Name = input.nextLine();
			v2Name = input.nextLine();
			// 通过顶点名称获得顶点在顶点名称数组的下标
			int v1Index = 0;
			int v2Index = 0;
			for (int j = 0; j < vertexNum; j++) {

				if (v1Name.charAt(0) == vertexNames[j]) {

					v1Index = j;
					break;

				}

			}

			for (int k = 0; k < vertexNum; k++) {

				if (v2Name.charAt(0) == vertexNames[k]) {

					v2Index = k;
					break;

				}

			}

			System.out.println("请输入这条边的权值：");
			int edgeValue = 0;
			edgeValue = input.nextInt();
			edges[v1Index][v2Index] = edgeValue;
			edges[v2Index][v1Index] = edgeValue;
			input.nextLine();

		}

		int maxInt = Integer.MAX_VALUE;
		for (int i = 0; i < vertexNum; i++) {
			for (int j = 0; j < vertexNum; j++) {

				if (edges[i][j] == 0 && i != j) {

					edges[i][j] = maxInt;

				}

			}

		}

	}

	public void displayG() {

		System.out.print(" ");
		for (int i = 0; i < vertexNum; i++) {

			System.out.print(vertexNames[i] + " ");

		}

		System.out.println();
		for (int j = 0; j < vertexNum; j++) {

			System.out.print(vertexNames[j]);

			for (int k = 0; k < vertexNum; k++) {

				System.out.print(edges[j][k] + " ");

			}

			System.out.println();

		}

	}

	// 单源最短距离 Node为源点
	public void dijkstra(int Node) {
		// 记录源点到其他各个点的距离
		int[] distance = new int[vertexNum];
		// 用一个boolean数组确认第几个结点已经被计算出从源点到该节点的最短距离
		boolean[] flag = new boolean[vertexNum];
		for (int i = 0; i < vertexNum; i++) {
			flag[i] = false;
		}

		for (int i = 0; i < vertexNum; i++) {
			distance[i] = edges[Node][i];
		}
		// 结点到自己的最短距离已经求出，为0
		flag[Node] = true;

		int maxInt = Integer.MAX_VALUE;

		for(int u = 1 ; u < vertexNum ; u++){
			int min = maxInt;
			int minIndex = 0;

			// 找出最小距离
			for (int i = 0; i < vertexNum; i++) {

				if (distance[i] < min && flag[i] != true) {

					min = distance[i];
					minIndex = i;
				}
			}

			flag[minIndex] = true;

			// 如果flag数组全部为true则可以退出循环
		/*	int countTrue = 0;
			for (int i = 0; i < vertexNum; i++) {

				if (flag[i] == true) {

					countTrue++;
				}

			}
			if (countTrue == vertexNum) {
				break;

			}
			countTrue = 0;
			*/

			// 接下来根据上面添加的结点扩充源节点可以到达的结点图
			for (int i = 0; i < vertexNum; i++) {

				if (edges[minIndex][i] != maxInt) {
					if (edges[minIndex][i] + distance[minIndex] < distance[i] && flag[i] != true) {

						distance[i] = edges[minIndex][i] + distance[minIndex];

					}

				}

			}

		}

		for (int i = 0; i < vertexNum; i++) {

			System.out.println(distance[i]);

		}

	}

}
