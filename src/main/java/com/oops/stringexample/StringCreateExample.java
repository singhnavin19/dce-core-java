package com.oops.stringexample;

public class StringCreateExample {

	public static void main(String[] args) {

		String s2 = new String("heap");
		String s1 = "SCP=String constant pool"; // by using string literals
		System.out.println(s1 + "" + s1.length());

		for (int i = 0; i < s1.length(); i++) {// traditional for loop
			System.out.println(s1.charAt(i));// hell Java
		}

		for (char c : s1.toCharArray()) { // Enchance for loop
			System.out.println(c);
		}

	}
}
