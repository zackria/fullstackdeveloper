class LogicalOperator05 {
  public static void main(String[] args) {
      int a = 30;
      int b = 10;
      int c = 15;
      int d = 20;
      int x = 0;

      System.out.println("Value of A: "+a);
      System.out.println("Value of B: "+b);
      System.out.println("Value of C: "+c);
      System.out.println("Value of D: "+d);
      System.out.println("Value of X: "+x);

      // if ( a < b )
      // {
      //     x=c	;
      // }
      // else
      // {
      //     x=d;
      // }

      x= a < b ? c : d;

      System.out.println("Value of X: "+x);
  }
}
