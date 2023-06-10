package com.oops.superexample;

class Teacher{
	int id;
	String name;

	public Teacher() {
		super();
		System.out.println("default const of Teacher");
	}
	
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class ClassTeacher extends Teacher{

	String manageClass;
	
	
	public ClassTeacher() {
		this("class manager");
		System.out.println("default const of ClassTeacher");
	}


	public ClassTeacher(String manageClass) {
		super();
		this.manageClass = manageClass;
	}


	public static void main(String[] args) {
		ClassTeacher t=new ClassTeacher();
	}
	

}
