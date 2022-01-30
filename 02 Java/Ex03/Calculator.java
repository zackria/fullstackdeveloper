import java.util.Scanner;


public class Calculator{

  public static void main(String[] args) {

     Scanner myScanner = new Scanner(System.in);

     System.out.println("Enter Number 1: ");

     int num1 = myScanner.nextInt();

     System.out.println("Enter Number 2: ");

     int num2 = myScanner.nextInt();

     System.out.println("Addition of Number 1 and Number 2 is: "+ (num1 + num2 ) );

     System.out.println("Subtraction of Number 1 and Number 2 is: "+ (num1 - num2 ));

      System.out.println("Multiplication of Number 1 and Number 2 is: "+ (num1 * num2 ));

      System.out.println("Division of Number 1 and Number 2 is: "+ (num1 / num2 ));

      System.out.println("Modulo of Number 1 and Number 2 is: "+ (num1 % num2 ));
  }

}
