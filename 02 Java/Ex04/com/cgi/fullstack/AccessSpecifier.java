package com.cgi.fullstack;

public class AccessSpecifier
{
	public int publicIntVariable = 10;
	private int privateIntVariable = 20;
	protected int protectedIntVariable = 30;
	int defaultIntVariable =40;

	public static void main(String[] args) {
		AccessSpecifier obj = new AccessSpecifier();
		System.out.println("AccessSpecifier publicIntVariable: "+obj.publicIntVariable);
		System.out.println("AccessSpecifier publicIntVariable: "+obj.privateIntVariable);
		System.out.println("AccessSpecifier protectedIntVariable: "+obj.protectedIntVariable);
		System.out.println("AccessSpecifier defaultIntVariable: "+obj.defaultIntVariable);
	}

	public int getProtectedIntVariable()
	{
		return protectedIntVariable;
	}
}