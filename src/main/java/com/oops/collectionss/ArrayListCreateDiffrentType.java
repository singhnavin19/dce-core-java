package com.oops.collectionss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListCreateDiffrentType {
	public static void main(String[] args) {
		//1 by using new operator
		List<String> names1=new ArrayList<>();
		names1.add("navin");
		names1.add("singh");
		System.out.println(names1);
		
		//2. by using List.of method (immutable list)
		List<String> names2=List.of("Navin","Singh");
		System.out.println(names2);
		
		names1.add("pravin");
		System.out.println(names1);
		
//		names2.add("singh"); //not supporting as it's immutable
		System.out.println(names2);
		
		//3.uisng unmodifiableList list 
		
		List<String> nos=Collections.unmodifiableList(names1);
		System.out.println(nos);
		
		// 4. Arrays class
		List<Integer> nos1=Arrays.asList(10,20,30,40);
		System.out.println("using Arrays.asList ="+nos);
		
		
	}
}
