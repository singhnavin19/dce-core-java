package com.oops.objectexample;
//object super class or father class or super-parent

class A implements Cloneable{
	
}


public class Hello extends A implements Cloneable  {
	int i=10;
	
	public String toString() {
		return "Hello ka toString";
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("hello");
		Hello r=new Hello();
//		//hashcode
//		System.out.println(r.hashCode());	
//		
//		//clone
//		Hello r1=(Hello)r.clone();
//
//		
//		r.i=20;
//		System.out.println(r.i+" r1"+r1.i);
//		r1.i=50;
//		//equals
//		System.out.println(r.equals(r1));
//		
//		//getclass
//		System.out.println(r1.getClass());
		
		//direct print object
		System.out.println("print direct object  = " + r);
		System.out.println("print toString method= "+r.toString());

//		String s=new String("Navin");
//		System.out.println(s.toString());
//		
	
					
	}
}
