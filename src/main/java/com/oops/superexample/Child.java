package com.oops.superexample;

 class SuperClass {
	int money=1000;
	
	SuperClass(){
		System.out.println("I am default SuperClass class constructor");
	}
	SuperClass(int i){
		System.out.println("I am param SuperClass class constructor"+i);
	}
	
	public void printMoney() {
		System.out.println(money);
	}
	public void getProperty() {
		System.out.println("I have 4 flats");
	}
	
}

public class Child extends SuperClass{

	int money=500;

	Child(){
		super(10);
		System.out.println("I am child class constructor");
	}
	public void getProperty() {
		System.out.println("I have 3 flats");
	}
	
	
	public static void main(String[] args) {
		
		Child c=new Child();
//		System.out.println(c.super.money);
//		c.getProperty();
		
	}
}
