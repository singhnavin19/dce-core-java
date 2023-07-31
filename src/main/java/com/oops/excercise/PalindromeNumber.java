package com.oops.excercise;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		byUsingModuloAndDivideOperator(input);
		byUsingStringBuilderReverseMethod(input);

		
	}

	private static void byUsingModuloAndDivideOperator(int input) {
		int output=0;
		int temp=input;
		
		while(temp>0) {//123
			int remainder=temp%10; //1/10=1
			output=output*10+remainder;//321
			temp=temp/10; //0
		}
		System.out.println(output);
		
		if(input==output) {
			System.out.println("Yes,it's palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

	private static void byUsingStringBuilderReverseMethod(int input) {
		String temp=String.valueOf(input);
		
		StringBuilder reverseString=new StringBuilder(temp);
		
		String reverse = reverseString.reverse().toString();
		
		if(temp.equals(reverse)) {
			System.out.println("Yes");
		}else {
			System.out.println("no");
		}
	}
}
