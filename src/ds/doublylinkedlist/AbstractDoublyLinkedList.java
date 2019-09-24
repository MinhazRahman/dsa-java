package ds.doublylinkedlist;

public abstract class AbstractDoublyLinkedList {

	
	//abstract methods
	public abstract int search(int x);
	
	public abstract void insert(int x);
	
	public abstract void insertLast(int x);

	public abstract int delete(int x);
	
	public abstract int deleteLast();
	
	public abstract boolean isEmpty();
}
