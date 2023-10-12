package com.tns.exceptions;
//program to demonstrate nested try block
public class NestedTry {
	public static void check() { 
	String str="tns";
	int slength=str.length();
	System.out.println("the length is"+ slength);
	String AnthorString="hello";
	int y=6;
	try {// outer try
		try {//inner try
			System.out.println(str.charAt(y));// exception arises
		}
		catch(StringIndexOutOfBoundsException ex) {//inner catch
		System.out.println("Arithmetic exception"+ex.getMessage());
		}
	}
	catch(ArithmeticException ex) {// outer catch
		System.out.println("Arithmetic exception"+ex.getMessage());
	}
	}
}


