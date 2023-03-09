package com.conditional;

import java.util.Scanner;

public class IfElseLadde {
	public static void main(String[] args) {
		int marksPercent;

		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your marks");
		marksPercent=sc.nextInt();
		
		if(marksPercent>=80) {
			if(marksPercent>90) {
				System.out.println("Royal Enfield 550cc");
			}else {
				System.out.println("Royal Enfield 350cc");
			}
		}
		else if(marksPercent>=70) {
			System.out.println("Activa");
		}
		else if(marksPercent>=60) {
			System.out.println("Hero Cycle");
		}
		else {
			System.out.println("nothing");
		}
		
		System.out.println("rest of code");
	}

}
