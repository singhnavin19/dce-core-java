package com.excercise.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int input[]= {10,3,50,1,5};
		
		for(int i=0;i<input.length;i++) {
			
			for(int j=i+1;j<input.length;j++) {//j=3
				
				if(input[i]>input[j]) {
					int temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
			
		}
		
		for(int i:input) {
			System.out.println(i);
		}
		
	}
	
}
