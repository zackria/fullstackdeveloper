//#1 private final fields for variable will be generated automatically
//#2 Record also generates public getter methods automatically 
//without the get name in the method
//#3 Records creates a constructor with parameters and sets the values (canonical constructor)
//#4 Automatically generates toString, hashCode, equals method
//#5 Does not generate setter methods. record is immutable by default
public record ContactRecord(String name, int number){
	//#6 record can have instance methods
	public String nameInUpperCase(){
		return name.toUpperCase();
	}
}