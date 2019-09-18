package ds.dequeue;

public abstract class AbstractDequeue {
	
	//declare dequeue properties
	int front;
	int rear;
	
	//constructor
	public AbstractDequeue() {
		
		this.front = 0;
		this.rear = 0;
	}
	
	//abstract methods
	public abstract void insertFirst(int e);
	public abstract void insertFront(int e);
	public abstract void insertRear(int e);
	
	public abstract int deleteFront(int e);
	public abstract int deleteRear(int e);
	
	public abstract boolean isEmpty();
	public abstract boolean isFull();






}
