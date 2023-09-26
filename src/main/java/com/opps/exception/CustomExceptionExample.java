package com.opps.exception;

import java.util.Scanner;

class LateStudent extends Exception{ //checked exception
   LateStudent(){
	   System.out.println("default constructor for late Student");
   }
   LateStudent(String s){
	   super(s);
	   System.out.println("message for late student"+s);
   }
	
}

public class CustomExceptionExample {
	public static void main(String[] args) {
		
		System.out.println("please enter your class in time");
		long time=new Scanner(System.in).nextLong();
		
		if(time!=830) {
			try {
				System.out.println("rest of code");
				throw new NullPointerException("null check");				
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
			catch(Exception e) {
				System.out.println("Exception");
				e.printStackTrace();
			}
			finally {
				System.out.println("Exception throw");
			}
		}
	}
}
