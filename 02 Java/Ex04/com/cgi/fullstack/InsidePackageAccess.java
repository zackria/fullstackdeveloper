package com.cgi.fullstack;

public class InsidePackageAccess
{
	public static void main(String[] args) {
		AccessSpecifier obj = new AccessSpecifier();
		System.out.println("AccessSpecifier publicIntVariable: "+obj.publicIntVariable);

		//System.out.println("AccessSpecifier publicIntVariable: "+obj.privateIntVariable);
		//privateIntVariable has private access in AccessSpecifier

		System.out.println("AccessSpecifier protectedIntVariable: "+obj.protectedIntVariable);
		System.out.println("AccessSpecifier defaultIntVariable: "+obj.defaultIntVariable);
	}
}