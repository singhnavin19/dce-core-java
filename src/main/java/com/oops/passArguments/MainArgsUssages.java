package com.oops.passArguments;

public class MainArgsUssages {
	static Integer i[]=new Integer[10];
	
	public static void main(String[] args) {
		
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		
		for(String arg:args) {
			System.out.println(arg);
		}
		
		
	}
}
