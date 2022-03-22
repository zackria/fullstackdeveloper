import java.lang.Math;


class MathPackage {
	public static void main(String[] args) {
		System.out.println("Value of PI is: " + Math.PI);

		System.out.println("Round value of 22.1: "+ Math.round(22.1));

		System.out.println("Floor value of 22.1: "+ Math.floor(22.1));

		System.out.println("Ceil value of 22.1: "+ Math.ceil(22.1));

		System.out.println("Max value of two numbers 22 & 28: "+ Math.max(22, 28));

		System.out.println("Math 2 power of 3 (2x2x2) is : "+ Math.pow(2, 3));

		double randomNumber = Math.round(Math.random()*10);
		int intRandomNumber = (int) randomNumber;

		System.out.println("Random Number (1-10): "+ intRandomNumber);

	}
}
