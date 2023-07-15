package com.oops.stringexample;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Navin");
		StringBuilder sb1=sb;
		
		sb.append(" Singh");
		
		System.out.println(sb);
		System.out.println(sb1);
		
		StringBuffer sbf=new StringBuffer("Navin");
		StringBuffer sbf1=sbf;
		
		sbf.append(" Singh");
		
		System.out.println(sbf);
		System.out.println(sbf1);
		
	}

}
