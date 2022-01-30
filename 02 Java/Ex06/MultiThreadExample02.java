public class MultiThreadExample02{
	
	public static void main(String[] args) {

		for(int i=0; i<5; i++){
			MultiThreadType2 myThreadClass = new MultiThreadType2(i);
			Thread myThread = new Thread(myThreadClass);
			myThread.start();
			
			try{
				myThread.join();
				myThread.isAlive();
			}catch(InterruptedException e){

			}
		}

	}
} 