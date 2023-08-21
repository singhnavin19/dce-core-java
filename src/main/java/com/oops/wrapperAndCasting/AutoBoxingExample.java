package com.oops.wrapperAndCasting;

public class AutoBoxingExample {
	static Integer no1;
	static String name;
	
	public static void main(String[] args) {
		//Integer default value is null 
		System.out.println(no1);
		System.out.println(name);
		
		Integer no2=10; 
	 //Wrapper class=primitiveValue //AutoBoxing
		
		System.out.println(no2.toString());
		
		int i=no2; 
	//primitive = wrapp  //AutoUnboxing
		
		
		no2.byteValue();
		no2.doubleValue();
		no2.longValue();
		
	}
	
}
