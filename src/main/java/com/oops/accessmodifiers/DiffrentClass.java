package com.oops.accessmodifiers;

public class DiffrentClass {
	public static void main(String[] args) {
		SameClass obj2=new SameClass();
		
		System.out.println(obj2.public_i);
		System.out.println(obj2.protected_j);
		System.out.println(obj2.default_k);
		//System.out.println(c.private_l); not accessible
		
	}
}
