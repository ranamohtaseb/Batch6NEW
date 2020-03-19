package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {

		//++,--
		//preincrement ++y, postincrement y++
		int z;
		int y=10;
		z=y++;// post increment : first use the variable, then increment
		System.out.println(y);
		System.out.println("___________--");
		int w;
		int x=10;
		w=++x;
		System.out.println(x);
	
	
	}

}
