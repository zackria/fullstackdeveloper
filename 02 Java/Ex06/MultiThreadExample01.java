public class MultiThreadExample01{
	
	public static void main(String[] args) {
		// MultiThreadType1 myThread01 = new MultiThreadType1();

		// MultiThreadType1 myThread02 = new MultiThreadType1();

		// myThread01.run();
		// myThread02.run();

		// myThread01.start();

		// myThread02.start();

		for(int i=0; i<5; i++){
			MultiThreadType1 myThread = new MultiThreadType1(i);
			myThread.start();
		}

		throw new RuntimeException();
	}
} 