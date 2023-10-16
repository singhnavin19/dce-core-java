package com.oops.collectionss;

import java.util.Scanner;

public class LinearSearchExample {
	public static void main(String[] args) {
		System.out.println("please enter size of array");
		Scanner sc=new Scanner(System.in);
		
		int sizeOfArray=sc.nextInt();

		int array[]=new int[sizeOfArray];
		
		for (int index = 0; index < sizeOfArray; index++) { //index=2
			System.out.println("please enter element");
			array[index]=sc.nextInt();
		}
		
		for(int index=0;index<sizeOfArray;index++) {
			System.out.println("array [" +index+"] = "+array[index]);
		}
		
		System.out.println("please enter element you want to search");
		int input=sc.nextInt();
//		boolean isFound=false;
		int flag=0;
		int index;
		for(index=0;index<sizeOfArray;index++) { //index=0
			if(array[index]==input) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Bingo We found element at array["+index+"]= "+input);
		}else {
			System.out.println("element not found");
		}
	}
}
