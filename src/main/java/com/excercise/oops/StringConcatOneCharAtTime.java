package com.excercise.oops;

public class StringConcatOneCharAtTime {

	public static void main(String[] args) {
		String s1="navin";
		String s2="sindsdfdfdf";
		StringBuilder result=new StringBuilder();
		
		int len=s1.length()>s2.length()?s1.length():s2.length();
		
		for(int i=0;i<len;i++) { //i=3
			if(s1.length()>i) {
				result.append(s1.charAt(i));
			}
			if(s2.length()>i) {
				result.append(s2.charAt(i));
			}
		}
		System.out.println(result);
	}

}
