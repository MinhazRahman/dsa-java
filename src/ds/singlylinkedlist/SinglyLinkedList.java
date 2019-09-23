package ds.singlylinkedlist;

public class SinglyLinkedList extends AbstractSinglyList{

	//declare variables
	Node head;

	@Override
	public int search(int data) {
	
		//start from the head node
		Node current = head;
		
		//iterate over the list
		while(current != null) {
			
			if(current.data == data) {
				
				return current.data;
			}
			
			//move to the next node
			current = current.next;
		}
		
		return -1;
	}

	@Override
	public void insert(int data) {

		//new node
		Node newNode = new Node(data);
		
		if(head != null) {
			
			newNode.next = head;
			
			head = newNode;	
		}
		else {
			
			head = newNode;	
		}
	}

	@Override
	public int delete(int data) {
		
		return 0;
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












