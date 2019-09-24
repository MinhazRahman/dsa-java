package ds.circularlinkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * testIsEmpty()
 * testInsert()
 * testSearch()
 * testDelete()
 * */
class TestCircularLinkedList {

	@Disabled
	@Test
	void testInsert() {
		
		CircularLinkedList list = new CircularLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		//print the list
		System.out.println("List:");
		list.printList();	
	}
	
	@Disabled
	@Test
	void testInsertLast() {
		
		CircularLinkedList list = new CircularLinkedList();
		
		//insert elements
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);
		
		//print the list
		System.out.println("List:");
		list.printList();	
	}
	
	@Disabled
	@Test
	void testNodeFound() {
		
		CircularLinkedList list = new CircularLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		int expected = 1;
		int actual = list.search(1);
		
		assertTrue(expected == actual);
		
	}
	
	@Disabled
	@Test
	void testNodeNotFound() {
		
		CircularLinkedList list = new CircularLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		int expected = -1;
		int actual = list.search(4);
		
		assertTrue(expected == actual);
		
	}
	
	//@Disabled
	@Test
	void testFoundAndDelete() {
		
		CircularLinkedList list = new CircularLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		//print the list
		System.out.println("List:");
		list.printList();	
		
		//delete element
		int expected = 1;
		int actual = list.delete(1);
		
		//print the list
		System.out.println("\nList:");
		list.printList();
		
		assertTrue(expected == actual);
		
		expected = 2;
		actual = list.deleteLast();
		
		//print the list
		System.out.println("\nList:");
		list.printList();
		
		assertTrue(expected == actual);
	}
	
	@Disabled
	@Test
	void testNotFoundAndNotDeleted() {
		
		CircularLinkedList list = new CircularLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		//print the list
		System.out.println("List:");
		list.printList();	
		
		//delete element
		int expected = -1;
		int actual = list.delete(5);
		
		//print the list
		System.out.println("\nList:");
		list.printList();
		
		assertTrue(expected == actual);
	}
	
	@Disabled
	@Test
	void testDeleteLast() {
		
		CircularLinkedList list = new CircularLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		
		//print the list
		System.out.println("List:");
		list.printList();	
		
		int expected = 1;
		int actual = list.deleteLast();
		
		//print the list
		System.out.println("List:");
		list.printList();
		
		assertTrue(expected == actual);
	}

}
























