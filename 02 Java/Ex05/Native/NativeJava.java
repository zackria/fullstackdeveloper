public class NativeJava {
    public native int square(int i);
    public static void main(String[] args) {
        System.loadLibrary("NativeJava");
        System.out.println(new NativeJava().square(2));
    }
}