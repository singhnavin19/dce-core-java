package com.jdbcc.example;
class Navin{
	int age=29;
}

public class ClassClazzExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Class name=Class.forName("com.oops.mapps.Navin");
		System.out.println(name.getSimpleName());
	}
}
