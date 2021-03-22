class LogicalOperator01 {
  public static void main(String[] args) {
     int a = 10;
     int b = 11;

     System.out.println("Value of a: "+a);
     System.out.println("Value of b: "+b);
     // System.out.println(a--);
     // System.out.println(b--);
     // System.out.println("Value of a: "+a);
     // System.out.println("Value of b: "+b);
     System.out.println((a--)>9 || (b--) <12);

     System.out.println("Value of a: "+a);
     System.out.println("Value of b: "+b);

}