import java.util.Scanner;// Import the Scanner class

//Scanner is used to read values from Console (Terminal / Command Prompt)

public class ScannerDemo{
  public static void main(String[] args) {

    // Create a Scanner object
    Scanner myScanner = new Scanner(System.in);

    System.out.println("Enter Username");

    String userName = myScanner.nextLine(); //Read user input from Console

    System.out.println("My Username is : "+ userName); // Output user input

    /*
		nextBoolean()	Reads a boolean value from the user
		nextByte()	Reads a byte value from the user
		nextDouble()	Reads a double value from the user
		nextFloat()	Reads a float value from the user
		nextInt()	Reads a int value from the user
		nextLine()	Reads a String value from the user
		nextLong()	Reads a long value from the user
		nextShort()	Reads a short value from the user
		
    */

  }
}
