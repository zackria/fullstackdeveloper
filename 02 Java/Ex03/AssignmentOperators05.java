class AssignmentOperators05  {
  public static void main(String[] args) {
      int a = 10;
      int b = 20;

      System.out.println("Value of a: " + a);

      System.out.println("Value of b: " + b);

      // a%=b  which is eqivalent as  a = a%b
      System.out.println("a%=b :" + (a%=b) );

      System.out.println("Value of a: " + a);

      System.out.println("Value of b: " + b);
  }
}
