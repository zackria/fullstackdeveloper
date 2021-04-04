public class Employee implements java.io.Serializable {
   public String name;
   public String address;
   public transient long creditCardNumber;
   public int number;
   
   public void mailCheck() {
      System.out.println("Mailing a check to " + name + " " + address);
   }
}