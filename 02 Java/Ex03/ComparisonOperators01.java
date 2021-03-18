class ComparisonOperators01
{
  public static void main(String[] args) {
      ComparisonOperators01 myObject1 = new ComparisonOperators01();

      ComparisonOperators01 myObject2 = null;//not initialized no instance available

      System.out.println("If myobject1 is a instanceOf ComparisonOperators01 ");

      System.out.println(myObject1 instanceof ComparisonOperators01);

      System.out.println(myObject1 instanceof java.lang.Object);


      System.out.println(myObject2 instanceof ComparisonOperators01);

      System.out.println(myObject2 instanceof java.lang.Object);
  }
}
