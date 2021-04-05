class ExceptionsExample 
{
	public static void main(String[] args) {
		
	try {
          int i = (10/0);
        }
        catch(ArithmeticException e)
        {
          System.out.println("You are dividing by Zero: "+e. getMessage());
          //e.printStackTrace();
        }
        catch(Exception e)
        {
           System.out.println("Error Occured in your program" + e. getMessage());
           //e.printStackTrace();
        }
        finally
        {
            System.out.println("This code will be executed whether exception occurs or not");
        }

	}
}