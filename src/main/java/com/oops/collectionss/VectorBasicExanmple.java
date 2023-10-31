package com.oops.collectionss;

import java.util.Iterator;
import java.util.Vector;

public class VectorBasicExanmple {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("navin");
		v.add("singh");
		v.add("singh");
		v.add(null);
		System.out.println(v);
		
		System.out.println(v.contains("navin"));
		
		for(String s:v) {
			System.out.println(s);
		}
		System.out.println("using iterator");
		Iterator<String> itr=v.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
