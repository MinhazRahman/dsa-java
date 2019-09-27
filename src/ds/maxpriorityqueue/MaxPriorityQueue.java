package ds.maxpriorityqueue;

public interface MaxPriorityQueue {
	
	public int maximum(int[] a);
	
	public int extractMaximum(int[] a) throws HeapUnderflow;
	
	public void increaseKey(int[] a, int i, int key) throws SmallerKey;
	
	public void insert(int[] a, int key) throws SmallerKey;

}
