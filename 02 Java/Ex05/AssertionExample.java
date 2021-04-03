class AssertionExample{
	
	public static void main(String[] args) {
			
			int age = 35;

			assert age == 45: "Not Valid Age" ; //Triggered if it is false

			System.out.println("Age is: " + age );
		}	

}