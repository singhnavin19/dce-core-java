package com.oops.accessmodifiers;

public class SameClassKaChild extends SameClass{

	public static void main(String[] args) {
		SameClass obj3=new SameClass();
		
		System.out.println(obj3.public_i);
		System.out.println(obj3.protected_j);
		System.out.println(obj3.default_k);
		//System.out.println(obj3.private_l);
		
	}
}
