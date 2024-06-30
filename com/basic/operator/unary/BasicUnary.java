package com.basic.operator.unary;

public class BasicUnary {
    public static void main(String[] args) {
//        int i=10;
//        System.out.println(i++); //A - 10
//        System.out.println(i);   //A- 11
//        System.out.println(++i); //A- 12
//
//        int a=10;
//        System.out.println(--a); //9
//        System.out.println(a--); //9
//        System.out.println(a-- +" phir se value "+  a);// 8 phir se value 7
//        System.out.println(a); //
//
//        System.out.println(10+a++);

        int a=20;
        System.out.println(20+a--+a); //59
        System.out.println(a); //20

        System.out.println(++a+" "+ a--);
    }
}
