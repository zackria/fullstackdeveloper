public class TestVol {
	public static void main(String[] args) {
		new VolatileTest("T1").start();
		new VolatileTest("T2").start();
	}
}
