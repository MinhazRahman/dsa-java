package ds.arrays;

public class CharToInt {

	public static void main(String[] args) {

		// If you store integer value in a single quote,
		// it will store actual character in char variable.
		char c = '5';
		System.out.println(c);

		
		// If you add '0' with int variable, it will return actual value in the char
		// variable.
		// The ASCII value of '0' is 48. So, if you add 1 with 48, it becomes 49 which
		// is equal to 1.
		// The ASCII character of 49 is 1.
		int a = 1;
		char ch = (char) (a + '0');
		System.out.println(ch);

		//To get the actual value, you can also use Character.forDigit() method.
		int radix = 10; //radix 10 is for decimal number, for hexa use radix 16  
		c = Character.forDigit(2, radix);
		System.out.println(c);
		
		radix=16;//radix 16 is for Hexadecimal value  
		a=10;    
		c=Character.forDigit(a,radix);    
		System.out.println(c);  //As you can see in the output, the hexadecimal code of 10 is a.
	}

}
