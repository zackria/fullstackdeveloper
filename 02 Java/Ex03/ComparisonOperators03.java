import java.text.DecimalFormat;

class ComparisonOperator03 {
  public static void main(String[] args) {
    double doubleVariable1 = 0.4;
    double doubleVariable2 = 0.8;

    System.out.println("Value of doubleVariable1: " + doubleVariable1);

    System.out.println("Value of doubleVariable2: " + doubleVariable2);

    for(int i=0; i<4; i++)
    {
      doubleVariable1 = doubleVariable1+0.1;
    }

    System.out.println("Value of doubleVariable1: " + doubleVariable1);

    System.out.println("Value of doubleVariable2: " + doubleVariable2);

    System.out.println("Compare doubleVariable1==doubleVariable2 : "+ (doubleVariable1==doubleVariable2));

    System.out.println("Value of doubleVariable1: " + Math.round(doubleVariable1));

    System.out.println("Value of doubleVariable2: " + Math.round(doubleVariable2));

    System.out.println("Compare Double.compare(doubleVariable1, doubleVariable2) : "+ Double.compare(doubleVariable1, doubleVariable2));

    DecimalFormat df = new DecimalFormat("##.#");

    doubleVariable1 = Double.valueOf( df.format(doubleVariable1));
    doubleVariable2 = Double.valueOf(df.format(doubleVariable2));

    System.out.println("Value of doubleVariable1: " + doubleVariable1);

    System.out.println("Value of doubleVariable2: " + doubleVariable2);

    System.out.println("Compare doubleVariable1==doubleVariable2 : "+ (doubleVariable1==doubleVariable2));

    System.out.println("Compare Double.compare(doubleVariable1, doubleVariable2) : "+ Double.compare(doubleVariable1, doubleVariable2));

    //0 means it is equal
    //-1 or negative means variable1 is less than variable2
    //1 or positive means variable1 is greater than variable2

  }
}
