package com.oops.accessmodifiers1;

import com.oops.accessmodifiers.SameClass;

public class DiffrentClassInDiffrentPackage {
	
	public static void main(String[] args) {
		SameClass obj5=new SameClass();
		
		System.out.println(obj5.public_i);
		//System.out.println(obj5.protected_j);
		//System.out.println(obj5.default_k);
		//System.out.println(obj5.private_l);
		
	}
}
