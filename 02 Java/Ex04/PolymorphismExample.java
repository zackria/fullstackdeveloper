class PolymorphismExample{

	public static void main(String[] args) {

		ParentPoly obj = new ParentPoly();

		ParentPoly obj1 = new ChildPoly();

		ParentPoly obj2 = new GrandChildPoly();

		obj.yourName();

		obj1.yourName();

		obj2.yourName();
		
	}

	public void yourName()
	{
		System.out.println("PolymorphismExample");
	}
	
}

class ParentPoly {

	public void yourName()
	{
		System.out.println("ParentPoly");
	}

}

class ChildPoly extends ParentPoly 
{

	public void yourName()
	{
		System.out.println("ChildPoly");
	}
}

class GrandChildPoly extends ChildPoly
{

	public void yourName()
	{
		System.out.println("GrandChildPoly");
	}
}