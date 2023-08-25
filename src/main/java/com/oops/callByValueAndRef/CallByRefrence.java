package com.oops.callByValueAndRef;

public class CallByRefrence {
	int i=10;	
	
	public void incrementValueBy1(CallByRefrence ref) {
		ref.i++;
	}
	
	public static void main(String[] args) {
		CallByRefrence c1=new CallByRefrence();
		System.out.println(c1.i); //10
		c1.incrementValueBy1(c1);
		System.out.println(c1.i); //
		
		CallByRefrence c2=new CallByRefrence();
		System.out.println(c2.i);
		
	}
}
