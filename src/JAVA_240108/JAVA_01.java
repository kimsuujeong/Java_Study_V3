package JAVA_240108;

import java.util.Arrays;

public class JAVA_01 {
	
	static int[] parent;

	public static int jolra_be_ssam(int n, int[][] cost) {
		
		parent = new int[n];

		// 모든 간선안에 있는 수를 더하고 최소 값을 출력한다.
		// *크루스칼 알고리즘의 매커니즘
		// -> 크루스칼 알고리즘은 기본적으로 그리디한 선택을 바탕으로 알고리즘을 진행한다.
		int sum = 0;

		for (int i = 0; i < n; i++) { // 부모(섬) 추출
			parent[i] = i;
		}

		// (1) 주어진 그래프의 모든 간선에 대해서, 간선의 연결비용을 낮은 순으로 오름 차순 정렬한다.
		Arrays.sort(cost, (o1, o2) -> Integer.compare(o1[2], o2[2]));

		// (2) 정렬된 간선 순서대로 선택하면서, 간선의 양 끝 정점을 Union 한다.
		for (int i = 0; i < n; i++) {
			if (find(parent, cost[i][0]) != find(parent, cost[i][1])) { // 만약 부모가 다르다면
				union(parent, cost[i][0], cost[i][1]); // 노드 서로소 집합
				sum += cost[i][2];

			}
			// 단, 이때 선택된 두 정점이 같은 집합에 속해있다면, 사이클(cycle)이 있다고 판단하고 포함시키지 않는다.

		}

		// 이러한 매커니즘을 바탕으로 최종 선택된 간선을 연결한 것이 최소 비용 신장트리이다.
//		System.out.println(sum);
		return sum;
	}

	static int find(int[] parent, int x) { // 같은 집합에 속해 있다면 포함시키지 않는 코드
		if (parent[x] == x) {
			return x;
		}
		return find(parent, parent[x]);
	}

	static void union(int[] parent, int a, int b) { // 서로소 집합
		a = find(parent, a);
		b = find(parent, b);
		if (a > b) {
			parent[a] = b;
		} else {
			parent[b] = a;
		}
	}

	public static void main(String[] args) {

		// 섬의 갯수 4(노드) cost 5((n-1)*n)/2(간선))
		// 0섬과 1섬은 1 cost --
		// 0섬과 2섬은 2 cost --
		// 1섬과 2섬은 5 cost
		// 1섬과 3섬은 1 cost --
		// 2섬과 3섬은 8 cost
		// 2->0->1->3 = 4cost (최소)
		// 3->2->1->0 = 14cost (최대)

//		System.out.println(
//				jolra_be_ssam(4, new int[][] { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } }));
		System.out.println("n\tcost\t\t\t\treturn");
		System.out.println("4\t[[0,1,1],[0,2,2],[1,2,5],[1,3,1],[2,3,8]]"
		+jolra_be_ssam(4, new int[][] { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } }));
		
	}

}
