public class ShallowCopy
{
    public static void main(String[] args) {
              Rectangle obj1 = new Rectangle();
              //Shallow Copy
               Rectangle obj2 = obj1;

               System.out.println(" Before Changing the value of object 1, the object2 will be - ");
               System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

               //Changing the values for object1.
               obj1.length = 10;
               obj1.breadth = 20;

               System.out.println("\n After Changing the value of object 1, the object2 will be - ");
               System.out.println(" Object2 Length = "+obj2.length+", Object2 Breadth = "+obj2.breadth);

    }
}
