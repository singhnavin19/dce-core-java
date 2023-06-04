package com.oops.variableType;

public class InstanceAndLocalVariable {
	int i=10; //instance
	
	public void printNo() {
		int no=10; //local variable
		System.out.println(no +" "+i);
	}

	public static void main(String[] args) {
		InstanceAndLocalVariable s1=new InstanceAndLocalVariable();

		System.out.println(s1.i);//get 
		s1.printNo();
		
	}
}
