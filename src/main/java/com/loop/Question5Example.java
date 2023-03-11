package com.loop;

import java.util.Scanner;

public class Question5Example {

	public static void main(String[] args) {
		int no1,no2,mult=1;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter no1 and no2 ");
		no1=sc.nextInt();
		no2=sc.nextInt();
		
		if(!(no1>0&&no2>0)) {
			System.out.println("No 1 or no2 is not postive");
		}
		
		while(no2>=1) {
			mult*=no1;
			System.out.println(no1);
			no2--;
		}
		
		System.out.println(mult);

	}

}
