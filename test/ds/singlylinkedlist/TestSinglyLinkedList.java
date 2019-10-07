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
	
	@Disabled
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
	
	@Disabled
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
	
	@Disabled
	@Test
	void testFoundAndDelete() {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		//insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		
		//print the list
		System.out.println("List:");
		list.printList();	
		
		//delete element
		int expected = 2;
		int actual = list.delete(2);
		
		//print the list
		System.out.println("List:");
		list.printList();
		
		assertTrue(expected == actual);
	}
	
	//@Disabled
	@Test
	void testNotFoundAndNotDeleted() {
		
		SinglyLinkedList list = new SinglyLinkedList();
		
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

}
























