package com.oops.collectionss;

import java.util.TreeSet;

public class TreeSetBasicExample {
	public static void main(String[] args) {
		TreeSet<Integer> nos=new TreeSet<>();
		nos.add(100);
		nos.add(50);
		nos.add(40);
		nos.add(130);
		
		nos.add(null);
		
		System.out.println(nos);
	}
}
