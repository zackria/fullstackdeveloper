class JavaArrays
{
  public static void main(String[] args) {
     String cars[] = {"Suzuki", "Honda"};
     int intArray[] = {10, 20};
     System.out.println(cars[0]);
     System.out.println(cars[1]);

     System.out.println(intArray[0]);
     System.out.println(intArray[1]);

     String newcars[] = new String[2];
     newcars[0] = "Audi";
     newcars[1] = "Tesla";

     System.out.println(newcars[0]);
     System.out.println(newcars[1]);

     Integer myArrayInt[] = new Integer[2];
     myArrayInt[0]= 30;
     myArrayInt[1] = 40;
     System.out.println(myArrayInt[0]);
     System.out.println(myArrayInt[1]);

     System.out.println(myArrayInt.length);
  }
}
