class CovariantReturnType{
	public static void main(String[] args) {
	   Base base = new Base(); 
       base.fun(); 
  
       Derived derived = new Derived(); 
       derived.fun(); 
	}
	
}

class Base 
{ 
    Class1 fun() 
    { 
        System.out.println("Base fun()"); 
        return new Class1(); 
    } 
} 
  
class Derived extends Base 
{ 
    Class2 fun() 
    { 
        System.out.println("Derived fun()"); 
        return new Class2(); 
    } 
} 

class Class1 {} 
class Class2 extends Class1 {} 