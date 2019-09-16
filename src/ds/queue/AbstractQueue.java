package ds.queue;

public abstract class AbstractQueue {
	
	//declare head and tail variables
	int head;
	int tail;
	
	
	//constructor
	public AbstractQueue(int head, int tail) {
		
		this.head = head;
		this.tail = tail;
	}
	
	//abstract methods
	public abstract void enqueue(int e) throws QueueOverflow;
	public abstract int dequeue() throws QueueUnderflow;
	public abstract int getHead();
	public abstract int getTail();
	public abstract boolean isEmpty();
	public abstract boolean isFull();

}
