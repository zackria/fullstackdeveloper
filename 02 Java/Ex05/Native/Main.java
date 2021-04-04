public class Main {
    public native int intMethod(int i);

    static{

    	try{
    	System.setProperty("java.library.path", "/Users/zackdawood/Development/fullstackdeveloper/02 Java/Ex05/Native");
		//set sys_paths to null
		final java.lang.reflect.Field sysPathsField = ClassLoader.class.getDeclaredField("sys_paths");
		sysPathsField.setAccessible(true);
		sysPathsField.set(null, null);

        System.loadLibrary("Main");
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println(new Main().intMethod(2));
    }
}