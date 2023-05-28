package com.oops.polymorphism;

class Parent{
	
	public void listenSong() {
		System.out.println("old song: Kishor Kumar....");
	}
}

class Child extends Parent{
	
	@Override  //annoation
	public void listenSong() {
		System.out.println("new song: Badshah Neha kakkar....");
	}
}

public class Overrirding {
	public static void main(String[] args) {
		Parent p=new Parent();
    	p.listenSong();
		
    	Child c=new Child();
		c.listenSong();
		
	}
}
