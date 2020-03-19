package com.syntax.class07;

public class LoopTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Print numbers from 1 to 100 in 1 line with space
//
//		Print numbers from 100 to 1
//
//		Print even numbers from 20 to 1 (2 ways)
//
//		Print odd numbers between 20 and 50 (2 ways)
		
		// Task 1:
				int n = 1;
				while (n <= 100) {
					System.out.print(n + " ");
					n++;
				}
				System.out.println("-----------------------------");
				// Task 2:
				int x = 100;
				while (x >= 1) {
					System.out.print(x + " ");
					x--;
				}
				//Task 3:
				//First way:
				System.out.println("***----------------------");
				int b=1;
				while (b<=20) {
					if(b%2==0) {
						System.out.println(b);
					}b++;
					}
				System.out.println("---------------------");
				//Second way:
					int m=20;
				while (m>=1) {
					if(m%2==0) {
						System.out.println(m);
					}m--;
				}
				System.out.println("+++++++++++++++++++++++");
				// Task 4:
				// First way:
				int y = 20;
				while (y <= 50) {
					if (y % 2 != 0) {
						System.out.println(y);
					}
					y++;
				System.out.println("-----------------------");
					// Second way:
					int f = 50;
					while (f >= 20) {
						if (f % 2 != 0) {
							System.out.println(f);
						}
						f--;
					}
				}
			}
			
	}


