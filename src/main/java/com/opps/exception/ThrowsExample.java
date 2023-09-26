package com.opps.exception;

public class ThrowsExample {

	static ThrowsExample e = new ThrowsExample();
	static String s="navin";
	static int i;

	public void sayHello() {
		System.out.println("hello");
		System.out.println(5/0);
		System.out.println("method rest of the code");
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println(i);
		System.out.println(e);
		System.out.println(s);
		try {
			e.sayHello();			
		}
		catch(Exception e) {
			System.out.println("Divide by zero");
		}
	   try{
		   e.clone();
	   }
	   catch(Exception e) {
		   System.out.println("clone exception");
	   }
		System.out.println("rest of the code");

	}
}
