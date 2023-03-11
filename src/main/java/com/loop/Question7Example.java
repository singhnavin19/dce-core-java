package com.loop;

import java.util.Scanner;

public class Question7Example {

	public static void main(String[] args) {
		
		int noOfInput,sumOfEven=0,sumOfOdd=0;
		Scanner sc=new Scanner(System.in);
		noOfInput=sc.nextInt();
		
		while(noOfInput>=1) {
			int no=sc.nextInt();
			if(no%2==0) {
				sumOfEven=sumOfEven+no;
			}else {
				sumOfOdd=sumOfOdd+no;
			}
			noOfInput--;
			
		}
		System.out.println("sum of even ="+sumOfEven);
		System.out.println("sum of odd ="+sumOfOdd);
		
	}

}
