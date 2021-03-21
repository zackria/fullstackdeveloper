public class ClassVariable{

	public int classInt = 20;

	public static void main(String[] args) {
		ClassVariable obj = new ClassVariable();
		obj.testMethod();		
		System.out.println("Class Variable: " + obj.classInt );

	}

	public void testMethod()
	{
		int localVarilable = 10;
		System.out.println("Local Variable: "+localVarilable );
	}
}

