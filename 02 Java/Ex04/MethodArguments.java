class MethodArguments{
	public static void main(String[] args) {
		Methods methodsObject = new Methods();
		methodsObject.myMethod("Zack");
		methodsObject.myMethod("Zack", 35);
	}


}

class Methods  
{
	void myMethod(String name )
	{
		System.out.println("Inside myMethod() Name: "+name);
	}

	void myMethod(String name, int age)
	{
		System.out.println("Inside myMethod() Name : "+name + "age : "+age);
	}
}