package com.oops.recursion;

public class PrintNumberUsingRecusrion {
	static int number=0;
	static int sum=0;
	
	public static void printNumnber() {
		System.out.println(number);
		number++;
		if(number<10) {
			if(number%2!=0) {
				System.out.println("odd number is "+number);
				sum=sum+number;
			}
			printNumnber();
		}
	}
	
	public static void main(String[] args) {
		printNumnber();
		System.out.println(sum);
		
	}

}
