package ds.strings;

public class FizzBuzz {
	
	public static void fizzBuzz(int n) {
		
		for(int i = 0; i <= n; i++) {
			
			//empty string
			String m = "";
			
			//divisible by 3
			if(i % 3 == 0) {
				
				m = "Fizz";
			}
			
			//divisible by 5
			if(i % 5 == 0) {
				
				m += "Buzz";
			}
			
			if(m != "") {
				
				System.out.println(m);
			}
			else {
				
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {

		FizzBuzz.fizzBuzz(100);
	}

}









