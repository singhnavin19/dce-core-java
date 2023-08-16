package com.excercise.sorting;

import java.util.Random;

public class BubbleSort {

	public static void main(String[] args) {
		Random r=new Random();
		int number=100000;
		int input[] = new int[number];

		for(int i=0;i<number;i++) {
			input[i]=r.nextInt(1000000);	
		}

		
		int count = 1;

		for (int i = 1; i < input.length; i++) {

			for (int j = 0; j < input.length - 1; j++) {
				count++;
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		System.out.println("loop count =" + count);

		printArray(input);

	}

	private static void printArray(int[] input) {
		System.out.println("[");
		for (int i : input) {
			System.out.print(i+",");
		}
		System.out.println("]");
	}
}

