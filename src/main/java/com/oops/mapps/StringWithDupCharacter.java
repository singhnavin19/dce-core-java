package com.oops.mapps;

import java.util.HashMap;
import java.util.Scanner;

public class StringWithDupCharacter {

	public static void main(String[] args) {
		System.out.println("Please enter your string");
		String input=new Scanner(System.in).nextLine();
		HashMap<String, Integer> map=new HashMap();
		//navin
		for(String s:input.split("")) {
			if(map.containsKey(s)) {
				int existingCount=map.get(s);
				map.put(s, ++existingCount);
			}else {
				map.put(s, 1);				
			}
		}
		System.out.println(map);

	}

}
