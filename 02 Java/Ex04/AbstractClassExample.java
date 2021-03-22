abstract class AbstractClassExample{
	// Abstract method (does not have a body)
	public abstract void abstractMethod();

	public void nonAbstractMethod()
	{
		System.out.println("Inside non abstract method");
	}
}


class NonAbstractChild extends AbstractClassExample
{
	public void abstractMethod()
	{
		System.out.println("Inside NonAbstractChild Abstract Method");
	}
}

class AbstractExecute{
	
	public static void main(String[] args) {
		//AbstractClassExample is abstract; cannot be instantiated
		//AbstractClassExample obj = new AbstractClassExample();

		AbstractClassExample obj = new NonAbstractChild();
		obj.abstractMethod();
		obj.nonAbstractMethod();
	}
}