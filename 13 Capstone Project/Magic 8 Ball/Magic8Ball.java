import java.util.*;
public class Magic8Ball
{

    public static String[] responseArray;

    public static void initializeResponses(){
        responseArray = new String[]{"It is certain",
          "It is decidedly so",
          "Without a doubt",
          "Yes definitely",
          "You may rely on it",
          "As I see it, yes",
          "Most likely",
          "Outlook good",
          "Yes",
          "Signs point to yes",
          "Reply hazy try again",
          "Ask again later",
          "Better not tell you now",
          "Cannot predict now",
          "Concentrate and ask again",
          "Don't count on it",
          "My reply is no",
          "My sources say no",
          "Outlook not so good",
          "Very doubtful"
        };
    }

    public static void predict(){
      int answer;
      answer = (int) (Math.random () * 20) + 1;
      switch(answer){
        case 1:
          System.out.println(responseArray[0]);
          break;
        case 2:
          System.out.println(responseArray[1]);
          break;
        case 3:
          System.out.println(responseArray[2]);
          break;
        case 4:
          System.out.println(responseArray[3]);
          break;
        case 5:
          System.out.println(responseArray[4]);
          break;
        case 6:
          System.out.println(responseArray[5]);
          break;
        case 7:
          System.out.println(responseArray[6]);
          break;
        case 8:
          System.out.println(responseArray[7]);
          break;
        case 9:
          System.out.println(responseArray[8]);
          break;
        case 10:
          System.out.println(responseArray[9]);
          break;
        case 11:
          System.out.println(responseArray[10]);
          break;
        case 12:
          System.out.println(responseArray[11]);
          break;
        case 13:
          System.out.println(responseArray[12]);
          break;
        case 14:
          System.out.println(responseArray[13]);
          break;
        case 15:
          System.out.println(responseArray[14]);
          break;
        case 16:
          System.out.println(responseArray[15]);
          break;
        case 17:
          System.out.println(responseArray[16]);
          break;
        case 18:
          System.out.println(responseArray[17]);
          break;
        case 19:
          System.out.println(responseArray[18]);
          break;
        case 20:
          System.out.println(responseArray[19]);
          break;
        default:
          System.out.println("My Power is not working today");
      }
    }
    public static void main (String [] args)
    {

        initializeResponses();
        Scanner keyboard = new Scanner (System.in);
        String question;

        while(true){
          System.out.println ("What's on your mind?");
          question = keyboard.nextLine ();
          if("exit".equalsIgnoreCase(question))
            break;
          predict();
        }

    }
}
