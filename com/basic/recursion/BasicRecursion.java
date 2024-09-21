package com.basic.recursion;

public class BasicRecursion {
    public static void main(String[] args) {
        printNumber(1);
    }
    public static void printNumber(int no){
        System.out.println(no);
        if(no<=10){
            printNumber(++no);
        }
        System.out.println("last= "+no);
    }

}
