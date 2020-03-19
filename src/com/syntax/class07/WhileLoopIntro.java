package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int time =10;
if(time<12) {
	System.out.println("Good Morning");
}
System.out.println("________________USING LOOP______________________");

while (time<12) {
	System.out.println("Good Morning");
	time++;
	//the compiler will check time=10<12, satisfies condition, then it will print once,
	// then compiler will check again using loop time=10+1=11<12 it will print again.
	// then compiler will check again using loop time=11+1=12=12 (does not satisfy condition), 
	//it will not print.
}

// how to print numbers from 1 to 50?
int num=1;
while (num<=50) {
	System.out.println(num);
	num++;
}

int num1=20;
while (num1<=30) {
	System.out.println(num1);
	//num1--; if you run this, it will not stop because the condition is always true.
	
}
// how to print number form 5 to 15 all in one line

int num2=5;
while (num2<=15) {
	System.out.print(num2+" ");
	num2++;
}
System.out.println("________________________");
// how to print values form 10 to 1?
int num3=10;
while (num3>=1) {
	System.out.println(num3);
	num3--;
	System.out.println("________________________");
	//how to print 50 to 1"
int num4=50;
while (num4>=1) {
	System.out.println(num4);
	num4--;
}
}
// how to print odd numbers from 1 to 20
int num5=1;

while (num5<21) {
	System.out.println();
}
	}

}
