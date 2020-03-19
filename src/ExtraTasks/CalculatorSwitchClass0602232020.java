package ExtraTasks;

import java.util.Scanner;

public class CalculatorSwitchClass0602232020 {

	public static void main(String[] args) {
//		Using scanner class create calculator. 
//		Allow user to enter 2 numbers and operator(+,-,*,/). 
//		Based on operator provide the result to user.

	
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter first number");
		double num1;
		num1=scan.nextDouble();
		System.out.println("Please enter second number");
		double num2;
		num2=scan.nextDouble();
		System.out.println("Please enter operator(+, -, *, /)");
		char operator=scan.next().charAt(0);
		
		double output=0;
		
		switch (operator) {
		case '+':
			output=num1+num2;
			break;
		case '-':
			output=num1-num2;
		break;
		case '*':
			output=num1*num2;
			break;
		case '/':
			output=num1/num2;
			break;
			default:
				System.out.println("Invalid entry");
				return;
		}
				System.out.println("The result of "+num1+operator+num2+" is "+output);
			
		}
	}


