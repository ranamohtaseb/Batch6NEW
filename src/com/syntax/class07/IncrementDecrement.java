package com.syntax.class07;

public class IncrementDecrement {

	public static void main(String[] args) {
		//IncrementDecrement ++ and/or --  are used in loops
 int x=10;
 x=x+1;
 x+=1;
 //another way to add +1 to a variable
 x++;
 //x=10+1+1+1
 System.out.println(x);
 
 int y=90;
 y-=+1; //y=y-1;
 //Another way t subtract -1 form a VARIABLE
 y--;
 //y=90-1-1
 System.out.println(y);
 //1++; complier will give error
 //2--; complier will give error
 
	}

}
