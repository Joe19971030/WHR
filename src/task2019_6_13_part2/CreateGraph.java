package task2019_6_13_part2;

import java.util.Scanner;

public class CreateGraph {

	graph g;

	public int getVertexByName(String name) {

		int length = g.vertexList.size();
		for (int i = 0; i < length; i++) {

			if (g.vertexList.get(i).vertexName.equals(name)) {

				return i;

			}

		}

		return -1;

	}

	public void CG() {

		g = new graph();

		// 确定图的点数和边数
		Scanner input = new Scanner(System.in);
		int vertexNum = 0;
		System.out.println("请输入点的个数：");
		vertexNum = input.nextInt();
		g.vertexNum = vertexNum;
		int edgeNum = 0;
		System.out.println("请输入边的条数：");
		edgeNum = input.nextInt();
		g.edgeNum = edgeNum;
		input.nextLine();
		// 确定图的顶点链表
		for (int i = 0; i < vertexNum; i++) {
			int j = i + 1;
			vertex v = new vertex();
			System.out.println("请输入第" + j + "个顶点的名称：");
			String name = input.nextLine();
			v.vertexName = name;
			v.firstEdge.next = null;
			g.vertexList.add(v);

		}

		// 输入图的边
		for (int j = 0; j < edgeNum; j++) {

			String v1Name = null;
			String v2Name = null;
			System.out.println("请输入第1个顶点的名称：");
			v1Name = input.nextLine();
			System.out.println("请输入第2个顶点的名称：");
			v2Name = input.nextLine();
			// 通过点的名称获得图中链表数组中的点下标位置
			int v1Index = getVertexByName(v1Name);
			int v2Index = getVertexByName(v2Name);

			// 创建新的边 v1指向v2
			edge e2 = new edge();
			e2.edgeName = v2Index;
			e2.next = g.vertexList.get(v1Index).firstEdge.next;
			g.vertexList.get(v1Index).firstEdge.next = e2;

			// 创建新的边 v2指向v1
			edge e1 = new edge();
			e1.edgeName = v1Index;
			e1.next = g.vertexList.get(v2Index).firstEdge.next;
			g.vertexList.get(v2Index).firstEdge.next = e1;

		}

	}

	// 显示图
	public void display() {

		for (int i = 0; i < g.vertexNum; i++) {

			System.out.print(g.vertexList.get(i).vertexName);

			edge e = g.vertexList.get(i).firstEdge;
			while (e.next != null) {

				e = e.next;
				System.out.print("--->" + g.vertexList.get(e.edgeName).vertexName);

			}

			System.out.println();

		}

	}

}
