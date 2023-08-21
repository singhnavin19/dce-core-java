package com.oops.wrapperAndCasting;

public class BasicExample {
	public static void main(String[] args) {
		char char1='A';
		int int1;
		
		int1=char1; //4 byte==2 byte//upcasting
		
		System.out.println("char-A to int"+int1);
		
		char1=66; //char=int -- downcasting
		System.out.println("int to char"+char1);
		
		float f1=32.21f;
	
		int1=(int)f1;
		
		System.out.println("float to int external"+int1);
		
		f1=char1;
		System.out.println("char to float"+f1);
		
		
	}
}
