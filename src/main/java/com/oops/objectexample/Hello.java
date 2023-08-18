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
		Hello h=new Hello();
		
		//toString()
//		System.out.println("print direct object  = " + r);//r.toString()
//		System.out.println("print toString method= "+r.toString());
//		String s=new String("Navin");
//		System.out.println(s.toString());
//		
		
		System.out.println(r.hashCode());
		System.out.println(h.hashCode());
		
		String s=new String("Navin");
		String s1=new String("Navin");
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(r.equals(h));
		
	
					
	}
}
