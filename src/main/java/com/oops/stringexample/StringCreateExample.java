package com.oops.stringexample;

public class StringCreateExample {

	public static void main(String[] args) {

		String s2=new String("Navin");
		s2.intern();
		
		String s1="Navin1";

		
		System.out.println(s2.hashCode());
		
		
		System.out.println(s1.hashCode());		
		
		StringBuilder sb=new StringBuilder(s2);
		sb.reverse();
		
		s1=sb.toString();
		
		System.out.println(s1);
		
//		String s1="hi";
//		String s2 = new String("heap");
//		
//		s2=s2.concat(" pop ");
//		
//		
//		
//		int i=10;
//		int j=20;
//		int k=i+j;
//		
//		System.out.println(k);
//		
//		System.out.println(s1+" "+s2);
//		String s1 = "SCP=String constant pool"; // by using string literals
//		System.out.println(s1 + "" + s1.length());
//
//		for (int i = 0; i < s1.length(); i++) {// traditional for loop
//			System.out.println(s1.charAt(i));// hell Java
//		}
//
//		for (char c : s1.toCharArray()) { // Enchance for loop
//			System.out.println(c);
//		}

	}
}
