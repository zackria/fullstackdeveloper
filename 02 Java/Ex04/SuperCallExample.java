class SuperCallExample extends ChildCallClass
{
	SuperCallExample(String value)
	{
		//super(); //call to super must be first statement in constructor
		super(value);
		System.out.println("SuperCallExample Constructor");

	}

	public static void main(String[] args) {
		System.out.println("SuperCallExample");
		new SuperCallExample("Test");
	}

}

class SuperCallClass 
{
	int age = 10;
	String variable;

	SuperCallClass()
	{
		System.out.println("SuperClass Constructor");
	}

	SuperCallClass(String variable)
	{
		System.out.println("SuperClass Constructor variable");
		this.variable = variable;
	}

	void test()
	{
		System.out.println("SuperClass void test");
	}
}

class ChildCallClass extends SuperCallClass 
{
	ChildCallClass()
	{
		System.out.println("ChildClass Constructor");
	}

	ChildCallClass(String value)
	{
		super(value);
		System.out.println("ChildClass Constructor value: "+value + " Age: "+age);
		super.test();
	}
}