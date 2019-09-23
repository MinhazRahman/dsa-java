package ds.dequeue;

public abstract class AbstractDequeue {
	
	//declare dequeue properties
	int head;
	int tail;
	
	//constructor
	public AbstractDequeue() {
		
		this.head = 0;
		this.tail = 0;
	}
	
	//abstract methods
	public abstract void insertFirst(int e);
	public abstract void insertHead(int e);
	public abstract void insertTail(int e);
	
	public abstract int deleteHead();
	public abstract int deleteTail();
	
	public abstract boolean isEmpty();
	public abstract boolean isFull();






}
