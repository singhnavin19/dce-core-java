package com.oops.mapps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteraretMap {
	public static void main(String[] args) {
		HashMap<Integer, String> nos = new HashMap<>();
		nos.put(1, "I");
		nos.put(2, "II");
		nos.put(3, "III");
		nos.put(4, "IV");
		nos.put(5, "V");
		nos.put(6, "VI");

		// 1. most efficient way
		for (Map.Entry no : nos.entrySet()) {
			System.out.println(no.getKey() + " :- " + no.getValue());
		}
		// 2. efficient way
		for (int key : nos.keySet()) {
			System.out.println("key:- " + key + " value= " + nos.get(key));
		}
		// keySet and ValueSet
		for (int keys : nos.keySet()) {
			System.out.println("key:- " + keys);
		}

		for (String value : nos.values()) {
			System.out.println("value:- " + value);
		}

		Iterator<Map.Entry<Integer, String>> itr = nos.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		
	}
}
