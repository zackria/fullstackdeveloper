class InheritanceExample{

	public static void main(String[] args) {

		Child obj = new Child();

		obj.yourName();
		
	}
	
}

class Parent {
	
	protected String newname = "Father Bond";

	public void yourName()
	{
		System.out.println(newname);
	}

}

class Child extends Parent 
{
	protected String name = "James Bond";

	public void yourName()
	{
		System.out.println(name);
		System.out.println(newname);
	}
}