class DummyClass {
    public String classVariable = "";
}

public class ClassInstantiation
{
    public static void main(String[] args) {
          //Process of creating a new object
          DummyClass object1 = new DummyClass();
          DummyClass object2 = new DummyClass();
          DummyClass object3 = object1;
          object3 = new DummyClass();

          object1.classVariable = "This is object 1 ";
          object2.classVariable = "This is object 2 ";
          object3.classVariable = "This is object 3 ";
          object1.classVariable = "This is object 1 ";

          System.out.println(object1.classVariable);
          System.out.println(object2.classVariable);
          System.out.println(object3.classVariable);
    }
}
