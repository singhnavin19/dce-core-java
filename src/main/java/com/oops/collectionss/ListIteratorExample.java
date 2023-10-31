package com.oops.collectionss;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	
	public static void main(String[] args) {
		List<Integer> listOfnos=Arrays.asList(10,20,30,50,60,80);
		
		List<Integer> linkedListOfNos=new LinkedList(listOfnos);
		
		Iterator<Integer> itr=listOfnos.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		 itr=listOfnos.iterator();
		System.out.println("first element"+itr.next());
//		itr.remove();

		System.out.println(listOfnos);
		
		ListIterator<Integer> advItr=listOfnos.listIterator();
		
		System.out.println("ListIterator in forward");
		while(advItr.hasNext()) {
			int no=advItr.next();
			System.out.println(no);
			advItr.set(++no);
		}
		
		System.out.println("ListIterator in backward");
		while(advItr.hasPrevious()) {
			System.out.println(advItr.previous());
		}
		
		System.out.println(listOfnos);
	}
}
