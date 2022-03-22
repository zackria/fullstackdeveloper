public class CastingExample{
  public static void main(String[] args) {
    //Implicit Casting auto conversion
    // short is greater than byter
    // int is greater than short
    // long is greater than int
    // float is greter than long
    // double is greater than float

    // byte > short > int > long > float > double

    byte byteVariable = 10;

    short shortVariable = byteVariable;

    int intVariable = shortVariable;

    long longVariable = intVariable;

    System.out.println(longVariable);

    float floatVariable = longVariable;

    double doubleVariable = floatVariable;

    System.out.println(doubleVariable);

    // double is more precise than integer

    double x = 10.1;
    double y = x + 2;

    System.out.println(y);

    //Explicit Casting

    int yInt = (int) y;

    System.out.println(yInt);

    long longData = 12345678791097975L;

    System.out.println(longData);


    int longToInt = (int) longData;

    System.out.println(longToInt);

    byte intToByte = (byte) longToInt;

    System.out.println(intToByte);
  }
}
