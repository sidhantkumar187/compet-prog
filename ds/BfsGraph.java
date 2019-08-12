package ds;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BfsGraph {
	
	int v;
	LinkedList<Integer> adj[];
	
	BfsGraph(int v){
		this.v = v;
		adj = new LinkedList[v];
		
		for (int i = 0; i<v; i++) {
			adj[i] = new LinkedList<>();
		}
	}
	
	void addEdge(int src, int dest) {
		adj[src].add(dest);
		adj[dest].add(src);
	}
	
	void printGraph() {
		
		for (int i = 0; i < v; i++) {
			System.out.print(i+": ");
			Iterator<Integer> itr = adj[i].iterator();
			while(itr.hasNext()) {
				System.out.print(itr.next()+", ");
			}
			System.out.println();
		}
	}
	
	void bfs(int from) {
		
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[v];
		
		q.add(from);
		
		while (!q.isEmpty()) {
			Integer ver = q.poll();
			System.out.print(ver+" ");
			
			for (Integer temp : adj[ver]) {
				if (!visited[temp]) {
					q.add(temp);
					visited[temp] = true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		BfsGraph g = new BfsGraph(5);
		
		g.addEdge(0, 1);
		g.addEdge(0, 4);
//		g.addEdge(1, 0);
		g.addEdge(1, 4);
		g.addEdge(1, 3);
		g.addEdge(1, 2);
//		g.addEdge(4, 0);
//		g.addEdge(4, 1);
		g.addEdge(4, 3);
//		g.addEdge(2, 1);
		g.addEdge(2, 3);
		
		g.printGraph();
		
		g.bfs(1);

	}

}
