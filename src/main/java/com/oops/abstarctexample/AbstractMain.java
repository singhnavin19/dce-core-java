package com.oops.abstarctexample;

import javax.swing.AbstractCellEditor;

abstract class AbstractExample{
	AbstractExample(){
		System.out.println("AbstractExample default");
	}
	
}

public class AbstractMain extends AbstractExample{
	public static void main(String[] args) {
		System.out.println("hello");
		AbstractMain e=new AbstractMain();
		
	}
}


//Cannot instantiate the type AbstractExample
