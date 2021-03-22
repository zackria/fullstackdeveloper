class SuperExample
{
	public static void main(String[] args) {
		ChildClass obj = new ChildClass("Testing");
	}

}

class SuperClass 
{
	int age = 10;

	SuperClass()
	{
		System.out.println("SuperClass Constructor");
	}

	void test()
	{
		System.out.println("SuperClass void test");
	}
}

class ChildClass extends SuperClass 
{
	ChildClass()
	{
		System.out.println("ChildClass Constructor");
	}

	ChildClass(String value)
	{
		System.out.println("ChildClass Constructor value: "+value + " Age: "+age);
		super.test();
	}
}