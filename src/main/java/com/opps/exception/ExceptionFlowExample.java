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
			sayBye();			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("hello");
	}

	private static void sayBye() {
		System.out.println("Bye bye");
		System.out.println("please enter number for the division");
		int no = new Scanner(System.in).nextInt();

		System.out.println(25 / no);
		
		System.out.println("end of bye method");
	}
}
