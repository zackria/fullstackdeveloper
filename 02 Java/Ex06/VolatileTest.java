public class VolatileTest extends Thread {

	private volatile int testValue;
	private volatile boolean ready;

	public VolatileTest(String str) {
		super(str);
	}

	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				if (getName().equals("T1")) {
					ready = true;
					testValue = i;
					System.out.println(getName() + " :: " + ready + " :: " + testValue);
				}
				if (getName().equals("T2")) {
					System.out.println(getName() + " :: " + ready + " :: " + testValue);
				}
					Thread.sleep(1000);
			} 
			catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}
}
