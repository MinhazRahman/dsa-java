package ds.strings;

/**
 * A k-rotation on a string takes the trailing k characters of the string 
 * and attaches it to the beginning of the string in the same order. 
 * You can rotate the String either in the clock wise (right from the top) 
 * or anti-clockwise(left from the top). 
 * The string can also be rotated in one go 
 * e.g. "123456" will become "456123" if we rotate 456 to the left around character "3".
 * */

public class StringRotation {
	
	public static String rotateStringClockWise(String str, int k) {
		
		//get the left substring
		String left = str.substring(0, str.length() - k);
		
		//get the right substring
		String right = str.substring(str.length() - k);
		
		//rotate the string clockwise
		String rotatedStr = right + left;
		
		return rotatedStr;
	}
	
	public static String rotateStringAntiClockWise(String str, int k) {
		
		//get the left substring
		String left = str.substring(0, k);
		
		//get the right substring
		String right = str.substring(k);
		
		//rotate the string anti clock wise
		String rotatedStr = right + left;
		
		return rotatedStr;
	}
	
	public static boolean isRotation(String original, String rotation, int k) {
		
		if(original.length() != rotation.length()) {
			
			return false;
		}
		
		//get the left substring
		String left = original.substring(0, original.length() - k);
		
		//get the right substring
		String right = original.substring(original.length() - k);
		
		//rotate the string clockwise
		String rotatedStr = right + left;
		
		
		return rotatedStr.equals(rotation);
	}

	public static void main(String[] args) {

		String s1= "Programming";
		String s2 = s1;
		int k = 3;
		
		System.out.println(s1);
		
		s1 = StringRotation.rotateStringClockWise(s1, k);
		System.out.println("Clockwise: " + s1);
		
		s2 = StringRotation.rotateStringAntiClockWise(s2, k);
		System.out.println("Anti Clockwise: " + s2);
		
		System.out.println("Is Rotation: " + StringRotation.isRotation("Programming","ingProgramm", k));
		
		
	}

}
