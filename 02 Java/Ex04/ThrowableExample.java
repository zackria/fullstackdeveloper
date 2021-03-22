class ThrowableExample
{
	public static void main(String[] args) {

		try
		{
			System.out.println("Try Block");

			int i = new MathMadness().divide(10,0);
		}
		catch(DivideByZeroException e)
		{
			System.out.println("DivideByZeroException Block");
			System.out.println("DivideByZeroException Message: "+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException Block");
			System.out.println("ArithmeticException Message: "+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception Block");
			System.out.println("Exception Message: " + e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block");
		}
		
	}
}


class DivideByZeroException extends Throwable 
{
	public DivideByZeroException(String errorMessage) 
	{
		super(errorMessage);
	}
}


class BasicException extends Exception 
{
	public BasicException(String errorMessage, Throwable err)
	{
		super(errorMessage, err);
	}
}

class MathMadness 
{
	public int divide(int var1, int var2) throws DivideByZeroException
	{
		int i = 0;

		try{
			i = (var1/var2);
		}catch(Exception e)
		{
			throw new DivideByZeroException(e.getMessage());
		}

		return i;

	}
}