package com.oops.stringexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringUpper {
	public static void main(String[] args) {
		System.out.println("please enter your name");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("enetred name"+name.toUpperCase());
		
	}
}
