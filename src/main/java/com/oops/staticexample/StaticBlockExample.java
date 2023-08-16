package com.oops.staticexample;

public class StaticBlockExample {
	
	static int i;
	static {
		System.out.println("before main and value of i= "+i);
	}
	public StaticBlockExample() {
		System.out.println("constructor");
	}
	
	{
		i=30;
		System.out.println("instance block"+i);
	}
	static {
		i=20;
	}
	public static void main(String[] args) {
		System.out.println("hello main and value of "+i);
		StaticBlockExample e=new StaticBlockExample();
	}
	
	static {
		System.out.println("after main and value of i= "+i);
	}
	{
		System.out.println("Instance block 2");
	}
}
