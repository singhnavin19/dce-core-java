package com.oops.staticexample;

public class StaticMethodExample {

	 static float g =9.88f;
	
	public static float getWeight(float m) {
		int i=1;
		return i*g*m;
	}

	public static void main(String[] args) {
		System.out.println(getWeight(10));
	
	}
}
