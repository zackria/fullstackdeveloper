class MethodOverLoad{
	public static void main(String[] args) {
		int intVar1 = 10;
		int intVar2 = 20;

		double doubleVar1 = 10.0;
		double doubleVar2 = 21.0;

		float floatVar1 = 5.0f;
		float floatVar2 = 6.0f;

		Calculator calculatorObject = new Calculator();

		calculatorObject.plusMethod(intVar1, intVar2);
		calculatorObject.plusMethod(floatVar1, floatVar2);
		calculatorObject.plusMethod(doubleVar1, doubleVar2);
	}
}

class Calculator 
{
	void plusMethod(int x, int y)
	{
		System.out.println("Adding Integer");
		System.out.println(x+y);
	}

	void plusMethod(double x, double y)
	{
		System.out.println("Adding Double");
		System.out.println(x+y);
	}

	void plusMethod(float x, float y)
	{
		System.out.println("Adding Float");
		System.out.println(x+y);
	}
}