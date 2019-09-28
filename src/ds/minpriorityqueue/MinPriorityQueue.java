package ds.minpriorityqueue;

public interface MinPriorityQueue {
	
	public int minimum(int[] a);
	
	public int extractMinimum(int[] a) throws HeapUnderflow;
	
	public void decreaseKey(int[] a, int i, int key) throws LargerKey;
	
	public void insert(int[] a, int key) throws LargerKey;

}
