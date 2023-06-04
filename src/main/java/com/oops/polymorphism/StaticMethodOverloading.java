package com.oops.polymorphism;

public class StaticMethodOverloading {
	public static void sayHello() {
		System.out.println("hello");
	}

	public static void sayHello(String name) {
		System.out.println("Hello "+name);
	}

	public void main(String[] args) {
		sayHello();
		sayHello("navin");
	}
}
