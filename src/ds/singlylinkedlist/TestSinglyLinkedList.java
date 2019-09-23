package ds.singlylinkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * testIsEmpty()
 * testInsert()
 * testSearch()
 * testDelete()
 * */
class TestSinglyLinkedList {

	@Disabled
	@Test
	void testInsert() {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		//print the list
		System.out.println("List:");
		list.printList();
		
	}
	
	@Test
	void testNodeFound() {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		int expected = 1;
		int actual = list.search(1);
		
		assertTrue(expected == actual);
		
	}
	
	@Test
	void testNodeNotFound() {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		int expected = -1;
		int actual = list.search(4);
		
		assertTrue(expected == actual);
		
	}

}
