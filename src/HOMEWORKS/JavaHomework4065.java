
package HOMEWORKS;

import java.util.Scanner;

public class JavaHomework4065 {

	public static void main(String[] args) {

//		Given the following inputs:
//			int x;
//
//			Write a for loop that will print out a series of numbers starting 
		//at one less than x and ending at 0.
//
//			Sample input/outputs:
//			In: 7
//			6 5 4 3 2 1 0
//
//			In: 12
//			11 10 9 8 7 6 5 4 3 2 1 0
//
//			In: 20
//			19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
// public static void main(String[] args) {
//    Scanner inp;
//    int x;
//    System.out.print("In:");
//    //write your code below

	
	int in;
	
	Scanner inp=new Scanner(System.in);
	System.out.println("In: ");
	in=inp.nextInt();
	for (int x=(in-1); x>=0; x--) {
		System.out.print(x+" ");
		
	 
		}
	}

}
