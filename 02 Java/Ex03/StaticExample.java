class StaticExample
{

   static int testVariable;

   static
   {
       System.out.println("Static Block");
   }

   public static void main(String[] args) {
      System.out.println("Main Method");
   }

   static void mymethod()
   {
      System.out.println("myMethod");
   }

}

class ExecuteStatic
{
    public static void main(String[] args) {
        StaticExample obj =  new StaticExample();
        StaticExample obj1 =  new StaticExample();
        StaticExample obj2 =  new StaticExample();

        obj.testVariable = 1;
        obj1.testVariable = 2;
        obj2.testVariable = 3;

        System.out.println(obj.testVariable);
        System.out.println(obj2.testVariable);
    }
}
