class StrictFPExample{

	// calculating sum using strictfp modifier
    public strictfp double sum()
    {
        double num1 = 10e+10;
  
        double num2 = 6e+08;
  
        return (num1+num2);
  
    }
  
    public static strictfp void main(String[] args)
    {
        StrictFPExample t = new StrictFPExample();
  
        System.out.println(t.sum());
    }
}

strictfp interface Test {
	 double sum();
     //strictfp double mul(); // compile-time error here
}



strictfp class StrictFPClass
{   
    // all concrete methods here are
    // implicitly strictfp.    
}
strictfp interface StrictFPInterface
{   
    // all  methods here becomes implicitly 
    // strictfp when used during inheritance.    
}
class Calculator
{  
    // strictfp applied on a concrete method 
    strictfp void add(){}
}  