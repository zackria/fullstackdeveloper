class UnaryOperator{
	public static void main(String[] args) {
		int a = 60;

		//~ (bitwise compliment)
		//Binary One's Complement Operator is unary and has the effect of 'flipping' bits.
		//(~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.
		System.out.println("Integer Value of a: "+a);
		System.out.println("Binary Value of a: "+Integer.toBinaryString(a));
		System.out.println(~a);
		System.out.println("Integer Value of a: "+(~a));
		System.out.println("Binary Value of a: "+Integer.toBinaryString(~a));


		int result = +1;
        // result is now 1
        System.out.println(result);

        result--;
        // result is now 0
        System.out.println(result);

        result++;
        // result is now 1
        System.out.println(result);

        result = -result;
        // result is now -1
        System.out.println(result);

        boolean success = false;
        // false
        System.out.println(success);
        // true
        System.out.println(!success);
	}
}