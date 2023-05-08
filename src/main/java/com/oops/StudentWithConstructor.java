package com.oops;

public class StudentWithConstructor {
	
	int rollNo;
	String s="hello"; //
	void playing() {
		System.out.println("playing");
	}
	
	 StudentWithConstructor() { //constructor 
		System.out.println("StudentWithConstructor");
	}
	
	public static void main(String[] args) {
		StudentWithConstructor nikhil=new StudentWithConstructor();
		System.out.println(nikhil.s);
		nikhil.s="khelo";
		System.out.println(nikhil.s);
	}

}
