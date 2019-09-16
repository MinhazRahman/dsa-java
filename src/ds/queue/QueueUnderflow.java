package ds.queue;

public class QueueUnderflow extends Exception {

	private static final long serialVersionUID = 1L;
	
	//constructor
	public QueueUnderflow() {
		
	}
	
	public String toString() {
		
		return "Queue Underflow:";
	}

}
