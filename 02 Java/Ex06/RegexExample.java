import java.util.regex.Matcher;
import java.util.regex.Pattern;

//https://regex101.com/
//https://www.javatpoint.com/java-regex
public class RegexExample {
  public static void main(String[] args) {
    Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("Visit W3Schools!");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }
}
