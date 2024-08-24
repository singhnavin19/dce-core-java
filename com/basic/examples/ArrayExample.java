package com.basic.examples;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int i[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int ind=0;ind<5;ind++){
            System.out.println("please enter your number");
            i[ind]=sc.nextInt();
        }

        for(int ind=0;ind<5;ind++){
            System.out.println(i[ind]);
        }

    }
}
