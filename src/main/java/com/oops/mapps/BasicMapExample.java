package com.oops.mapps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class BasicMapExample {
	 public static void main(String[] args) {
		Map<Integer, String> students=new WeakHashMap();
		students.put(1, "Prachi");
		students.put(2, "Singh");
		
		Integer three=new Integer(3);
		students.put(three, "World");
		System.out.println(students);
		three=null;
		System.gc();
		System.out.println(students);
		
		
	}
}	
