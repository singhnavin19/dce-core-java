package com.oops.collectionss;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasic {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		System.out.println(ll);
		ll.add("navin");
		ll.add("singh");
		ll.add("navin1");
		ll.add("singh1");
		ll.add("navin");
		
		System.out.println(ll.toString());
		
		//iterate list:
		System.out.println("by using enchance for loop");
		for (String s:ll) {
			System.out.println(s);
		}
		
		System.out.println("2. by using iterator");
		Iterator<String>itr=ll.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(ll.get(0));
		
		System.out.println(ll.set(0, "pravin"));
		System.out.println(ll);
		
	
	}

}
