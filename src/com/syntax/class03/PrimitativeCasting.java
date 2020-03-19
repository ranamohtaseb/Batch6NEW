package com.syntax.class03;

public class PrimitativeCasting {
	
	public static void main(String[]args) {
	
		//widening happens implicitly (read below)
		double d=10;
		System.out.println(d);//10.0
		
		//int i=10.99; -->compile time error saying 
		
		
		//type mismatch, cannot convert double to int
		//casting is taking place, casting in Java is converting one variable type to another. 
		//In this case it is converting the 10 as an int to 10.0 since it is double
		// there are 2 types of casting in Primitive, 
		//1. Widening(Implicit Casting),
		// byte-> short-> int-> long-> float-> double
		// you can store numbers from byte in bigger variable when you care widening

		//2. Narrowing(Explicit Casting)
		//double-> float-> long-> int-> short-> byte
		// the system automatically do widening and assign int to double (small to big)
		//but the system does not do narrowing automatically you will have to program it
		
		// to do int i=10.99 again, it has to be done manually since the system does not narrow automatically
		//narrowing, explicitly implementing
		int i=(int)10.99;
		System.out.println(i);
		
		//byte -128 to 127
		byte b=(byte)1284;
		System.out.println(b);
		
	
	}

}
