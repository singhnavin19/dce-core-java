package com.oops.finalexample;

public class FinalVaribaleExample {
	final int  i_final=20;  //instance +final
	int j_instance; //instance
	
	public static void main(String[] args) {
		FinalVaribaleExample v=new FinalVaribaleExample();
		FinalVaribaleExample v1=new FinalVaribaleExample();
		System.out.println(v.j_instance);
		v.j_instance=30;
		//v.i_final=30;
		System.out.println(v.j_instance);
	
		System.out.println(v1.j_instance);
		
	
	}
	
}
