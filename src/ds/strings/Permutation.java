package ds.strings;

public class Permutation {
	
	//holds the flags to determine whether a character is already taken or not
	int[] a = new int[10];

	//holds the result
	char[] r = new char[10];
	
	
	public void permute(char[] s, int k) {
		
		int i;
		
		if( k == s.length) {
			
			System.out.println(String.valueOf(r));
		}
		else {
			
			for(i = 0; i < s.length; i++) {
				
				if(a[i] == 0) {
					
					r[k] = s[i];
					a[i] = 1;
					permute(s, k + 1);
					a[i] = 0;	
				}
			}
		}
	}

		
	public static void main(String[] args) {
		
		Permutation p = new Permutation();

		String str = "ABC";
		
		char[] chars = str.toCharArray();
		
		p.permute(chars, 0);
		

	}

}
