package com.loop;

import java.util.Scanner;

public class LoopWithBreak {

	public static void main(String[] args) {
		int i;
		int no;
		System.out.println("please enter number from 1 to 10");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();

		for (i = 1; i <= 10; i++) {
			System.out.println(i);
			if (i == no) {
				break;
			}
		}
		System.out.println(i);
	}

}
