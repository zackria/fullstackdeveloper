public class DeepCopy
{
    public static void main(String[] args) {
      Rectangle obj1 = new Rectangle();
      //Deep Copy
      Rectangle obj2 = new Rectangle();
      obj2.length = obj1.length;
      obj2.breadth = obj1.breadth;

      System.out.println(" Before Changing the value of object 1, the object2 will be - ");
      System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

       //Changing the values for object1.
       obj1.length = 10;
       obj1.breadth = 20;

       System.out.println("\n After Changing the value of object 1, the object2 will be - ");
       System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

    }
}
