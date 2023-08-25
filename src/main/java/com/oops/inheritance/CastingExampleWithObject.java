package com.oops.inheritance;
class Basic{
	void sayHello() {
		System.out.println("Basic");
	}
}

public class CastingExampleWithObject extends Basic{
	int i=10;
	void sayHello() {
		System.out.println("child casting");
	}
	void sayHi() {
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		Basic b=new CastingExampleWithObject();
		b.sayHello();
		b.sayHi();
		
	}
	
}
