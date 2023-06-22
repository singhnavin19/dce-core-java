package com.oops.inheritance;
class A{
	
}
class B{
	
}
public class AninmalMain extends A{
	public static void main(String[] args) {
		Cow c=new Cow();
		c.leg=4;
		c.hand=0;
		
		System.out.println("cow's details hand= "+c.hand+" and leg="+c.leg);
		
	}
}
