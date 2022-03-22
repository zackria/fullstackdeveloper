public class EscapeCharacters{

  public static void main(String[] args) {
    String helloString = "Hello World!!";

    System.out.println(helloString);

    // \" escape character is for Double Quote
    helloString = "\"Hello World!!\" ";

    System.out.println(helloString);

    // \\ escape character is for backslash
    helloString = "C:\\Windows\\Users";

    System.out.println(helloString);

    // \' escape character is for single quote
    helloString = "\'Hello World!!\'";

    System.out.println(helloString);

    // \n escape character is for new line
    helloString = "Hello\nWorld!!";

    System.out.println(helloString);

    // \t escape character is for adding tab
    helloString = "Hello\tWorld!!";

    System.out.println(helloString);
  }
}
