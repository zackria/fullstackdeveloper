import java.util.Arrays;

class StringToCharArray01{
	public static void main(String[] args) {
		// define a string
		String vowels = "aeiou";

		// create an array of characters. Length is vowels' length
		char[] vowelArray = new char[vowels.length()];

		// loop to iterate each characters in the 'vowels' string
		for (int i = 0; i < vowels.length(); i++) {
		    // add each character to the character array
		    vowelArray[i] = vowels.charAt(i);
		}

		// print the array
		System.out.println(Arrays.toString(vowelArray));
	}
}