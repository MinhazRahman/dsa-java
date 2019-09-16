package ds.queue;

/**
 * A queue maintains FIFO(First In First Out) policy.
 * A queue has capacity, q[0...n], capacity = n -1;
 * When an element is enqueued, it takes its place at the tail of the queue
 * */
public class QueueDemo extends AbstractQueue{

	//declare the array that will hold the queue elements
	int[] queueArray;
	int capacity;
	
	//constructor
	public QueueDemo(int arraySize, int head, int tail) {
		super(head, tail);
		
		//define the array
		this.queueArray = new int[arraySize];
		
		//capacity of the queue
		this.capacity = queueArray.length - 1;
	}

	//insert element into the queue
	@Override
	public void enqueue(int e) throws QueueOverflow {
		
		if(isFull()) {
			
			throw new QueueOverflow();
		}
		
		//insert element at the tail
		queueArray[tail] = e;
		
		if(tail == (queueArray.length - 1)) { //when tail points to the last index of the array
			
			tail = 0;
		}
		else {
			
			tail++;
		}
		
	}

	//delete element from the array
	@Override
	public int dequeue() throws QueueUnderflow {
		
		if(isEmpty()) {
			
			throw new QueueUnderflow();
		}
		
		//retrieve the element
		int x = queueArray[head];
		
		if(head == queueArray.length - 1) {
			
			head = 0;
		}
		else {
			
			head++;
		}
		
		return x;
	}

	@Override
	public boolean isEmpty() {
		
		return head == tail;
	}

	@Override
	public boolean isFull() {
		
		return (head == tail + 1) || (head == 0 && tail == capacity );
	}

	@Override
	public int getHead() {
		
		return queueArray[head];
	}

	@Override
	public int getTail() {
		
		return queueArray[tail-1];
	}

}
