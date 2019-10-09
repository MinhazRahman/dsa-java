package ds.strings;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteArrayToString {
	
	public static String convertByteArrayToString(byte[] bytes) throws UnsupportedEncodingException {
		
		String str = new String(bytes, "UTF-8");
		
		return str;
	}
	
	public static byte[] convertStringToByteArray(String str) {
		
		byte[] bytes = str.getBytes();
		
		return bytes;
	}
	

	public static void main(String[] args) throws UnsupportedEncodingException {

		byte[] bytes = {'P', 'r', 'o', 'g', 'r', 'a', 'm', 'm', 'i', 'n', 'g'};
		
		String str = ByteArrayToString.convertByteArrayToString(bytes);
		
		System.out.println(str);
		
		bytes = ByteArrayToString.convertStringToByteArray(str);
		
		System.out.println(Arrays.toString(bytes));
	}

}
