import java.text.NumberFormat;

public class NumberFormatExample{
  public static void main(String[] args) {
    NumberFormat percentage = NumberFormat.getPercentInstance();
    String percentageFormat = percentage.format(0.1);
    System.out.println(percentageFormat);

    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String currencyFormat = currency.format(1234567.8910);
    System.out.println(currencyFormat);
  }
}
