package com.oops.accessmodifiers;

public class SameClass {
	public int public_i=1;
	protected int protected_j=2;
	int default_k=3;
	private int private_l=4;
	
	public static void main(String[] args) {
		SameClass obj1=new SameClass();
		System.out.println(obj1.public_i);
		System.out.println(obj1.protected_j);
		System.out.println(obj1.default_k);
		System.out.println(obj1.private_l);
		
	}
}
