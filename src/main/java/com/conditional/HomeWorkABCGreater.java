package com.conditional;

public class HomeWorkABCGreater {
	public static void main(String[] args) {
		int a=10,b=20,c=50;
		
		if(a>b&&a>c) {
			System.out.println("a is greater");
		}
		if(b>c&&b>a) {
			System.out.println("b is greater");
		}
		if(c>a&&c>b) {
			System.out.println("c is greater");
		}
		
	}

}
