package ds.dequeue;

/**
 * Dequeue implementation using a circular array.
 * */
public class DequeueDemo extends AbstractDequeue {
	
	//declare the array to hold the queue
	int[] q;
	
	//constructor
	public DequeueDemo(int size) {
			
		//create the array
		q = new int[size];
		
	}

	@Override
	public void insertFirst(int e) {
		
		//when there is no element in the queue
		if(front == 0 && rear == 0) {
			
			//insert element at front or rear
			q[front] = e; //q[rear] = e
			
			//increment rear by 1
			rear++;
		}
	}

	@Override
	public void insertFront(int e) {
		
		if(isFull()) {
			
			System.out.println("Queue is full!");
		}
		else if(front == 0 && rear == 0) {
				
			//insert element
			q[front] = e;
			
			//increment rear
			rear++;
			
		}
		else if(front == 0 && rear != q.length - 1) {
			
			//set front to (q.length - 1) i.e the last index
			front = q.length - 1;
			q[front] = e;
		}
		else if(front != 0) {
			
			//decrement q by 1 and insert element
			q[--front] = e;
		}
		
	}

	@Override
	public void insertRear(int e) {

		if(isFull()) {
			
			System.out.println("Queue is full!");
		}
		else if(rear != q.length - 1) {
			
			//insert element and increment rear by 1
			q[rear++] = e;
		}
		else if (rear == q.length - 1 && front != 0) {
			
			//insert element
			q[rear] = e;
			
			//set rear to 0
			rear = 0;
		}
	}

	@Override
	public int deleteFront(int e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRear(int e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		return front == rear;
	}

	@Override
	public boolean isFull() {
		
		return (front == 0 && rear == q.length - 1) || (front == rear + 1);
	}

}
