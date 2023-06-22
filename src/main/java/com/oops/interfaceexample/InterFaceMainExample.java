package com.oops.interfaceexample;

interface interfaceExample{  //100 % asbtarct
	public static final int i=10;
	public  abstract void sayHello(); //static default
}

interface B {
	void sayBye();
}

public class InterFaceMainExample implements B,interfaceExample{

	int j=20;	
	@Override
	public void sayHello() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		InterFaceMainExample e=new InterFaceMainExample();
		e.sayHello();
		System.out.println(interfaceExample.i);
	}

	@Override
	public void sayBye() {
		System.out.println("say Bye");
		
	}
		
}
