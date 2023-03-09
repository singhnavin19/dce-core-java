package com.loop;

public class NestedLoopExample {
	public static void main(String[] args) {
		int table = 2;
		for (; table <= 20; table++) {
			for (int i = 1; i <= 10; i++) {
				System.out.print(" "+table + "*" + i + "=" + table * i);
			}
		System.out.println("  ");	
		}

	}
}
