import java.util.Arrays;

class MultidimensionalArray{
	public static void main(String[] args) {
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7

		for (int i = 0; i < myNumbers.length; ++i) {
	      for(int j = 0; j < myNumbers[i].length; ++j) {
	        System.out.println(myNumbers[i][j]);
	      }
	    }

	    System.out.println(Arrays.toString(myNumbers));

	    System.out.println(Arrays.deepToString(myNumbers));
	}
}