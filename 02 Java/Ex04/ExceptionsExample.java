class ExceptionsExample 
{
	public static void main(String[] args) {
		
		try
		{
			System.out.println("Try Block");

			int i = (10/0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Block");
			System.out.println("Exception Message: "+e.getMessage());
		}
		finally
		{
			System.out.println("Finally Block");
		}

	}
}