package com.conditional;

import java.util.Scanner;

public class NumberToWordWithSwitch {
	public static void main(String[] args) {
		int no;
		Scanner s=new Scanner(System.in);
		
		System.out.println("please enter your number");
		no=s.nextInt();
		
		switch(no) {
		case 1 : //if(no==1)
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("please enter correcr choice between 1 to 5");
			break;
		}
	}
}
