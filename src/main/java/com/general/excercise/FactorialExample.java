package com.general.excercise;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		
		System.out.println("please enter input for factorial");
		int no=new Scanner(System.in).nextInt();
		int fact=1;
		
		while(no>1) {
			System.out.print(no+"*");
			fact=fact*no;
			no--;
			
		}
		System.out.println("1 ="+fact);
	}

}
