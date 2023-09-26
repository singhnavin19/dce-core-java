package com.opps.exception;

import java.util.Scanner;

public class ExceptionFlowExample {

	public static void main(String[] args) {
		sayHello();
		System.out.println("main");
	}

	private static void sayHello() {
		System.out.println("inside hello method");
		try {
			System.out.println("hello 1");
			sayBye();			
			System.out.println("hello 2");
			
		}catch(Exception e) {
			System.out.println("catch block");
			e.printStackTrace();
		}
		finally {
			System.out.println("finally block");
		}
		
	}

	private static void sayBye() {
		System.out.println("Bye bye");
		System.out.println("please enter number for the division");
		int no = new Scanner(System.in).nextInt();

		System.out.println(25 / no);
		
		System.out.println("end of bye method");
	}
}
