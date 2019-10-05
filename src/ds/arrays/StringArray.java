package ds.arrays;

public class StringArray {
	
	public static String[] initialize(String[] strs) {

		for (int i = 0; i < strs.length; i++) {

			strs[i] = String.valueOf(i);
		}

		return strs;
	}
	
	public static void print(String[] strs) {
		
		for(String str: strs) {
			
			System.out.print(str + " ");
		}
	}

	public static void main(String[] args) {

		//create an array of strings
		String[] strs = new String[10];
		
		strs = StringArray.initialize(strs);
		
		StringArray.print(strs);
		
	}

}
