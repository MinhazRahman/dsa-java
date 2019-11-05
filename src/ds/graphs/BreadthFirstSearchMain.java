package ds.graphs;

public class BreadthFirstSearchMain {

	public static void main(String[] args) {

		//create object
		BreadthFirstSearch bfs = new BreadthFirstSearch(7);
		
		//call breadthFirstSearch() method with a starting vertex
		System.out.println("BFS Iterative:");
		bfs.breadthFirstSearch(1);
	}

}
