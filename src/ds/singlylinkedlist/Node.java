package ds.singlylinkedlist;

//create inner class Node
public class Node{
	
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