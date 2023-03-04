package com.conditional;

public class FooBaarTernary {

	public static void main(String[] args) {
		int no=9;
		
		System.out.println(no%3==0 ? "foo":"bar");
		
		if(no%3==0) {
			System.out.println("foo");
		}else {
			System.out.println("bar");
		}
	}

}
