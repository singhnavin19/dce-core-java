package com.oops.interfaceexample;

abstract class Hello1 {
	int j=20;
	public abstract void sayHello();
}

public class Hello extends Hello1{
	
	int i=10;
	public static void main(String[] args) {
		Hello1 h=new Hello();
		System.out.println(h.j);
		
	}
	@Override
	public void sayHello() {
		System.out.println("hello");
		
	}
}
