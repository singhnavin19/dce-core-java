package com.basic;

public class BitwiseOperatorExample {
	public static void main(String[] args) {
		
		//conversions
		System.out.println(Integer.toBinaryString(10)); //decimal to binary
		System.out.println(Integer.parseInt("1010", 2)); //binary to decimal
		
		//Bitwise AND
		
		System.out.println(Integer.toBinaryString(10)+" "+Integer.toBinaryString(12));
		
		System.out.println(10&12);
		
		System.out.println(10|12);
		
	}
}
