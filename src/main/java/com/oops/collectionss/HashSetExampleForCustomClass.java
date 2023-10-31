package com.oops.collectionss;

import java.util.HashSet;
import java.util.Set;


class Student{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public boolean equals(Object o) {
		Student s=(Student)o;
//		return this.id==s.id;
		return false;
	}
	
	
}
public class HashSetExampleForCustomClass {
	public static void main(String[] args) {
		HashSet<Student> setOfStudents=new HashSet<>();
		Student s1=new Student(10, "Azmat");
		Student s2=new Student(20, "Azmat1");
		
		System.out.println("s1 ka hashcode "+s1.hashCode());
		System.out.println("s2 ja hascode "+s2.hashCode());
		
		setOfStudents.add(s1);
		setOfStudents.add(s2);
		
		for(Student s:setOfStudents) {
			System.out.println(s.id+" "+s.name);
		}
	}
}
