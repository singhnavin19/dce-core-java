package com.oops;

public class StudentWithConstructor {
	
	int rollNo;
	String s="hello"; //
	void playing() {
		System.out.println("playing");
	}

	public int giveMoney() {
		System.out.println("give money");
		return 10;
	}
	
	 StudentWithConstructor() { //constructor 
		System.out.println("StudentWithConstructor 1");
	}
	 StudentWithConstructor(int i,double d) { //constructor 
		 rollNo=100;
		 s="navin";
		System.out.println("StudentWithConstructor 2");
	}
	
	public static void main(String[] args) {
		StudentWithConstructor suraj=new StudentWithConstructor(10,2.34);
		
		int m=suraj.giveMoney();
		suraj.playing();
		System.out.println("roll nO is:-"+suraj.rollNo);
		
		StudentWithConstructor n2=new StudentWithConstructor();
		
		System.out.println(m);
		
		
		
		
	}

}
