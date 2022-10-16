import java.util.Arrays;

class StringToCharArray02{
	public static void main(String[] args) {
		// define a string
		String vowels = "aeiou";

		// create an array of characters. Length is vowels' length
		char[] vowelArray = vowels.toCharArray();

		for(int i = 0; i < vowelArray.length; i++){
			System.out.println(vowelArray[i]);
		}

		for(char tempVar: vowelArray){
			System.out.println(tempVar);
		}

		// print the array
		System.out.println(Arrays.toString(vowelArray));
		
	}
		
}