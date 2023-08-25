package com.oops.recursion;

public class PrintNumberUsingRecusrion {
	static int number=10;
	
	public static void printNumnber() {
		System.out.println(number);
		number++;
		if(number<100) {
			printNumnber();
		}
	}
	
	public static void main(String[] args) {
		printNumnber();
		
	}

}
