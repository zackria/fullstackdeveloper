//#1 private final fields for variable will be generated automatically
//#2 Record also generates public getter methods automatically 
//without the get name in the method
//#3 Records creates a constructor with parameters and sets the values (canonical constructor)
//#4 Automatically generates toString, hashCode, equals method
//#5 Does not generate setter methods. record is immutable by default
//#10 Records cannot extend another class, implicitly extends java.lang.Record class
//#11 Records are also implicity final classes cannot be extended by other classes
//#12 Records can implement a interface 
public record ContactRecord(String name, int number){
	//#6 record can have instance methods
	public String nameInUpperCase(){
		return name.toUpperCase();
	}

	//#13 Compact Constructor, Constructor without parenthesis
	//this.name = name & this.number = number is set automatically
	public ContactRecord{
		if(number < 0){
			throw new IllegalArgumentException("number cannot be negative");
		}
	}

	//#7 you can create static method
	public static void printClassName(){
		System.out.println("ContactRecord is the class name");
	}

	//#8 you can add public static field
	public static final String DEFAULT_LOCATION = "Paris, France";

	//#9 you cannot add a not static field 
	//private String nonStaticField;

}