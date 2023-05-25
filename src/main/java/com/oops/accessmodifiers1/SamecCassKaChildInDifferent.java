package com.oops.accessmodifiers1;

import com.oops.accessmodifiers.SameClass;

public class SamecCassKaChildInDifferent extends SameClass {

	public static void main(String[] args) {
		SamecCassKaChildInDifferent obj6=new SamecCassKaChildInDifferent();
		System.out.println(obj6.public_i);
		System.out.println(obj6.protected_j);
		//System.out.println(obj6.default_k);
		//System.out.println(obj6.private_l);
		
	}
}
