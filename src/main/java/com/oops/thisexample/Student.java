package com.oops.thisexample;

public class Student {
	
	int rollNo;
	int marks;
	
	Student(){
		System.out.println("default");
	}
	
	Student(int rollNo,int marks){
		this.rollNo=rollNo;
		this.marks=marks;
	}
	
	public static void main(String[] args) {
		Student s1=new Student(10,450);
		
		System.out.println(s1.rollNo);
		System.out.println(s1.marks);
		
		Student s2=new Student(20,480);
		System.out.println("roll Nos is= "+s2.rollNo+" marks= "+s2.marks);
		
	}
}
