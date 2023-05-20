package com.oops;

public class Human {
	int leg;
	int hand;
	String name;

	public void canTalk() {
		System.out.println("takking");
	}

	public void canTalk(String language) {
		System.out.println("takking= "+language);
	}
	
	public void canTalk(int time) {
		System.out.println("takking= "+time);
	}
	
	Human(){
		System.out.println("default");
	}
	
	Human(int leg,int hand){
		
		System.out.println("param= "+leg);
	}
	Human(int leg){
		
		System.out.println("param= "+leg);
	}
	Human(String name){
		
		System.out.println("param = "+name);
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		Human nikhil=new Human(2);
		nikhil.canTalk(10);
		
		Human suraj=new Human("suraj");
		
		Human defaultt=new Human();
		
//		Human deepak=new Human();
//		
//		deepak.hand=2;
//		
//		System.out.println(deepak.hand);
	}
}
