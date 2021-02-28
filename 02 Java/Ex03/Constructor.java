public class Constructor
{
    int a;

    public Constructor()
    {
        System.out.println("Inside Constructor");
        a = 10;
    }

    public static void main(String[] args) {
      Constructor obj = new Constructor();
      System.out.println(obj.a);
      //System.out.println(a);

      Constructor newobj = new Constructor();
      System.out.println(newobj.a);
    }
}
