package com.excercise.string;

public class SCPExample {
	public static void main(String[] args) {
		String s = new String();
		String s1 = new String();
		
		System.out.println(s);
		System.out.println(s1);
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));

		Laxmi m1=new Laxmi();
		Laxmi m2=new Laxmi();
		
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		
	}
}
