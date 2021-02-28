class ComparisonOperators02 {
  public static void main(String[] args) {
      ParentClass myObject1 = new ChildClass();
      ParentClass myObject2 = new ParentClass();


      System.out.println(" myObject1 instanceof ParentClass  : ");
      System.out.println(myObject1 instanceof ParentClass);

      System.out.println(" myObject1 instanceof ChildClass  : ");
      System.out.println(myObject1 instanceof ChildClass);

      System.out.println(" myObject2 instanceof ParentClass  : ");
      System.out.println(myObject2 instanceof ParentClass);

      System.out.println(" myObject2 instanceof ChildClass  : ");
      System.out.println(myObject2 instanceof ChildClass);

  }
}

class ParentClass{

}

class ChildClass extends ParentClass
{

}
