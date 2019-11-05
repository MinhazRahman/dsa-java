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
 * */

public class BreadthFirstSearch {
	
	//declare a queue
	Queue<Integer> queue;
	
	//holds a vertex removed from the queue
	int u;
	
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
	public BreadthFirstSearch(){
		
		this.queue = new ArrayDeque<>();	
	}
	
	//breadth first search,
	void breadthFirstSearch(int vertex) {
		
		//visited
		visited[vertex] = 1;
		
		//BFS
		System.out.println(vertex);
		
		//add vertex to the queue
		queue.add(vertex);
		
		while(!queue.isEmpty()) {
			
			//take out the vertex from the queue
			u = queue.remove();
			
			//exploring vertex u
			for(int v = 1; v <= 7; v++) {
				
				if(adj[u][v] == 1 && visited[v] == 0) {
					
					visited[v] = 1;
					System.out.println(v);
					queue.add(v);
				}
			}	
		}
	}

}





























