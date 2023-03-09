package com.conditional;

import java.util.Scanner;

public class MarksWithGradeQuestion6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int p,c,m,b,cs,percentage;
		
		char c1;
		String i=sc.next();
		c1=i.charAt(0);
		
		System.out.println(c1);
		System.out.println("please enter marks of p,c,m,b,cs");
		p=sc.nextInt();
		if(p>100) {
			System.out.println("max mark is 100 exiting programme");
			System.exit(0);
		}
		c=sc.nextInt();
		m=sc.nextInt();
		b=sc.nextInt();
		cs=sc.nextInt();
		
		int total = p+c+m+b+cs;
		percentage=(total*100)/500;
		System.out.println(percentage+"%");
		
		if(percentage>=90) {
			System.out.println("Grade A");
		}else if(percentage>=80) {
			System.out.println("Grade B");
		}else if(percentage>=70) {
			System.out.println("Grade C");
		}else if(percentage>=60) {
			System.out.println("Grade D");
		}else if(percentage>=50) {
			System.out.println("Grade E");
		}else {
			System.out.println("Garde F");
		}
		

	}

}
