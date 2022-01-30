class CallByReferenceOrValue{

	public static void main(String args[]) {
	    int a = 10;
	    System.out.println("$$$$$$ Call By Value Example $$$$$$");
	    System.out.println("Before call Value of a = "+ a);
	    increment(a);
	    System.out.println("After call Value of a = "+ a);

	    System.out.println("");
	    
	    IntWrapper b = new IntWrapper(10);
	    System.out.println("$$$$$$ Call By Reference Example $$$$$$");
	    System.out.println("Before call Value of b = "+ b.a);
	    increment(b);
	    System.out.println("After call Value of b = "+ b.a);

	}

	public static void increment(int x) {
	    x = x + 1;
	}

	public static void increment(IntWrapper x) {
	    x.a = x.a + 1;
	}
	
}


class IntWrapper {
   public int a;
   public IntWrapper(int a){ this.a = a;}
}