package com.opps.exception;

import java.util.Scanner;

public class BasicEception {
	public static void sayHello() {
		System.out.println("Hello Method");
	}
	public static void main(String[] args) {
		int nos[]= {10,23,55};
		System.out.println("Please enter index between 0 to 3");
		int index=new Scanner(System.in).nextInt();
		
		System.out.println("above code");
		
//		try {
			System.out.println(nos[index]);			
//		}catch(Exception e) {
//			System.out.println("exception aaya and we handle it");
//			System.out.println(e);
//		}
		
		System.out.println("rest of code");
		sayHello();
		System.out.println("Exit");
	}

}
