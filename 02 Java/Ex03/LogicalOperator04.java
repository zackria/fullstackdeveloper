class LogicalOperator04 {
  public static void main(String[] args) {
      int a = 10;
      int b = 20;

      System.out.println("Value of int a: "+a );
      System.out.println("Value of int b: "+b );

      System.out.println(a<11);
      System.out.println(b>11);

      System.out.println("Value of int a: "+ (a++) );
      System.out.println("Value of int b: "+ (b++) );

      System.out.println("Value of int a: "+a );
      System.out.println("Value of int b: "+b );

      System.out.println("a<12: "+(a<12));
      System.out.println("b>11: "+(b>11));
      System.out.println("a<12 & b>11: "+ (a<12 & b>11) );

      System.out.println("a<12 | b>11: "+ (a<12 | b>11) );

      System.out.println("Value of int a: "+a );
      System.out.println("Value of int b: "+b );
      System.out.println("(a++)<12 || (b++)>20: "+ ((a++)<12 || (b++)>20) );//Short 

      System.out.println("Value of int a: "+a );
      System.out.println("Value of int b: "+b );
  }
}
