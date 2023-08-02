package com.excercise.string;

public class StringMethodExample {

	public static void main(String[] args) {
		
		String s="  ldbf fodf dfdf java dfdfjhdbf  ";
		
		String template="Happy Birthday from %s to %s";
		
		System.out.println(s.substring(2));//0
		
		System.out.println(s.contains("z"));

		System.out.println(s.join(" ", "Navin","Singh","Java"));
		
		System.out.println(s.toUpperCase().trim());
		
		System.out.println(s.replace("d", "z"));
		
		System.out.println(template.formatted("Nikhil","Kareena"));
		
		System.out.println("navin".offsetByCodePoints(3, -5));
	}

}
