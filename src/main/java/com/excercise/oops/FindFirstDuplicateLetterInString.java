package com.excercise.oops;

public class FindFirstDuplicateLetterInString {
	public static void main(String[] args) {
		String name = "Hello Student Hello Sir";
		
		name.contains("sir");
		
		String arrayStrings[]=name.split(" ");
		
		for(int i=0;i<arrayStrings.length;i++) {
			for(int j=i+1;j<arrayStrings.length;j++) {
				if(arrayStrings[i].equals(arrayStrings[j])) {
					System.out.println("bingo ,got element "+arrayStrings[i]);
				}
			}
		}
		
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
