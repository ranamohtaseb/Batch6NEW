package com.syntax.class12;

public class StringIsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String str1 = "Hello";
		String str2 = "World";//
		// String is immutable object
		str.toUpperCase();
		System.out.println(str);
	}
}
