class StringBufferExample
{

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();

		System.out.println("sb.capacity(): "+ sb.capacity()); //default 16 	

		sb = new StringBuffer("Hello ");

		System.out.println("sb.capacity(): "+ sb.capacity()); //default 16 	

		sb.ensureCapacity(50);//(oldcapacity*2)+2 

		System.out.println("sb.capacity(): "+ sb.capacity()); //default 16 	

		System.out.println("Original String: " +sb);

		sb.append("Java");

		System.out.println("sb.append(\"Java\"): "+ sb);

		sb.insert(0, "New ");

		System.out.println("sb.insert(\"New \"): "+ sb);
		
		sb.replace(0, 3, "Java");

		System.out.println("sb.replace(0, 3, \"Java\"): "+ sb);

		sb.delete(0, 4);

		System.out.println("sb.delete(0, 4): "+ sb);

		sb.reverse();

		System.out.println("sb.reverse(): "+ sb);

		System.out.println("sb.capacity(): "+ sb.capacity()); //default 16 
	}
}