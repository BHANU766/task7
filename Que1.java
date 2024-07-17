package com.task7;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("connection is established");
		
		try {	
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number1");
			int num1=sc.nextInt();
			
			System.out.println("enter a number2");
			int num2=sc.nextInt();	
		//division
		int res=num1/num2;
		System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("you are trying to divide a number which is illogical");
		}finally {
			System.out.println("this finally will always");
		}
		//terminate the connection
		System.out.println("connection is terminated");
	}

}
