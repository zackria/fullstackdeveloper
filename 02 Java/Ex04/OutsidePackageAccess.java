import com.cgi.fullstack.AccessSpecifier;

public class OutsidePackageAccess
{
	public static void main(String[] args) {
		AccessSpecifier obj = new AccessSpecifier();
		System.out.println("AccessSpecifier publicIntVariable: "+obj.publicIntVariable);

		//System.out.println("AccessSpecifier publicIntVariable: "+obj.privateIntVariable);
		//privateIntVariable has private access in AccessSpecifier

		//System.out.println("AccessSpecifier protectedIntVariable: "+obj.protectedIntVariable);
		//protectedIntVariable has protected access in AccessSpecifier


		//System.out.println("AccessSpecifier defaultIntVariable: "+obj.defaultIntVariable);
		//defaultIntVariable is not public in AccessSpecifier; cannot be accessed from outside package

	}
}