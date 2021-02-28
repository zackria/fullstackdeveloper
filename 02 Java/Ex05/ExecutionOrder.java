public class ExecutionOrder
{
    public ExecutionOrder()
    {
       System.out.println("ExecutionOrder Constructor");
    }

    static
    {
        System.out.println("Static Block");
    }

    static void myMethod()
    {
        System.out.println("Static void myMethod");
    }

    public static void main(String args[])
    {
      System.out.println("Main Method");

      new ExecutionOrder();
    }

}
