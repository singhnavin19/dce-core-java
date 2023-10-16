package com.oops.collectionss;

import java.util.ArrayList;

import com.oops.wrapperAndCasting.BasicExample;

public class ArrayListBasicExample {
	public static void main(String[] args) {
		
		int j[]=new int[10];
		j[0]=10;
		j[1]=20;
		
			
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(0);
		l.add(10);
		l.add(100);
		l.add(10);
//		l.add("Navin"); //type safe allow only integer
//		l.add(10.78);
		
		System.out.println("all elements are "+l);
		System.out.println(l.get(0));
		int sum=0;
		
		for(int s :l) {
			sum=sum+s;
		}
		System.out.println("sum is "+sum);
		System.out.println("is 10 contains method "+l.contains(10));
		System.out.println("size will give number of elements in array ="+l.size());
	}
}
