class EqualsOperator
{
    public static void main(String[] args) {
       int a = 20;
       int b = 20;

       String variable1 = "Test"; //Shared Memory Pool
       String variable2 = "Test"; //Shared Memory Pool
       String variable3 = new String("Test"); //Unique Memory Pool

       System.out.println("Value of a: "+a);
       System.out.println("Value of b: "+b);
       System.out.println("Comparing (a == b) : " +(a == b) );

       System.out.println("Value of variable1: "+variable1);
       System.out.println("Value of variable2: "+variable2);
       System.out.println("Comparing (variable1 == variable2) : " +(variable1 == variable2)  );

       System.out.println("Value of variable1: "+variable1);
       System.out.println("Value of variable3: "+variable3);
       System.out.println("Comparing (variable1 == variable3) : " +(variable1 == variable3)  );


      System.out.println("Comparing (variable1.equals(variable3)) : " +(variable1.equals(variable3) )  );

    }
}
