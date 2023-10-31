package com.oops.collectionss;

import java.util.Stack;

public class StackBasicExample {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(10);
		st.push(20);
		st.add(null);
		st.add(10);
		
		System.out.println(st);
		System.out.println(st.contains(10));
		
		st.pop();
		System.out.println(st);
		
		System.out.println("peek ="+st.peek());

	}

}
