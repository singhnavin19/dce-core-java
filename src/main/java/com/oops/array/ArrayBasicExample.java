package com.oops.array;

import java.util.Scanner;

public class ArrayBasicExample {
	public static void main(String[] args) {
		System.out.println("hello");
		//dataType []varName=new dataType[]
		  int         c[]  =new int[3];
		  Scanner sc=new Scanner(System.in);
		  for(int le=0;le<c.length;le++) {
		      System.out.println("please enter elements");
		  	  c[le]=sc.nextInt();
		  }
		  
//		  c[2]='a';
//		  c[0]='A';
//		  c[1]='B';
		  int z;//variable declaration
		  //1. initialization 2. condtion check 3.increment/decrement
		  //.4. body
		  
		  for(z=c.length-1;z>=0;z--) { //z=2 
			  System.out.println(c[z]);
		  }
		  //0 1 2
		  //System.out.println(c[z]); //java.lang.ArrayIndexOutOfBoundsException
		  
//		  int i[]=new int[2];
//		  System.out.println(i[1]);
	}

}
