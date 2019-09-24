package ds.doublylinkedlist;


public class DoublyLinkedList extends AbstractDoublyLinkedList {

	//create variables
	//head points to the first node
	//tail points to the last node
	Node head;
	Node tail;
	
	//create an inner class Node
	class Node{
		
		//declare variables
		int data;
		Node next;
		Node prev;
		
		//constructor
		public Node(int data) {
			
			this.data = data;
		}
		
		@Override
		public String toString() {
			
			return Integer.toString(this.data);
		}
		
	}
	
	@Override
	public int search(int x) {
	
		//start from the head node
		Node current = head;
		
		//iterate over the list
		while(current != null) {
			
			if(current.data == x) { //found
				
				return current.data;
			}
			
			//move to the next node
			current = current.next;
		}
		
		//not found
		return -1;
	}

	@Override
	public void insert(int x) {  //insert at first position

		//new node
		Node newNode = new Node(x);
		
		if(head != null) {  //list is not empty
			
			head.prev = newNode;
			
			newNode.next = head;
			
			head = newNode;
			
			
		}
		else { //list is empty
			
			head = newNode;
			tail = newNode;
		}
	}

	@Override
	public void insertLast(int x) {
		
		//new node
		Node newNode = new Node(x);
		
		if(tail != null) {  //list is not empty
			
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
			
		}
		else {  //list is empty
			
			head = newNode;
			tail = newNode;
		}
			
	}

	@Override
	public int delete(int x) {  //delete any node
		
		if(isEmpty()) {
			
			return -1;
		}
		
		//start from the head
		Node current = head;
		
		//search for x
		while(current != null && current.data != x) {
			
			//move to the next node
			current = current.next;
			
		}
		
		//found the node
		if(current != null && current.data == x) {  
			
			if(tail.data == x) {  //found node is the last node
				
				tail = current.prev;  //now current.prev is the last node
				
				current.prev.next = null;
				
				current.prev = null;
				
				return current.data;
				
			}
			else {
				
				//delete the node
				current.prev.next = current.next;
				
				current.next.prev = current.prev;
				
				current.next = null;
				
				return current.data;
			
			}	
		}
		
		return -1;
	}

	@Override
	public int deleteLast() {
		
		//get the last node and the previous node of the last node
		Node last = tail;
		Node previous = tail.prev;
		
		//delete the last node
		tail.prev.next = null;
		
		tail.prev = null;
		
		//tail refers to the new last node
		tail = previous;
		
		return last.data;  //return the data of the deleted node
	}

	@Override
	public boolean isEmpty() {
		
		return head == null;  //whether head points to null or not
	}
	
	//print the list
	public void printList() {
		
		
		if(isEmpty()) {
			
			System.out.println("Empty List!");
		}
		
		//start from the head
		Node current = head;
		
		//iterate over the list
		while(current != null) {
			
			System.out.print(current + "--->");
			
			//move to the next node
			current = current.next;
		}
		
	}

}
