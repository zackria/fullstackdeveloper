class ShiftOperators
{
  public static void main(String[] args) {

      int a = 60; //Binary Value 1010

      System.out.println("Integer a value: "+a);
      System.out.println("Integer a binary value: " +Integer.toBinaryString(a));

      //Bitwise operator works on bits and performs bit-by-bit operation. Assume if a = 60 and b = 13; now in binary format they will be as follows −
      //a = 0011 1100
      //b = 0000 1101

      //<< (left shift)
      //Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.
      //A << 2 will give 240 which is 1111 0000
      int b = 0;
      b = a << 1;
      System.out.println("<< (left shift): a << 1 ");
      System.out.println("Integer b value: "+b);
      System.out.println("Integer b binary value: " +Integer.toBinaryString(b));

      System.out.println("Integer a value: "+a);
      System.out.println("Integer a binary value: " +Integer.toBinaryString(a));

      //>> (right shift)
      //Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
      //A >> 2 will give 15 which is 1111
      int c = 0;
      c = a >> 1;
      System.out.println(">> (right shift): a >> 1 ");
      System.out.println("Integer c value: "+c);
      System.out.println("Integer c binary value: " +Integer.toBinaryString(c));

      System.out.println("Integer a value: "+a);
      System.out.println("Integer a binary value: " +Integer.toBinaryString(a));

      //>>> (zero fill right shift)
      //Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros.
      //A >>>2 will give 15 which is 0000 1111
      int d = 0;
      d = a >>> 1;
      System.out.println(">>> (zero fill right shift): a >>> 1 ");
      System.out.println("Integer d value: "+d);
      System.out.println("Integer d binary value: " +Integer.toBinaryString(d));

      System.out.println("Integer a value: "+a);
      System.out.println("Integer a binary value: " +Integer.toBinaryString(a));

  }
}
