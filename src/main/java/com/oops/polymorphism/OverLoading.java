package com.oops.polymorphism;

import java.util.Scanner;

public class OverLoading {

	OverLoading(){
		System.out.println("object created");
	}

	OverLoading(int n){
		System.out.println("phir se object created");
	}
	
	public void sayHello() {
		System.out.println("hello");
	}
	
	public void sayHello(int no) {
		for(int i=1;i<=no;i++) {
			System.out.println("hello "+i);
		}
	}
	
	public static void main(String[] args) {
		OverLoading o=new OverLoading();
		System.out.println("please enter no");
		int n=new Scanner(System.in).nextInt();
		o.sayHello(n);
	}
}
