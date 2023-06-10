package com.oops.superexample;
class Person{
	int aadharCardNo;
	String panCard="123";
	
	
	Person(){
		System.out.println("default");
	}
	
	Person(int aadharCardNo,String panCard){
		System.out.println("aadhar card="+aadharCardNo+" panCard No="+panCard);
	}
}

public class Student extends Person{
	int rollNo;
	String panCard="234";
	
	Student(){
		this(10);
		System.out.println("student class default constructor");
	}
	
	Student(int rollNo){
		super();
		System.out.println("rollNo is"+rollNo);
	}
	
	public  void printPanCardNo() {
		System.out.println("student pancard"+panCard);
		System.out.println("Person pancard"+super.panCard);
	}
	
	public static void main(String[] args) {
		Student s=new Student();
		
	}
}
