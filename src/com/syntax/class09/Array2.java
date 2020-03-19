package com.syntax.class09;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] students=new String[3];
students[0]="hassna";
students[1]="Faisal";
students[2]="Kemal";
//students[3]="Aaron"; during runtime, java machine will give 
//ArrayIndexOutOfBoundsException

System.out.println(students[3]); 
// we will get error message ArrayIndexOutOfBoundsException
//arrays are fixed in size
// String[3] means only 3 elements 0,1,2
//
//
//String [] inCLassStudents= new String [5];
//inCLassStudents[0]="Hisham";
//inCLassStudents [1]="Tetteh";
//
//System.out.println(inCLassStudents[2]); //Error: ArrayIndexOutOfBoundsException
//	
//System.out.println("--------------------------");	
//	
String [] inCLassStudent= new String [5];
inCLassStudent[1]="Hisham";
inCLassStudent [2]="Tetteh";
inCLassStudent[3]="Hisham";
inCLassStudent [4]="Tetteh";
inCLassStudent[5]="Hisham";

System.out.println(inCLassStudent[0]); //Error: ArrayIndexOutOfBoundsException
	
	}

}
