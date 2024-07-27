package com.basic.oops;

public class SwapTwoNumber {
    public static void main(String[] args) {
        System.out.println("hello");
        int i=10,j=20,k; //result i=20, j=10
//        swapNumberUsingThirdVariable(i, j);
        i=i+j; //i=30 ,j=20
        j=i-j; //i=30, j=10
        i=i-j; //

    }

    private static void swapNumberUsingThirdVariable(int i, int j) {
        int k;
        System.out.println("by using Third variable before swapping i= "+ i +" j= "+ j);
        k= i;
        i = j;// i=20
        j =k;
        System.out.println("by using Third variable after swapping i= "+ i +" j= "+ j);
    }
}
