class ConstructorDemo
{
	public ConstructorDemo()
	{
		System.out.println("Inside ConstructorDemo Constructor ");
	}

	public ConstructorDemo(String name)
	{
		System.out.println("Inside ConstructorDemo Constructor Name: "+ name);
	}

	public static void main(String[] args) {

		ConstructorDemo obj = new ConstructorDemo();
		ConstructorDemo obj1 = new ConstructorDemo("Zack");
		System.out.println("Inside ConstructorDemo Main Method");
	}
}