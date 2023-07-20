package com.string.excercise;

public class FindFirstDuplicateLetterInString {
	public static void main(String[] args) {
		String name = "avinvi";
		for (int j = 0; j < name.length(); j++) {// j=1
			char c = name.charAt(j); // c=v
			for (int i = j+1; i < name.length(); i++) {// i=2
				if (c == name.charAt(i)) {// n==a
					System.out.println("found duplicate = " + name.charAt(i)+"index are "+i+" "+j);
					break;
				}
			}

		}
	}
}
