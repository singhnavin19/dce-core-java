package com.basic.takeInput;

import java.util.Scanner;

public class TakeInputFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter your number");
        int i=sc.nextInt();

        System.out.println("Entered number is "+ i);


    }
}
