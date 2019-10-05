package ds.strings;

public class StringToInteger {

	public static void main(String[] args) {

		String a = "123";
		String b = "123";
		
		String str = a + b;
		
		System.out.println("String: " + str);
		
		int c = Integer.valueOf(a);
		int d = Integer.valueOf(b);
		int e = c + d;
		
		System.out.println("Integer: " + e);
		
	}

}
