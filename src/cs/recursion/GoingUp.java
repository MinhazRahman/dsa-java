package cs.recursion;

/**
 * Write a recursive function to go up the stairs like:1..2..3..4..5
 * Or we can say to go up using the elevator like: first floor-->second floor-->third floor and so on
 * */
public class GoingUp {
	
	public static void goUp(int n) {
		
		//base case 
		if(n<1) {
			return;
		}
		
		//recursive steps
		goUp(n-1);
		System.out.print(n + " ");
	}

	public static void main(String[] args) {
		
		GoingUp.goUp(5);

	}

}
