package ds.strings;

public class ReverseSentence {
	
	public static String reverseWord(String str) {
		
		//create string builder object
		StringBuilder sb = new StringBuilder();
		
		//split the string 
		String[] strings = str.split("\\s");
		
		//iterate over the String array in backward direction 
		//and append each word into string builder object
		for(int i = strings.length - 1; i >= 0; i--) {
			
			sb.append(strings[i] + " ");
		}
		
		return sb.toString();
		
	}

	public static void main(String[] args) {
		
		String str = "This is a string";
		
		str = ReverseSentence.reverseWord(str);
		
		System.out.println(str);

	}

}
