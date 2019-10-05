package ds.strings;

public class IntegerToString {

	public static void main(String[] args) {

		int a = 123;
		int b = 456;
		int c = a + b;
		
		System.out.println("Integer:" + c);
		
		String s1 = String.valueOf(a);
		String s2 = String.valueOf(b);
		String s3 = s1 + s2;
		
		System.out.println("String:" + s3);
	}

}
