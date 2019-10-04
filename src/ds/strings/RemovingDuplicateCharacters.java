package ds.strings;

public class RemovingDuplicateCharacters {
	
	public static String removeDuplicateCharacters(String str) {
		
		int i = 0, j = 0;
		
		//convert the string into char array
		char[] chars = str.toCharArray();
		
		//put the first character into a[i]
		chars[i] = chars[j];
		
		//iterate over the array to put all the distinct characters on the left
		for(j = 0; j < str.length(); j++) {
			
			if(chars[i] != chars[j]) {
				
				chars[++i] = chars[j];
			}
		}
		
		//truncate the distinct characters
		str = String.valueOf(chars).substring(0, i+1);
		
		return str;
	}

	public static void main(String[] args) {

		String s = "aaabbbccdddefghiiii";
		
		s = RemovingDuplicateCharacters.removeDuplicateCharacters(s);
		
		System.out.println(s);
	}

}














