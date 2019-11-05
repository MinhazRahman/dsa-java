package ds.graphs;

import java.util.Stack;

/** An undirected graph, |V| = 7 and|E| = 8
 * 		1-----2
 * 		| 	 /	
 * 		|  /   	
 * 		4-------3
 * 		 \	   /
 * 		  \	  /
 * 	        5 
 * 		  /  \
 * 		 /    \
 * 		6	   7
 * 
 * 1. visiting 
 * 2. exploring
 * */

public class DepthFirstSearch {
	
	//stack
	Stack<Integer> stack;
	
	//no of vertices
	int n;

	// (8x8) adjacency matrix
	int[][] adj = { {0,0,0,0,0,0,0,0},
					{0,0,1,0,1,0,0,0},
					{0,1,0,0,1,0,0,0},
					{0,0,1,0,1,0,0,0},
					{0,1,0,1,0,1,0,0},
					{0,0,0,1,1,0,1,1},
					{0,0,0,0,0,1,0,0},
					{0,0,0,0,0,0,1,0}
				  };
	
	//holds visited vertices
	int[] visited = {0,0,0,0,0,0,0,0};
	
	//constructor
	public DepthFirstSearch(int n) {
		
		this.stack = new Stack<>();
		this.n = n;
	}
	
	//depth first search using iterative method
	//it takes a vertex as an input
	public void depthFirstSearch(int u) {
		
		//holds column as current vertex
		int v = 0;
		
		//visit
		visited[u] = 1;
		//DFS
		System.out.println(u);
		
		do {
			
			//starting vertex
			v = 1;
			
			//explore each vertex, u = row, v = column
			while(v <= n) {
			
				if(adj[u][v] == 1 && visited[v] == 0) {
					
					//visit
					visited[v] = 1;
					//DFS
					System.out.println(v);
					//push previous vertex into the stack for future exploration
					stack.add(u);
					
					//the new vertex to be explored
					u = v;
					v = 0;
				}
				
				//increment v
				v++;
			}
			
			//pop vertex from the stack for exploration
			u = stack.pop();
			
		}while(!stack.isEmpty());	
	}
	
	//depth first search using recursive method
	public void dfs(int u) {
		
		//visit
		if(visited[u] == 0) {
			
			System.out.println(u);
			visited[u] = 1;
			
			//explore
			for(int v = 1; v <= n; v ++) {
				
				if(adj[u][v] == 1 && visited[v] == 0) {
					
					dfs(v); //recursive call
				}
			}
		}
	}
}



































