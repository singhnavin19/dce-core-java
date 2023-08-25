package com.oops.recursion;

public class BadRecursionExample {
	static int count=1;
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("bad recusrion example"+count++);
		Thread.sleep(1000);
		main(args);
	}
}
