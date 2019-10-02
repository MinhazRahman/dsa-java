package ds.strings;

public class RemovingCharacter {
	
	public static String removeCharacter(String word, char c) {
		
		int i, j, index = 0;
		
		char[] chars = word.toCharArray();
		
		//find character c in the string word
		for(i = 0; i < word.length(); i++) {
			
			if(word.charAt(i) == c) {
				
				index = i;	
				
				//if you put 'break', you will find the first match
				//if you remove break you will find the last match
				break;  
			}
		}
		
		//remove c from word
		for(j = index; j < word.length() - 1; j++) {
			
			chars[j] = chars[j+1];
		}
		
		//set the last value to NUL (null character)
		chars[j] = '\0';
		
		return String.valueOf(chars);
	}

	public static void main(String[] args) {

		String str = "Programming";
		char c = 'g';
		
		str = RemovingCharacter.removeCharacter(str, c);
		
		System.out.println(str);
		
	}

}






















