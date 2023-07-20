package com.string.excercise;

import java.util.Scanner;

public class SwaplastTwoCharOfString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter name");
		String name = sc.nextLine();// output =navni

		easyWay(name);
		googleBard(name);
		difficultway(name);
	}

	private static void difficultway(String name) {
		
		
	}

	private static void googleBard(String name) {
		char lastChar=name.charAt(name.length()-1);
		char secondLastChar=name.charAt(name.length()-2);
		
		System.out.println(name.substring(0, name.length()-2)+lastChar+secondLastChar);
				
		
	}

	private static void easyWay(String name) {
		if (name.length() >= 2) {

			char nameArray[] = name.toCharArray();

			char a = nameArray[name.length() - 1];
			char b = nameArray[name.length() - 2];

			System.out.println("old a= " + a + " b= " + b);
			char c = a;
			a = b;
			b = c;
			System.out.println("new a= " + a + " and b= " + b);

			nameArray[name.length() - 1] = a;
			nameArray[name.length() - 2] = b;

			name = new String(nameArray);
		} else {
			System.out.println("please enter name more than two character");
		}

		System.out.println(name);
	}

}
