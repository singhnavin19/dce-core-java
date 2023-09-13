package com.oops.recursion;

public class NormalFlowExample {

	public static void main(String[] args) {
		sayHello();
		System.out.println("main");
	}

	private static void sayHello() {
		System.out.println("inside hello method");
		sayBye();
		System.out.println("hello");
	}

	private static void sayBye() {
		System.out.println("Bye bye");
		
	}
}
