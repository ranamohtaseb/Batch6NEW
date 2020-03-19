package com.syntax.class03;

public class RelationEqualityOperatrs {
public static void main(String[]args) {
	int i=10;
	int y=20;
	
	System.out.println(i>y);//false
	System.out.println(i<y);//true
	System.out.println(i==y);//false
	System.out.println(i!=y);//true
	//true and false values are boolean variable
	
	System.out.println("-------------------------");
	double a=900.99;
	double b=100.99;
	boolean result=a>b;
	boolean result1=a==b;
	boolean result2=a!=b;//true
	System.out.println(result);//true
	System.out.println(result1);//false
	System.out.println(result2);//true

	
}
}
