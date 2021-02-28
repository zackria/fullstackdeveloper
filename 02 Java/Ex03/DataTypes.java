class DataTypes {
  public static void main(String[] args) {
    boolean booleanVariable;
    //System.out.println("Value of boleanVariable: "+ boleanVariable);

    booleanVariable = true;
    System.out.println("Value of b: "+ booleanVariable);

    booleanVariable = false;
    System.out.println("Value of b: "+ booleanVariable);

    byte byteVariable = 10;

    System.out.println("Value of byteVariable: " + byteVariable);

    byte byteVariable2 = 10;

    byte byteVariable3 = (byte) (byteVariable + byteVariable2);

    System.out.println("Value of byteVariable3: " + byteVariable3);


    char charVariable = 'a';

    System.out.println("Value of charVariable: " + charVariable);


    short shortVariable = 10000;

    System.out.println("Value of shortVariable: " + shortVariable);


    long longVariable = 100000000l;

    System.out.println("Value of longVariable: " + longVariable);

    int intVariable = 10;

    System.out.println("Value of intVariable: " + intVariable);

    float floatVariable = 10.1f;

    System.out.println("Value of floatVariable: " + floatVariable);

    double doubleVariable = 10.1;

    System.out.println("Value of doubleVariable: " + doubleVariable);

  }
}
