package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework3034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to find the largest number among three distinct numbers using nested if condition
//		Please use Scanner class to take input from users
//		Please enter 3 distinct numbers
//		The largest number is 14

Scanner scan;
int num1, num2, num3;
System.out.println("Please enter 3 distinct numbers");
scan=new Scanner(System.in);
num1=scan.nextInt();
num2=scan.nextInt();
num3=scan.nextInt();

if(num1 >= num2) {
    if(num1 >= num3) 
        System.out.println ("The largest number is "+num1);
     else
        System.out.println("The largest number is "+num3);
}else 
    if(num2 >= num3)
        System.out.println("The largest number is "+num2);
    else
        System.out.println("The largest number is "+num3);
}
}







