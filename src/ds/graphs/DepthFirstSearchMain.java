package ds.graphs;

public class DepthFirstSearchMain {

	public static void main(String[] args) {

		//create object
		DepthFirstSearch dfs = new DepthFirstSearch(7);
		
		//call depthFirstSearch() method with a starting vertex
		System.out.println("DFS Iterative:");
		dfs.depthFirstSearch(1);
		
		System.out.println("DFS Recursive:");
		//dfs.dfs(1);
	}

}
