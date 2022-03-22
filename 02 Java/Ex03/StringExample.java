public class StringExample{
  public static void main(String[] args) {
      //String Literal stored in String Variable
      String helloString = "Hello World!!";
      //String is from java.lang package

      System.out.println(helloString);

      System.out.println(helloString.startsWith("Hello"));
      System.out.println(helloString.endsWith("Hello"));
      System.out.println(helloString.length());
      System.out.println(helloString.indexOf("l"));
      System.out.println(helloString.indexOf("a"));
      System.out.println(helloString.replace("World", "Universe"));

      System.out.println(helloString);


      helloString = "      Hello World!!      ";
      System.out.println(helloString);
      System.out.println(helloString.trim());
  }
}
