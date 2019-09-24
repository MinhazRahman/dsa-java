package ds.circularlinkedlist;

/**
 * Circular Linked List using sentinels
 * 
 * */
public class CircularLinkedList extends AbstractCircularList {

	//declare variables
	Node head; //always points to the first node
	Node tail; //always points to the last node
	
	//constructor
	CircularLinkedList(){
		
	}
	
	//create an inner class Node
	class Node{
		
		//declare variables
		int data;
		Node next;
		
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
		while(current != null && current.data != x) {
			
			//move to the next node
			current = current.next;
		}
		
		if(current != null && current.data == x) { //found
			
			return current.data;
		}
		
		//not found
		return -1;
		
	}

	@Override
	public void insert(int x) {  //insert at first position
		
		//new node
		Node newNode = new Node(x);
		
		if(head != null) {
			
			newNode.next = head;
			
			head = newNode;
			
		}
		else {
			
			head = newNode;
			
			tail = newNode;
		}
		
	}
	
	@Override
	public void insertLast(int x) {
		
		//last node
		Node newNode = new Node(x);
		
		if(tail != null) {  //list is not empty
			
			tail.next = newNode;
			
			tail = newNode;
			
		}
		else {  //list is empty
			
			head = newNode;
			
			tail = newNode;
			
		}
		
	}

	@Override
	public int delete(int x) {  //delete any node
		
		//When the list is empty
		if(isEmpty()) {
			
			return -1;
		}
		
		//holds the previous node
		Node previous = null;
		
		//start from the head node
		Node current = head;
		
		//search for x
		while(current != null && current.data != x) {
			
			previous = current;
			
			//move to the current node
			current = current.next;
		}
		
		if(current != null && current.data == x) {  //found the node
			
			if(tail.data == x) {  //found node is the last node
				
				tail = previous;
			}
			
			//delete the node by changing the references
			previous.next = current.next;
			current.next = null;
			
			return current.data;
		}
		
		//not found	
		return -1;
		
		
	}
	
	@Override
	public int deleteLast() {
		
		//in case of empty list
		if(tail == null) {
			
			return -1;
		}
		
		//holds the previous node
		Node previous = null;
		
		//start from the head
		Node current = head;
		
		//go to the last node
		while(current != null && current.data != tail.data) {  //tail.data is the data of the last node
			
			previous = current;
			
			//move to the next node
			current = current.next;
		}
		
		if(current != null && current.data == tail.data) { //found the last node
			
			//delete the last node
			tail = previous;
			previous.next = null;
			
			return current.data;
			
		}
		
		//not found
		return -1;
	}

	@Override
	public boolean isEmpty() {
		
		return head == null;  //whether head refers to null or not
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
