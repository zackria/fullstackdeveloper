class ThisExample
{
	int classVariableString;
	String name;

	public ThisExample()
	{
		System.out.println("Inside ConstructorDemo Constructor ");
		this.classVariableString = 10;
	}

	public ThisExample(String name)
	{
		System.out.println("Inside ConstructorDemo Constructor Name: "+ name);
		this.name = name;
	}

	public static void main(String[] args) {

		ThisExample obj = new ThisExample();
		ThisExample obj1 = new ThisExample("Zack");
		System.out.println("Inside ConstructorDemo Main Method");
		obj1.printMethod();
		
	}

	public void printMethod()
	{
		System.out.println("This Variable :"+name);
	}
}