import java.util.Arrays;

class StringToCharArray02{
	public static void main(String[] args) {
		// define a string
		String vowels = "aeiou";

		// create an array of characters. Length is vowels' length
		char[] vowelArray = vowels.toCharArray();

		// print the array
		System.out.println(Arrays.toString(vowelArray));
		
	}
		
}