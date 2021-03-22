interface Interface1 
{
	void method1();
}

interface Interface2 extends Interface1
{
	void method1();
}

interface Interface3
{
	void method3();
}

interface Interface4{
	void method4();
}

interface Interface5{
	void method5();
}

class InterfaceExample extends DummyClass implements Interface2, Interface3, Interface4, Interface5
{
	public static void main(String[] args) {
		InterfaceExample obj = new InterfaceExample();
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
		obj.method5();
	}

	// attempting to assign weaker access privileges; was public
	public void method1()
	{
		System.out.println("Method 1");
	}

	public void method2()
	{
		System.out.println("Method 2");
	}

	public void method3()
	{
		System.out.println("Method 3");
	}

		public void method4()
	{
		System.out.println("Method 4");
	}

		public void method5()
	{
		System.out.println("Method 5");
	}
}

class DummyClass {}

class DummyClass1 {}