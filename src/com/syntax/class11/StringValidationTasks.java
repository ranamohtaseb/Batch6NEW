package com.syntax.class11;

public class StringValidationTasks {

	public static void main(String[] args) {

//		Accept username, password and confirm password from a user and check following requirements:
//
//			Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//			Password should be minimum 8 characters, if less → message=“Password is too short”.
//			Password cannot contain username if so, → message=“Password cannot contain username”.
//			Password should match confirmed password, if not  → message=“Passwords do not match”.
//	
		
		String message="Welcome Admin!";
		
		//verify that message contains username which is Admin
		System.out.println("----- contains FUNCTION -----");
		System.out.println(message.contains("Admin"));
		boolean flag=message.contains("welcome");System.out.println(flag);
		//we want to see if welcome starts with Welcome
		System.out.println("----- startsWith() FUNCTION -----");
		boolean starts=message.startsWith("Welcome");
		System.out.println(starts);
		//we want to verify that welcome message ends with username
		System.out.println("----- endsWith() FUNCTION -----");
		String username="Admin";
		boolean ends=message.endsWith(username);
		System.out.println(ends);System.out.println(message.endsWith("!"));
		
	}}