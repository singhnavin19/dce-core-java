package com.opps.variableType;

public class InstanceAndLocalVariable {
	int i=10; //instance
	
	public void printNo() {
		int no=10; //local variable
		System.out.println(no +" "+i);
	}

	public static void main(String[] args) {
		
		InstanceAndLocalVariable instance = new InstanceAndLocalVariable();
		System.out.println(instance.i);
		
		//System.out.println(instance.no);//not accessible
	}
}
