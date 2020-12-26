package graph;

import java.util.ArrayList;

public class createLinJieBiaoDeTu {

	int v; // 图中点的个数 用于创建链表数组
	ArrayList<linJieBiaoDeBian>[] arrayList; // 链表数组，用来存储图中的边
	int e; // 图中的边数

	// 构造函数
	public createLinJieBiaoDeTu(int v) {
		this.v = v;
		arrayList = new ArrayList[v];
		for (int i = 0; i < v; i++) {

			arrayList[i] = new ArrayList<linJieBiaoDeBian>();

		}

	}

	// 往图中添加边
	public void addEdge(linJieBiaoDeBian e) {

		arrayList[e.getFrom()].add(e); // 往特定的链表中加入边
		this.e++; // 边数+1

	}

	// 显示图中有的边
	public void showGraph() {

		for (int j = 0; j < v; j++) {
			for (linJieBiaoDeBian e : arrayList[j]) {

				System.out.println(e);

			}

		}

	}

}
