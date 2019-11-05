package ds.graphs;

import java.util.ArrayDeque;
import java.util.Queue;

/** An undirected graph, |V| = 7 and|E| = 8
 * 		1-------2
 * 		| 		|
 * 		|    	|
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

public class BreadthFirstSearch {
	
	//queue will store the vertices to be explored
	Queue<Integer> queue;
	
	//no of vertices
	int n;
	
	// (8x8) adjacency matrix
	int[][] adj = { {0,0,0,0,0,0,0,0},
					{0,0,1,0,1,0,0,0},
					{0,1,0,1,0,0,0,0},
					{0,0,1,0,1,0,0,0},
					{0,1,0,1,0,1,0,0},
					{0,0,0,1,1,0,1,1},
					{0,0,0,0,0,1,0,0},
					{0,0,0,0,0,0,1,0}
				  };
	
	//array to hold visited vertices
	int[] visited = {0,0,0,0,0,0,0,0};
	
	//constructor
	public BreadthFirstSearch(int n){
		
		this.queue = new ArrayDeque<>();
		this.n = n;
	}
	
	//breadth first search using iterative method
	void breadthFirstSearch(int vertex) {
		
		//holds the vertex removed from the queue
		int u;
		
		//visit
		visited[vertex] = 1;
		
		//BFS
		System.out.println(vertex);
		
		//add vertex to the queue
		queue.add(vertex);
		
		while(!queue.isEmpty()) {
			
			//take out the vertex from the queue for exploration
			u = queue.remove();
			
			//exploring vertex u, u=row, v = column
			for(int v = 1; v <= n; v++) {
				
				if(adj[u][v] == 1 && visited[v] == 0) {
					
					//visit
					visited[v] = 1;
					//BFS
					System.out.println(v);
					//add vertex to the queue for future exploration
					queue.add(v);
				}
			}	
		}
	}
	
	
}





























