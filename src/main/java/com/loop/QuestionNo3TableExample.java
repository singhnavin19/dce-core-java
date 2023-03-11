package com.loop;

import java.util.Scanner;

public class QuestionNo3TableExample {
	public static void main(String[] args) {
		int positiveNo;
		
		Scanner input=new Scanner(System.in);
		positiveNo=input.nextInt();
		
		if(!(positiveNo>0)) {
			System.out.println("please enter positive number");
			System.exit(0);
		}
		
		for(int count=1;count<=10;count++) {
			System.out.println(positiveNo*count);
		}
		
	}

}
