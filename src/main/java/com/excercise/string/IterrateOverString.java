package com.excercise.string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class IterrateOverString {
	
	public static void printStringUsingLoop(String str) {
		System.out.println("***Using traditional loop**");
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	
	public static void printUsingEnchanceLoop(String s) {
		System.out.println("***Using enchance loop**");
		for(char c:s.toCharArray()) {
			System.out.println(c);
		}
	}
	
	public static void printStringUsingSplit(String inp) {
		String []output=inp.split("");
		
		for(String s:output) {
			System.out.println(s);
		}

	}
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("please enter a string");
//		String input=sc.nextLine();
//		
//		printStringUsingLoop(input);
//	
//		printUsingEnchanceLoop(input);
//		
//		printStringUsingSplit(input);
//		
//		printStringUsingToken(input);
		
		String s="navin";
		
		char c[]=s.toCharArray();
		
		
		
		String out=new String(c);
		
		System.out.println(out);
		
	}

	private static void printStringUsingToken(String input) {

		StringTokenizer str=new StringTokenizer(input,"");
		
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}
	}
	
}






