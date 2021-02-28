class LogicalOperators {
  public static void main(String[] args) {

    int intVariable1 = 10;
    int intVariable2 = 20;

    System.out.println("(intVariable1 + intVariable2) : "+ (intVariable1 + intVariable2));
    System.out.println("(intVariable1 - intVariable2) : "+ (intVariable1 - intVariable2) );
    System.out.println("(intVariable1 * intVariable2) : "+ (intVariable1 * intVariable2));
    System.out.println("(intVariable1 / intVariable2) : "+ (intVariable1 / intVariable2));
    System.out.println("(intVariable1 % intVariable2) : "+ (intVariable1 % intVariable2));
    System.out.println("(intVariable1 ++) : "+ (intVariable1 ++));
    System.out.println("intVariable1 : "+ intVariable1);
    System.out.println("(intVariable1 --) : "+ (intVariable1 --));
    System.out.println("intVariable1 : "+ intVariable1);

    if(intVariable1==10 & intVariable2 == 20)
    {
      System.out.println("intVariable1==10 & intVariable2 == 20 : "+ (intVariable1==10 & intVariable2 == 20));
    }

    if(intVariable1==10 | intVariable2 == 30)
    {
      System.out.println("intVariable1==10 | intVariable2 == 30 : "+ (intVariable1==10 | intVariable2 == 30));
    }

    if(intVariable1==10 && intVariable2 == 20)
    {
      System.out.println("intVariable1==10 && intVariable2 == 20 : "+ (intVariable1==10 & intVariable2 == 20));
    }

    if(intVariable1==10 || intVariable2 == 30)
    {
      System.out.println("intVariable1==10 || intVariable2 == 30 : "+ (intVariable1==10 || intVariable2 == 30));
    }

    boolean xorVar1 = false;
    boolean xorVar2 = true;

    boolean xorVariable = (
        (xorVar1 && !xorVar2) || (!xorVar1 && xorVar2)
    );


    System.out.println("xorVariable : "+ xorVariable);

    xorVariable = xorVar1 ^ xorVar2;
    //false ^ false = false
    //false ^ true = true
    //true ^ false = true
    //true ^ true = false

    System.out.println("xorVariable : "+ xorVariable);


    int a = 10;
    int b = 20;
    int x = 0;
    int c = 30;
    int d = 40;


    System.out.println(" Value of a : "+ a);
    System.out.println(" Value of b : "+ b);
    System.out.println(" Value of c : "+ c);
    System.out.println(" Value of d : "+ d);
    System.out.println(" Value of x : "+ x);

    x = a < b ? c : d;

    System.out.println(" Value of x : "+ x);

    x=0;

    System.out.println(" Value of x : "+ x);

    if ( a < b )
    {
        x=c	;
    }
    else
    {
      x=d;
    }

    System.out.println(" Value of x : "+ x);

  }
}
