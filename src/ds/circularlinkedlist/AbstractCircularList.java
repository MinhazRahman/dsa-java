package ds.circularlinkedlist;

public abstract class AbstractCircularList {

	
	//abstract methods
	public abstract int search(int x);
	
	public abstract void insert(int x);
	
	public abstract void insertLast(int x);
	
	public abstract int delete(int x);
	
	public abstract int deleteLast();
	
	public abstract boolean isEmpty();
}
