package ds.dequeue;

/**
 * Dequeue implementation using a circular array.
 * */
public class DequeueDemo extends AbstractDequeue {
	
	//declare the array to hold the queue
	int[] q;
	int capacity;
	
	//constructor
	public DequeueDemo(int size) {
			
		//create the array
		q = new int[size];
		
		//initialize the capacity of the queue
		this.capacity = size - 1;
		
	}

	@Override
	public void insertFirst(int e) {
		
		//when there is no element in the queue
		if(head == 0 && tail == 0) {
			
			//insert element at front or rear
			q[head] = e; //q[rear] = e
			
			//increment rear by 1
			tail++;
		}
	}

	@Override
	public void insertHead(int e) {
		
		if(isFull()) {
			
			System.out.println("Queue is full!");
		}
		else if(head == 0 && tail == 0) {
				
			//insert element
			q[head] = e;
			
			//increment rear
			tail++;
			
		}
		else if(head == 0 && tail != q.length - 1) {
			
			//set front to (q.length - 1) i.e the last index
			head = q.length - 1;
			q[head] = e;
		}
		else if(head != 0) {
			
			//decrement q by 1 and insert element
			q[--head] = e;
		}
		
	}

	@Override
	public void insertTail(int e) {

		if(isFull()) {
			
			System.out.println("Queue is full!");
		}
		else if(tail != q.length - 1) {
			
			//insert element and increment rear by 1
			q[tail++] = e;
		}
		else if (tail == q.length - 1 && head != 0) {
			
			//insert element
			q[tail] = e;
			
			//set rear to 0
			tail = 0;
		}
	}

	@Override
	public int deleteHead() {
		
		//get the head element
		int x = q[head];
		
		//new head
		if(head == q.length - 1) {
			
			head = 0;
		}
		else {
			head = head + 1;
		}
		
		
		return x;
	}

	@Override
	public int deleteTail() {
		
		int x;
		 
		if(tail == 0) {
			
			//new tail
			tail = q.length - 1;
			
			x = q[tail];

		}
		else {
			
			//new tail
			tail = tail - 1;
			
			x = q[tail];
		}
		
		return x;
	}

	@Override
	public boolean isEmpty() {
		
		return head == tail;
	}

	@Override
	public boolean isFull() {
		
		return (head == 0 && tail == q.length - 1) || (head == tail + 1);
	}

}
