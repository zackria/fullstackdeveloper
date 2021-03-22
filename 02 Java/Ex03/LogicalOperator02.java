class LogicalOperator02 {
  public static void main(String[] args) {
    boolean boolVar1 = false;
    boolean boolVar2 = false;

    System.out.println("Value of boolVar1: "+boolVar1);
    System.out.println("Value of boolVar2: "+boolVar2);
    System.out.println("Boolean OR  boolvar1 | boolvar2: "+ (boolVar1 | boolVar2) );

    boolVar1 = false;
    boolVar2 = true;

    System.out.println("Value of boolVar1: "+boolVar1);
    System.out.println("Value of boolVar2: "+boolVar2);
    System.out.println("Boolean OR  boolvar1 | boolvar2: "+ (boolVar1 | boolVar2) );


    boolVar1 = true;
    boolVar2 = false;

    System.out.println("Value of boolVar1: "+boolVar1);
    System.out.println("Value of boolVar2: "+boolVar2);
    System.out.println("Boolean OR  boolvar1 | boolvar2: "+ (boolVar1 | boolVar2) );

    boolVar1 = true;
    boolVar2 = true;

    System.out.println("Value of boolVar1: "+boolVar1);
    System.out.println("Value of boolVar2: "+boolVar2);
    System.out.println("Boolean OR  boolvar1 | boolvar2: "+ (boolVar1 | boolVar2) );
  }
}
