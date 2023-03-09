package com.conditional;

import java.util.Scanner;

public class NumberToWord {
	public static void main(String[] args) {
		int no;
		Scanner s=new Scanner(System.in);
		
		System.out.println("please enter your number");
		no=s.nextInt();
		
		if(no==1) {
			System.out.println("One");
		}else if(no==2) {
			System.out.println("two");
		}
		else if(no==3) {
			System.out.println("Three");
		}
		else if(no==4) {
			System.out.println("Four");
		}
		else if(no==5) {
			System.out.println("Five");
		}
		else if(no>5||no<1) {
			System.out.println("please enter number between 1 to 5");
		}
		
	}
}
