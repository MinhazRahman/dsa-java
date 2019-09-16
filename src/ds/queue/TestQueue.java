package ds.queue;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestQueue {

	@Test
	void testIsEmpty() {
		
		QueueDemo q = new QueueDemo(5, 0, 0);
		
		boolean actual = q.isEmpty(); //returns true
		boolean expected = true;
		
		assertTrue(expected == actual); 
	}
	
	@Test
	void testIsFull() throws QueueOverflow {
		
		QueueDemo q = new QueueDemo(5, 0, 0); //capacity = 5-1 = 4
		
		//insert elements
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		boolean actual = q.isFull();
		boolean expected = true;
		
		assertTrue(expected == actual); 
		
		//throws QueueOverflow exception
		//q.enqueue(5);
	}
	
	@Test
	void testEnqueue() throws QueueOverflow {
		
		QueueDemo q = new QueueDemo(5, 0, 0); //capacity = 5-1 = 4
		
		//insert elements
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		int actual = q.getHead();
		int expected = 1;
		
		assertTrue(expected == actual);
	}
	
	@Test
	void testDequeue() throws QueueOverflow, QueueUnderflow {
		
		QueueDemo q = new QueueDemo(5, 0, 0); //capacity = 5-1 = 4
		
		//insert elements
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		//delete elements
		int actual = q.dequeue();
		int expected = 1;
		
		int actualHead = q.getHead();
		int expectedHead = 2;
	
		assertTrue(expected == actual);
		assertTrue(expectedHead == actualHead);
	}
	
	

}
