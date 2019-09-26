package ds.maxpriorityqueue;

public interface MaxPriorityQueue {
	
	public int maximum(int[] a);
	
	public int extractMaximum(int[] a);
	
	public void increaseKey(int[] a, int i, int key);
	
	public void insert(int[] a, int key);

}
