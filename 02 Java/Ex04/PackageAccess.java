import com.cgi.fullstack.FirstPackage;

public class PackageAccess
{
	public static void main(String[] args) {

		new PackageAccess().print();

	}

	public void print()
	{

		FirstPackage obj = new FirstPackage();
		System.out.println(obj.strVariable);
	}
}