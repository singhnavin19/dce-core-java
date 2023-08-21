package com.oops.callByValueAndRef;



public class CallByValueExample {
	public void incrementValueBy1(int value) {
		value++;
		System.out.println(value);
	}
	public static void main(String[] args) {
		int no=10;
		CallByValueExample c=new CallByValueExample();
		c.incrementValueBy1(no);
		
		System.out.println(no);
	}
	
}
