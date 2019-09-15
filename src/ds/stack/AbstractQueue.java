package ds.stack;

public abstract class AbstractQueue {
	
	//declare instance variables
	int head;
	int tail;
	
	//constructor
	public AbstractQueue(int head, int tail) {
		
		this.head = head;
		this.tail = tail;
	}
	
	//abstract methods
	public abstract void enqueue(int element);
	public abstract int dequeue();

}
