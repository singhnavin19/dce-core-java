package com.basic.examples;

public class FibonacciExample {
    public static void main(String[] args) {
        //i j k
        //1 1 2 3 5
        //  i j k
        //1 1 2 3 5
        int arr[]=new int[7];
        int no=1;
        int i=1,j=1;
        System.out.print(i +" "+j+" "); //1 1
        while(no<=5){ //1
            int k=i+j; //3
            System.out.print(k+" "); //3
            i=j;//2
            j=k;//3
            no++;
        }


    }
}
