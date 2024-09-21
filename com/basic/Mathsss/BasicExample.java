package com.basic.Mathsss;

import java.util.Scanner;

public class BasicExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your number");
        int no=sc.nextInt();
        System.out.println("Please enter pow");
        int pow=sc.nextInt();

        int total=1;
        for(int i=0;i<pow;i++){
            total=total*no;
        }
        System.out.println("result="+total);

        System.out.println(Math.pow(no,pow));
        System.out.println(Math.addExact(10,20));
    }
}
