package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		boolean b=true;
		boolean val=!false;
		
		System.out.println(b);
		System.out.println(val);

		
		boolean isCold=true;
		
		if(!isCold) {
			
			System.out.println("hello");
		}else {
			System.out.println("bye");
			
		
			String day1="Monday";
		}
		
	//if it is not Monday nor Friday --> Find me at Syntax
			
			if(!day1.contentEquals("Monday")&& !day1.contentEquals("Friday")){
				System.out.println("Find me at Syntax");
			}
	//day is not Monday and y day is not Friday
			
			if(!(day1.contentEquals("Monday")&& day1.contentEquals("Friday"))) {
				System.out.println("Find me at Syntax");
			}
				
		}
	}

