package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Convert String to lowercase or UPPERCASE\\
		String school = "Syntax";

		System.out.println("______To Uppercase /To lower case______");

		System.out.println(school.toupperCase());
		System.out.println(str.toLowerCase());
		str = str.toLowerCase();
		System.out.println(str);

		// Conctanate 2 strings
		System.out.println("_____Concat Function______");
		String newString = str + school;
		System.out.println(newString);

		String day = "Staurday";
		String date = "14";

		String newDate = day.concat(date);
		System.out.println(newDate);

		char grade = 'A';
		String str2 = "Student";
		// below code will give CE Compilor Error
		// since concat() method is used to attach 1 String to aother String
		// str2.concat (grade);

		System.out.println("______isEmpty Function______");

		String str3 = "";
		boolean empty = str3.isEmpty();
		System.out.println(empty);

		System.out.println("________trim() Function_________");

		// removes empty/white spaces at the begening and end of the String
		String str4 = "     Welcome to Syntax!      ";

		str4 = str4.trim();
		System.out.println("String with no leading or trailing spaces: " + str4);
	//Asel Code
//		System.out.println("----- isEmpty FUNCTION -----");
//        // tells true if there is no characters inside the String
//        // tells falls if any characters are inside the String
//        String str3="";
//        boolean empty=str3.isEmpty();
//        System.out.println(empty);
//        
//        System.out.println("----- trim() FUNCTION -----");
//        //removes empty/white space at the begiining and end of the String
//        String str4="   Welcome to Syntax!   ";
//        
//        str4=str4.trim();
//        System.out.println("String with no leading or trailing spaces:"+str4);}

}}
