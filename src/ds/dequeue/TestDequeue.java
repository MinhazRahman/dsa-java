package ds.dequeue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestDequeue {

	@Disabled
	@Test
	void testInsertHead() {
		
		DequeueDemo dq = new DequeueDemo(5);
		
		//insert element
		dq.insertHead(1);
		dq.insertHead(2);
		dq.insertHead(3);
		dq.insertHead(4);
		dq.insertHead(5);


		System.out.println(dq.head);
		System.out.println(dq.tail);	
	}
	
	@Disabled
	@Test
	void testInsertTail() {
		
		DequeueDemo dq = new DequeueDemo(5);
		
		//insert element
		dq.insertTail(1);
		dq.insertTail(2);
		dq.insertTail(3);
		dq.insertTail(4);
		dq.insertTail(5);


		System.out.println(dq.head);
		System.out.println(dq.tail);
			
	}
	
	@Disabled
	@Test
	void testDeleteHead() {
		
		DequeueDemo dq = new DequeueDemo(5);
		
		//insert element
		dq.insertTail(1);
		dq.insertTail(2);
		dq.insertTail(3);
		dq.insertTail(4);

		System.out.println(dq.head);
		
		int x = dq.deleteHead();

		System.out.println(x);
		
		System.out.println(dq.head);
		System.out.println(dq.tail);
			
	}
	
	@Test
	void testDeleteTail() {
		
		DequeueDemo dq = new DequeueDemo(5);
		
		//insert element
		dq.insertHead(1);
		dq.insertHead(2);
		dq.insertHead(3);
		dq.insertHead(4);

		System.out.println("Before deletion:");
		System.out.println(dq.head);
		System.out.println(dq.tail);

		System.out.println("After deletion:");
		int x = dq.deleteTail();
		
		System.out.println("Deleted Element:" + x);
		System.out.println(dq.head);
		System.out.println(dq.tail);	
	}

}


















