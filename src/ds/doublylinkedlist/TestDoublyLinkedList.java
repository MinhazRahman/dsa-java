package ds.doublylinkedlist;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * testIsEmpty() testInsert() testSearch() testDelete()
 */
class TestDoublyLinkedList {

	@Disabled
	@Test
	void testInsert() {

		DoublyLinkedList list = new DoublyLinkedList();

		// insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);

		// print the list
		System.out.println("List:");
		list.printList();
	}

	@Disabled
	@Test
	void testInsertLast() {

		DoublyLinkedList list = new DoublyLinkedList();

		// insert elements
		list.insertLast(1);
		list.insertLast(2);
		list.insertLast(3);

		// print the list
		System.out.println("List:");
		list.printList();
	}

	@Disabled
	@Test
	void testNodeFound() {

		DoublyLinkedList list = new DoublyLinkedList();

		// insert elements
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

		DoublyLinkedList list = new DoublyLinkedList();

		// insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);

		int expected = -1;
		int actual = list.search(4);

		assertTrue(expected == actual);

	}
	
	@Disabled
	@Test
	void testNotFoundAndNotDeleted() {

		DoublyLinkedList list = new DoublyLinkedList();

		// insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		// print the list
		System.out.println("List:");
		list.printList();

		// delete element
		int expected = -1;
		int actual = list.delete(5);

		// print the list
		System.out.println("\nList:");
		list.printList();

		assertTrue(expected == actual);
	}

	// @Disabled
	@Test
	void testDeleteAndDeleteLast() {

		DoublyLinkedList list = new DoublyLinkedList();

		// insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);

		// print the list
		System.out.println("List:");
		list.printList();

		// delete element
		int expected = 1;
		int actual = list.delete(1);

		// print the list
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
	void testDeleteLast() {

		DoublyLinkedList list = new DoublyLinkedList();

		// insert elements
		list.insert(1);
		list.insert(2);
		list.insert(3);

		// print the list
		System.out.println("List:");
		list.printList();

		int expected = 1;
		int actual = list.deleteLast();

		// print the list
		System.out.println("List:");
		list.printList();

		assertTrue(expected == actual);
	}

}
