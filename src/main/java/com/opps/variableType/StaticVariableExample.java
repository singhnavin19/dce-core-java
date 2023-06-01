package com.opps.variableType;

public class StaticVariableExample {

	int i_instace=10;
	static int j_static=20;
	

	public static void printVaribales() {
		System.out.println("static= "+j_static);
	}
	
	public static void main(String[] args) {
		StaticVariableExample v1=new StaticVariableExample();
		StaticVariableExample v2=new StaticVariableExample();
		
		v1.i_instace=30;
		
		System.out.println(v1.i_instace);
		System.out.println(v2.i_instace);
		
		
		System.out.println(v1.j_static);
		System.out.println(v2.j_static);
		
		v2.j_static=50;

		System.out.println(j_static);
		System.out.println(v2.j_static);

		System.out.println(j_static);
		System.out.println(StaticVariableExample.j_static);
		
		printVaribales();
		
	}
}
