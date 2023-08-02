package com.excercise.oops;

public class SwapTwoNumber {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		swapByUsingThirdVariable(a, b);
		
		SwapWithoutThirdVariable(a,b);
	}

	private static void SwapWithoutThirdVariable(int a, int b) {
		System.out.println("old value of a="+a+"and b="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("new value of a="+a+"and b="+b);
		
	}

	private static void swapByUsingThirdVariable(int a, int b) {
		System.out.println("old value of a="+a+"and b="+b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("new value of a="+a+"and b="+b);
	}
}
