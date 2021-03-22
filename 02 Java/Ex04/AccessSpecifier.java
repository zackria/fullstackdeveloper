class AccessSpecifier
{
	public int publicIntVariable = 10;
	private int privateIntVariable = 20;
	protected int protectedIntVariable = 30;
	int defaultIntVariable =40;

	public static void main(String[] args) {
		System.out.println("AccessSpecifier publicIntVariable: "+publicIntVariable);
		System.out.println("AccessSpecifier publicIntVariable: "+privateIntVariable);
		System.out.println("AccessSpecifier protectedIntVariable: "+protectedIntVariable);
		System.out.println("AccessSpecifier defaultIntVariable: "+defaultIntVariable);
	}
}