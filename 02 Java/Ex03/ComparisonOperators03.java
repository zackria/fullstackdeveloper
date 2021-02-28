class ComparisonOperators03 {
  public static void main(String[] args) {

      double doubleVariable1 = 0.4;
      double doubleVariable2 = 0.8;

      System.out.println("Value of doubleVariable1 : "+ doubleVariable1);

      for(int i=0;i<=4;i++)
      {
        doubleVariable1 = doubleVariable1 + 0.1;
      }

      System.out.println("Value of doubleVariable1 : "+ doubleVariable1);

      System.out.println("doubleVariable1==doubleVariable2 : " + (doubleVariable1==doubleVariable2));

      final double THRESHOLD = .1;

      System.out.println("(Math.abs(doubleVariable1 - doubleVariable2) < THRESHOLD) : " + (Math.abs(doubleVariable1 - doubleVariable2) < THRESHOLD));

      Double doubleVariable3 = Double.valueOf(10.1);
      Double doubleVariable4 = Double.valueOf(10.1);

      System.out.println("Value of doubleVariable3 : "+ doubleVariable3);
      System.out.println("Value of doubleVariable4 : "+ doubleVariable4);

      System.out.println("Double.compare(doubleVariable3, doubleVariable4) : " +
        Double.compare(doubleVariable3, doubleVariable4)
      ); // 0 if equal, negative if var1 less than var2, positive if var1 greater than var2

      doubleVariable4 = Double.valueOf(10.2);

      System.out.println("Value of doubleVariable3 : "+ doubleVariable3);
      System.out.println("Value of doubleVariable4 : "+ doubleVariable4);

      System.out.println("Double.compare(doubleVariable3, doubleVariable4) : " +
        Double.compare(doubleVariable3, doubleVariable4)
      ); // 0 if equal, negative if var1 less than var2, positive if var1 greater than var2

      doubleVariable4 = Double.valueOf(9.9);

      System.out.println("Value of doubleVariable3 : "+ doubleVariable3);
      System.out.println("Value of doubleVariable4 : "+ doubleVariable4);

      System.out.println("Double.compare(doubleVariable3, doubleVariable4) : " +
        Double.compare(doubleVariable3, doubleVariable4)
      ); // 0 if equal, negative if var1 less than var2, positive if var1 greater than var2
  }
}
