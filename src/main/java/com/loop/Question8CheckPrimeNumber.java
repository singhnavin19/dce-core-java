package com.loop;

import java.util.Scanner;

public class Question8CheckPrimeNumber {

	public static void main(String[] args) {
		
		int number=0;
		System.out.println("please enter your number");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		boolean isNotPrime=false;
		
		int temp=number-1;;
		
		while(temp>=2) {
			System.out.println(number+" /"+temp+"= "+(number%temp));
			if(number%temp==0) {
				isNotPrime=true;
				break;
			}
			temp--;
		}

		if(isNotPrime==true) {
			System.out.println("Number is not prime ");
		}else {
			System.out.println("prime number");
		}
	}

}
