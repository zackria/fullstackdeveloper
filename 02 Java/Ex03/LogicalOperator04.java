class LogicalOperator04 {
  public static void main(String[] args) {

  		//XOR
  		//The XOR logical operation, or exclusive or, 
  		//takes two boolean operands and returns true if 
  		//and only if the operands are different.


  		boolean a = true;
  		boolean b = true;
  		//a true b true A XOR B false 

  		System.out.println("a true b true A XOR B: " + (a ^ b) );

  		a = true;
  		b = false;
  		//a true b false A XOR  B true 

  		System.out.println("a true b false A XOR B: " +(a ^ b) );


  		a = false;
  		b = true;
  		//a false b true A XOR  B true 

  		System.out.println("a false b true A XOR B: " +(a ^ b) );

  		a = false;
  		b = false;
  		//a false b false A XOR  B false 

  		System.out.println("a false b false A XOR B: " +(a ^ b) );
	}

}