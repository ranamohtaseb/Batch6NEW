package com.syntax.class03;

public class TempretureCheck {
public static void main(String[] args) {

	//if is used to perform verification and using if we are doing selective execution
	// if (boolean expression){
	//block of if code
    //}
	//if(boolean expression){
	//block of if code
	//}else{
	//block of else code
	//}
	//_______________________________________
	
	
int t1=30;

if (t1<32) {
	System.out.println("Water will freeze with tempreture "+ t1);
} else {
	System.out.println("Water will NOT freeze with tempreture "+ t1);
	
}

System.out.println("____________________________");
//different way to do it

int temp=30;
int freezingTemp=32;

if (temp<freezingTemp) {
	System.out.println("Water will freeze with tempreture "+ temp);
} else {
	System.out.println("Water will NOT freeze with tempreture "+ temp);
	
}
}
}
