package ds.singlylinkedlist;

public class SinglyLinkedList extends AbstractSinglyList{

	//declare variables
	Node head;

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
	public void insert(int x) {

		//new node
		Node newNode = new Node(x);
		
		if(head != null) {
			
			newNode.next = head;
			
			head = newNode;	
		}
		else {
			
			head = newNode;	
		}
	}

	@Override
	public int delete(int x) {
		
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
		
		if(current != null && current.data == x) {  //found
			
			//delete the node by changing the references
			previous.next = current.next;
			current.next = null;
			
			return current.data;
		}
		
		//not found	
		return -1;
		
		
	}

	@Override
	public boolean isEmpty() {
		
		return head == null;
	}
	
	//print list
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












