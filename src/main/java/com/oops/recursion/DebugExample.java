package com.oops.recursion;

public class DebugExample {
	
	static int count=0;
	
	public static void sayHello() {
		System.out.println("hello");
		if(count<3) {
			count++;
			sayHello();
			
		}
		System.out.println("bye");
	}
	
	public static void main(String[] args) {
		sayHello();
		System.out.println("after Say Hello call");
	}
}
