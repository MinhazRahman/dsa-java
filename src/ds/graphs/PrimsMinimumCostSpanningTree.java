package ds.graphs;

public class PrimsMinimumCostSpanningTree {

	
	int max = Integer.MAX_VALUE;
	
	// (8x8) cost adjacency matrix
	int[][] adj = { {0, 0, 0, 0, 0, 0, 0, 0},
					{0, max, 25, max, max, max, 5, max},
					{0, max, max, 12, max, max, max, 10},
					{0, max, 12, max, 8, max, max, max},
					{0, max, max, max, max, 16, max, 14},
					{0, max, max, max, 16, max, 20, 18},
					{0, max, 5, max, max, 20, max, max},
					{0, max, 10, 12, 14, 18, max, max}
				  };
}
