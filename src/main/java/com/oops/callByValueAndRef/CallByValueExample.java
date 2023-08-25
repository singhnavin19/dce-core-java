package com.oops.callByValueAndRef;



public class CallByValueExample {
	public int  incrementValueBy1(int value) {
		value++;
		System.out.println(value);
		return value;
	}
	public static void main(String[] args) {
		int no=10;
		CallByValueExample c=new CallByValueExample();
		no=c.incrementValueBy1(no);
		
		System.out.println(no);
	}
	
}
