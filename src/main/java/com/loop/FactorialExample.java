package com.loop;

import java.util.Scanner;

public class FactorialExample {

	public static void main(String[] args) {
		int no,result=1;	
		no=new Scanner(System.in).nextInt();
		
		for(int i=no;i>1;i--) {
			result*=i;
		}
		System.out.print(result);
	}

}
