package com.oops.collectionss;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetExampleForCustomClass {
	public static void main(String[] args) {
		LinkedHashSet<Student> setOfStudents = new LinkedHashSet<>();
		Student s1 = new Student(10, "Azmat");
		Student s2 = new Student(20, "Azmat1");

		System.out.println("s1 ka hashcode " + s1.hashCode());
		System.out.println("s2 ja hascode " + s2.hashCode());

		setOfStudents.add(s1);
		setOfStudents.add(s2);

		for (Student s : setOfStudents) {
			System.out.println(s.id + " " + s.name);
		}
	}
}
