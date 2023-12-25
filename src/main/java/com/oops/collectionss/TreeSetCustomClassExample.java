package com.oops.collectionss;

import java.util.HashMap;
import java.util.TreeSet;

public class TreeSetCustomClassExample {
	public static void main(String[] args) {
		TreeSet<Integer> nos=new TreeSet<>();
		nos.add(100);
		nos.add(50);
		nos.add(40);
		nos.add(140);
		HashMap<String, Integer> m=new HashMap<>();
		m.put("Navin",1);
//		
		System.out.println(m);
//		nos.add(null);
		
		System.out.println(nos);
	}
}
