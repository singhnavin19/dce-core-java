package com.oops;

import java.util.Scanner;

public class Student {

	String name; //attribute
	int rollNo;
	int age;
	char div;
	char gender;
	
	public void study() {
		System.out.println("studying");
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="prachi";
		s2.name="sneha";
		
		System.out.println("s1 ka name = "+s1.name);
		System.out.println("s2 ka name = "+s2.name);
		
		Student s3=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("s3 ka name enter karo");
		s3.name=sc.nextLine();
		System.out.println("entered name is = "+s3.name);
		
		
			
	}
}
