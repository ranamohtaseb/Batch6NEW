package com.syntax.class02;

public class ModulesOperators {

	public static void main(String[] args) {
		float f = 12.50f;
		float f1 = 2.7f;
		float result = f / f1;
		System.out.println(result);

		int i = 12;
		int y = 7;
		int result1 = i / y;
//1  it is .0987 but Java only result a full number not rounded and no decimal
		double result2 = i / y;
//since the numbers are int, then the result is still will have same characteristic so the result is int so whole number 
		float i1 = 12;
		float y1 = 7;
		float result3 = i1 / y1;

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

		
		//modules
		int v=16;
		int w=3;
		
		int mod=v%w;
		System.out.println(mod);
		// the percentage sign will calculate the remainder, 16/3 is 5 and reaminder is 1
		int v1=16;
		int w1=4;
		
		int mod1=v1%w1;
		System.out.println(mod1);
		// the percentage sign will calculate the remainder 16/4 is 4, remainder is zero

		
		// I would like to divide 12/7
		
		//int num1=12.5; was added as a note cuz JAVA will not allow us to add int as decimals
		
		
	double num2=12;// we can store int as double 
			System.out.println(num2);
			//even if you insert the numver as whole without decimals, the result will show decimals
			
	
	}

}
