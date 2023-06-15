package com.oops.abstarctexample;

abstract class AbstractMethodExample{
	
	public abstract void sayHello();
	
	public void sayBye() {
		System.out.println("Bye Bye");
	}
}

public class AbstractMethodExampleMain extends AbstractMethodExample{
	
	@Override
	public void sayHello() {
		System.out.println("Namaste sir");
	}
	public static void main(String[] args) {
		AbstractMethodExampleMain m=new AbstractMethodExampleMain();
		m.sayHello();
	}
}
